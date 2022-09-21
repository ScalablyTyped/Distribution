package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.CommandTypes.Saveto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Saveto request message; value of command field is "saveto".
  * For debugging purposes, save to a temporaryfile (named by
  * argument 'tmpfile') the contents of file named by argument
  * 'file'.  The server does not currently send a response to a
  * "saveto" request.
  */
trait SavetoRequest
  extends StObject
     with FileRequest {
  
  @JSName("arguments")
  var arguments_SavetoRequest: SavetoRequestArgs
  
  @JSName("command")
  var command_SavetoRequest: Saveto
}
object SavetoRequest {
  
  inline def apply(arguments: SavetoRequestArgs, command: Saveto, seq: Double): SavetoRequest = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("request")
    __obj.asInstanceOf[SavetoRequest]
  }
  
  extension [Self <: SavetoRequest](x: Self) {
    
    inline def setArguments(value: SavetoRequestArgs): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setCommand(value: Saveto): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
  }
}
