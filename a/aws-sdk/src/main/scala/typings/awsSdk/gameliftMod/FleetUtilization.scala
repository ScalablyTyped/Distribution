package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FleetUtilization extends js.Object {
  /**
    * Number of active game sessions currently being hosted on all instances in the fleet.
    */
  var ActiveGameSessionCount: js.UndefOr[WholeNumber] = js.native
  /**
    * Number of server processes in an ACTIVE status currently running across all instances in the fleet
    */
  var ActiveServerProcessCount: js.UndefOr[WholeNumber] = js.native
  /**
    * Number of active player sessions currently being hosted on all instances in the fleet.
    */
  var CurrentPlayerSessionCount: js.UndefOr[WholeNumber] = js.native
  /**
    * A unique identifier for a fleet.
    */
  var FleetId: js.UndefOr[typings.awsSdk.gameliftMod.FleetId] = js.native
  /**
    * The maximum number of players allowed across all game sessions currently being hosted on all instances in the fleet.
    */
  var MaximumPlayerSessionCount: js.UndefOr[WholeNumber] = js.native
}

object FleetUtilization {
  @scala.inline
  def apply(
    ActiveGameSessionCount: js.UndefOr[WholeNumber] = js.undefined,
    ActiveServerProcessCount: js.UndefOr[WholeNumber] = js.undefined,
    CurrentPlayerSessionCount: js.UndefOr[WholeNumber] = js.undefined,
    FleetId: FleetId = null,
    MaximumPlayerSessionCount: js.UndefOr[WholeNumber] = js.undefined
  ): FleetUtilization = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ActiveGameSessionCount)) __obj.updateDynamic("ActiveGameSessionCount")(ActiveGameSessionCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ActiveServerProcessCount)) __obj.updateDynamic("ActiveServerProcessCount")(ActiveServerProcessCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(CurrentPlayerSessionCount)) __obj.updateDynamic("CurrentPlayerSessionCount")(CurrentPlayerSessionCount.get.asInstanceOf[js.Any])
    if (FleetId != null) __obj.updateDynamic("FleetId")(FleetId.asInstanceOf[js.Any])
    if (!js.isUndefined(MaximumPlayerSessionCount)) __obj.updateDynamic("MaximumPlayerSessionCount")(MaximumPlayerSessionCount.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FleetUtilization]
  }
}

