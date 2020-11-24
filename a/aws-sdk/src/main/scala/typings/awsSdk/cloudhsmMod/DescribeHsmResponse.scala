package typings.awsSdk.cloudhsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): DescribeHsmResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeHsmResponse]
  }
  
  @scala.inline
  implicit class DescribeHsmResponseOps[Self <: DescribeHsmResponse] (val x: Self) extends AnyVal {
    
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
    def setAvailabilityZone(value: AZ): Self = this.set("AvailabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvailabilityZone: Self = this.set("AvailabilityZone", js.undefined)
    
    @scala.inline
    def setEniId(value: EniId): Self = this.set("EniId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEniId: Self = this.set("EniId", js.undefined)
    
    @scala.inline
    def setEniIp(value: IpAddress): Self = this.set("EniIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEniIp: Self = this.set("EniIp", js.undefined)
    
    @scala.inline
    def setHsmArn(value: HsmArn): Self = this.set("HsmArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHsmArn: Self = this.set("HsmArn", js.undefined)
    
    @scala.inline
    def setHsmType(value: String): Self = this.set("HsmType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHsmType: Self = this.set("HsmType", js.undefined)
    
    @scala.inline
    def setIamRoleArn(value: IamRoleArn): Self = this.set("IamRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIamRoleArn: Self = this.set("IamRoleArn", js.undefined)
    
    @scala.inline
    def setPartitionsVarargs(value: PartitionArn*): Self = this.set("Partitions", js.Array(value :_*))
    
    @scala.inline
    def setPartitions(value: PartitionList): Self = this.set("Partitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePartitions: Self = this.set("Partitions", js.undefined)
    
    @scala.inline
    def setSerialNumber(value: HsmSerialNumber): Self = this.set("SerialNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSerialNumber: Self = this.set("SerialNumber", js.undefined)
    
    @scala.inline
    def setServerCertLastUpdated(value: Timestamp): Self = this.set("ServerCertLastUpdated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServerCertLastUpdated: Self = this.set("ServerCertLastUpdated", js.undefined)
    
    @scala.inline
    def setServerCertUri(value: String): Self = this.set("ServerCertUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServerCertUri: Self = this.set("ServerCertUri", js.undefined)
    
    @scala.inline
    def setSoftwareVersion(value: String): Self = this.set("SoftwareVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSoftwareVersion: Self = this.set("SoftwareVersion", js.undefined)
    
    @scala.inline
    def setSshKeyLastUpdated(value: Timestamp): Self = this.set("SshKeyLastUpdated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSshKeyLastUpdated: Self = this.set("SshKeyLastUpdated", js.undefined)
    
    @scala.inline
    def setSshPublicKey(value: SshKey): Self = this.set("SshPublicKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSshPublicKey: Self = this.set("SshPublicKey", js.undefined)
    
    @scala.inline
    def setStatus(value: HsmStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    
    @scala.inline
    def setStatusDetails(value: String): Self = this.set("StatusDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusDetails: Self = this.set("StatusDetails", js.undefined)
    
    @scala.inline
    def setSubnetId(value: SubnetId): Self = this.set("SubnetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubnetId: Self = this.set("SubnetId", js.undefined)
    
    @scala.inline
    def setSubscriptionEndDate(value: Timestamp): Self = this.set("SubscriptionEndDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubscriptionEndDate: Self = this.set("SubscriptionEndDate", js.undefined)
    
    @scala.inline
    def setSubscriptionStartDate(value: Timestamp): Self = this.set("SubscriptionStartDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubscriptionStartDate: Self = this.set("SubscriptionStartDate", js.undefined)
    
    @scala.inline
    def setSubscriptionType(value: SubscriptionType): Self = this.set("SubscriptionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubscriptionType: Self = this.set("SubscriptionType", js.undefined)
    
    @scala.inline
    def setVendorName(value: String): Self = this.set("VendorName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVendorName: Self = this.set("VendorName", js.undefined)
    
    @scala.inline
    def setVpcId(value: VpcId): Self = this.set("VpcId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVpcId: Self = this.set("VpcId", js.undefined)
  }
}
