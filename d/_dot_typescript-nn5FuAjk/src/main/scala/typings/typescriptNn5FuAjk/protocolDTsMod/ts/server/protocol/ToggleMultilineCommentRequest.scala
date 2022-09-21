package typings.typescriptNn5FuAjk.protocolDTsMod.ts.server.protocol

import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.toggleMultilineComment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ToggleMultilineCommentRequest
  extends StObject
     with FileRequest {
  
  @JSName("arguments")
  var arguments_ToggleMultilineCommentRequest: FileRangeRequestArgs
  
  @JSName("command")
  var command_ToggleMultilineCommentRequest: toggleMultilineComment
}
object ToggleMultilineCommentRequest {
  
  inline def apply(arguments: FileRangeRequestArgs, seq: Double): ToggleMultilineCommentRequest = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], command = "toggleMultilineComment", seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("request")
    __obj.asInstanceOf[ToggleMultilineCommentRequest]
  }
  
  extension [Self <: ToggleMultilineCommentRequest](x: Self) {
    
    inline def setArguments(value: FileRangeRequestArgs): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setCommand(value: toggleMultilineComment): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
  }
}
