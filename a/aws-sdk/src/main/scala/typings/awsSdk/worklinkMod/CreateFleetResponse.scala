package typings.awsSdk.worklinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateFleetResponse extends js.Object {
  /**
    * The ARN of the fleet.
    */
  var FleetArn: js.UndefOr[typings.awsSdk.worklinkMod.FleetArn] = js.native
}

object CreateFleetResponse {
  @scala.inline
  def apply(FleetArn: FleetArn = null): CreateFleetResponse = {
    val __obj = js.Dynamic.literal()
    if (FleetArn != null) __obj.updateDynamic("FleetArn")(FleetArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFleetResponse]
  }
}

