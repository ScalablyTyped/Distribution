package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.CommandTypes.ToggleMultilineComment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ToggleMultilineCommentRequest
  extends StObject
     with FileRequest {
  
  @JSName("arguments")
  var arguments_ToggleMultilineCommentRequest: FileRangeRequestArgs
  
  @JSName("command")
  var command_ToggleMultilineCommentRequest: ToggleMultilineComment
}
object ToggleMultilineCommentRequest {
  
  inline def apply(arguments: FileRangeRequestArgs, command: ToggleMultilineComment, seq: Double): ToggleMultilineCommentRequest = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("request")
    __obj.asInstanceOf[ToggleMultilineCommentRequest]
  }
  
  extension [Self <: ToggleMultilineCommentRequest](x: Self) {
    
    inline def setArguments(value: FileRangeRequestArgs): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setCommand(value: ToggleMultilineComment): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
  }
}
