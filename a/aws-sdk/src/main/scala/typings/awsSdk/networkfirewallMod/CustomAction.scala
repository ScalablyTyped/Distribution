package typings.awsSdk.networkfirewallMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomAction extends StObject {
  
  /**
    * The custom action associated with the action name.
    */
  var ActionDefinition: typings.awsSdk.networkfirewallMod.ActionDefinition
  
  /**
    * The descriptive name of the custom action. You can't change the name of a custom action after you create it.
    */
  var ActionName: typings.awsSdk.networkfirewallMod.ActionName
}
object CustomAction {
  
  @scala.inline
  def apply(ActionDefinition: ActionDefinition, ActionName: ActionName): CustomAction = {
    val __obj = js.Dynamic.literal(ActionDefinition = ActionDefinition.asInstanceOf[js.Any], ActionName = ActionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomAction]
  }
  
  @scala.inline
  implicit class CustomActionMutableBuilder[Self <: CustomAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionDefinition(value: ActionDefinition): Self = StObject.set(x, "ActionDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionName(value: ActionName): Self = StObject.set(x, "ActionName", value.asInstanceOf[js.Any])
  }
}
