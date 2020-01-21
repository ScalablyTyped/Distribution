package typings.awsSdk.groundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSatelliteResponse extends js.Object {
  /**
    * When a satellite was created.
    */
  var dateCreated: js.UndefOr[Timestamp] = js.native
  /**
    * When a satellite was last updated.
    */
  var lastUpdated: js.UndefOr[Timestamp] = js.native
  /**
    * NORAD satellite ID number.
    */
  var noradSatelliteID: js.UndefOr[typings.awsSdk.groundstationMod.noradSatelliteID] = js.native
  /**
    * ARN of a satellite.
    */
  var satelliteArn: js.UndefOr[typings.awsSdk.groundstationMod.satelliteArn] = js.native
  /**
    * UUID of a satellite.
    */
  var satelliteId: js.UndefOr[Uuid] = js.native
  /**
    * Tags assigned to a satellite.
    */
  var tags: js.UndefOr[TagsMap] = js.native
}

object GetSatelliteResponse {
  @scala.inline
  def apply(
    dateCreated: Timestamp = null,
    lastUpdated: Timestamp = null,
    noradSatelliteID: Int | scala.Double = null,
    satelliteArn: satelliteArn = null,
    satelliteId: Uuid = null,
    tags: TagsMap = null
  ): GetSatelliteResponse = {
    val __obj = js.Dynamic.literal()
    if (dateCreated != null) __obj.updateDynamic("dateCreated")(dateCreated.asInstanceOf[js.Any])
    if (lastUpdated != null) __obj.updateDynamic("lastUpdated")(lastUpdated.asInstanceOf[js.Any])
    if (noradSatelliteID != null) __obj.updateDynamic("noradSatelliteID")(noradSatelliteID.asInstanceOf[js.Any])
    if (satelliteArn != null) __obj.updateDynamic("satelliteArn")(satelliteArn.asInstanceOf[js.Any])
    if (satelliteId != null) __obj.updateDynamic("satelliteId")(satelliteId.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSatelliteResponse]
  }
}

