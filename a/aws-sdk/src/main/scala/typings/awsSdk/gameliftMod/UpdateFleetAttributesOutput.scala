package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateFleetAttributesOutput extends js.Object {
  /**
    * A unique identifier for a fleet that was updated. Use either the fleet ID or ARN value.
    */
  var FleetId: js.UndefOr[typings.awsSdk.gameliftMod.FleetId] = js.native
}

object UpdateFleetAttributesOutput {
  @scala.inline
  def apply(): UpdateFleetAttributesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateFleetAttributesOutput]
  }
  @scala.inline
  implicit class UpdateFleetAttributesOutputOps[Self <: UpdateFleetAttributesOutput] (val x: Self) extends AnyVal {
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
    def setFleetId(value: FleetId): Self = this.set("FleetId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFleetId: Self = this.set("FleetId", js.undefined)
  }
  
}

