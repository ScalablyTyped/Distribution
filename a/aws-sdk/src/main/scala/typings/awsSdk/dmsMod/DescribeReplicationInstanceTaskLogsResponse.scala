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
  
  inline def apply(): DescribeReplicationInstanceTaskLogsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeReplicationInstanceTaskLogsResponse]
  }
  
  extension [Self <: DescribeReplicationInstanceTaskLogsResponse](x: Self) {
    
    inline def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    inline def setReplicationInstanceArn(value: String): Self = StObject.set(x, "ReplicationInstanceArn", value.asInstanceOf[js.Any])
    
    inline def setReplicationInstanceArnUndefined: Self = StObject.set(x, "ReplicationInstanceArn", js.undefined)
    
    inline def setReplicationInstanceTaskLogs(value: ReplicationInstanceTaskLogsList): Self = StObject.set(x, "ReplicationInstanceTaskLogs", value.asInstanceOf[js.Any])
    
    inline def setReplicationInstanceTaskLogsUndefined: Self = StObject.set(x, "ReplicationInstanceTaskLogs", js.undefined)
    
    inline def setReplicationInstanceTaskLogsVarargs(value: ReplicationInstanceTaskLog*): Self = StObject.set(x, "ReplicationInstanceTaskLogs", js.Array(value :_*))
  }
}
