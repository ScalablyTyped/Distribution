package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import typings.typescriptNn5FuAjk.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodeFixResponse
  extends StObject
     with Response {
  
  /** The code actions that are available */
  @JSName("body")
  var body_CodeFixResponse: js.UndefOr[Array[CodeFixAction]] = js.undefined
}
object CodeFixResponse {
  
  inline def apply(command: String, request_seq: Double, seq: Double, success: Boolean): CodeFixResponse = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], request_seq = request_seq.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("response")
    __obj.asInstanceOf[CodeFixResponse]
  }
  
  extension [Self <: CodeFixResponse](x: Self) {
    
    inline def setBody(value: Array[CodeFixAction]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
  }
}
