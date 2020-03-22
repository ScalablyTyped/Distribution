package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteFleetErrorItem extends js.Object {
  /**
    * The error.
    */
  var Error: js.UndefOr[DeleteFleetError] = js.native
  /**
    * The ID of the EC2 Fleet.
    */
  var FleetId: js.UndefOr[typings.awsSdk.ec2Mod.FleetId] = js.native
}

object DeleteFleetErrorItem {
  @scala.inline
  def apply(Error: DeleteFleetError = null, FleetId: FleetId = null): DeleteFleetErrorItem = {
    val __obj = js.Dynamic.literal()
    if (Error != null) __obj.updateDynamic("Error")(Error.asInstanceOf[js.Any])
    if (FleetId != null) __obj.updateDynamic("FleetId")(FleetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteFleetErrorItem]
  }
}

