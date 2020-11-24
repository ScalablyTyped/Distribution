package typings.azure.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Requirement extends js.Object {
  
  var SettingName: String = js.native
  
  var SettingPredicate: js.Function = js.native
}
object Requirement {
  
  @scala.inline
  def apply(SettingName: String, SettingPredicate: js.Function): Requirement = {
    val __obj = js.Dynamic.literal(SettingName = SettingName.asInstanceOf[js.Any], SettingPredicate = SettingPredicate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Requirement]
  }
  
  @scala.inline
  implicit class RequirementOps[Self <: Requirement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSettingName(value: String): Self = this.set("SettingName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettingPredicate(value: js.Function): Self = this.set("SettingPredicate", value.asInstanceOf[js.Any])
  }
}
