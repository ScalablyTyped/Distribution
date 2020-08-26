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
  def apply(): DescribeGlobalReplicationGroupsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeGlobalReplicationGroupsResult]
  }
  @scala.inline
  implicit class DescribeGlobalReplicationGroupsResultOps[Self <: DescribeGlobalReplicationGroupsResult] (val x: Self) extends AnyVal {
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
    def setGlobalReplicationGroupsVarargs(value: GlobalReplicationGroup*): Self = this.set("GlobalReplicationGroups", js.Array(value :_*))
    @scala.inline
    def setGlobalReplicationGroups(value: GlobalReplicationGroupList): Self = this.set("GlobalReplicationGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlobalReplicationGroups: Self = this.set("GlobalReplicationGroups", js.undefined)
    @scala.inline
    def setMarker(value: String): Self = this.set("Marker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
  }
  
}

