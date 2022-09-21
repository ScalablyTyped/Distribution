package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.CommandTypes.NavTree
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NavTree request; value of command field is "navtree".
  * Return response giving the navigation tree of the requested file.
  */
trait NavTreeRequest
  extends StObject
     with FileRequest {
  
  @JSName("command")
  var command_NavTreeRequest: NavTree
}
object NavTreeRequest {
  
  inline def apply(arguments: FileRequestArgs, command: NavTree, seq: Double): NavTreeRequest = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("request")
    __obj.asInstanceOf[NavTreeRequest]
  }
  
  extension [Self <: NavTreeRequest](x: Self) {
    
    inline def setCommand(value: NavTree): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
  }
}
