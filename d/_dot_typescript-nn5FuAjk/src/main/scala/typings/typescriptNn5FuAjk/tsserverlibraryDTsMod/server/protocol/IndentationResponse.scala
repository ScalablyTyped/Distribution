package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response for IndentationRequest request.
  */
trait IndentationResponse
  extends StObject
     with Response {
  
  @JSName("body")
  var body_IndentationResponse: js.UndefOr[IndentationResult] = js.undefined
}
object IndentationResponse {
  
  inline def apply(command: String, request_seq: Double, seq: Double, success: Boolean): IndentationResponse = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], request_seq = request_seq.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("response")
    __obj.asInstanceOf[IndentationResponse]
  }
  
  extension [Self <: IndentationResponse](x: Self) {
    
    inline def setBody(value: IndentationResult): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
  }
}
