package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeSnapshotScheduleOutput extends js.Object {
  /**
    * The snapshot description.
    */
  var Description: js.UndefOr[typings.awsSdk.storagegatewayMod.Description] = js.native
  /**
    * The number of hours between snapshots.
    */
  var RecurrenceInHours: js.UndefOr[typings.awsSdk.storagegatewayMod.RecurrenceInHours] = js.native
  /**
    * The hour of the day at which the snapshot schedule begins represented as hh, where hh is the hour (0 to 23). The hour of the day is in the time zone of the gateway.
    */
  var StartAt: js.UndefOr[HourOfDay] = js.native
  /**
    * A list of up to 50 tags assigned to the snapshot schedule, sorted alphabetically by key name. Each tag is a key-value pair. For a gateway with more than 10 tags assigned, you can view all tags using the ListTagsForResource API operation.
    */
  var Tags: js.UndefOr[typings.awsSdk.storagegatewayMod.Tags] = js.native
  /**
    * A value that indicates the time zone of the gateway.
    */
  var Timezone: js.UndefOr[GatewayTimezone] = js.native
  /**
    * The Amazon Resource Name (ARN) of the volume that was specified in the request.
    */
  var VolumeARN: js.UndefOr[typings.awsSdk.storagegatewayMod.VolumeARN] = js.native
}

object DescribeSnapshotScheduleOutput {
  @scala.inline
  def apply(
    Description: Description = null,
    RecurrenceInHours: Int | Double = null,
    StartAt: Int | Double = null,
    Tags: Tags = null,
    Timezone: GatewayTimezone = null,
    VolumeARN: VolumeARN = null
  ): DescribeSnapshotScheduleOutput = {
    val __obj = js.Dynamic.literal()
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (RecurrenceInHours != null) __obj.updateDynamic("RecurrenceInHours")(RecurrenceInHours.asInstanceOf[js.Any])
    if (StartAt != null) __obj.updateDynamic("StartAt")(StartAt.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    if (Timezone != null) __obj.updateDynamic("Timezone")(Timezone.asInstanceOf[js.Any])
    if (VolumeARN != null) __obj.updateDynamic("VolumeARN")(VolumeARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeSnapshotScheduleOutput]
  }
}

