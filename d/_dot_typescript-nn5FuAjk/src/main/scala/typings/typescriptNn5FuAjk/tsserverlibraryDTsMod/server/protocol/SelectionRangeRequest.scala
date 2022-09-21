package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectionRangeRequest
  extends StObject
     with FileRequest {
  
  @JSName("arguments")
  var arguments_SelectionRangeRequest: SelectionRangeRequestArgs
  
  @JSName("command")
  var command_SelectionRangeRequest: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.CommandTypes.SelectionRange
}
object SelectionRangeRequest {
  
  inline def apply(
    arguments: SelectionRangeRequestArgs,
    command: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.CommandTypes.SelectionRange,
    seq: Double
  ): SelectionRangeRequest = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("request")
    __obj.asInstanceOf[SelectionRangeRequest]
  }
  
  extension [Self <: SelectionRangeRequest](x: Self) {
    
    inline def setArguments(value: SelectionRangeRequestArgs): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setCommand(
      value: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.CommandTypes.SelectionRange
    ): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
  }
}
