package typings.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeReplicationInstancesResponse extends js.Object {
  
  /**
    *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
    */
  var Marker: js.UndefOr[String] = js.native
  
  /**
    * The replication instances described.
    */
  var ReplicationInstances: js.UndefOr[ReplicationInstanceList] = js.native
}
object DescribeReplicationInstancesResponse {
  
  @scala.inline
  def apply(): DescribeReplicationInstancesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeReplicationInstancesResponse]
  }
  
  @scala.inline
  implicit class DescribeReplicationInstancesResponseOps[Self <: DescribeReplicationInstancesResponse] (val x: Self) extends AnyVal {
    
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
    def setReplicationInstancesVarargs(value: ReplicationInstance*): Self = this.set("ReplicationInstances", js.Array(value :_*))
    
    @scala.inline
    def setReplicationInstances(value: ReplicationInstanceList): Self = this.set("ReplicationInstances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplicationInstances: Self = this.set("ReplicationInstances", js.undefined)
  }
}
