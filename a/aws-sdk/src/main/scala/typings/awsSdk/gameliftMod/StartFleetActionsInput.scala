package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartFleetActionsInput extends js.Object {
  /**
    * List of actions to restart on the fleet.
    */
  var Actions: FleetActionList = js.native
  /**
    * A unique identifier for a fleet to start actions on. You can use either the fleet ID or ARN value.
    */
  var FleetId: FleetIdOrArn = js.native
}

object StartFleetActionsInput {
  @scala.inline
  def apply(Actions: FleetActionList, FleetId: FleetIdOrArn): StartFleetActionsInput = {
    val __obj = js.Dynamic.literal(Actions = Actions.asInstanceOf[js.Any], FleetId = FleetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartFleetActionsInput]
  }
  @scala.inline
  implicit class StartFleetActionsInputOps[Self <: StartFleetActionsInput] (val x: Self) extends AnyVal {
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

