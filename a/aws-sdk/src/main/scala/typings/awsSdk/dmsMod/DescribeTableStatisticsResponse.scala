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
  
  @scala.inline
  def apply(): DescribeTableStatisticsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTableStatisticsResponse]
  }
  
  @scala.inline
  implicit class DescribeTableStatisticsResponseMutableBuilder[Self <: DescribeTableStatisticsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    @scala.inline
    def setReplicationTaskArn(value: String): Self = StObject.set(x, "ReplicationTaskArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicationTaskArnUndefined: Self = StObject.set(x, "ReplicationTaskArn", js.undefined)
    
    @scala.inline
    def setTableStatistics(value: TableStatisticsList): Self = StObject.set(x, "TableStatistics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableStatisticsUndefined: Self = StObject.set(x, "TableStatistics", js.undefined)
    
    @scala.inline
    def setTableStatisticsVarargs(value: TableStatistics*): Self = StObject.set(x, "TableStatistics", js.Array(value :_*))
  }
}
