package typings.commandLineCommands

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Argv extends StObject {
    
    var argv: js.Array[String]
    
    var command: String | Null
  }
  object Argv {
    
    inline def apply(argv: js.Array[String]): Argv = {
      val __obj = js.Dynamic.literal(argv = argv.asInstanceOf[js.Any], command = null)
      __obj.asInstanceOf[Argv]
    }
    
    extension [Self <: Argv](x: Self) {
      
      inline def setArgv(value: js.Array[String]): Self = StObject.set(x, "argv", value.asInstanceOf[js.Any])
      
      inline def setArgvVarargs(value: String*): Self = StObject.set(x, "argv", js.Array(value*))
      
      inline def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
      
      inline def setCommandNull: Self = StObject.set(x, "command", null)
    }
  }
}
