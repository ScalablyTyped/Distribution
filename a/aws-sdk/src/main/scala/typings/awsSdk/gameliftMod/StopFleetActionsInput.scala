package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopFleetActionsInput extends js.Object {
  /**
    * List of actions to suspend on the fleet. 
    */
  var Actions: FleetActionList = js.native
  /**
    * A unique identifier for a fleet to stop actions on. You can use either the fleet ID or ARN value.
    */
  var FleetId: typings.awsSdk.gameliftMod.FleetId = js.native
}

object StopFleetActionsInput {
  @scala.inline
  def apply(Actions: FleetActionList, FleetId: FleetId): StopFleetActionsInput = {
    val __obj = js.Dynamic.literal(Actions = Actions.asInstanceOf[js.Any], FleetId = FleetId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StopFleetActionsInput]
  }
}

