package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.CommandTypes.UncommentSelection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UncommentSelectionRequest
  extends StObject
     with FileRequest {
  
  @JSName("arguments")
  var arguments_UncommentSelectionRequest: FileRangeRequestArgs
  
  @JSName("command")
  var command_UncommentSelectionRequest: UncommentSelection
}
object UncommentSelectionRequest {
  
  inline def apply(arguments: FileRangeRequestArgs, command: UncommentSelection, seq: Double): UncommentSelectionRequest = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("request")
    __obj.asInstanceOf[UncommentSelectionRequest]
  }
  
  extension [Self <: UncommentSelectionRequest](x: Self) {
    
    inline def setArguments(value: FileRangeRequestArgs): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setCommand(value: UncommentSelection): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
  }
}
