package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DBClusterEndpointMessage extends StObject {
  
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
  implicit class DBClusterEndpointMessageMutableBuilder[Self <: DBClusterEndpointMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDBClusterEndpoints(value: DBClusterEndpointList): Self = StObject.set(x, "DBClusterEndpoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBClusterEndpointsUndefined: Self = StObject.set(x, "DBClusterEndpoints", js.undefined)
    
    @scala.inline
    def setDBClusterEndpointsVarargs(value: DBClusterEndpoint*): Self = StObject.set(x, "DBClusterEndpoints", js.Array(value :_*))
    
    @scala.inline
    def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
  }
}
