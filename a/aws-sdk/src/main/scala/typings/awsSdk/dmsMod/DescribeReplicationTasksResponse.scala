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
  def apply(): DescribeReplicationTasksResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeReplicationTasksResponse]
  }
  @scala.inline
  implicit class DescribeReplicationTasksResponseOps[Self <: DescribeReplicationTasksResponse] (val x: Self) extends AnyVal {
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
    def setMarker(value: String): Self = this.set("Marker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
    @scala.inline
    def setReplicationTasksVarargs(value: ReplicationTask*): Self = this.set("ReplicationTasks", js.Array(value :_*))
    @scala.inline
    def setReplicationTasks(value: ReplicationTaskList): Self = this.set("ReplicationTasks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplicationTasks: Self = this.set("ReplicationTasks", js.undefined)
  }
  
}

