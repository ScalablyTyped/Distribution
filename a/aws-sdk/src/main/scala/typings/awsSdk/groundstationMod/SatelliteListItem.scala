package typings.awsSdk.groundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SatelliteListItem extends js.Object {
  /**
    * NORAD satellite ID number.
    */
  var noradSatelliteID: js.UndefOr[typings.awsSdk.groundstationMod.noradSatelliteID] = js.native
  /**
    * ARN of a satellite.
    */
  var satelliteArn: js.UndefOr[typings.awsSdk.groundstationMod.satelliteArn] = js.native
  /**
    * ID of a satellite.
    */
  var satelliteId: js.UndefOr[Uuid] = js.native
}

object SatelliteListItem {
  @scala.inline
  def apply(
    noradSatelliteID: Int | scala.Double = null,
    satelliteArn: satelliteArn = null,
    satelliteId: Uuid = null
  ): SatelliteListItem = {
    val __obj = js.Dynamic.literal()
    if (noradSatelliteID != null) __obj.updateDynamic("noradSatelliteID")(noradSatelliteID.asInstanceOf[js.Any])
    if (satelliteArn != null) __obj.updateDynamic("satelliteArn")(satelliteArn.asInstanceOf[js.Any])
    if (satelliteId != null) __obj.updateDynamic("satelliteId")(satelliteId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SatelliteListItem]
  }
}

