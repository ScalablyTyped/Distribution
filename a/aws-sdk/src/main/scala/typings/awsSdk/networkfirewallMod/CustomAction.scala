package typings.awsSdk.networkfirewallMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomAction extends js.Object {
  
  /**
    * The custom action associated with the action name.
    */
  var ActionDefinition: typings.awsSdk.networkfirewallMod.ActionDefinition = js.native
  
  /**
    * The descriptive name of the custom action. You can't change the name of a custom action after you create it.
    */
  var ActionName: typings.awsSdk.networkfirewallMod.ActionName = js.native
}
object CustomAction {
  
  @scala.inline
  def apply(ActionDefinition: ActionDefinition, ActionName: ActionName): CustomAction = {
    val __obj = js.Dynamic.literal(ActionDefinition = ActionDefinition.asInstanceOf[js.Any], ActionName = ActionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomAction]
  }
  
  @scala.inline
  implicit class CustomActionOps[Self <: CustomAction] (val x: Self) extends AnyVal {
    
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
    def setActionDefinition(value: ActionDefinition): Self = this.set("ActionDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionName(value: ActionName): Self = this.set("ActionName", value.asInstanceOf[js.Any])
  }
}
