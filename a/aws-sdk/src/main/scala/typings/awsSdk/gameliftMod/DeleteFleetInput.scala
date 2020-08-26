package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteFleetInput extends js.Object {
  /**
    * A unique identifier for a fleet to be deleted. You can use either the fleet ID or ARN value.
    */
  var FleetId: FleetIdOrArn = js.native
}

object DeleteFleetInput {
  @scala.inline
  def apply(FleetId: FleetIdOrArn): DeleteFleetInput = {
    val __obj = js.Dynamic.literal(FleetId = FleetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteFleetInput]
  }
  @scala.inline
  implicit class DeleteFleetInputOps[Self <: DeleteFleetInput] (val x: Self) extends AnyVal {
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
    def setFleetId(value: FleetIdOrArn): Self = this.set("FleetId", value.asInstanceOf[js.Any])
  }
  
}

