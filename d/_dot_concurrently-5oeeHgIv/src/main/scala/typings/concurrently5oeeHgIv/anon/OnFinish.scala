package typings.concurrently5oeeHgIv.anon

import typings.concurrently5oeeHgIv.commandDTsMod.Command
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnFinish extends StObject {
  
  var commands: js.Array[Command]
  
  var onFinish: Unit
}
object OnFinish {
  
  inline def apply(commands: js.Array[Command], onFinish: Unit): OnFinish = {
    val __obj = js.Dynamic.literal(commands = commands.asInstanceOf[js.Any], onFinish = onFinish.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnFinish]
  }
  
  extension [Self <: OnFinish](x: Self) {
    
    inline def setCommands(value: js.Array[Command]): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
    
    inline def setCommandsVarargs(value: Command*): Self = StObject.set(x, "commands", js.Array(value*))
    
    inline def setOnFinish(value: Unit): Self = StObject.set(x, "onFinish", value.asInstanceOf[js.Any])
  }
}
