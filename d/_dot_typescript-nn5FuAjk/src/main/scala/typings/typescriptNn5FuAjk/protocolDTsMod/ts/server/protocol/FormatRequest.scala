package typings.typescriptNn5FuAjk.protocolDTsMod.ts.server.protocol

import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.format
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
  var command_FormatRequest: format
}
object FormatRequest {
  
  inline def apply(arguments: FormatRequestArgs, seq: Double): FormatRequest = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], command = "format", seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("request")
    __obj.asInstanceOf[FormatRequest]
  }
  
  extension [Self <: FormatRequest](x: Self) {
    
    inline def setArguments(value: FormatRequestArgs): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setCommand(value: format): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
  }
}
