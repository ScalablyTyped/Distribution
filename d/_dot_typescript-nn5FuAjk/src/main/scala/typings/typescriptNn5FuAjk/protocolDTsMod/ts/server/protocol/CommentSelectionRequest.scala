package typings.typescriptNn5FuAjk.protocolDTsMod.ts.server.protocol

import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.commentSelection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommentSelectionRequest
  extends StObject
     with FileRequest {
  
  @JSName("arguments")
  var arguments_CommentSelectionRequest: FileRangeRequestArgs
  
  @JSName("command")
  var command_CommentSelectionRequest: commentSelection
}
object CommentSelectionRequest {
  
  inline def apply(arguments: FileRangeRequestArgs, seq: Double): CommentSelectionRequest = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], command = "commentSelection", seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("request")
    __obj.asInstanceOf[CommentSelectionRequest]
  }
  
  extension [Self <: CommentSelectionRequest](x: Self) {
    
    inline def setArguments(value: FileRangeRequestArgs): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setCommand(value: commentSelection): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
  }
}
