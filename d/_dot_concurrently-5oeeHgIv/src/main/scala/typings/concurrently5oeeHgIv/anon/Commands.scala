package typings.concurrently5oeeHgIv.anon

import typings.concurrently5oeeHgIv.commandDTsMod.Command
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Commands extends StObject {
  
  var commands: js.Array[Command]
  
  var onFinish: js.UndefOr[js.Function0[Unit]] = js.undefined
}
object Commands {
  
  inline def apply(commands: js.Array[Command]): Commands = {
    val __obj = js.Dynamic.literal(commands = commands.asInstanceOf[js.Any])
    __obj.asInstanceOf[Commands]
  }
  
  extension [Self <: Commands](x: Self) {
    
    inline def setCommands(value: js.Array[Command]): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
    
    inline def setCommandsVarargs(value: Command*): Self = StObject.set(x, "commands", js.Array(value*))
    
    inline def setOnFinish(value: () => Unit): Self = StObject.set(x, "onFinish", js.Any.fromFunction0(value))
    
    inline def setOnFinishUndefined: Self = StObject.set(x, "onFinish", js.undefined)
  }
}
