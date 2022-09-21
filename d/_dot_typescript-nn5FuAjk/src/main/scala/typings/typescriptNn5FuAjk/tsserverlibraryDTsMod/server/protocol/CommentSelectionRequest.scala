package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.CommandTypes.CommentSelection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommentSelectionRequest
  extends StObject
     with FileRequest {
  
  @JSName("arguments")
  var arguments_CommentSelectionRequest: FileRangeRequestArgs
  
  @JSName("command")
  var command_CommentSelectionRequest: CommentSelection
}
object CommentSelectionRequest {
  
  inline def apply(arguments: FileRangeRequestArgs, command: CommentSelection, seq: Double): CommentSelectionRequest = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("request")
    __obj.asInstanceOf[CommentSelectionRequest]
  }
  
  extension [Self <: CommentSelectionRequest](x: Self) {
    
    inline def setArguments(value: FileRangeRequestArgs): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setCommand(value: CommentSelection): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
  }
}
