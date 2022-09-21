package typings.typescriptNn5FuAjk.protocolDTsMod.ts.server.protocol

import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.uncommentSelection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UncommentSelectionRequest
  extends StObject
     with FileRequest {
  
  @JSName("arguments")
  var arguments_UncommentSelectionRequest: FileRangeRequestArgs
  
  @JSName("command")
  var command_UncommentSelectionRequest: uncommentSelection
}
object UncommentSelectionRequest {
  
  inline def apply(arguments: FileRangeRequestArgs, seq: Double): UncommentSelectionRequest = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], command = "uncommentSelection", seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("request")
    __obj.asInstanceOf[UncommentSelectionRequest]
  }
  
  extension [Self <: UncommentSelectionRequest](x: Self) {
    
    inline def setArguments(value: FileRangeRequestArgs): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setCommand(value: uncommentSelection): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
  }
}
