package typings.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeResourceGroupsResponse extends js.Object {
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
}

