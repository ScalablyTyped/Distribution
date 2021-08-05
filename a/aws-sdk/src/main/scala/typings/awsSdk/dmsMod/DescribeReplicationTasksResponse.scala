package typings.awsSdk.dmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeReplicationTasksResponse extends StObject {
  
  /**
    *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
    */
  var Marker: js.UndefOr[String] = js.undefined
  
  /**
    * A description of the replication tasks.
    */
  var ReplicationTasks: js.UndefOr[ReplicationTaskList] = js.undefined
}
object DescribeReplicationTasksResponse {
  
  inline def apply(): DescribeReplicationTasksResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeReplicationTasksResponse]
  }
  
  extension [Self <: DescribeReplicationTasksResponse](x: Self) {
    
    inline def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    inline def setReplicationTasks(value: ReplicationTaskList): Self = StObject.set(x, "ReplicationTasks", value.asInstanceOf[js.Any])
    
    inline def setReplicationTasksUndefined: Self = StObject.set(x, "ReplicationTasks", js.undefined)
    
    inline def setReplicationTasksVarargs(value: ReplicationTask*): Self = StObject.set(x, "ReplicationTasks", js.Array(value :_*))
  }
}
