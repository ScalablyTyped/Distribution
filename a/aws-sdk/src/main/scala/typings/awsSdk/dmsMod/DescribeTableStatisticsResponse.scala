package typings.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeTableStatisticsResponse extends js.Object {
  
  /**
    *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
    */
  var Marker: js.UndefOr[String] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the replication task.
    */
  var ReplicationTaskArn: js.UndefOr[String] = js.native
  
  /**
    * The table statistics.
    */
  var TableStatistics: js.UndefOr[TableStatisticsList] = js.native
}
object DescribeTableStatisticsResponse {
  
  @scala.inline
  def apply(): DescribeTableStatisticsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTableStatisticsResponse]
  }
  
  @scala.inline
  implicit class DescribeTableStatisticsResponseOps[Self <: DescribeTableStatisticsResponse] (val x: Self) extends AnyVal {
    
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
    def setReplicationTaskArn(value: String): Self = this.set("ReplicationTaskArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplicationTaskArn: Self = this.set("ReplicationTaskArn", js.undefined)
    
    @scala.inline
    def setTableStatisticsVarargs(value: TableStatistics*): Self = this.set("TableStatistics", js.Array(value :_*))
    
    @scala.inline
    def setTableStatistics(value: TableStatisticsList): Self = this.set("TableStatistics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableStatistics: Self = this.set("TableStatistics", js.undefined)
  }
}
