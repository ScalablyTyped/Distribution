package typings.awsSdk.mediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddFlowVpcInterfacesResponse extends js.Object {
  /**
    * The ARN of the flow that these VPC interfaces were added to.
    */
  var FlowArn: js.UndefOr[string] = js.native
  /**
    * The details of the newly added VPC interfaces.
    */
  var VpcInterfaces: js.UndefOr[listOfVpcInterface] = js.native
}

object AddFlowVpcInterfacesResponse {
  @scala.inline
  def apply(): AddFlowVpcInterfacesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddFlowVpcInterfacesResponse]
  }
  @scala.inline
  implicit class AddFlowVpcInterfacesResponseOps[Self <: AddFlowVpcInterfacesResponse] (val x: Self) extends AnyVal {
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
    def deleteFlowArn: Self = this.set("FlowArn", js.undefined)
    @scala.inline
    def setVpcInterfacesVarargs(value: VpcInterface*): Self = this.set("VpcInterfaces", js.Array(value :_*))
    @scala.inline
    def setVpcInterfaces(value: listOfVpcInterface): Self = this.set("VpcInterfaces", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcInterfaces: Self = this.set("VpcInterfaces", js.undefined)
  }
  
}

