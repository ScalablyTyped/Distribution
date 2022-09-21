package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The response for a EncodedSemanticClassificationsRequest */
trait EncodedSemanticClassificationsResponse
  extends StObject
     with Response {
  
  @JSName("body")
  var body_EncodedSemanticClassificationsResponse: js.UndefOr[EncodedSemanticClassificationsResponseBody] = js.undefined
}
object EncodedSemanticClassificationsResponse {
  
  inline def apply(command: String, request_seq: Double, seq: Double, success: Boolean): EncodedSemanticClassificationsResponse = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], request_seq = request_seq.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("response")
    __obj.asInstanceOf[EncodedSemanticClassificationsResponse]
  }
  
  extension [Self <: EncodedSemanticClassificationsResponse](x: Self) {
    
    inline def setBody(value: EncodedSemanticClassificationsResponseBody): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
  }
}
