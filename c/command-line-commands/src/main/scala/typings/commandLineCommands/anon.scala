package typings.commandLineCommands

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Argv extends StObject {
    
    var argv: js.Array[String] = js.native
    
    var command: String | Null = js.native
  }
  object Argv {
    
    @scala.inline
    def apply(argv: js.Array[String]): Argv = {
      val __obj = js.Dynamic.literal(argv = argv.asInstanceOf[js.Any])
      __obj.asInstanceOf[Argv]
    }
    
    @scala.inline
    implicit class ArgvMutableBuilder[Self <: Argv] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArgv(value: js.Array[String]): Self = StObject.set(x, "argv", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgvVarargs(value: String*): Self = StObject.set(x, "argv", js.Array(value :_*))
      
      @scala.inline
      def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommandNull: Self = StObject.set(x, "command", null)
    }
  }
}
