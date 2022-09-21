package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import typings.typescriptNn5FuAjk.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response to "brace" request.
  */
trait BraceResponse
  extends StObject
     with Response {
  
  @JSName("body")
  var body_BraceResponse: js.UndefOr[Array[TextSpan]] = js.undefined
}
object BraceResponse {
  
  inline def apply(command: String, request_seq: Double, seq: Double, success: Boolean): BraceResponse = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], request_seq = request_seq.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("response")
    __obj.asInstanceOf[BraceResponse]
  }
  
  extension [Self <: BraceResponse](x: Self) {
    
    inline def setBody(value: Array[TextSpan]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
  }
}
