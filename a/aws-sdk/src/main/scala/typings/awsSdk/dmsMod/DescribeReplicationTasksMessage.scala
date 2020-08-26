package typings.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeReplicationTasksMessage extends js.Object {
  /**
    * Filters applied to replication tasks. Valid filter names: replication-task-arn | replication-task-id | migration-type | endpoint-arn | replication-instance-arn
    */
  var Filters: js.UndefOr[FilterList] = js.native
  /**
    *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
    */
  var Marker: js.UndefOr[String] = js.native
  /**
    *  The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a pagination token called a marker is included in the response so that the remaining results can be retrieved.  Default: 100 Constraints: Minimum 20, maximum 100.
    */
  var MaxRecords: js.UndefOr[IntegerOptional] = js.native
  /**
    * An option to set to avoid returning information about settings. Use this to reduce overhead when setting information is too large. To use this option, choose true; otherwise, choose false (the default).
    */
  var WithoutSettings: js.UndefOr[BooleanOptional] = js.native
}

object DescribeReplicationTasksMessage {
  @scala.inline
  def apply(): DescribeReplicationTasksMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeReplicationTasksMessage]
  }
  @scala.inline
  implicit class DescribeReplicationTasksMessageOps[Self <: DescribeReplicationTasksMessage] (val x: Self) extends AnyVal {
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
    def setFiltersVarargs(value: Filter*): Self = this.set("Filters", js.Array(value :_*))
    @scala.inline
    def setFilters(value: FilterList): Self = this.set("Filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("Filters", js.undefined)
    @scala.inline
    def setMarker(value: String): Self = this.set("Marker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
    @scala.inline
    def setMaxRecords(value: IntegerOptional): Self = this.set("MaxRecords", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxRecords: Self = this.set("MaxRecords", js.undefined)
    @scala.inline
    def setWithoutSettings(value: BooleanOptional): Self = this.set("WithoutSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWithoutSettings: Self = this.set("WithoutSettings", js.undefined)
  }
  
}

