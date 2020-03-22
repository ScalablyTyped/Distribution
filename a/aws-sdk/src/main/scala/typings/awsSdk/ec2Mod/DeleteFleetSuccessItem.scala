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
  def apply(
    CurrentFleetState: FleetStateCode = null,
    FleetId: FleetId = null,
    PreviousFleetState: FleetStateCode = null
  ): DeleteFleetSuccessItem = {
    val __obj = js.Dynamic.literal()
    if (CurrentFleetState != null) __obj.updateDynamic("CurrentFleetState")(CurrentFleetState.asInstanceOf[js.Any])
    if (FleetId != null) __obj.updateDynamic("FleetId")(FleetId.asInstanceOf[js.Any])
    if (PreviousFleetState != null) __obj.updateDynamic("PreviousFleetState")(PreviousFleetState.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteFleetSuccessItem]
  }
}

