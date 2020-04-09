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
}

