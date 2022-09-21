package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import typings.typescriptNn5FuAjk.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Format and format on key response message.
  */
trait FormatResponse
  extends StObject
     with Response {
  
  @JSName("body")
  var body_FormatResponse: js.UndefOr[Array[CodeEdit]] = js.undefined
}
object FormatResponse {
  
  inline def apply(command: String, request_seq: Double, seq: Double, success: Boolean): FormatResponse = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], request_seq = request_seq.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("response")
    __obj.asInstanceOf[FormatResponse]
  }
  
  extension [Self <: FormatResponse](x: Self) {
    
    inline def setBody(value: Array[CodeEdit]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
  }
}
