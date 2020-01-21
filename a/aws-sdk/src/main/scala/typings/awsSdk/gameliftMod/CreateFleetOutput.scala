package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateFleetOutput extends js.Object {
  /**
    * Properties for the newly created fleet.
    */
  var FleetAttributes: js.UndefOr[typings.awsSdk.gameliftMod.FleetAttributes] = js.native
}

object CreateFleetOutput {
  @scala.inline
  def apply(FleetAttributes: FleetAttributes = null): CreateFleetOutput = {
    val __obj = js.Dynamic.literal()
    if (FleetAttributes != null) __obj.updateDynamic("FleetAttributes")(FleetAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFleetOutput]
  }
}

