package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.CommandTypes.Navto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Navto request message; value of command field is "navto".
  * Return list of objects giving file locations and symbols that
  * match the search term given in argument 'searchTerm'.  The
  * context for the search is given by the named file.
  */
trait NavtoRequest
  extends StObject
     with Request {
  
  @JSName("arguments")
  var arguments_NavtoRequest: NavtoRequestArgs
  
  @JSName("command")
  var command_NavtoRequest: Navto
}
object NavtoRequest {
  
  inline def apply(arguments: NavtoRequestArgs, command: Navto, seq: Double): NavtoRequest = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("request")
    __obj.asInstanceOf[NavtoRequest]
  }
  
  extension [Self <: NavtoRequest](x: Self) {
    
    inline def setArguments(value: NavtoRequestArgs): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setCommand(value: Navto): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
  }
}
