package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import typings.typescriptNn5FuAjk.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @deprecated Prefer CompletionInfoResponse, which supports several top-level fields in addition to the array of entries. */
trait CompletionsResponse
  extends StObject
     with Response {
  
  @JSName("body")
  var body_CompletionsResponse: js.UndefOr[Array[CompletionEntry]] = js.undefined
}
object CompletionsResponse {
  
  inline def apply(command: String, request_seq: Double, seq: Double, success: Boolean): CompletionsResponse = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], request_seq = request_seq.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("response")
    __obj.asInstanceOf[CompletionsResponse]
  }
  
  extension [Self <: CompletionsResponse](x: Self) {
    
    inline def setBody(value: Array[CompletionEntry]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
  }
}
