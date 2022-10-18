package typings.concurrently.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Commands extends StObject {
  
  var commands: js.Array[typings.concurrently.distSrcCommandMod.Command]
  
  var onFinish: js.UndefOr[js.Function0[Unit]] = js.undefined
}
object Commands {
  
  inline def apply(commands: js.Array[typings.concurrently.distSrcCommandMod.Command]): Commands = {
    val __obj = js.Dynamic.literal(commands = commands.asInstanceOf[js.Any])
    __obj.asInstanceOf[Commands]
  }
  
  extension [Self <: Commands](x: Self) {
    
    inline def setCommands(value: js.Array[typings.concurrently.distSrcCommandMod.Command]): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
    
    inline def setCommandsVarargs(value: typings.concurrently.distSrcCommandMod.Command*): Self = StObject.set(x, "commands", js.Array(value*))
    
    inline def setOnFinish(value: () => Unit): Self = StObject.set(x, "onFinish", js.Any.fromFunction0(value))
    
    inline def setOnFinishUndefined: Self = StObject.set(x, "onFinish", js.undefined)
  }
}
