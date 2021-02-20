package typings.awsSdk.inspectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeResourceGroupsResponse extends StObject {
  
  /**
    * Resource group details that cannot be described. An error code is provided for each failed item.
    */
  var failedItems: FailedItems = js.native
  
  /**
    * Information about a resource group.
    */
  var resourceGroups: ResourceGroupList = js.native
}
object DescribeResourceGroupsResponse {
  
  @scala.inline
  def apply(failedItems: FailedItems, resourceGroups: ResourceGroupList): DescribeResourceGroupsResponse = {
    val __obj = js.Dynamic.literal(failedItems = failedItems.asInstanceOf[js.Any], resourceGroups = resourceGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeResourceGroupsResponse]
  }
  
  @scala.inline
  implicit class DescribeResourceGroupsResponseMutableBuilder[Self <: DescribeResourceGroupsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailedItems(value: FailedItems): Self = StObject.set(x, "failedItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceGroups(value: ResourceGroupList): Self = StObject.set(x, "resourceGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceGroupsVarargs(value: ResourceGroup*): Self = StObject.set(x, "resourceGroups", js.Array(value :_*))
  }
}
