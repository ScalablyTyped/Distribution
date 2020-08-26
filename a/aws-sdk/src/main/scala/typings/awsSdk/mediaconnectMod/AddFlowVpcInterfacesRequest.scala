package typings.awsSdk.mediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddFlowVpcInterfacesRequest extends js.Object {
  /**
    * The flow that you want to mutate.
    */
  var FlowArn: string = js.native
  /**
    * A list of VPC interfaces that you want to add.
    */
  var VpcInterfaces: listOfVpcInterfaceRequest = js.native
}

object AddFlowVpcInterfacesRequest {
  @scala.inline
  def apply(FlowArn: string, VpcInterfaces: listOfVpcInterfaceRequest): AddFlowVpcInterfacesRequest = {
    val __obj = js.Dynamic.literal(FlowArn = FlowArn.asInstanceOf[js.Any], VpcInterfaces = VpcInterfaces.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddFlowVpcInterfacesRequest]
  }
  @scala.inline
  implicit class AddFlowVpcInterfacesRequestOps[Self <: AddFlowVpcInterfacesRequest] (val x: Self) extends AnyVal {
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
    def setVpcInterfacesVarargs(value: VpcInterfaceRequest*): Self = this.set("VpcInterfaces", js.Array(value :_*))
    @scala.inline
    def setVpcInterfaces(value: listOfVpcInterfaceRequest): Self = this.set("VpcInterfaces", value.asInstanceOf[js.Any])
  }
  
}

