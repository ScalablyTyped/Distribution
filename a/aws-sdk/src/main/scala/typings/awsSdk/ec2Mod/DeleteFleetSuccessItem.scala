package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteFleetSuccessItem extends js.Object {
  /**
    * The current state of the EC2 Fleet.
    */
  var CurrentFleetState: js.UndefOr[FleetStateCode] = js.native
  /**
    * The ID of the EC2 Fleet.
    */
  var FleetId: js.UndefOr[typings.awsSdk.ec2Mod.FleetId] = js.native
  /**
    * The previous state of the EC2 Fleet.
    */
  var PreviousFleetState: js.UndefOr[FleetStateCode] = js.native
}

object DeleteFleetSuccessItem {
  @scala.inline
  def apply(): DeleteFleetSuccessItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteFleetSuccessItem]
  }
  @scala.inline
  implicit class DeleteFleetSuccessItemOps[Self <: DeleteFleetSuccessItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCurrentFleetState(value: FleetStateCode): Self = this.set("CurrentFleetState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentFleetState: Self = this.set("CurrentFleetState", js.undefined)
    @scala.inline
    def setFleetId(value: FleetId): Self = this.set("FleetId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFleetId: Self = this.set("FleetId", js.undefined)
    @scala.inline
    def setPreviousFleetState(value: FleetStateCode): Self = this.set("PreviousFleetState", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreviousFleetState: Self = this.set("PreviousFleetState", js.undefined)
  }
  
}

