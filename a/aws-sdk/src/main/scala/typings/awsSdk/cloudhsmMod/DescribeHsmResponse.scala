package typings.awsSdk.cloudhsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeHsmResponse extends StObject {
  
  /**
    * The Availability Zone that the HSM is in.
    */
  var AvailabilityZone: js.UndefOr[AZ] = js.undefined
  
  /**
    * The identifier of the elastic network interface (ENI) attached to the HSM.
    */
  var EniId: js.UndefOr[typings.awsSdk.cloudhsmMod.EniId] = js.undefined
  
  /**
    * The IP address assigned to the HSM's ENI.
    */
  var EniIp: js.UndefOr[IpAddress] = js.undefined
  
  /**
    * The ARN of the HSM.
    */
  var HsmArn: js.UndefOr[typings.awsSdk.cloudhsmMod.HsmArn] = js.undefined
  
  /**
    * The HSM model type.
    */
  var HsmType: js.UndefOr[String] = js.undefined
  
  /**
    * The ARN of the IAM role assigned to the HSM.
    */
  var IamRoleArn: js.UndefOr[typings.awsSdk.cloudhsmMod.IamRoleArn] = js.undefined
  
  /**
    * The list of partitions on the HSM.
    */
  var Partitions: js.UndefOr[PartitionList] = js.undefined
  
  /**
    * The serial number of the HSM.
    */
  var SerialNumber: js.UndefOr[HsmSerialNumber] = js.undefined
  
  /**
    * The date and time that the server certificate was last updated.
    */
  var ServerCertLastUpdated: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The URI of the certificate server.
    */
  var ServerCertUri: js.UndefOr[String] = js.undefined
  
  /**
    * The HSM software version.
    */
  var SoftwareVersion: js.UndefOr[String] = js.undefined
  
  /**
    * The date and time that the SSH key was last updated.
    */
  var SshKeyLastUpdated: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The public SSH key.
    */
  var SshPublicKey: js.UndefOr[SshKey] = js.undefined
  
  /**
    * The status of the HSM.
    */
  var Status: js.UndefOr[HsmStatus] = js.undefined
  
  /**
    * Contains additional information about the status of the HSM.
    */
  var StatusDetails: js.UndefOr[String] = js.undefined
  
  /**
    * The identifier of the subnet that the HSM is in.
    */
  var SubnetId: js.UndefOr[typings.awsSdk.cloudhsmMod.SubnetId] = js.undefined
  
  /**
    * The subscription end date.
    */
  var SubscriptionEndDate: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The subscription start date.
    */
  var SubscriptionStartDate: js.UndefOr[Timestamp] = js.undefined
  
  var SubscriptionType: js.UndefOr[typings.awsSdk.cloudhsmMod.SubscriptionType] = js.undefined
  
  /**
    * The name of the HSM vendor.
    */
  var VendorName: js.UndefOr[String] = js.undefined
  
  /**
    * The identifier of the VPC that the HSM is in.
    */
  var VpcId: js.UndefOr[typings.awsSdk.cloudhsmMod.VpcId] = js.undefined
}
object DescribeHsmResponse {
  
  inline def apply(): DescribeHsmResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeHsmResponse]
  }
  
  extension [Self <: DescribeHsmResponse](x: Self) {
    
    inline def setAvailabilityZone(value: AZ): Self = StObject.set(x, "AvailabilityZone", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZoneUndefined: Self = StObject.set(x, "AvailabilityZone", js.undefined)
    
    inline def setEniId(value: EniId): Self = StObject.set(x, "EniId", value.asInstanceOf[js.Any])
    
    inline def setEniIdUndefined: Self = StObject.set(x, "EniId", js.undefined)
    
    inline def setEniIp(value: IpAddress): Self = StObject.set(x, "EniIp", value.asInstanceOf[js.Any])
    
    inline def setEniIpUndefined: Self = StObject.set(x, "EniIp", js.undefined)
    
    inline def setHsmArn(value: HsmArn): Self = StObject.set(x, "HsmArn", value.asInstanceOf[js.Any])
    
    inline def setHsmArnUndefined: Self = StObject.set(x, "HsmArn", js.undefined)
    
    inline def setHsmType(value: String): Self = StObject.set(x, "HsmType", value.asInstanceOf[js.Any])
    
    inline def setHsmTypeUndefined: Self = StObject.set(x, "HsmType", js.undefined)
    
    inline def setIamRoleArn(value: IamRoleArn): Self = StObject.set(x, "IamRoleArn", value.asInstanceOf[js.Any])
    
    inline def setIamRoleArnUndefined: Self = StObject.set(x, "IamRoleArn", js.undefined)
    
    inline def setPartitions(value: PartitionList): Self = StObject.set(x, "Partitions", value.asInstanceOf[js.Any])
    
    inline def setPartitionsUndefined: Self = StObject.set(x, "Partitions", js.undefined)
    
    inline def setPartitionsVarargs(value: PartitionArn*): Self = StObject.set(x, "Partitions", js.Array(value :_*))
    
    inline def setSerialNumber(value: HsmSerialNumber): Self = StObject.set(x, "SerialNumber", value.asInstanceOf[js.Any])
    
    inline def setSerialNumberUndefined: Self = StObject.set(x, "SerialNumber", js.undefined)
    
    inline def setServerCertLastUpdated(value: Timestamp): Self = StObject.set(x, "ServerCertLastUpdated", value.asInstanceOf[js.Any])
    
    inline def setServerCertLastUpdatedUndefined: Self = StObject.set(x, "ServerCertLastUpdated", js.undefined)
    
    inline def setServerCertUri(value: String): Self = StObject.set(x, "ServerCertUri", value.asInstanceOf[js.Any])
    
    inline def setServerCertUriUndefined: Self = StObject.set(x, "ServerCertUri", js.undefined)
    
    inline def setSoftwareVersion(value: String): Self = StObject.set(x, "SoftwareVersion", value.asInstanceOf[js.Any])
    
    inline def setSoftwareVersionUndefined: Self = StObject.set(x, "SoftwareVersion", js.undefined)
    
    inline def setSshKeyLastUpdated(value: Timestamp): Self = StObject.set(x, "SshKeyLastUpdated", value.asInstanceOf[js.Any])
    
    inline def setSshKeyLastUpdatedUndefined: Self = StObject.set(x, "SshKeyLastUpdated", js.undefined)
    
    inline def setSshPublicKey(value: SshKey): Self = StObject.set(x, "SshPublicKey", value.asInstanceOf[js.Any])
    
    inline def setSshPublicKeyUndefined: Self = StObject.set(x, "SshPublicKey", js.undefined)
    
    inline def setStatus(value: HsmStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusDetails(value: String): Self = StObject.set(x, "StatusDetails", value.asInstanceOf[js.Any])
    
    inline def setStatusDetailsUndefined: Self = StObject.set(x, "StatusDetails", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setSubnetId(value: SubnetId): Self = StObject.set(x, "SubnetId", value.asInstanceOf[js.Any])
    
    inline def setSubnetIdUndefined: Self = StObject.set(x, "SubnetId", js.undefined)
    
    inline def setSubscriptionEndDate(value: Timestamp): Self = StObject.set(x, "SubscriptionEndDate", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionEndDateUndefined: Self = StObject.set(x, "SubscriptionEndDate", js.undefined)
    
    inline def setSubscriptionStartDate(value: Timestamp): Self = StObject.set(x, "SubscriptionStartDate", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionStartDateUndefined: Self = StObject.set(x, "SubscriptionStartDate", js.undefined)
    
    inline def setSubscriptionType(value: SubscriptionType): Self = StObject.set(x, "SubscriptionType", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionTypeUndefined: Self = StObject.set(x, "SubscriptionType", js.undefined)
    
    inline def setVendorName(value: String): Self = StObject.set(x, "VendorName", value.asInstanceOf[js.Any])
    
    inline def setVendorNameUndefined: Self = StObject.set(x, "VendorName", js.undefined)
    
    inline def setVpcId(value: VpcId): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    inline def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
  }
}
