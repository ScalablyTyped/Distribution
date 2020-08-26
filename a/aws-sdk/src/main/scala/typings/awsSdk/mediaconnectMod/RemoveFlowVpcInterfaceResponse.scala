package typings.awsSdk.mediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoveFlowVpcInterfaceResponse extends js.Object {
  /**
    * The ARN of the flow that is associated with the VPC interface you removed.
    */
  var FlowArn: js.UndefOr[string] = js.native
  /**
    * IDs of network interfaces associated with the removed VPC interface that Media Connect was unable to remove.
    */
  var NonDeletedNetworkInterfaceIds: js.UndefOr[listOfString] = js.native
  /**
    * The name of the VPC interface that was removed.
    */
  var VpcInterfaceName: js.UndefOr[string] = js.native
}

object RemoveFlowVpcInterfaceResponse {
  @scala.inline
  def apply(): RemoveFlowVpcInterfaceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoveFlowVpcInterfaceResponse]
  }
  @scala.inline
  implicit class RemoveFlowVpcInterfaceResponseOps[Self <: RemoveFlowVpcInterfaceResponse] (val x: Self) extends AnyVal {
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
    def setNonDeletedNetworkInterfaceIdsVarargs(value: string*): Self = this.set("NonDeletedNetworkInterfaceIds", js.Array(value :_*))
    @scala.inline
    def setNonDeletedNetworkInterfaceIds(value: listOfString): Self = this.set("NonDeletedNetworkInterfaceIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNonDeletedNetworkInterfaceIds: Self = this.set("NonDeletedNetworkInterfaceIds", js.undefined)
    @scala.inline
    def setVpcInterfaceName(value: string): Self = this.set("VpcInterfaceName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcInterfaceName: Self = this.set("VpcInterfaceName", js.undefined)
  }
  
}

