package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TargetNetwork extends js.Object {
  /**
    * The ID of the association.
    */
  var AssociationId: js.UndefOr[String] = js.native
  /**
    * The ID of the Client VPN endpoint with which the target network is associated.
    */
  var ClientVpnEndpointId: js.UndefOr[String] = js.native
  /**
    * The IDs of the security groups applied to the target network association.
    */
  var SecurityGroups: js.UndefOr[ValueStringList] = js.native
  /**
    * The current state of the target network association.
    */
  var Status: js.UndefOr[AssociationStatus] = js.native
  /**
    * The ID of the subnet specified as the target network.
    */
  var TargetNetworkId: js.UndefOr[String] = js.native
  /**
    * The ID of the VPC in which the target network (subnet) is located.
    */
  var VpcId: js.UndefOr[String] = js.native
}

object TargetNetwork {
  @scala.inline
  def apply(): TargetNetwork = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetNetwork]
  }
  @scala.inline
  implicit class TargetNetworkOps[Self <: TargetNetwork] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAssociationId(value: String): Self = this.set("AssociationId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssociationId: Self = this.set("AssociationId", js.undefined)
    @scala.inline
    def setClientVpnEndpointId(value: String): Self = this.set("ClientVpnEndpointId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientVpnEndpointId: Self = this.set("ClientVpnEndpointId", js.undefined)
    @scala.inline
    def setSecurityGroupsVarargs(value: String*): Self = this.set("SecurityGroups", js.Array(value :_*))
    @scala.inline
    def setSecurityGroups(value: ValueStringList): Self = this.set("SecurityGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecurityGroups: Self = this.set("SecurityGroups", js.undefined)
    @scala.inline
    def setStatus(value: AssociationStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    @scala.inline
    def setTargetNetworkId(value: String): Self = this.set("TargetNetworkId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetNetworkId: Self = this.set("TargetNetworkId", js.undefined)
    @scala.inline
    def setVpcId(value: String): Self = this.set("VpcId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcId: Self = this.set("VpcId", js.undefined)
  }
  
}

