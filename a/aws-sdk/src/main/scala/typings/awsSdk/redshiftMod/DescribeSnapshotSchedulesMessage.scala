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
  def apply(
    ClusterIdentifier: String = null,
    Marker: String = null,
    MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
    ScheduleIdentifier: String = null,
    TagKeys: TagKeyList = null,
    TagValues: TagValueList = null
  ): DescribeSnapshotSchedulesMessage = {
    val __obj = js.Dynamic.literal()
    if (ClusterIdentifier != null) __obj.updateDynamic("ClusterIdentifier")(ClusterIdentifier.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxRecords)) __obj.updateDynamic("MaxRecords")(MaxRecords.get.asInstanceOf[js.Any])
    if (ScheduleIdentifier != null) __obj.updateDynamic("ScheduleIdentifier")(ScheduleIdentifier.asInstanceOf[js.Any])
    if (TagKeys != null) __obj.updateDynamic("TagKeys")(TagKeys.asInstanceOf[js.Any])
    if (TagValues != null) __obj.updateDynamic("TagValues")(TagValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeSnapshotSchedulesMessage]
  }
}

