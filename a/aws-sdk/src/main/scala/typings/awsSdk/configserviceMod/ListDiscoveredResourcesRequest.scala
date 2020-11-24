package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListDiscoveredResourcesRequest extends js.Object {
  
  /**
    * Specifies whether AWS Config includes deleted resources in the results. By default, deleted resources are not included.
    */
  var includeDeletedResources: js.UndefOr[Boolean] = js.native
  
  /**
    * The maximum number of resource identifiers returned on each page. The default is 100. You cannot specify a number greater than 100. If you specify 0, AWS Config uses the default.
    */
  var limit: js.UndefOr[Limit] = js.native
  
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  
  /**
    * The IDs of only those resources that you want AWS Config to list in the response. If you do not specify this parameter, AWS Config lists all resources of the specified type that it has discovered.
    */
  var resourceIds: js.UndefOr[ResourceIdList] = js.native
  
  /**
    * The custom name of only those resources that you want AWS Config to list in the response. If you do not specify this parameter, AWS Config lists all resources of the specified type that it has discovered.
    */
  var resourceName: js.UndefOr[ResourceName] = js.native
  
  /**
    * The type of resources that you want AWS Config to list in the response.
    */
  var resourceType: ResourceType = js.native
}
object ListDiscoveredResourcesRequest {
  
  @scala.inline
  def apply(resourceType: ResourceType): ListDiscoveredResourcesRequest = {
    val __obj = js.Dynamic.literal(resourceType = resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDiscoveredResourcesRequest]
  }
  
  @scala.inline
  implicit class ListDiscoveredResourcesRequestOps[Self <: ListDiscoveredResourcesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setResourceType(value: ResourceType): Self = this.set("resourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeDeletedResources(value: Boolean): Self = this.set("includeDeletedResources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeDeletedResources: Self = this.set("includeDeletedResources", js.undefined)
    
    @scala.inline
    def setLimit(value: Limit): Self = this.set("limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    
    @scala.inline
    def setResourceIdsVarargs(value: ResourceId*): Self = this.set("resourceIds", js.Array(value :_*))
    
    @scala.inline
    def setResourceIds(value: ResourceIdList): Self = this.set("resourceIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceIds: Self = this.set("resourceIds", js.undefined)
    
    @scala.inline
    def setResourceName(value: ResourceName): Self = this.set("resourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceName: Self = this.set("resourceName", js.undefined)
  }
}
