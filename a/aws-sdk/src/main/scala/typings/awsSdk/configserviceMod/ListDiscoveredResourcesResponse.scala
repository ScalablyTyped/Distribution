package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDiscoveredResourcesResponse extends StObject {
  
  /**
    * The string that you use in a subsequent request to get the next page of results in a paginated response.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * The details that identify a resource that is discovered by Config, including the resource type, ID, and (if available) the custom resource name.
    */
  var resourceIdentifiers: js.UndefOr[ResourceIdentifierList] = js.undefined
}
object ListDiscoveredResourcesResponse {
  
  inline def apply(): ListDiscoveredResourcesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDiscoveredResourcesResponse]
  }
  
  extension [Self <: ListDiscoveredResourcesResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setResourceIdentifiers(value: ResourceIdentifierList): Self = StObject.set(x, "resourceIdentifiers", value.asInstanceOf[js.Any])
    
    inline def setResourceIdentifiersUndefined: Self = StObject.set(x, "resourceIdentifiers", js.undefined)
    
    inline def setResourceIdentifiersVarargs(value: ResourceIdentifier*): Self = StObject.set(x, "resourceIdentifiers", js.Array(value*))
  }
}
