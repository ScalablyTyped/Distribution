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
  @scala.inline
  implicit class DescribeResourceGroupsResponseOps[Self <: DescribeResourceGroupsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFailedItems(value: FailedItems): Self = this.set("failedItems", value.asInstanceOf[js.Any])
    @scala.inline
    def setResourceGroupsVarargs(value: ResourceGroup*): Self = this.set("resourceGroups", js.Array(value :_*))
    @scala.inline
    def setResourceGroups(value: ResourceGroupList): Self = this.set("resourceGroups", value.asInstanceOf[js.Any])
  }
  
}

