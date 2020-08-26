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
  @scala.inline
  implicit class CreateResourceGroupResponseOps[Self <: CreateResourceGroupResponse] (val x: Self) extends AnyVal {
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
    def setResourceGroupArn(value: Arn): Self = this.set("resourceGroupArn", value.asInstanceOf[js.Any])
  }
  
}

