package typings.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeReplicationInstanceTaskLogsResponse extends js.Object {
  
  /**
    *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
    */
  var Marker: js.UndefOr[String] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the replication instance.
    */
  var ReplicationInstanceArn: js.UndefOr[String] = js.native
  
  /**
    * An array of replication task log metadata. Each member of the array contains the replication task name, ARN, and task log size (in bytes). 
    */
  var ReplicationInstanceTaskLogs: js.UndefOr[ReplicationInstanceTaskLogsList] = js.native
}
object DescribeReplicationInstanceTaskLogsResponse {
  
  @scala.inline
  def apply(): DescribeReplicationInstanceTaskLogsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeReplicationInstanceTaskLogsResponse]
  }
  
  @scala.inline
  implicit class DescribeReplicationInstanceTaskLogsResponseOps[Self <: DescribeReplicationInstanceTaskLogsResponse] (val x: Self) extends AnyVal {
    
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
    def setReplicationInstanceArn(value: String): Self = this.set("ReplicationInstanceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplicationInstanceArn: Self = this.set("ReplicationInstanceArn", js.undefined)
    
    @scala.inline
    def setReplicationInstanceTaskLogsVarargs(value: ReplicationInstanceTaskLog*): Self = this.set("ReplicationInstanceTaskLogs", js.Array(value :_*))
    
    @scala.inline
    def setReplicationInstanceTaskLogs(value: ReplicationInstanceTaskLogsList): Self = this.set("ReplicationInstanceTaskLogs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplicationInstanceTaskLogs: Self = this.set("ReplicationInstanceTaskLogs", js.undefined)
  }
}
