package typings.typescriptNn5FuAjk.protocolDTsMod.ts.server.protocol

import typings.typescriptNn5FuAjk.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Navto response message. Body is an array of navto items.  Each
  * item gives a symbol that matched the search term.
  */
trait NavtoResponse
  extends StObject
     with Response {
  
  @JSName("body")
  var body_NavtoResponse: js.UndefOr[Array[NavtoItem]] = js.undefined
}
object NavtoResponse {
  
  inline def apply(command: String, request_seq: Double, seq: Double, success: Boolean): NavtoResponse = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], request_seq = request_seq.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("response")
    __obj.asInstanceOf[NavtoResponse]
  }
  
  extension [Self <: NavtoResponse](x: Self) {
    
    inline def setBody(value: Array[NavtoItem]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
  }
}
