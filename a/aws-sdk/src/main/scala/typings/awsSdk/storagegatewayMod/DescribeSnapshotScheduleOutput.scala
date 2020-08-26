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
  def apply(): DescribeSnapshotScheduleOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSnapshotScheduleOutput]
  }
  @scala.inline
  implicit class DescribeSnapshotScheduleOutputOps[Self <: DescribeSnapshotScheduleOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDescription(value: Description): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setRecurrenceInHours(value: RecurrenceInHours): Self = this.set("RecurrenceInHours", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecurrenceInHours: Self = this.set("RecurrenceInHours", js.undefined)
    @scala.inline
    def setStartAt(value: HourOfDay): Self = this.set("StartAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartAt: Self = this.set("StartAt", js.undefined)
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: Tags): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
    @scala.inline
    def setTimezone(value: GatewayTimezone): Self = this.set("Timezone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimezone: Self = this.set("Timezone", js.undefined)
    @scala.inline
    def setVolumeARN(value: VolumeARN): Self = this.set("VolumeARN", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVolumeARN: Self = this.set("VolumeARN", js.undefined)
  }
  
}

