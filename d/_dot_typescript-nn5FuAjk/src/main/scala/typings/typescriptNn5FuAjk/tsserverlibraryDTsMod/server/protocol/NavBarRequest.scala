package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.CommandTypes.NavBar
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NavBar items request; value of command field is "navbar".
  * Return response giving the list of navigation bar entries
  * extracted from the requested file.
  */
trait NavBarRequest
  extends StObject
     with FileRequest {
  
  @JSName("command")
  var command_NavBarRequest: NavBar
}
object NavBarRequest {
  
  inline def apply(arguments: FileRequestArgs, command: NavBar, seq: Double): NavBarRequest = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("request")
    __obj.asInstanceOf[NavBarRequest]
  }
  
  extension [Self <: NavBarRequest](x: Self) {
    
    inline def setCommand(value: NavBar): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
  }
}
