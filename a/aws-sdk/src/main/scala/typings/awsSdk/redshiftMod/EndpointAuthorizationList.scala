package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EndpointAuthorizationList extends StObject {
  
  /**
    * The authorizations to an endpoint.
    */
  var EndpointAuthorizationList: js.UndefOr[EndpointAuthorizations] = js.undefined
  
  /**
    * An optional pagination token provided by a previous DescribeEndpointAuthorization request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by the MaxRecords parameter.
    */
  var Marker: js.UndefOr[String] = js.undefined
}
object EndpointAuthorizationList {
  
  inline def apply(): EndpointAuthorizationList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndpointAuthorizationList]
  }
  
  extension [Self <: EndpointAuthorizationList](x: Self) {
    
    inline def setEndpointAuthorizationList(value: EndpointAuthorizations): Self = StObject.set(x, "EndpointAuthorizationList", value.asInstanceOf[js.Any])
    
    inline def setEndpointAuthorizationListUndefined: Self = StObject.set(x, "EndpointAuthorizationList", js.undefined)
    
    inline def setEndpointAuthorizationListVarargs(value: EndpointAuthorization*): Self = StObject.set(x, "EndpointAuthorizationList", js.Array(value*))
    
    inline def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
  }
}
