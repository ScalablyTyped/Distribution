package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteFleetInput extends js.Object {
  /**
    * A unique identifier for a fleet to be deleted. You can use either the fleet ID or ARN value.
    */
  var FleetId: typings.awsSdk.gameliftMod.FleetId = js.native
}

object DeleteFleetInput {
  @scala.inline
  def apply(FleetId: FleetId): DeleteFleetInput = {
    val __obj = js.Dynamic.literal(FleetId = FleetId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteFleetInput]
  }
}

