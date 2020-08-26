package typings.awsSdk.mediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoveFlowVpcInterfaceRequest extends js.Object {
  /**
    * The flow that you want to remove a VPC interface from.
    */
  var FlowArn: string = js.native
  /**
    * The name of the VPC interface that you want to remove.
    */
  var VpcInterfaceName: string = js.native
}

object RemoveFlowVpcInterfaceRequest {
  @scala.inline
  def apply(FlowArn: string, VpcInterfaceName: string): RemoveFlowVpcInterfaceRequest = {
    val __obj = js.Dynamic.literal(FlowArn = FlowArn.asInstanceOf[js.Any], VpcInterfaceName = VpcInterfaceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveFlowVpcInterfaceRequest]
  }
  @scala.inline
  implicit class RemoveFlowVpcInterfaceRequestOps[Self <: RemoveFlowVpcInterfaceRequest] (val x: Self) extends AnyVal {
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
    def setFlowArn(value: string): Self = this.set("FlowArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setVpcInterfaceName(value: string): Self = this.set("VpcInterfaceName", value.asInstanceOf[js.Any])
  }
  
}

