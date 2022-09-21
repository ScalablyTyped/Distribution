package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDBProxyEndpointsResponse extends StObject {
  
  /**
    * The list of ProxyEndpoint objects returned by the API operation.
    */
  var DBProxyEndpoints: js.UndefOr[DBProxyEndpointList] = js.undefined
  
  /**
    * An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
    */
  var Marker: js.UndefOr[String] = js.undefined
}
object DescribeDBProxyEndpointsResponse {
  
  inline def apply(): DescribeDBProxyEndpointsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDBProxyEndpointsResponse]
  }
  
  extension [Self <: DescribeDBProxyEndpointsResponse](x: Self) {
    
    inline def setDBProxyEndpoints(value: DBProxyEndpointList): Self = StObject.set(x, "DBProxyEndpoints", value.asInstanceOf[js.Any])
    
    inline def setDBProxyEndpointsUndefined: Self = StObject.set(x, "DBProxyEndpoints", js.undefined)
    
    inline def setDBProxyEndpointsVarargs(value: DBProxyEndpoint*): Self = StObject.set(x, "DBProxyEndpoints", js.Array(value*))
    
    inline def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
  }
}
