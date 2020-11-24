package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListDiscoveredResourcesResponse extends js.Object {
  
  /**
    * The string that you use in a subsequent request to get the next page of results in a paginated response.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  
  /**
    * The details that identify a resource that is discovered by AWS Config, including the resource type, ID, and (if available) the custom resource name.
    */
  var resourceIdentifiers: js.UndefOr[ResourceIdentifierList] = js.native
}
object ListDiscoveredResourcesResponse {
  
  @scala.inline
  def apply(): ListDiscoveredResourcesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDiscoveredResourcesResponse]
  }
  
  @scala.inline
  implicit class ListDiscoveredResourcesResponseOps[Self <: ListDiscoveredResourcesResponse] (val x: Self) extends AnyVal {
    
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
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    
    @scala.inline
    def setResourceIdentifiersVarargs(value: ResourceIdentifier*): Self = this.set("resourceIdentifiers", js.Array(value :_*))
    
    @scala.inline
    def setResourceIdentifiers(value: ResourceIdentifierList): Self = this.set("resourceIdentifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceIdentifiers: Self = this.set("resourceIdentifiers", js.undefined)
  }
}
