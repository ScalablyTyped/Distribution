package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import typings.typescriptNn5FuAjk.Array
import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.TodoComment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response for TodoCommentRequest request.
  */
trait TodoCommentsResponse
  extends StObject
     with Response {
  
  @JSName("body")
  var body_TodoCommentsResponse: js.UndefOr[Array[TodoComment]] = js.undefined
}
object TodoCommentsResponse {
  
  inline def apply(command: String, request_seq: Double, seq: Double, success: Boolean): TodoCommentsResponse = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], request_seq = request_seq.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("response")
    __obj.asInstanceOf[TodoCommentsResponse]
  }
  
  extension [Self <: TodoCommentsResponse](x: Self) {
    
    inline def setBody(value: Array[TodoComment]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
  }
}
