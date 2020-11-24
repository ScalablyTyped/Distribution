package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BootstrapActionConfig extends js.Object {
  
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
  implicit class BootstrapActionConfigOps[Self <: BootstrapActionConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setName(value: XmlStringMaxLen256): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScriptBootstrapAction(value: ScriptBootstrapActionConfig): Self = this.set("ScriptBootstrapAction", value.asInstanceOf[js.Any])
  }
}
