package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.CommandTypes.Exit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *  Exit request; value of command field is "exit".  Ask the server process
  *  to exit.
  */
trait ExitRequest
  extends StObject
     with Request {
  
  @JSName("command")
  var command_ExitRequest: Exit
}
object ExitRequest {
  
  inline def apply(command: Exit, seq: Double): ExitRequest = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("request")
    __obj.asInstanceOf[ExitRequest]
  }
  
  extension [Self <: ExitRequest](x: Self) {
    
    inline def setCommand(value: Exit): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
  }
}
