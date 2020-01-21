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
  def apply(
    HsmArn: HsmArn,
    EniIp: IpAddress = null,
    ExternalId: ExternalId = null,
    IamRoleArn: IamRoleArn = null,
    SubnetId: SubnetId = null,
    SyslogIp: IpAddress = null
  ): ModifyHsmRequest = {
    val __obj = js.Dynamic.literal(HsmArn = HsmArn.asInstanceOf[js.Any])
    if (EniIp != null) __obj.updateDynamic("EniIp")(EniIp.asInstanceOf[js.Any])
    if (ExternalId != null) __obj.updateDynamic("ExternalId")(ExternalId.asInstanceOf[js.Any])
    if (IamRoleArn != null) __obj.updateDynamic("IamRoleArn")(IamRoleArn.asInstanceOf[js.Any])
    if (SubnetId != null) __obj.updateDynamic("SubnetId")(SubnetId.asInstanceOf[js.Any])
    if (SyslogIp != null) __obj.updateDynamic("SyslogIp")(SyslogIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyHsmRequest]
  }
}

