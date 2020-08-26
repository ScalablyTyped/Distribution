package typings.awsSdk.codestarconnectionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VpcConfiguration extends js.Object {
  /**
    * The ID of the security group or security groups associated with the Amazon VPC connected to the infrastructure where your provider type is installed.
    */
  var SecurityGroupIds: typings.awsSdk.codestarconnectionsMod.SecurityGroupIds = js.native
  /**
    * The ID of the subnet or subnets associated with the Amazon VPC connected to the infrastructure where your provider type is installed.
    */
  var SubnetIds: typings.awsSdk.codestarconnectionsMod.SubnetIds = js.native
  /**
    * The value of the Transport Layer Security (TLS) certificate associated with the infrastructure where your provider type is installed.
    */
  var TlsCertificate: js.UndefOr[typings.awsSdk.codestarconnectionsMod.TlsCertificate] = js.native
  /**
    * The ID of the Amazon VPC connected to the infrastructure where your provider type is installed.
    */
  var VpcId: typings.awsSdk.codestarconnectionsMod.VpcId = js.native
}

object VpcConfiguration {
  @scala.inline
  def apply(SecurityGroupIds: SecurityGroupIds, SubnetIds: SubnetIds, VpcId: VpcId): VpcConfiguration = {
    val __obj = js.Dynamic.literal(SecurityGroupIds = SecurityGroupIds.asInstanceOf[js.Any], SubnetIds = SubnetIds.asInstanceOf[js.Any], VpcId = VpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpcConfiguration]
  }
  @scala.inline
  implicit class VpcConfigurationOps[Self <: VpcConfiguration] (val x: Self) extends AnyVal {
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
    def setSecurityGroupIdsVarargs(value: SecurityGroupId*): Self = this.set("SecurityGroupIds", js.Array(value :_*))
    @scala.inline
    def setSecurityGroupIds(value: SecurityGroupIds): Self = this.set("SecurityGroupIds", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubnetIdsVarargs(value: SubnetId*): Self = this.set("SubnetIds", js.Array(value :_*))
    @scala.inline
    def setSubnetIds(value: SubnetIds): Self = this.set("SubnetIds", value.asInstanceOf[js.Any])
    @scala.inline
    def setVpcId(value: VpcId): Self = this.set("VpcId", value.asInstanceOf[js.Any])
    @scala.inline
    def setTlsCertificate(value: TlsCertificate): Self = this.set("TlsCertificate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTlsCertificate: Self = this.set("TlsCertificate", js.undefined)
  }
  
}

