package typings.concurrently5oeeHgIv.anon

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined .concurrently-5oeeHgIv..concurrently-5oeeHgIv/dist/src/command.d.ts.CommandInfo & {  command :string} */
trait CommandInfocommandstring extends StObject {
  
  /**
    * Which command line the command has.
    */
  var command: String
  
  /**
    * The current working directory of the process when spawned.
    */
  var cwd: js.UndefOr[String] = js.undefined
  
  /**
    * Which environment variables should the spawned process have.
    */
  var env: js.UndefOr[Record[String, Any]] = js.undefined
  
  /**
    * Command's name.
    */
  var name: String
  
  /**
    * Color to use on prefix of command.
    */
  var prefixColor: js.UndefOr[String] = js.undefined
}
object CommandInfocommandstring {
  
  inline def apply(command: String, name: String): CommandInfocommandstring = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandInfocommandstring]
  }
  
  extension [Self <: CommandInfocommandstring](x: Self) {
    
    inline def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
    
    inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
    
    inline def setEnv(value: Record[String, Any]): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPrefixColor(value: String): Self = StObject.set(x, "prefixColor", value.asInstanceOf[js.Any])
    
    inline def setPrefixColorUndefined: Self = StObject.set(x, "prefixColor", js.undefined)
  }
}
