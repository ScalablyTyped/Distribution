package typings.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BootstrapActionConfig extends StObject {
  
  /**
    * The name of the bootstrap action.
    */
  var Name: XmlStringMaxLen256 = js.native
  
  /**
    * The script run by the bootstrap action.
    */
  var ScriptBootstrapAction: ScriptBootstrapActionConfig = js.native
}
object BootstrapActionConfig {
  
  @scala.inline
  def apply(Name: XmlStringMaxLen256, ScriptBootstrapAction: ScriptBootstrapActionConfig): BootstrapActionConfig = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], ScriptBootstrapAction = ScriptBootstrapAction.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapActionConfig]
  }
  
  @scala.inline
  implicit class BootstrapActionConfigMutableBuilder[Self <: BootstrapActionConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: XmlStringMaxLen256): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScriptBootstrapAction(value: ScriptBootstrapActionConfig): Self = StObject.set(x, "ScriptBootstrapAction", value.asInstanceOf[js.Any])
  }
}
