package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeSnapshotSchedulesMessage extends js.Object {
  /**
    * The unique identifier for the cluster whose snapshot schedules you want to view.
    */
  var ClusterIdentifier: js.UndefOr[String] = js.native
  /**
    * A value that indicates the starting point for the next set of response records in a subsequent request. If a value is returned in a response, you can retrieve the next set of records by providing this returned marker value in the marker parameter and retrying the command. If the marker field is empty, all response records have been retrieved for the request.
    */
  var Marker: js.UndefOr[String] = js.native
  /**
    * The maximum number or response records to return in each call. If the number of remaining response records exceeds the specified MaxRecords value, a value is returned in a marker field of the response. You can retrieve the next set of records by retrying the command with the returned marker value.
    */
  var MaxRecords: js.UndefOr[IntegerOptional] = js.native
  /**
    * A unique identifier for a snapshot schedule.
    */
  var ScheduleIdentifier: js.UndefOr[String] = js.native
  /**
    * The key value for a snapshot schedule tag.
    */
  var TagKeys: js.UndefOr[TagKeyList] = js.native
  /**
    * The value corresponding to the key of the snapshot schedule tag.
    */
  var TagValues: js.UndefOr[TagValueList] = js.native
}

object DescribeSnapshotSchedulesMessage {
  @scala.inline
  def apply(): DescribeSnapshotSchedulesMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSnapshotSchedulesMessage]
  }
  @scala.inline
  implicit class DescribeSnapshotSchedulesMessageOps[Self <: DescribeSnapshotSchedulesMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClusterIdentifier(value: String): Self = this.set("ClusterIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClusterIdentifier: Self = this.set("ClusterIdentifier", js.undefined)
    @scala.inline
    def setMarker(value: String): Self = this.set("Marker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
    @scala.inline
    def setMaxRecords(value: IntegerOptional): Self = this.set("MaxRecords", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxRecords: Self = this.set("MaxRecords", js.undefined)
    @scala.inline
    def setScheduleIdentifier(value: String): Self = this.set("ScheduleIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScheduleIdentifier: Self = this.set("ScheduleIdentifier", js.undefined)
    @scala.inline
    def setTagKeysVarargs(value: String*): Self = this.set("TagKeys", js.Array(value :_*))
    @scala.inline
    def setTagKeys(value: TagKeyList): Self = this.set("TagKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTagKeys: Self = this.set("TagKeys", js.undefined)
    @scala.inline
    def setTagValuesVarargs(value: String*): Self = this.set("TagValues", js.Array(value :_*))
    @scala.inline
    def setTagValues(value: TagValueList): Self = this.set("TagValues", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTagValues: Self = this.set("TagValues", js.undefined)
  }
  
}

