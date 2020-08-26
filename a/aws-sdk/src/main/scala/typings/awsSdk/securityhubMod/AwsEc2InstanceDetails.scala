package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwsEc2InstanceDetails extends js.Object {
  /**
    * The IAM profile ARN of the instance.
    */
  var IamInstanceProfileArn: js.UndefOr[NonEmptyString] = js.native
  /**
    * The Amazon Machine Image (AMI) ID of the instance.
    */
  var ImageId: js.UndefOr[NonEmptyString] = js.native
  /**
    * The IPv4 addresses associated with the instance.
    */
  var IpV4Addresses: js.UndefOr[StringList] = js.native
  /**
    * The IPv6 addresses associated with the instance.
    */
  var IpV6Addresses: js.UndefOr[StringList] = js.native
  /**
    * The key name associated with the instance.
    */
  var KeyName: js.UndefOr[NonEmptyString] = js.native
  /**
    * The date/time the instance was launched.
    */
  var LaunchedAt: js.UndefOr[NonEmptyString] = js.native
  /**
    * The identifier of the subnet that the instance was launched in.
    */
  var SubnetId: js.UndefOr[NonEmptyString] = js.native
  /**
    * The instance type of the instance. 
    */
  var Type: js.UndefOr[NonEmptyString] = js.native
  /**
    * The identifier of the VPC that the instance was launched in.
    */
  var VpcId: js.UndefOr[NonEmptyString] = js.native
}

object AwsEc2InstanceDetails {
  @scala.inline
  def apply(): AwsEc2InstanceDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEc2InstanceDetails]
  }
  @scala.inline
  implicit class AwsEc2InstanceDetailsOps[Self <: AwsEc2InstanceDetails] (val x: Self) extends AnyVal {
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
    def setIamInstanceProfileArn(value: NonEmptyString): Self = this.set("IamInstanceProfileArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIamInstanceProfileArn: Self = this.set("IamInstanceProfileArn", js.undefined)
    @scala.inline
    def setImageId(value: NonEmptyString): Self = this.set("ImageId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageId: Self = this.set("ImageId", js.undefined)
    @scala.inline
    def setIpV4AddressesVarargs(value: NonEmptyString*): Self = this.set("IpV4Addresses", js.Array(value :_*))
    @scala.inline
    def setIpV4Addresses(value: StringList): Self = this.set("IpV4Addresses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIpV4Addresses: Self = this.set("IpV4Addresses", js.undefined)
    @scala.inline
    def setIpV6AddressesVarargs(value: NonEmptyString*): Self = this.set("IpV6Addresses", js.Array(value :_*))
    @scala.inline
    def setIpV6Addresses(value: StringList): Self = this.set("IpV6Addresses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIpV6Addresses: Self = this.set("IpV6Addresses", js.undefined)
    @scala.inline
    def setKeyName(value: NonEmptyString): Self = this.set("KeyName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyName: Self = this.set("KeyName", js.undefined)
    @scala.inline
    def setLaunchedAt(value: NonEmptyString): Self = this.set("LaunchedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLaunchedAt: Self = this.set("LaunchedAt", js.undefined)
    @scala.inline
    def setSubnetId(value: NonEmptyString): Self = this.set("SubnetId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubnetId: Self = this.set("SubnetId", js.undefined)
    @scala.inline
    def setType(value: NonEmptyString): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
    @scala.inline
    def setVpcId(value: NonEmptyString): Self = this.set("VpcId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcId: Self = this.set("VpcId", js.undefined)
  }
  
}

