package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EndpointAccessList extends StObject {
  
  /**
    * The list of endpoints with access to the cluster.
    */
  var EndpointAccessList: js.UndefOr[EndpointAccesses] = js.undefined
  
  /**
    * An optional pagination token provided by a previous DescribeEndpointAccess request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by the MaxRecords parameter.
    */
  var Marker: js.UndefOr[String] = js.undefined
}
object EndpointAccessList {
  
  inline def apply(): EndpointAccessList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndpointAccessList]
  }
  
  extension [Self <: EndpointAccessList](x: Self) {
    
    inline def setEndpointAccessList(value: EndpointAccesses): Self = StObject.set(x, "EndpointAccessList", value.asInstanceOf[js.Any])
    
    inline def setEndpointAccessListUndefined: Self = StObject.set(x, "EndpointAccessList", js.undefined)
    
    inline def setEndpointAccessListVarargs(value: EndpointAccess*): Self = StObject.set(x, "EndpointAccessList", js.Array(value*))
    
    inline def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
  }
}
