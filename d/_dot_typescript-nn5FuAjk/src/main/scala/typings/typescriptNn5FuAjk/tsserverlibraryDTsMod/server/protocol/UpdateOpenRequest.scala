package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.CommandTypes.UpdateOpen
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request to synchronize list of open files with the client
  */
trait UpdateOpenRequest
  extends StObject
     with Request {
  
  @JSName("arguments")
  var arguments_UpdateOpenRequest: UpdateOpenRequestArgs
  
  @JSName("command")
  var command_UpdateOpenRequest: UpdateOpen
}
object UpdateOpenRequest {
  
  inline def apply(arguments: UpdateOpenRequestArgs, command: UpdateOpen, seq: Double): UpdateOpenRequest = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("request")
    __obj.asInstanceOf[UpdateOpenRequest]
  }
  
  extension [Self <: UpdateOpenRequest](x: Self) {
    
    inline def setArguments(value: UpdateOpenRequestArgs): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setCommand(value: UpdateOpen): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
  }
}
