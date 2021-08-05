package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DBClusterEndpointMessage extends StObject {
  
  /**
    * Contains the details of the endpoints associated with the cluster and matching any filter conditions.
    */
  var DBClusterEndpoints: js.UndefOr[DBClusterEndpointList] = js.undefined
  
  /**
    *  An optional pagination token provided by a previous DescribeDBClusterEndpoints request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
    */
  var Marker: js.UndefOr[String] = js.undefined
}
object DBClusterEndpointMessage {
  
  inline def apply(): DBClusterEndpointMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DBClusterEndpointMessage]
  }
  
  extension [Self <: DBClusterEndpointMessage](x: Self) {
    
    inline def setDBClusterEndpoints(value: DBClusterEndpointList): Self = StObject.set(x, "DBClusterEndpoints", value.asInstanceOf[js.Any])
    
    inline def setDBClusterEndpointsUndefined: Self = StObject.set(x, "DBClusterEndpoints", js.undefined)
    
    inline def setDBClusterEndpointsVarargs(value: DBClusterEndpoint*): Self = StObject.set(x, "DBClusterEndpoints", js.Array(value :_*))
    
    inline def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
  }
}
