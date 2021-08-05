package typings.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BootstrapActionConfig extends StObject {
  
  /**
    * The name of the bootstrap action.
    */
  var Name: XmlStringMaxLen256
  
  /**
    * The script run by the bootstrap action.
    */
  var ScriptBootstrapAction: ScriptBootstrapActionConfig
}
object BootstrapActionConfig {
  
  inline def apply(Name: XmlStringMaxLen256, ScriptBootstrapAction: ScriptBootstrapActionConfig): BootstrapActionConfig = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], ScriptBootstrapAction = ScriptBootstrapAction.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapActionConfig]
  }
  
  extension [Self <: BootstrapActionConfig](x: Self) {
    
    inline def setName(value: XmlStringMaxLen256): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setScriptBootstrapAction(value: ScriptBootstrapActionConfig): Self = StObject.set(x, "ScriptBootstrapAction", value.asInstanceOf[js.Any])
  }
}
