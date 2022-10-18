package typings.concurrently.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommandsOnFinish extends StObject {
  
  var commands: js.Array[typings.concurrently.distSrcCommandMod.Command]
  
  def onFinish(): Unit
}
object CommandsOnFinish {
  
  inline def apply(commands: js.Array[typings.concurrently.distSrcCommandMod.Command], onFinish: () => Unit): CommandsOnFinish = {
    val __obj = js.Dynamic.literal(commands = commands.asInstanceOf[js.Any], onFinish = js.Any.fromFunction0(onFinish))
    __obj.asInstanceOf[CommandsOnFinish]
  }
  
  extension [Self <: CommandsOnFinish](x: Self) {
    
    inline def setCommands(value: js.Array[typings.concurrently.distSrcCommandMod.Command]): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
    
    inline def setCommandsVarargs(value: typings.concurrently.distSrcCommandMod.Command*): Self = StObject.set(x, "commands", js.Array(value*))
    
    inline def setOnFinish(value: () => Unit): Self = StObject.set(x, "onFinish", js.Any.fromFunction0(value))
  }
}
