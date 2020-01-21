package typings.awsSdk.worklinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateFleetRequest extends js.Object {
  /**
    * The fleet name to display.
    */
  var DisplayName: js.UndefOr[typings.awsSdk.worklinkMod.DisplayName] = js.native
  /**
    * A unique name for the fleet.
    */
  var FleetName: typings.awsSdk.worklinkMod.FleetName = js.native
  /**
    * The option to optimize for better performance by routing traffic through the closest AWS Region to users, which may be outside of your home Region.
    */
  var OptimizeForEndUserLocation: js.UndefOr[Boolean] = js.native
}

object CreateFleetRequest {
  @scala.inline
  def apply(
    FleetName: FleetName,
    DisplayName: DisplayName = null,
    OptimizeForEndUserLocation: js.UndefOr[scala.Boolean] = js.undefined
  ): CreateFleetRequest = {
    val __obj = js.Dynamic.literal(FleetName = FleetName.asInstanceOf[js.Any])
    if (DisplayName != null) __obj.updateDynamic("DisplayName")(DisplayName.asInstanceOf[js.Any])
    if (!js.isUndefined(OptimizeForEndUserLocation)) __obj.updateDynamic("OptimizeForEndUserLocation")(OptimizeForEndUserLocation.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFleetRequest]
  }
}

