package typings.concurrently5oeeHgIv.anon

import typings.concurrently5oeeHgIv.commandDTsMod.Command
import typings.node.streamMod.Writable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Group extends StObject {
  
  var commands: js.Array[Command]
  
  var group: Boolean
  
  var outputStream: Writable
}
object Group {
  
  inline def apply(commands: js.Array[Command], group: Boolean, outputStream: Writable): Group = {
    val __obj = js.Dynamic.literal(commands = commands.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], outputStream = outputStream.asInstanceOf[js.Any])
    __obj.asInstanceOf[Group]
  }
  
  extension [Self <: Group](x: Self) {
    
    inline def setCommands(value: js.Array[Command]): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
    
    inline def setCommandsVarargs(value: Command*): Self = StObject.set(x, "commands", js.Array(value*))
    
    inline def setGroup(value: Boolean): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setOutputStream(value: Writable): Self = StObject.set(x, "outputStream", value.asInstanceOf[js.Any])
  }
}
