package typings.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeResourceGroupsRequest extends js.Object {
  
  /**
    * The ARN that specifies the resource group that you want to describe.
    */
  var resourceGroupArns: BatchDescribeArnList = js.native
}
object DescribeResourceGroupsRequest {
  
  @scala.inline
  def apply(resourceGroupArns: BatchDescribeArnList): DescribeResourceGroupsRequest = {
    val __obj = js.Dynamic.literal(resourceGroupArns = resourceGroupArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeResourceGroupsRequest]
  }
  
  @scala.inline
  implicit class DescribeResourceGroupsRequestOps[Self <: DescribeResourceGroupsRequest] (val x: Self) extends AnyVal {
    
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
    def setResourceGroupArnsVarargs(value: Arn*): Self = this.set("resourceGroupArns", js.Array(value :_*))
    
    @scala.inline
    def setResourceGroupArns(value: BatchDescribeArnList): Self = this.set("resourceGroupArns", value.asInstanceOf[js.Any])
  }
}
