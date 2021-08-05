package typings.awsSdk.dmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTableStatisticsResponse extends StObject {
  
  /**
    *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
    */
  var Marker: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the replication task.
    */
  var ReplicationTaskArn: js.UndefOr[String] = js.undefined
  
  /**
    * The table statistics.
    */
  var TableStatistics: js.UndefOr[TableStatisticsList] = js.undefined
}
object DescribeTableStatisticsResponse {
  
  inline def apply(): DescribeTableStatisticsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTableStatisticsResponse]
  }
  
  extension [Self <: DescribeTableStatisticsResponse](x: Self) {
    
    inline def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    inline def setReplicationTaskArn(value: String): Self = StObject.set(x, "ReplicationTaskArn", value.asInstanceOf[js.Any])
    
    inline def setReplicationTaskArnUndefined: Self = StObject.set(x, "ReplicationTaskArn", js.undefined)
    
    inline def setTableStatistics(value: TableStatisticsList): Self = StObject.set(x, "TableStatistics", value.asInstanceOf[js.Any])
    
    inline def setTableStatisticsUndefined: Self = StObject.set(x, "TableStatistics", js.undefined)
    
    inline def setTableStatisticsVarargs(value: TableStatistics*): Self = StObject.set(x, "TableStatistics", js.Array(value :_*))
  }
}
