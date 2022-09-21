package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.CommandTypes.Rename
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Rename request; value of command field is "rename". Return
  * response giving the file locations that reference the symbol
  * found in file at location line, col. Also return full display
  * name of the symbol so that client can print it unambiguously.
  */
trait RenameRequest
  extends StObject
     with FileLocationRequest {
  
  @JSName("arguments")
  var arguments_RenameRequest: RenameRequestArgs
  
  @JSName("command")
  var command_RenameRequest: Rename
}
object RenameRequest {
  
  inline def apply(arguments: RenameRequestArgs, command: Rename, seq: Double): RenameRequest = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("request")
    __obj.asInstanceOf[RenameRequest]
  }
  
  extension [Self <: RenameRequest](x: Self) {
    
    inline def setArguments(value: RenameRequestArgs): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setCommand(value: Rename): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
  }
}
