package typings.typescriptNn5FuAjk.protocolDTsMod.ts.server.protocol

import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.change
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Change request message; value of command field is "change".
  * Update the server's view of the file named by argument 'file'.
  * Server does not currently send a response to a change request.
  */
trait ChangeRequest
  extends StObject
     with FileLocationRequest {
  
  @JSName("arguments")
  var arguments_ChangeRequest: ChangeRequestArgs
  
  @JSName("command")
  var command_ChangeRequest: change
}
object ChangeRequest {
  
  inline def apply(arguments: ChangeRequestArgs, seq: Double): ChangeRequest = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], command = "change", seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("request")
    __obj.asInstanceOf[ChangeRequest]
  }
  
  extension [Self <: ChangeRequest](x: Self) {
    
    inline def setArguments(value: ChangeRequestArgs): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setCommand(value: change): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
  }
}
