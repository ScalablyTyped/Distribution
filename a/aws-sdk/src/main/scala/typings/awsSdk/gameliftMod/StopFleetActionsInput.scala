package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StopFleetActionsInput extends js.Object {
  
  /**
    * List of actions to suspend on the fleet. 
    */
  var Actions: FleetActionList = js.native
  
  /**
    * A unique identifier for a fleet to stop actions on. You can use either the fleet ID or ARN value.
    */
  var FleetId: FleetIdOrArn = js.native
}
object StopFleetActionsInput {
  
  @scala.inline
  def apply(Actions: FleetActionList, FleetId: FleetIdOrArn): StopFleetActionsInput = {
    val __obj = js.Dynamic.literal(Actions = Actions.asInstanceOf[js.Any], FleetId = FleetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopFleetActionsInput]
  }
  
  @scala.inline
  implicit class StopFleetActionsInputOps[Self <: StopFleetActionsInput] (val x: Self) extends AnyVal {
    
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
    def setActionsVarargs(value: FleetAction*): Self = this.set("Actions", js.Array(value :_*))
    
    @scala.inline
    def setActions(value: FleetActionList): Self = this.set("Actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFleetId(value: FleetIdOrArn): Self = this.set("FleetId", value.asInstanceOf[js.Any])
  }
}
