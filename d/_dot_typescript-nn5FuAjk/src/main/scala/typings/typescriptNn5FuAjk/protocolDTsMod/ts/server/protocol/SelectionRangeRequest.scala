package typings.typescriptNn5FuAjk.protocolDTsMod.ts.server.protocol

import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.selectionRange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectionRangeRequest
  extends StObject
     with FileRequest {
  
  @JSName("arguments")
  var arguments_SelectionRangeRequest: SelectionRangeRequestArgs
  
  @JSName("command")
  var command_SelectionRangeRequest: selectionRange
}
object SelectionRangeRequest {
  
  inline def apply(arguments: SelectionRangeRequestArgs, seq: Double): SelectionRangeRequest = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], command = "selectionRange", seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("request")
    __obj.asInstanceOf[SelectionRangeRequest]
  }
  
  extension [Self <: SelectionRangeRequest](x: Self) {
    
    inline def setArguments(value: SelectionRangeRequestArgs): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setCommand(value: selectionRange): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
  }
}
