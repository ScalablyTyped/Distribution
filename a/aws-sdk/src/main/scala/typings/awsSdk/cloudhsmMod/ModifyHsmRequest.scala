package typings.awsSdk.cloudhsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyHsmRequest extends js.Object {
  /**
    * The new IP address for the elastic network interface (ENI) attached to the HSM. If the HSM is moved to a different subnet, and an IP address is not specified, an IP address will be randomly chosen from the CIDR range of the new subnet.
    */
  var EniIp: js.UndefOr[IpAddress] = js.native
  /**
    * The new external ID.
    */
  var ExternalId: js.UndefOr[typings.awsSdk.cloudhsmMod.ExternalId] = js.native
  /**
    * The ARN of the HSM to modify.
    */
  var HsmArn: typings.awsSdk.cloudhsmMod.HsmArn = js.native
  /**
    * The new IAM role ARN.
    */
  var IamRoleArn: js.UndefOr[typings.awsSdk.cloudhsmMod.IamRoleArn] = js.native
  /**
    * The new identifier of the subnet that the HSM is in. The new subnet must be in the same Availability Zone as the current subnet.
    */
  var SubnetId: js.UndefOr[typings.awsSdk.cloudhsmMod.SubnetId] = js.native
  /**
    * The new IP address for the syslog monitoring server. The AWS CloudHSM service only supports one syslog monitoring server.
    */
  var SyslogIp: js.UndefOr[IpAddress] = js.native
}

object ModifyHsmRequest {
  @scala.inline
  def apply(HsmArn: HsmArn): ModifyHsmRequest = {
    val __obj = js.Dynamic.literal(HsmArn = HsmArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyHsmRequest]
  }
  @scala.inline
  implicit class ModifyHsmRequestOps[Self <: ModifyHsmRequest] (val x: Self) extends AnyVal {
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
    def setHsmArn(value: HsmArn): Self = this.set("HsmArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setEniIp(value: IpAddress): Self = this.set("EniIp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEniIp: Self = this.set("EniIp", js.undefined)
    @scala.inline
    def setExternalId(value: ExternalId): Self = this.set("ExternalId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExternalId: Self = this.set("ExternalId", js.undefined)
    @scala.inline
    def setIamRoleArn(value: IamRoleArn): Self = this.set("IamRoleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIamRoleArn: Self = this.set("IamRoleArn", js.undefined)
    @scala.inline
    def setSubnetId(value: SubnetId): Self = this.set("SubnetId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubnetId: Self = this.set("SubnetId", js.undefined)
    @scala.inline
    def setSyslogIp(value: IpAddress): Self = this.set("SyslogIp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSyslogIp: Self = this.set("SyslogIp", js.undefined)
  }
  
}

