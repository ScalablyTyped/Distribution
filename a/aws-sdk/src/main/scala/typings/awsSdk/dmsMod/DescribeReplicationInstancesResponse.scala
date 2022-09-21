package typings.awsSdk.dmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeReplicationInstancesResponse extends StObject {
  
  /**
    *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
    */
  var Marker: js.UndefOr[String] = js.undefined
  
  /**
    * The replication instances described.
    */
  var ReplicationInstances: js.UndefOr[ReplicationInstanceList] = js.undefined
}
object DescribeReplicationInstancesResponse {
  
  inline def apply(): DescribeReplicationInstancesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeReplicationInstancesResponse]
  }
  
  extension [Self <: DescribeReplicationInstancesResponse](x: Self) {
    
    inline def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    inline def setReplicationInstances(value: ReplicationInstanceList): Self = StObject.set(x, "ReplicationInstances", value.asInstanceOf[js.Any])
    
    inline def setReplicationInstancesUndefined: Self = StObject.set(x, "ReplicationInstances", js.undefined)
    
    inline def setReplicationInstancesVarargs(value: ReplicationInstance*): Self = StObject.set(x, "ReplicationInstances", js.Array(value*))
  }
}
