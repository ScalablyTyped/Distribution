package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.CommandTypes.Format
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Format request; value of command field is "format".  Return
  * response giving zero or more edit instructions.  The edit
  * instructions will be sorted in file order.  Applying the edit
  * instructions in reverse to file will result in correctly
  * reformatted text.
  */
trait FormatRequest
  extends StObject
     with FileLocationRequest {
  
  @JSName("arguments")
  var arguments_FormatRequest: FormatRequestArgs
  
  @JSName("command")
  var command_FormatRequest: Format
}
object FormatRequest {
  
  inline def apply(arguments: FormatRequestArgs, command: Format, seq: Double): FormatRequest = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("request")
    __obj.asInstanceOf[FormatRequest]
  }
  
  extension [Self <: FormatRequest](x: Self) {
    
    inline def setArguments(value: FormatRequestArgs): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setCommand(value: Format): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
  }
}
