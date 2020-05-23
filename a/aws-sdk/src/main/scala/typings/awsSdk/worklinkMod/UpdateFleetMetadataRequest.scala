package typings.awsSdk.worklinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateFleetMetadataRequest extends js.Object {
  /**
    * The fleet name to display. The existing DisplayName is unset if null is passed.
    */
  var DisplayName: js.UndefOr[typings.awsSdk.worklinkMod.DisplayName] = js.native
  /**
    * The ARN of the fleet.
    */
  var FleetArn: typings.awsSdk.worklinkMod.FleetArn = js.native
  /**
    * The option to optimize for better performance by routing traffic through the closest AWS Region to users, which may be outside of your home Region.
    */
  var OptimizeForEndUserLocation: js.UndefOr[Boolean] = js.native
}

object UpdateFleetMetadataRequest {
  @scala.inline
  def apply(
    FleetArn: FleetArn,
    DisplayName: DisplayName = null,
    OptimizeForEndUserLocation: js.UndefOr[Boolean] = js.undefined
  ): UpdateFleetMetadataRequest = {
    val __obj = js.Dynamic.literal(FleetArn = FleetArn.asInstanceOf[js.Any])
    if (DisplayName != null) __obj.updateDynamic("DisplayName")(DisplayName.asInstanceOf[js.Any])
    if (!js.isUndefined(OptimizeForEndUserLocation)) __obj.updateDynamic("OptimizeForEndUserLocation")(OptimizeForEndUserLocation.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFleetMetadataRequest]
  }
}

