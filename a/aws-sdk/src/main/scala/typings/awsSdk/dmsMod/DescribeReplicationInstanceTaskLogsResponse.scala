package typings.awsSdk.dmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeReplicationInstanceTaskLogsResponse extends StObject {
  
  /**
    *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
    */
  var Marker: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the replication instance.
    */
  var ReplicationInstanceArn: js.UndefOr[String] = js.undefined
  
  /**
    * An array of replication task log metadata. Each member of the array contains the replication task name, ARN, and task log size (in bytes). 
    */
  var ReplicationInstanceTaskLogs: js.UndefOr[ReplicationInstanceTaskLogsList] = js.undefined
}
object DescribeReplicationInstanceTaskLogsResponse {
  
  @scala.inline
  def apply(): DescribeReplicationInstanceTaskLogsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeReplicationInstanceTaskLogsResponse]
  }
  
  @scala.inline
  implicit class DescribeReplicationInstanceTaskLogsResponseMutableBuilder[Self <: DescribeReplicationInstanceTaskLogsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    @scala.inline
    def setReplicationInstanceArn(value: String): Self = StObject.set(x, "ReplicationInstanceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicationInstanceArnUndefined: Self = StObject.set(x, "ReplicationInstanceArn", js.undefined)
    
    @scala.inline
    def setReplicationInstanceTaskLogs(value: ReplicationInstanceTaskLogsList): Self = StObject.set(x, "ReplicationInstanceTaskLogs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicationInstanceTaskLogsUndefined: Self = StObject.set(x, "ReplicationInstanceTaskLogs", js.undefined)
    
    @scala.inline
    def setReplicationInstanceTaskLogsVarargs(value: ReplicationInstanceTaskLog*): Self = StObject.set(x, "ReplicationInstanceTaskLogs", js.Array(value :_*))
  }
}
