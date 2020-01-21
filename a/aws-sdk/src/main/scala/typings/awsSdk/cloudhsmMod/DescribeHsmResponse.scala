package typings.awsSdk.cloudhsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeHsmResponse extends js.Object {
  /**
    * The Availability Zone that the HSM is in.
    */
  var AvailabilityZone: js.UndefOr[AZ] = js.native
  /**
    * The identifier of the elastic network interface (ENI) attached to the HSM.
    */
  var EniId: js.UndefOr[typings.awsSdk.cloudhsmMod.EniId] = js.native
  /**
    * The IP address assigned to the HSM's ENI.
    */
  var EniIp: js.UndefOr[IpAddress] = js.native
  /**
    * The ARN of the HSM.
    */
  var HsmArn: js.UndefOr[typings.awsSdk.cloudhsmMod.HsmArn] = js.native
  /**
    * The HSM model type.
    */
  var HsmType: js.UndefOr[String] = js.native
  /**
    * The ARN of the IAM role assigned to the HSM.
    */
  var IamRoleArn: js.UndefOr[typings.awsSdk.cloudhsmMod.IamRoleArn] = js.native
  /**
    * The list of partitions on the HSM.
    */
  var Partitions: js.UndefOr[PartitionList] = js.native
  /**
    * The serial number of the HSM.
    */
  var SerialNumber: js.UndefOr[HsmSerialNumber] = js.native
  /**
    * The date and time that the server certificate was last updated.
    */
  var ServerCertLastUpdated: js.UndefOr[Timestamp] = js.native
  /**
    * The URI of the certificate server.
    */
  var ServerCertUri: js.UndefOr[String] = js.native
  /**
    * The HSM software version.
    */
  var SoftwareVersion: js.UndefOr[String] = js.native
  /**
    * The date and time that the SSH key was last updated.
    */
  var SshKeyLastUpdated: js.UndefOr[Timestamp] = js.native
  /**
    * The public SSH key.
    */
  var SshPublicKey: js.UndefOr[SshKey] = js.native
  /**
    * The status of the HSM.
    */
  var Status: js.UndefOr[HsmStatus] = js.native
  /**
    * Contains additional information about the status of the HSM.
    */
  var StatusDetails: js.UndefOr[String] = js.native
  /**
    * The identifier of the subnet that the HSM is in.
    */
  var SubnetId: js.UndefOr[typings.awsSdk.cloudhsmMod.SubnetId] = js.native
  /**
    * The subscription end date.
    */
  var SubscriptionEndDate: js.UndefOr[Timestamp] = js.native
  /**
    * The subscription start date.
    */
  var SubscriptionStartDate: js.UndefOr[Timestamp] = js.native
  var SubscriptionType: js.UndefOr[typings.awsSdk.cloudhsmMod.SubscriptionType] = js.native
  /**
    * The name of the HSM vendor.
    */
  var VendorName: js.UndefOr[String] = js.native
  /**
    * The identifier of the VPC that the HSM is in.
    */
  var VpcId: js.UndefOr[typings.awsSdk.cloudhsmMod.VpcId] = js.native
}

object DescribeHsmResponse {
  @scala.inline
  def apply(
    AvailabilityZone: AZ = null,
    EniId: EniId = null,
    EniIp: IpAddress = null,
    HsmArn: HsmArn = null,
    HsmType: String = null,
    IamRoleArn: IamRoleArn = null,
    Partitions: PartitionList = null,
    SerialNumber: HsmSerialNumber = null,
    ServerCertLastUpdated: Timestamp = null,
    ServerCertUri: String = null,
    SoftwareVersion: String = null,
    SshKeyLastUpdated: Timestamp = null,
    SshPublicKey: SshKey = null,
    Status: HsmStatus = null,
    StatusDetails: String = null,
    SubnetId: SubnetId = null,
    SubscriptionEndDate: Timestamp = null,
    SubscriptionStartDate: Timestamp = null,
    SubscriptionType: SubscriptionType = null,
    VendorName: String = null,
    VpcId: VpcId = null
  ): DescribeHsmResponse = {
    val __obj = js.Dynamic.literal()
    if (AvailabilityZone != null) __obj.updateDynamic("AvailabilityZone")(AvailabilityZone.asInstanceOf[js.Any])
    if (EniId != null) __obj.updateDynamic("EniId")(EniId.asInstanceOf[js.Any])
    if (EniIp != null) __obj.updateDynamic("EniIp")(EniIp.asInstanceOf[js.Any])
    if (HsmArn != null) __obj.updateDynamic("HsmArn")(HsmArn.asInstanceOf[js.Any])
    if (HsmType != null) __obj.updateDynamic("HsmType")(HsmType.asInstanceOf[js.Any])
    if (IamRoleArn != null) __obj.updateDynamic("IamRoleArn")(IamRoleArn.asInstanceOf[js.Any])
    if (Partitions != null) __obj.updateDynamic("Partitions")(Partitions.asInstanceOf[js.Any])
    if (SerialNumber != null) __obj.updateDynamic("SerialNumber")(SerialNumber.asInstanceOf[js.Any])
    if (ServerCertLastUpdated != null) __obj.updateDynamic("ServerCertLastUpdated")(ServerCertLastUpdated.asInstanceOf[js.Any])
    if (ServerCertUri != null) __obj.updateDynamic("ServerCertUri")(ServerCertUri.asInstanceOf[js.Any])
    if (SoftwareVersion != null) __obj.updateDynamic("SoftwareVersion")(SoftwareVersion.asInstanceOf[js.Any])
    if (SshKeyLastUpdated != null) __obj.updateDynamic("SshKeyLastUpdated")(SshKeyLastUpdated.asInstanceOf[js.Any])
    if (SshPublicKey != null) __obj.updateDynamic("SshPublicKey")(SshPublicKey.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (StatusDetails != null) __obj.updateDynamic("StatusDetails")(StatusDetails.asInstanceOf[js.Any])
    if (SubnetId != null) __obj.updateDynamic("SubnetId")(SubnetId.asInstanceOf[js.Any])
    if (SubscriptionEndDate != null) __obj.updateDynamic("SubscriptionEndDate")(SubscriptionEndDate.asInstanceOf[js.Any])
    if (SubscriptionStartDate != null) __obj.updateDynamic("SubscriptionStartDate")(SubscriptionStartDate.asInstanceOf[js.Any])
    if (SubscriptionType != null) __obj.updateDynamic("SubscriptionType")(SubscriptionType.asInstanceOf[js.Any])
    if (VendorName != null) __obj.updateDynamic("VendorName")(VendorName.asInstanceOf[js.Any])
    if (VpcId != null) __obj.updateDynamic("VpcId")(VpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeHsmResponse]
  }
}

