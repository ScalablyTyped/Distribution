package typings.awsSdk.emrcontainersMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListManagedEndpointsResponse extends StObject {
  
  /**
    * The managed endpoints to be listed.
    */
  var endpoints: js.UndefOr[Endpoints] = js.undefined
  
  /**
    *  The token for the next set of endpoints to return. 
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListManagedEndpointsResponse {
  
  inline def apply(): ListManagedEndpointsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListManagedEndpointsResponse]
  }
  
  extension [Self <: ListManagedEndpointsResponse](x: Self) {
    
    inline def setEndpoints(value: Endpoints): Self = StObject.set(x, "endpoints", value.asInstanceOf[js.Any])
    
    inline def setEndpointsUndefined: Self = StObject.set(x, "endpoints", js.undefined)
    
    inline def setEndpointsVarargs(value: Endpoint*): Self = StObject.set(x, "endpoints", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
