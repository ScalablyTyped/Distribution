package typings.awsSdk.neptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DBClusterEndpointMessage extends js.Object {
  
  /**
    * Contains the details of the endpoints associated with the cluster and matching any filter conditions.
    */
  var DBClusterEndpoints: js.UndefOr[DBClusterEndpointList] = js.native
  
  /**
    *  An optional pagination token provided by a previous DescribeDBClusterEndpoints request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
    */
  var Marker: js.UndefOr[String] = js.native
}
object DBClusterEndpointMessage {
  
  @scala.inline
  def apply(): DBClusterEndpointMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DBClusterEndpointMessage]
  }
  
  @scala.inline
  implicit class DBClusterEndpointMessageOps[Self <: DBClusterEndpointMessage] (val x: Self) extends AnyVal {
    
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
    def setDBClusterEndpointsVarargs(value: DBClusterEndpoint*): Self = this.set("DBClusterEndpoints", js.Array(value :_*))
    
    @scala.inline
    def setDBClusterEndpoints(value: DBClusterEndpointList): Self = this.set("DBClusterEndpoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDBClusterEndpoints: Self = this.set("DBClusterEndpoints", js.undefined)
    
    @scala.inline
    def setMarker(value: String): Self = this.set("Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
  }
}
