package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Instance extends StObject {
  
  /**
    * The AMI launch index, which can be used to find this instance in the launch group.
    */
  var AmiLaunchIndex: js.UndefOr[Integer] = js.undefined
  
  /**
    * The architecture of the image.
    */
  var Architecture: js.UndefOr[ArchitectureValues] = js.undefined
  
  /**
    * Any block device mapping entries for the instance.
    */
  var BlockDeviceMappings: js.UndefOr[InstanceBlockDeviceMappingList] = js.undefined
  
  /**
    * The ID of the Capacity Reservation.
    */
  var CapacityReservationId: js.UndefOr[String] = js.undefined
  
  /**
    * Information about the Capacity Reservation targeting option.
    */
  var CapacityReservationSpecification: js.UndefOr[CapacityReservationSpecificationResponse] = js.undefined
  
  /**
    * The idempotency token you provided when you launched the instance, if applicable.
    */
  var ClientToken: js.UndefOr[String] = js.undefined
  
  /**
    * The CPU options for the instance.
    */
  var CpuOptions: js.UndefOr[typings.awsSdk.ec2Mod.CpuOptions] = js.undefined
  
  /**
    * Indicates whether the instance is optimized for Amazon EBS I/O. This optimization provides dedicated throughput to Amazon EBS and an optimized configuration stack to provide optimal I/O performance. This optimization isn't available with all instance types. Additional usage charges apply when using an EBS Optimized instance.
    */
  var EbsOptimized: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The Elastic GPU associated with the instance.
    */
  var ElasticGpuAssociations: js.UndefOr[ElasticGpuAssociationList] = js.undefined
  
  /**
    *  The elastic inference accelerator associated with the instance.
    */
  var ElasticInferenceAcceleratorAssociations: js.UndefOr[ElasticInferenceAcceleratorAssociationList] = js.undefined
  
  /**
    * Specifies whether enhanced networking with ENA is enabled.
    */
  var EnaSupport: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether the instance is enabled for AWS Nitro Enclaves.
    */
  var EnclaveOptions: js.UndefOr[typings.awsSdk.ec2Mod.EnclaveOptions] = js.undefined
  
  /**
    * Indicates whether the instance is enabled for hibernation.
    */
  var HibernationOptions: js.UndefOr[typings.awsSdk.ec2Mod.HibernationOptions] = js.undefined
  
  /**
    * The hypervisor type of the instance. The value xen is used for both Xen and Nitro hypervisors.
    */
  var Hypervisor: js.UndefOr[HypervisorType] = js.undefined
  
  /**
    * The IAM instance profile associated with the instance, if applicable.
    */
  var IamInstanceProfile: js.UndefOr[typings.awsSdk.ec2Mod.IamInstanceProfile] = js.undefined
  
  /**
    * The ID of the AMI used to launch the instance.
    */
  var ImageId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the instance.
    */
  var InstanceId: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates whether this is a Spot Instance or a Scheduled Instance.
    */
  var InstanceLifecycle: js.UndefOr[InstanceLifecycleType] = js.undefined
  
  /**
    * The instance type.
    */
  var InstanceType: js.UndefOr[typings.awsSdk.ec2Mod.InstanceType] = js.undefined
  
  /**
    * The kernel associated with this instance, if applicable.
    */
  var KernelId: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the key pair, if this instance was launched with an associated key pair.
    */
  var KeyName: js.UndefOr[String] = js.undefined
  
  /**
    * The time the instance was launched.
    */
  var LaunchTime: js.UndefOr[DateTime] = js.undefined
  
  /**
    * The license configurations.
    */
  var Licenses: js.UndefOr[LicenseList] = js.undefined
  
  /**
    * The metadata options for the instance.
    */
  var MetadataOptions: js.UndefOr[InstanceMetadataOptionsResponse] = js.undefined
  
  /**
    * The monitoring for the instance.
    */
  var Monitoring: js.UndefOr[typings.awsSdk.ec2Mod.Monitoring] = js.undefined
  
  /**
    * [EC2-VPC] The network interfaces for the instance.
    */
  var NetworkInterfaces: js.UndefOr[InstanceNetworkInterfaceList] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the Outpost.
    */
  var OutpostArn: js.UndefOr[String] = js.undefined
  
  /**
    * The location where the instance launched, if applicable.
    */
  var Placement: js.UndefOr[typings.awsSdk.ec2Mod.Placement] = js.undefined
  
  /**
    * The value is Windows for Windows instances; otherwise blank.
    */
  var Platform: js.UndefOr[PlatformValues] = js.undefined
  
  /**
    * (IPv4 only) The private DNS hostname name assigned to the instance. This DNS hostname can only be used inside the Amazon EC2 network. This name is not available until the instance enters the running state.  [EC2-VPC] The Amazon-provided DNS server resolves Amazon-provided private DNS hostnames if you've enabled DNS resolution and DNS hostnames in your VPC. If you are not using the Amazon-provided DNS server in your VPC, your custom domain name servers must resolve the hostname as appropriate.
    */
  var PrivateDnsName: js.UndefOr[String] = js.undefined
  
  /**
    * The private IPv4 address assigned to the instance.
    */
  var PrivateIpAddress: js.UndefOr[String] = js.undefined
  
  /**
    * The product codes attached to this instance, if applicable.
    */
  var ProductCodes: js.UndefOr[ProductCodeList] = js.undefined
  
  /**
    * (IPv4 only) The public DNS name assigned to the instance. This name is not available until the instance enters the running state. For EC2-VPC, this name is only available if you've enabled DNS hostnames for your VPC.
    */
  var PublicDnsName: js.UndefOr[String] = js.undefined
  
  /**
    * The public IPv4 address, or the Carrier IP address assigned to the instance, if applicable. A Carrier IP address only applies to an instance launched in a subnet associated with a Wavelength Zone.
    */
  var PublicIpAddress: js.UndefOr[String] = js.undefined
  
  /**
    * The RAM disk associated with this instance, if applicable.
    */
  var RamdiskId: js.UndefOr[String] = js.undefined
  
  /**
    * The device name of the root device volume (for example, /dev/sda1).
    */
  var RootDeviceName: js.UndefOr[String] = js.undefined
  
  /**
    * The root device type used by the AMI. The AMI can use an EBS volume or an instance store volume.
    */
  var RootDeviceType: js.UndefOr[DeviceType] = js.undefined
  
  /**
    * The security groups for the instance.
    */
  var SecurityGroups: js.UndefOr[GroupIdentifierList] = js.undefined
  
  /**
    * Specifies whether to enable an instance launched in a VPC to perform NAT. This controls whether source/destination checking is enabled on the instance. A value of true means that checking is enabled, and false means that checking is disabled. The value must be false for the instance to perform NAT. For more information, see NAT Instances in the Amazon Virtual Private Cloud User Guide.
    */
  var SourceDestCheck: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If the request is a Spot Instance request, the ID of the request.
    */
  var SpotInstanceRequestId: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies whether enhanced networking with the Intel 82599 Virtual Function interface is enabled.
    */
  var SriovNetSupport: js.UndefOr[String] = js.undefined
  
  /**
    * The current state of the instance.
    */
  var State: js.UndefOr[InstanceState] = js.undefined
  
  /**
    * The reason for the most recent state transition.
    */
  var StateReason: js.UndefOr[typings.awsSdk.ec2Mod.StateReason] = js.undefined
  
  /**
    * The reason for the most recent state transition. This might be an empty string.
    */
  var StateTransitionReason: js.UndefOr[String] = js.undefined
  
  /**
    * [EC2-VPC] The ID of the subnet in which the instance is running.
    */
  var SubnetId: js.UndefOr[String] = js.undefined
  
  /**
    * Any tags assigned to the instance.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The virtualization type of the instance.
    */
  var VirtualizationType: js.UndefOr[typings.awsSdk.ec2Mod.VirtualizationType] = js.undefined
  
  /**
    * [EC2-VPC] The ID of the VPC in which the instance is running.
    */
  var VpcId: js.UndefOr[String] = js.undefined
}
object Instance {
  
  inline def apply(): Instance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Instance]
  }
  
  extension [Self <: Instance](x: Self) {
    
    inline def setAmiLaunchIndex(value: Integer): Self = StObject.set(x, "AmiLaunchIndex", value.asInstanceOf[js.Any])
    
    inline def setAmiLaunchIndexUndefined: Self = StObject.set(x, "AmiLaunchIndex", js.undefined)
    
    inline def setArchitecture(value: ArchitectureValues): Self = StObject.set(x, "Architecture", value.asInstanceOf[js.Any])
    
    inline def setArchitectureUndefined: Self = StObject.set(x, "Architecture", js.undefined)
    
    inline def setBlockDeviceMappings(value: InstanceBlockDeviceMappingList): Self = StObject.set(x, "BlockDeviceMappings", value.asInstanceOf[js.Any])
    
    inline def setBlockDeviceMappingsUndefined: Self = StObject.set(x, "BlockDeviceMappings", js.undefined)
    
    inline def setBlockDeviceMappingsVarargs(value: InstanceBlockDeviceMapping*): Self = StObject.set(x, "BlockDeviceMappings", js.Array(value :_*))
    
    inline def setCapacityReservationId(value: String): Self = StObject.set(x, "CapacityReservationId", value.asInstanceOf[js.Any])
    
    inline def setCapacityReservationIdUndefined: Self = StObject.set(x, "CapacityReservationId", js.undefined)
    
    inline def setCapacityReservationSpecification(value: CapacityReservationSpecificationResponse): Self = StObject.set(x, "CapacityReservationSpecification", value.asInstanceOf[js.Any])
    
    inline def setCapacityReservationSpecificationUndefined: Self = StObject.set(x, "CapacityReservationSpecification", js.undefined)
    
    inline def setClientToken(value: String): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setCpuOptions(value: CpuOptions): Self = StObject.set(x, "CpuOptions", value.asInstanceOf[js.Any])
    
    inline def setCpuOptionsUndefined: Self = StObject.set(x, "CpuOptions", js.undefined)
    
    inline def setEbsOptimized(value: Boolean): Self = StObject.set(x, "EbsOptimized", value.asInstanceOf[js.Any])
    
    inline def setEbsOptimizedUndefined: Self = StObject.set(x, "EbsOptimized", js.undefined)
    
    inline def setElasticGpuAssociations(value: ElasticGpuAssociationList): Self = StObject.set(x, "ElasticGpuAssociations", value.asInstanceOf[js.Any])
    
    inline def setElasticGpuAssociationsUndefined: Self = StObject.set(x, "ElasticGpuAssociations", js.undefined)
    
    inline def setElasticGpuAssociationsVarargs(value: ElasticGpuAssociation*): Self = StObject.set(x, "ElasticGpuAssociations", js.Array(value :_*))
    
    inline def setElasticInferenceAcceleratorAssociations(value: ElasticInferenceAcceleratorAssociationList): Self = StObject.set(x, "ElasticInferenceAcceleratorAssociations", value.asInstanceOf[js.Any])
    
    inline def setElasticInferenceAcceleratorAssociationsUndefined: Self = StObject.set(x, "ElasticInferenceAcceleratorAssociations", js.undefined)
    
    inline def setElasticInferenceAcceleratorAssociationsVarargs(value: ElasticInferenceAcceleratorAssociation*): Self = StObject.set(x, "ElasticInferenceAcceleratorAssociations", js.Array(value :_*))
    
    inline def setEnaSupport(value: Boolean): Self = StObject.set(x, "EnaSupport", value.asInstanceOf[js.Any])
    
    inline def setEnaSupportUndefined: Self = StObject.set(x, "EnaSupport", js.undefined)
    
    inline def setEnclaveOptions(value: EnclaveOptions): Self = StObject.set(x, "EnclaveOptions", value.asInstanceOf[js.Any])
    
    inline def setEnclaveOptionsUndefined: Self = StObject.set(x, "EnclaveOptions", js.undefined)
    
    inline def setHibernationOptions(value: HibernationOptions): Self = StObject.set(x, "HibernationOptions", value.asInstanceOf[js.Any])
    
    inline def setHibernationOptionsUndefined: Self = StObject.set(x, "HibernationOptions", js.undefined)
    
    inline def setHypervisor(value: HypervisorType): Self = StObject.set(x, "Hypervisor", value.asInstanceOf[js.Any])
    
    inline def setHypervisorUndefined: Self = StObject.set(x, "Hypervisor", js.undefined)
    
    inline def setIamInstanceProfile(value: IamInstanceProfile): Self = StObject.set(x, "IamInstanceProfile", value.asInstanceOf[js.Any])
    
    inline def setIamInstanceProfileUndefined: Self = StObject.set(x, "IamInstanceProfile", js.undefined)
    
    inline def setImageId(value: String): Self = StObject.set(x, "ImageId", value.asInstanceOf[js.Any])
    
    inline def setImageIdUndefined: Self = StObject.set(x, "ImageId", js.undefined)
    
    inline def setInstanceId(value: String): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setInstanceIdUndefined: Self = StObject.set(x, "InstanceId", js.undefined)
    
    inline def setInstanceLifecycle(value: InstanceLifecycleType): Self = StObject.set(x, "InstanceLifecycle", value.asInstanceOf[js.Any])
    
    inline def setInstanceLifecycleUndefined: Self = StObject.set(x, "InstanceLifecycle", js.undefined)
    
    inline def setInstanceType(value: InstanceType): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
    
    inline def setInstanceTypeUndefined: Self = StObject.set(x, "InstanceType", js.undefined)
    
    inline def setKernelId(value: String): Self = StObject.set(x, "KernelId", value.asInstanceOf[js.Any])
    
    inline def setKernelIdUndefined: Self = StObject.set(x, "KernelId", js.undefined)
    
    inline def setKeyName(value: String): Self = StObject.set(x, "KeyName", value.asInstanceOf[js.Any])
    
    inline def setKeyNameUndefined: Self = StObject.set(x, "KeyName", js.undefined)
    
    inline def setLaunchTime(value: DateTime): Self = StObject.set(x, "LaunchTime", value.asInstanceOf[js.Any])
    
    inline def setLaunchTimeUndefined: Self = StObject.set(x, "LaunchTime", js.undefined)
    
    inline def setLicenses(value: LicenseList): Self = StObject.set(x, "Licenses", value.asInstanceOf[js.Any])
    
    inline def setLicensesUndefined: Self = StObject.set(x, "Licenses", js.undefined)
    
    inline def setLicensesVarargs(value: LicenseConfiguration*): Self = StObject.set(x, "Licenses", js.Array(value :_*))
    
    inline def setMetadataOptions(value: InstanceMetadataOptionsResponse): Self = StObject.set(x, "MetadataOptions", value.asInstanceOf[js.Any])
    
    inline def setMetadataOptionsUndefined: Self = StObject.set(x, "MetadataOptions", js.undefined)
    
    inline def setMonitoring(value: Monitoring): Self = StObject.set(x, "Monitoring", value.asInstanceOf[js.Any])
    
    inline def setMonitoringUndefined: Self = StObject.set(x, "Monitoring", js.undefined)
    
    inline def setNetworkInterfaces(value: InstanceNetworkInterfaceList): Self = StObject.set(x, "NetworkInterfaces", value.asInstanceOf[js.Any])
    
    inline def setNetworkInterfacesUndefined: Self = StObject.set(x, "NetworkInterfaces", js.undefined)
    
    inline def setNetworkInterfacesVarargs(value: InstanceNetworkInterface*): Self = StObject.set(x, "NetworkInterfaces", js.Array(value :_*))
    
    inline def setOutpostArn(value: String): Self = StObject.set(x, "OutpostArn", value.asInstanceOf[js.Any])
    
    inline def setOutpostArnUndefined: Self = StObject.set(x, "OutpostArn", js.undefined)
    
    inline def setPlacement(value: Placement): Self = StObject.set(x, "Placement", value.asInstanceOf[js.Any])
    
    inline def setPlacementUndefined: Self = StObject.set(x, "Placement", js.undefined)
    
    inline def setPlatform(value: PlatformValues): Self = StObject.set(x, "Platform", value.asInstanceOf[js.Any])
    
    inline def setPlatformUndefined: Self = StObject.set(x, "Platform", js.undefined)
    
    inline def setPrivateDnsName(value: String): Self = StObject.set(x, "PrivateDnsName", value.asInstanceOf[js.Any])
    
    inline def setPrivateDnsNameUndefined: Self = StObject.set(x, "PrivateDnsName", js.undefined)
    
    inline def setPrivateIpAddress(value: String): Self = StObject.set(x, "PrivateIpAddress", value.asInstanceOf[js.Any])
    
    inline def setPrivateIpAddressUndefined: Self = StObject.set(x, "PrivateIpAddress", js.undefined)
    
    inline def setProductCodes(value: ProductCodeList): Self = StObject.set(x, "ProductCodes", value.asInstanceOf[js.Any])
    
    inline def setProductCodesUndefined: Self = StObject.set(x, "ProductCodes", js.undefined)
    
    inline def setProductCodesVarargs(value: ProductCode*): Self = StObject.set(x, "ProductCodes", js.Array(value :_*))
    
    inline def setPublicDnsName(value: String): Self = StObject.set(x, "PublicDnsName", value.asInstanceOf[js.Any])
    
    inline def setPublicDnsNameUndefined: Self = StObject.set(x, "PublicDnsName", js.undefined)
    
    inline def setPublicIpAddress(value: String): Self = StObject.set(x, "PublicIpAddress", value.asInstanceOf[js.Any])
    
    inline def setPublicIpAddressUndefined: Self = StObject.set(x, "PublicIpAddress", js.undefined)
    
    inline def setRamdiskId(value: String): Self = StObject.set(x, "RamdiskId", value.asInstanceOf[js.Any])
    
    inline def setRamdiskIdUndefined: Self = StObject.set(x, "RamdiskId", js.undefined)
    
    inline def setRootDeviceName(value: String): Self = StObject.set(x, "RootDeviceName", value.asInstanceOf[js.Any])
    
    inline def setRootDeviceNameUndefined: Self = StObject.set(x, "RootDeviceName", js.undefined)
    
    inline def setRootDeviceType(value: DeviceType): Self = StObject.set(x, "RootDeviceType", value.asInstanceOf[js.Any])
    
    inline def setRootDeviceTypeUndefined: Self = StObject.set(x, "RootDeviceType", js.undefined)
    
    inline def setSecurityGroups(value: GroupIdentifierList): Self = StObject.set(x, "SecurityGroups", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupsUndefined: Self = StObject.set(x, "SecurityGroups", js.undefined)
    
    inline def setSecurityGroupsVarargs(value: GroupIdentifier*): Self = StObject.set(x, "SecurityGroups", js.Array(value :_*))
    
    inline def setSourceDestCheck(value: Boolean): Self = StObject.set(x, "SourceDestCheck", value.asInstanceOf[js.Any])
    
    inline def setSourceDestCheckUndefined: Self = StObject.set(x, "SourceDestCheck", js.undefined)
    
    inline def setSpotInstanceRequestId(value: String): Self = StObject.set(x, "SpotInstanceRequestId", value.asInstanceOf[js.Any])
    
    inline def setSpotInstanceRequestIdUndefined: Self = StObject.set(x, "SpotInstanceRequestId", js.undefined)
    
    inline def setSriovNetSupport(value: String): Self = StObject.set(x, "SriovNetSupport", value.asInstanceOf[js.Any])
    
    inline def setSriovNetSupportUndefined: Self = StObject.set(x, "SriovNetSupport", js.undefined)
    
    inline def setState(value: InstanceState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateReason(value: StateReason): Self = StObject.set(x, "StateReason", value.asInstanceOf[js.Any])
    
    inline def setStateReasonUndefined: Self = StObject.set(x, "StateReason", js.undefined)
    
    inline def setStateTransitionReason(value: String): Self = StObject.set(x, "StateTransitionReason", value.asInstanceOf[js.Any])
    
    inline def setStateTransitionReasonUndefined: Self = StObject.set(x, "StateTransitionReason", js.undefined)
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setSubnetId(value: String): Self = StObject.set(x, "SubnetId", value.asInstanceOf[js.Any])
    
    inline def setSubnetIdUndefined: Self = StObject.set(x, "SubnetId", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    
    inline def setVirtualizationType(value: VirtualizationType): Self = StObject.set(x, "VirtualizationType", value.asInstanceOf[js.Any])
    
    inline def setVirtualizationTypeUndefined: Self = StObject.set(x, "VirtualizationType", js.undefined)
    
    inline def setVpcId(value: String): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    inline def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
  }
}
