package typings.awsSdk.resiliencehubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListUnsupportedAppVersionResourcesResponse extends StObject {
  
  /**
    * The token for the next set of results, or null if there are no more results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * The identifier for a specific resolution.
    */
  var resolutionId: String255
  
  /**
    * The unsupported resources for the application.
    */
  var unsupportedResources: UnsupportedResourceList
}
object ListUnsupportedAppVersionResourcesResponse {
  
  inline def apply(resolutionId: String255, unsupportedResources: UnsupportedResourceList): ListUnsupportedAppVersionResourcesResponse = {
    val __obj = js.Dynamic.literal(resolutionId = resolutionId.asInstanceOf[js.Any], unsupportedResources = unsupportedResources.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListUnsupportedAppVersionResourcesResponse]
  }
  
  extension [Self <: ListUnsupportedAppVersionResourcesResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setResolutionId(value: String255): Self = StObject.set(x, "resolutionId", value.asInstanceOf[js.Any])
    
    inline def setUnsupportedResources(value: UnsupportedResourceList): Self = StObject.set(x, "unsupportedResources", value.asInstanceOf[js.Any])
    
    inline def setUnsupportedResourcesVarargs(value: UnsupportedResource*): Self = StObject.set(x, "unsupportedResources", js.Array(value*))
  }
}
