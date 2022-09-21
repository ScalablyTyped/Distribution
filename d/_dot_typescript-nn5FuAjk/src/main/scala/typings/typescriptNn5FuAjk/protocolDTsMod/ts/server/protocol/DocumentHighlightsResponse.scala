package typings.typescriptNn5FuAjk.protocolDTsMod.ts.server.protocol

import typings.typescriptNn5FuAjk.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response for a DocumentHighlightsRequest request.
  */
trait DocumentHighlightsResponse
  extends StObject
     with Response {
  
  @JSName("body")
  var body_DocumentHighlightsResponse: js.UndefOr[Array[DocumentHighlightsItem]] = js.undefined
}
object DocumentHighlightsResponse {
  
  inline def apply(command: String, request_seq: Double, seq: Double, success: Boolean): DocumentHighlightsResponse = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], request_seq = request_seq.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("response")
    __obj.asInstanceOf[DocumentHighlightsResponse]
  }
  
  extension [Self <: DocumentHighlightsResponse](x: Self) {
    
    inline def setBody(value: Array[DocumentHighlightsItem]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
  }
}
