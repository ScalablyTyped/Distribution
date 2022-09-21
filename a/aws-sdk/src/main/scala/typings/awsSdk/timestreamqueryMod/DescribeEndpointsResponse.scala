package typings.awsSdk.timestreamqueryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeEndpointsResponse extends StObject {
  
  /**
    * An Endpoints object is returned when a DescribeEndpoints request is made.
    */
  var Endpoints: typings.awsSdk.timestreamqueryMod.Endpoints
}
object DescribeEndpointsResponse {
  
  inline def apply(Endpoints: Endpoints): DescribeEndpointsResponse = {
    val __obj = js.Dynamic.literal(Endpoints = Endpoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeEndpointsResponse]
  }
  
  extension [Self <: DescribeEndpointsResponse](x: Self) {
    
    inline def setEndpoints(value: Endpoints): Self = StObject.set(x, "Endpoints", value.asInstanceOf[js.Any])
    
    inline def setEndpointsVarargs(value: Endpoint*): Self = StObject.set(x, "Endpoints", js.Array(value*))
  }
}
