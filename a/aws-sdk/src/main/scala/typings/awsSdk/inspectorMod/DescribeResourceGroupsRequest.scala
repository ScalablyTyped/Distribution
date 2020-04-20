package typings.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
}

