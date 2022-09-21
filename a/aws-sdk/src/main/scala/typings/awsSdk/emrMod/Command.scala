package typings.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Command extends StObject {
  
  /**
    * Arguments for Amazon EMR to pass to the command for execution.
    */
  var Args: js.UndefOr[StringList] = js.undefined
  
  /**
    * The name of the command.
    */
  var Name: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon S3 location of the command script.
    */
  var ScriptPath: js.UndefOr[String] = js.undefined
}
object Command {
  
  inline def apply(): Command = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Command]
  }
  
  extension [Self <: Command](x: Self) {
    
    inline def setArgs(value: StringList): Self = StObject.set(x, "Args", value.asInstanceOf[js.Any])
    
    inline def setArgsUndefined: Self = StObject.set(x, "Args", js.undefined)
    
    inline def setArgsVarargs(value: String*): Self = StObject.set(x, "Args", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setScriptPath(value: String): Self = StObject.set(x, "ScriptPath", value.asInstanceOf[js.Any])
    
    inline def setScriptPathUndefined: Self = StObject.set(x, "ScriptPath", js.undefined)
  }
}
