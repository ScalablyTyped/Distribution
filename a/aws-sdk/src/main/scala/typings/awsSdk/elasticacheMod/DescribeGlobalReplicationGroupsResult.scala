package typings.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeGlobalReplicationGroupsResult extends js.Object {
  /**
    * Indicates the slot configuration and global identifier for each slice group.
    */
  var GlobalReplicationGroups: js.UndefOr[GlobalReplicationGroupList] = js.native
  /**
    * An optional marker returned from a prior request. Use this marker for pagination of results from this operation. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. &gt;
    */
  var Marker: js.UndefOr[String] = js.native
}

object DescribeGlobalReplicationGroupsResult {
  @scala.inline
  def apply(GlobalReplicationGroups: GlobalReplicationGroupList = null, Marker: String = null): DescribeGlobalReplicationGroupsResult = {
    val __obj = js.Dynamic.literal()
    if (GlobalReplicationGroups != null) __obj.updateDynamic("GlobalReplicationGroups")(GlobalReplicationGroups.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeGlobalReplicationGroupsResult]
  }
}

