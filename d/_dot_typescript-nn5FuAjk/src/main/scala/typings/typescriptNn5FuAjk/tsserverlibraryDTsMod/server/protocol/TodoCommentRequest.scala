package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.CommandTypes.TodoComments
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
  var command_TodoCommentRequest: TodoComments
}
object TodoCommentRequest {
  
  inline def apply(arguments: TodoCommentRequestArgs, command: TodoComments, seq: Double): TodoCommentRequest = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("request")
    __obj.asInstanceOf[TodoCommentRequest]
  }
  
  extension [Self <: TodoCommentRequest](x: Self) {
    
    inline def setArguments(value: TodoCommentRequestArgs): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setCommand(value: TodoComments): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
  }
}
