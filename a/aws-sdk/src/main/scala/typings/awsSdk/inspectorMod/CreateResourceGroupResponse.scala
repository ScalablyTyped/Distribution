package typings.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateResourceGroupResponse extends js.Object {
  /**
    * The ARN that specifies the resource group that is created.
    */
  var resourceGroupArn: Arn = js.native
}

object CreateResourceGroupResponse {
  @scala.inline
  def apply(resourceGroupArn: Arn): CreateResourceGroupResponse = {
    val __obj = js.Dynamic.literal(resourceGroupArn = resourceGroupArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateResourceGroupResponse]
  }
}

