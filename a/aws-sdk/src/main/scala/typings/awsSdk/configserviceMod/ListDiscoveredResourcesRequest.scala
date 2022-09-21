package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDiscoveredResourcesRequest extends StObject {
  
  /**
    * Specifies whether Config includes deleted resources in the results. By default, deleted resources are not included.
    */
  var includeDeletedResources: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The maximum number of resource identifiers returned on each page. The default is 100. You cannot specify a number greater than 100. If you specify 0, Config uses the default.
    */
  var limit: js.UndefOr[Limit] = js.undefined
  
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * The IDs of only those resources that you want Config to list in the response. If you do not specify this parameter, Config lists all resources of the specified type that it has discovered.
    */
  var resourceIds: js.UndefOr[ResourceIdList] = js.undefined
  
  /**
    * The custom name of only those resources that you want Config to list in the response. If you do not specify this parameter, Config lists all resources of the specified type that it has discovered.
    */
  var resourceName: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * The type of resources that you want Config to list in the response.
    */
  var resourceType: ResourceType
}
object ListDiscoveredResourcesRequest {
  
  inline def apply(resourceType: ResourceType): ListDiscoveredResourcesRequest = {
    val __obj = js.Dynamic.literal(resourceType = resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDiscoveredResourcesRequest]
  }
  
  extension [Self <: ListDiscoveredResourcesRequest](x: Self) {
    
    inline def setIncludeDeletedResources(value: Boolean): Self = StObject.set(x, "includeDeletedResources", value.asInstanceOf[js.Any])
    
    inline def setIncludeDeletedResourcesUndefined: Self = StObject.set(x, "includeDeletedResources", js.undefined)
    
    inline def setLimit(value: Limit): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setResourceIds(value: ResourceIdList): Self = StObject.set(x, "resourceIds", value.asInstanceOf[js.Any])
    
    inline def setResourceIdsUndefined: Self = StObject.set(x, "resourceIds", js.undefined)
    
    inline def setResourceIdsVarargs(value: ResourceId*): Self = StObject.set(x, "resourceIds", js.Array(value*))
    
    inline def setResourceName(value: ResourceName): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
    
    inline def setResourceNameUndefined: Self = StObject.set(x, "resourceName", js.undefined)
    
    inline def setResourceType(value: ResourceType): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
  }
}
