package typings.awsSdk.groundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroundStationData extends js.Object {
  /**
    * ID of a ground station.
    */
  var groundStationId: js.UndefOr[String] = js.native
  /**
    * Name of a ground station.
    */
  var groundStationName: js.UndefOr[String] = js.native
  /**
    * Ground station Region.
    */
  var region: js.UndefOr[String] = js.native
}

object GroundStationData {
  @scala.inline
  def apply(groundStationId: String = null, groundStationName: String = null, region: String = null): GroundStationData = {
    val __obj = js.Dynamic.literal()
    if (groundStationId != null) __obj.updateDynamic("groundStationId")(groundStationId.asInstanceOf[js.Any])
    if (groundStationName != null) __obj.updateDynamic("groundStationName")(groundStationName.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroundStationData]
  }
}

