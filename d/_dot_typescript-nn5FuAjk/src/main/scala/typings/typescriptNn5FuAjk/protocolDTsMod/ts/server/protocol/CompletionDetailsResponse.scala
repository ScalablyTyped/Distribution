package typings.typescriptNn5FuAjk.protocolDTsMod.ts.server.protocol

import typings.typescriptNn5FuAjk.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompletionDetailsResponse
  extends StObject
     with Response {
  
  @JSName("body")
  var body_CompletionDetailsResponse: js.UndefOr[Array[CompletionEntryDetails]] = js.undefined
}
object CompletionDetailsResponse {
  
  inline def apply(command: String, request_seq: Double, seq: Double, success: Boolean): CompletionDetailsResponse = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], request_seq = request_seq.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("response")
    __obj.asInstanceOf[CompletionDetailsResponse]
  }
  
  extension [Self <: CompletionDetailsResponse](x: Self) {
    
    inline def setBody(value: Array[CompletionEntryDetails]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
  }
}
