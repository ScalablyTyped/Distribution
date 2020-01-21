package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateFleetPortSettingsOutput extends js.Object {
  /**
    * A unique identifier for a fleet that was updated.
    */
  var FleetId: js.UndefOr[typings.awsSdk.gameliftMod.FleetId] = js.native
}

object UpdateFleetPortSettingsOutput {
  @scala.inline
  def apply(FleetId: FleetId = null): UpdateFleetPortSettingsOutput = {
    val __obj = js.Dynamic.literal()
    if (FleetId != null) __obj.updateDynamic("FleetId")(FleetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFleetPortSettingsOutput]
  }
}

