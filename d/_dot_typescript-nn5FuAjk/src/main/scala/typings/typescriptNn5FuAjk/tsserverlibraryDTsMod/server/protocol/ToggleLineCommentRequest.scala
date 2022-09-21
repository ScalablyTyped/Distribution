package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.CommandTypes.ToggleLineComment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ToggleLineCommentRequest
  extends StObject
     with FileRequest {
  
  @JSName("arguments")
  var arguments_ToggleLineCommentRequest: FileRangeRequestArgs
  
  @JSName("command")
  var command_ToggleLineCommentRequest: ToggleLineComment
}
object ToggleLineCommentRequest {
  
  inline def apply(arguments: FileRangeRequestArgs, command: ToggleLineComment, seq: Double): ToggleLineCommentRequest = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("request")
    __obj.asInstanceOf[ToggleLineCommentRequest]
  }
  
  extension [Self <: ToggleLineCommentRequest](x: Self) {
    
    inline def setArguments(value: FileRangeRequestArgs): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setCommand(value: ToggleLineComment): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
  }
}
