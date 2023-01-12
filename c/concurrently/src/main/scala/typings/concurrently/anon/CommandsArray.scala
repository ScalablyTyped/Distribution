package typings.concurrently.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommandsArray extends StObject {
  
  var commands: js.Array[typings.concurrently.distSrcCommandMod.Command]
}
object CommandsArray {
  
  inline def apply(commands: js.Array[typings.concurrently.distSrcCommandMod.Command]): CommandsArray = {
    val __obj = js.Dynamic.literal(commands = commands.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandsArray]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CommandsArray] (val x: Self) extends AnyVal {
    
    inline def setCommands(value: js.Array[typings.concurrently.distSrcCommandMod.Command]): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
    
    inline def setCommandsVarargs(value: typings.concurrently.distSrcCommandMod.Command*): Self = StObject.set(x, "commands", js.Array(value*))
  }
}
