package typings.concurrently.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommandsArray extends StObject {
  
  var commands: js.Array[typings.concurrently.commandMod.Command]
}
object CommandsArray {
  
  inline def apply(commands: js.Array[typings.concurrently.commandMod.Command]): CommandsArray = {
    val __obj = js.Dynamic.literal(commands = commands.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandsArray]
  }
  
  extension [Self <: CommandsArray](x: Self) {
    
    inline def setCommands(value: js.Array[typings.concurrently.commandMod.Command]): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
    
    inline def setCommandsVarargs(value: typings.concurrently.commandMod.Command*): Self = StObject.set(x, "commands", js.Array(value*))
  }
}
