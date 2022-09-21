package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.CommandTypes.GetSpanOfEnclosingComment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A request to determine if the caret is inside a comment.
  */
trait SpanOfEnclosingCommentRequest
  extends StObject
     with FileLocationRequest {
  
  @JSName("arguments")
  var arguments_SpanOfEnclosingCommentRequest: SpanOfEnclosingCommentRequestArgs
  
  @JSName("command")
  var command_SpanOfEnclosingCommentRequest: GetSpanOfEnclosingComment
}
object SpanOfEnclosingCommentRequest {
  
  inline def apply(arguments: SpanOfEnclosingCommentRequestArgs, command: GetSpanOfEnclosingComment, seq: Double): SpanOfEnclosingCommentRequest = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("request")
    __obj.asInstanceOf[SpanOfEnclosingCommentRequest]
  }
  
  extension [Self <: SpanOfEnclosingCommentRequest](x: Self) {
    
    inline def setArguments(value: SpanOfEnclosingCommentRequestArgs): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setCommand(value: GetSpanOfEnclosingComment): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
  }
}
