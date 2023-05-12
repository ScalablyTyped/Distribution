package typings.concurrently.anon

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  command :string} & std.Partial<concurrently.concurrently/dist/src/command.CommandInfo> */
trait commandstringPartialComma extends StObject {
  
  var command: String
  
  var cwd: js.UndefOr[String] = js.undefined
  
  var env: js.UndefOr[Record[String, Any]] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var prefixColor: js.UndefOr[String] = js.undefined
}
object commandstringPartialComma {
  
  inline def apply(command: String): commandstringPartialComma = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any])
    __obj.asInstanceOf[commandstringPartialComma]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: commandstringPartialComma] (val x: Self) extends AnyVal {
    
    inline def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
    
    inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
    
    inline def setEnv(value: Record[String, Any]): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPrefixColor(value: String): Self = StObject.set(x, "prefixColor", value.asInstanceOf[js.Any])
    
    inline def setPrefixColorUndefined: Self = StObject.set(x, "prefixColor", js.undefined)
  }
}
