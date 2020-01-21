package typings.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeReplicationTasksResponse extends js.Object {
  /**
    *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
    */
  var Marker: js.UndefOr[String] = js.native
  /**
    * A description of the replication tasks.
    */
  var ReplicationTasks: js.UndefOr[ReplicationTaskList] = js.native
}

object DescribeReplicationTasksResponse {
  @scala.inline
  def apply(Marker: String = null, ReplicationTasks: ReplicationTaskList = null): DescribeReplicationTasksResponse = {
    val __obj = js.Dynamic.literal()
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    if (ReplicationTasks != null) __obj.updateDynamic("ReplicationTasks")(ReplicationTasks.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeReplicationTasksResponse]
  }
}

