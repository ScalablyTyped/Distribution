package typings.typescriptNn5FuAjk.protocolDTsMod.ts.server.protocol

import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.todoComments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A request to get TODO comments from the file
  */
trait TodoCommentRequest
  extends StObject
     with FileRequest {
  
  @JSName("arguments")
  var arguments_TodoCommentRequest: TodoCommentRequestArgs
  
  @JSName("command")
  var command_TodoCommentRequest: todoComments
}
object TodoCommentRequest {
  
  inline def apply(arguments: TodoCommentRequestArgs, seq: Double): TodoCommentRequest = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], command = "todoComments", seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("request")
    __obj.asInstanceOf[TodoCommentRequest]
  }
  
  extension [Self <: TodoCommentRequest](x: Self) {
    
    inline def setArguments(value: TodoCommentRequestArgs): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setCommand(value: todoComments): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
  }
}
