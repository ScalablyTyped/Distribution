package typings.awsSdk.emrcontainersMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListManagedEndpointsRequest extends StObject {
  
  /**
    *  The date and time after which the endpoints are created.
    */
  var createdAfter: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The date and time before which the endpoints are created.
    */
  var createdBefore: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The maximum number of managed endpoints that can be listed.
    */
  var maxResults: js.UndefOr[JavaInteger] = js.undefined
  
  /**
    *  The token for the next set of managed endpoints to return. 
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * The states of the managed endpoints.
    */
  var states: js.UndefOr[EndpointStates] = js.undefined
  
  /**
    * The types of the managed endpoints.
    */
  var types: js.UndefOr[EndpointTypes] = js.undefined
  
  /**
    * The ID of the virtual cluster.
    */
  var virtualClusterId: ResourceIdString
}
object ListManagedEndpointsRequest {
  
  inline def apply(virtualClusterId: ResourceIdString): ListManagedEndpointsRequest = {
    val __obj = js.Dynamic.literal(virtualClusterId = virtualClusterId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListManagedEndpointsRequest]
  }
  
  extension [Self <: ListManagedEndpointsRequest](x: Self) {
    
    inline def setCreatedAfter(value: js.Date): Self = StObject.set(x, "createdAfter", value.asInstanceOf[js.Any])
    
    inline def setCreatedAfterUndefined: Self = StObject.set(x, "createdAfter", js.undefined)
    
    inline def setCreatedBefore(value: js.Date): Self = StObject.set(x, "createdBefore", value.asInstanceOf[js.Any])
    
    inline def setCreatedBeforeUndefined: Self = StObject.set(x, "createdBefore", js.undefined)
    
    inline def setMaxResults(value: JavaInteger): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setStates(value: EndpointStates): Self = StObject.set(x, "states", value.asInstanceOf[js.Any])
    
    inline def setStatesUndefined: Self = StObject.set(x, "states", js.undefined)
    
    inline def setStatesVarargs(value: EndpointState*): Self = StObject.set(x, "states", js.Array(value*))
    
    inline def setTypes(value: EndpointTypes): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    inline def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
    
    inline def setTypesVarargs(value: EndpointType*): Self = StObject.set(x, "types", js.Array(value*))
    
    inline def setVirtualClusterId(value: ResourceIdString): Self = StObject.set(x, "virtualClusterId", value.asInstanceOf[js.Any])
  }
}
