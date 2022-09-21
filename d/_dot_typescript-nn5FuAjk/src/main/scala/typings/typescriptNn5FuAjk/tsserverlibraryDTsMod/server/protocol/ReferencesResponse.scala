package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response to "references" request.
  */
trait ReferencesResponse
  extends StObject
     with Response {
  
  @JSName("body")
  var body_ReferencesResponse: js.UndefOr[ReferencesResponseBody] = js.undefined
}
object ReferencesResponse {
  
  inline def apply(command: String, request_seq: Double, seq: Double, success: Boolean): ReferencesResponse = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], request_seq = request_seq.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("response")
    __obj.asInstanceOf[ReferencesResponse]
  }
  
  extension [Self <: ReferencesResponse](x: Self) {
    
    inline def setBody(value: ReferencesResponseBody): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
  }
}
