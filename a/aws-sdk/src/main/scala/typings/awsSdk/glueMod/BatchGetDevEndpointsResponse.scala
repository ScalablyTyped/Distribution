package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetDevEndpointsResponse extends StObject {
  
  /**
    * A list of DevEndpoint definitions.
    */
  var DevEndpoints: js.UndefOr[DevEndpointList] = js.undefined
  
  /**
    * A list of DevEndpoints not found.
    */
  var DevEndpointsNotFound: js.UndefOr[DevEndpointNames] = js.undefined
}
object BatchGetDevEndpointsResponse {
  
  inline def apply(): BatchGetDevEndpointsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetDevEndpointsResponse]
  }
  
  extension [Self <: BatchGetDevEndpointsResponse](x: Self) {
    
    inline def setDevEndpoints(value: DevEndpointList): Self = StObject.set(x, "DevEndpoints", value.asInstanceOf[js.Any])
    
    inline def setDevEndpointsNotFound(value: DevEndpointNames): Self = StObject.set(x, "DevEndpointsNotFound", value.asInstanceOf[js.Any])
    
    inline def setDevEndpointsNotFoundUndefined: Self = StObject.set(x, "DevEndpointsNotFound", js.undefined)
    
    inline def setDevEndpointsNotFoundVarargs(value: GenericString*): Self = StObject.set(x, "DevEndpointsNotFound", js.Array(value :_*))
    
    inline def setDevEndpointsUndefined: Self = StObject.set(x, "DevEndpoints", js.undefined)
    
    inline def setDevEndpointsVarargs(value: DevEndpoint*): Self = StObject.set(x, "DevEndpoints", js.Array(value :_*))
  }
}
