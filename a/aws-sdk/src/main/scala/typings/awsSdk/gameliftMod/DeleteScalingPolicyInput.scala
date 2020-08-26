package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteScalingPolicyInput extends js.Object {
  /**
    * A unique identifier for a fleet to be deleted. You can use either the fleet ID or ARN value.
    */
  var FleetId: FleetIdOrArn = js.native
  /**
    * A descriptive label that is associated with a scaling policy. Policy names do not need to be unique.
    */
  var Name: NonZeroAndMaxString = js.native
}

object DeleteScalingPolicyInput {
  @scala.inline
  def apply(FleetId: FleetIdOrArn, Name: NonZeroAndMaxString): DeleteScalingPolicyInput = {
    val __obj = js.Dynamic.literal(FleetId = FleetId.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteScalingPolicyInput]
  }
  @scala.inline
  implicit class DeleteScalingPolicyInputOps[Self <: DeleteScalingPolicyInput] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setName(value: NonZeroAndMaxString): Self = this.set("Name", value.asInstanceOf[js.Any])
  }
  
}

