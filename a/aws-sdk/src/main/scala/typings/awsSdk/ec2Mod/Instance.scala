package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Instance extends js.Object {
  /**
    * The AMI launch index, which can be used to find this instance in the launch group.
    */
  var AmiLaunchIndex: js.UndefOr[Integer] = js.native
  /**
    * The architecture of the image.
    */
  var Architecture: js.UndefOr[ArchitectureValues] = js.native
  /**
    * Any block device mapping entries for the instance.
    */
  var BlockDeviceMappings: js.UndefOr[InstanceBlockDeviceMappingList] = js.native
  /**
    * The ID of the Capacity Reservation.
    */
  var CapacityReservationId: js.UndefOr[String] = js.native
  /**
    * Information about the Capacity Reservation targeting option.
    */
  var CapacityReservationSpecification: js.UndefOr[CapacityReservationSpecificationResponse] = js.native
  /**
    * The idempotency token you provided when you launched the instance, if applicable.
    */
  var ClientToken: js.UndefOr[String] = js.native
  /**
    * The CPU options for the instance.
    */
  var CpuOptions: js.UndefOr[typings.awsSdk.ec2Mod.CpuOptions] = js.native
  /**
    * Indicates whether the instance is optimized for Amazon EBS I/O. This optimization provides dedicated throughput to Amazon EBS and an optimized configuration stack to provide optimal I/O performance. This optimization isn't available with all instance types. Additional usage charges apply when using an EBS Optimized instance.
    */
  var EbsOptimized: js.UndefOr[Boolean] = js.native
  /**
    * The Elastic GPU associated with the instance.
    */
  var ElasticGpuAssociations: js.UndefOr[ElasticGpuAssociationList] = js.native
  /**
    *  The elastic inference accelerator associated with the instance.
    */
  var ElasticInferenceAcceleratorAssociations: js.UndefOr[ElasticInferenceAcceleratorAssociationList] = js.native
  /**
    * Specifies whether enhanced networking with ENA is enabled.
    */
  var EnaSupport: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether the instance is enabled for hibernation.
    */
  var HibernationOptions: js.UndefOr[typings.awsSdk.ec2Mod.HibernationOptions] = js.native
  /**
    * The hypervisor type of the instance. The value xen is used for both Xen and Nitro hypervisors.
    */
  var Hypervisor: js.UndefOr[HypervisorType] = js.native
  /**
    * The IAM instance profile associated with the instance, if applicable.
    */
  var IamInstanceProfile: js.UndefOr[typings.awsSdk.ec2Mod.IamInstanceProfile] = js.native
  /**
    * The ID of the AMI used to launch the instance.
    */
  var ImageId: js.UndefOr[String] = js.native
  /**
    * The ID of the instance.
    */
  var InstanceId: js.UndefOr[String] = js.native
  /**
    * Indicates whether this is a Spot Instance or a Scheduled Instance.
    */
  var InstanceLifecycle: js.UndefOr[InstanceLifecycleType] = js.native
  /**
    * The instance type.
    */
  var InstanceType: js.UndefOr[typings.awsSdk.ec2Mod.InstanceType] = js.native
  /**
    * The kernel associated with this instance, if applicable.
    */
  var KernelId: js.UndefOr[String] = js.native
  /**
    * The name of the key pair, if this instance was launched with an associated key pair.
    */
  var KeyName: js.UndefOr[String] = js.native
  /**
    * The time the instance was launched.
    */
  var LaunchTime: js.UndefOr[DateTime] = js.native
  /**
    * The license configurations.
    */
  var Licenses: js.UndefOr[LicenseList] = js.native
  /**
    * The metadata options for the instance.
    */
  var MetadataOptions: js.UndefOr[InstanceMetadataOptionsResponse] = js.native
  /**
    * The monitoring for the instance.
    */
  var Monitoring: js.UndefOr[typings.awsSdk.ec2Mod.Monitoring] = js.native
  /**
    * [EC2-VPC] The network interfaces for the instance.
    */
  var NetworkInterfaces: js.UndefOr[InstanceNetworkInterfaceList] = js.native
  /**
    * The Amazon Resource Name (ARN) of the Outpost.
    */
  var OutpostArn: js.UndefOr[String] = js.native
  /**
    * The location where the instance launched, if applicable.
    */
  var Placement: js.UndefOr[typings.awsSdk.ec2Mod.Placement] = js.native
  /**
    * The value is Windows for Windows instances; otherwise blank.
    */
  var Platform: js.UndefOr[PlatformValues] = js.native
  /**
    * (IPv4 only) The private DNS hostname name assigned to the instance. This DNS hostname can only be used inside the Amazon EC2 network. This name is not available until the instance enters the running state.  [EC2-VPC] The Amazon-provided DNS server resolves Amazon-provided private DNS hostnames if you've enabled DNS resolution and DNS hostnames in your VPC. If you are not using the Amazon-provided DNS server in your VPC, your custom domain name servers must resolve the hostname as appropriate.
    */
  var PrivateDnsName: js.UndefOr[String] = js.native
  /**
    * The private IPv4 address assigned to the instance.
    */
  var PrivateIpAddress: js.UndefOr[String] = js.native
  /**
    * The product codes attached to this instance, if applicable.
    */
  var ProductCodes: js.UndefOr[ProductCodeList] = js.native
  /**
    * (IPv4 only) The public DNS name assigned to the instance. This name is not available until the instance enters the running state. For EC2-VPC, this name is only available if you've enabled DNS hostnames for your VPC.
    */
  var PublicDnsName: js.UndefOr[String] = js.native
  /**
    * The public IPv4 address assigned to the instance, if applicable.
    */
  var PublicIpAddress: js.UndefOr[String] = js.native
  /**
    * The RAM disk associated with this instance, if applicable.
    */
  var RamdiskId: js.UndefOr[String] = js.native
  /**
    * The device name of the root device volume (for example, /dev/sda1).
    */
  var RootDeviceName: js.UndefOr[String] = js.native
  /**
    * The root device type used by the AMI. The AMI can use an EBS volume or an instance store volume.
    */
  var RootDeviceType: js.UndefOr[DeviceType] = js.native
  /**
    * The security groups for the instance.
    */
  var SecurityGroups: js.UndefOr[GroupIdentifierList] = js.native
  /**
    * Specifies whether to enable an instance launched in a VPC to perform NAT. This controls whether source/destination checking is enabled on the instance. A value of true means that checking is enabled, and false means that checking is disabled. The value must be false for the instance to perform NAT. For more information, see NAT Instances in the Amazon Virtual Private Cloud User Guide.
    */
  var SourceDestCheck: js.UndefOr[Boolean] = js.native
  /**
    * If the request is a Spot Instance request, the ID of the request.
    */
  var SpotInstanceRequestId: js.UndefOr[String] = js.native
  /**
    * Specifies whether enhanced networking with the Intel 82599 Virtual Function interface is enabled.
    */
  var SriovNetSupport: js.UndefOr[String] = js.native
  /**
    * The current state of the instance.
    */
  var State: js.UndefOr[InstanceState] = js.native
  /**
    * The reason for the most recent state transition.
    */
  var StateReason: js.UndefOr[typings.awsSdk.ec2Mod.StateReason] = js.native
  /**
    * The reason for the most recent state transition. This might be an empty string.
    */
  var StateTransitionReason: js.UndefOr[String] = js.native
  /**
    * [EC2-VPC] The ID of the subnet in which the instance is running.
    */
  var SubnetId: js.UndefOr[String] = js.native
  /**
    * Any tags assigned to the instance.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * The virtualization type of the instance.
    */
  var VirtualizationType: js.UndefOr[typings.awsSdk.ec2Mod.VirtualizationType] = js.native
  /**
    * [EC2-VPC] The ID of the VPC in which the instance is running.
    */
  var VpcId: js.UndefOr[String] = js.native
}

object Instance {
  @scala.inline
  def apply(): Instance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Instance]
  }
  @scala.inline
  implicit class InstanceOps[Self <: Instance] (val x: Self) extends AnyVal {
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
    def setAmiLaunchIndex(value: Integer): Self = this.set("AmiLaunchIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAmiLaunchIndex: Self = this.set("AmiLaunchIndex", js.undefined)
    @scala.inline
    def setArchitecture(value: ArchitectureValues): Self = this.set("Architecture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArchitecture: Self = this.set("Architecture", js.undefined)
    @scala.inline
    def setBlockDeviceMappingsVarargs(value: InstanceBlockDeviceMapping*): Self = this.set("BlockDeviceMappings", js.Array(value :_*))
    @scala.inline
    def setBlockDeviceMappings(value: InstanceBlockDeviceMappingList): Self = this.set("BlockDeviceMappings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlockDeviceMappings: Self = this.set("BlockDeviceMappings", js.undefined)
    @scala.inline
    def setCapacityReservationId(value: String): Self = this.set("CapacityReservationId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCapacityReservationId: Self = this.set("CapacityReservationId", js.undefined)
    @scala.inline
    def setCapacityReservationSpecification(value: CapacityReservationSpecificationResponse): Self = this.set("CapacityReservationSpecification", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCapacityReservationSpecification: Self = this.set("CapacityReservationSpecification", js.undefined)
    @scala.inline
    def setClientToken(value: String): Self = this.set("ClientToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientToken: Self = this.set("ClientToken", js.undefined)
    @scala.inline
    def setCpuOptions(value: CpuOptions): Self = this.set("CpuOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCpuOptions: Self = this.set("CpuOptions", js.undefined)
    @scala.inline
    def setEbsOptimized(value: Boolean): Self = this.set("EbsOptimized", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEbsOptimized: Self = this.set("EbsOptimized", js.undefined)
    @scala.inline
    def setElasticGpuAssociationsVarargs(value: ElasticGpuAssociation*): Self = this.set("ElasticGpuAssociations", js.Array(value :_*))
    @scala.inline
    def setElasticGpuAssociations(value: ElasticGpuAssociationList): Self = this.set("ElasticGpuAssociations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElasticGpuAssociations: Self = this.set("ElasticGpuAssociations", js.undefined)
    @scala.inline
    def setElasticInferenceAcceleratorAssociationsVarargs(value: ElasticInferenceAcceleratorAssociation*): Self = this.set("ElasticInferenceAcceleratorAssociations", js.Array(value :_*))
    @scala.inline
    def setElasticInferenceAcceleratorAssociations(value: ElasticInferenceAcceleratorAssociationList): Self = this.set("ElasticInferenceAcceleratorAssociations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElasticInferenceAcceleratorAssociations: Self = this.set("ElasticInferenceAcceleratorAssociations", js.undefined)
    @scala.inline
    def setEnaSupport(value: Boolean): Self = this.set("EnaSupport", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnaSupport: Self = this.set("EnaSupport", js.undefined)
    @scala.inline
    def setHibernationOptions(value: HibernationOptions): Self = this.set("HibernationOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHibernationOptions: Self = this.set("HibernationOptions", js.undefined)
    @scala.inline
    def setHypervisor(value: HypervisorType): Self = this.set("Hypervisor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHypervisor: Self = this.set("Hypervisor", js.undefined)
    @scala.inline
    def setIamInstanceProfile(value: IamInstanceProfile): Self = this.set("IamInstanceProfile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIamInstanceProfile: Self = this.set("IamInstanceProfile", js.undefined)
    @scala.inline
    def setImageId(value: String): Self = this.set("ImageId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageId: Self = this.set("ImageId", js.undefined)
    @scala.inline
    def setInstanceId(value: String): Self = this.set("InstanceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceId: Self = this.set("InstanceId", js.undefined)
    @scala.inline
    def setInstanceLifecycle(value: InstanceLifecycleType): Self = this.set("InstanceLifecycle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceLifecycle: Self = this.set("InstanceLifecycle", js.undefined)
    @scala.inline
    def setInstanceType(value: InstanceType): Self = this.set("InstanceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceType: Self = this.set("InstanceType", js.undefined)
    @scala.inline
    def setKernelId(value: String): Self = this.set("KernelId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKernelId: Self = this.set("KernelId", js.undefined)
    @scala.inline
    def setKeyName(value: String): Self = this.set("KeyName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyName: Self = this.set("KeyName", js.undefined)
    @scala.inline
    def setLaunchTime(value: DateTime): Self = this.set("LaunchTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLaunchTime: Self = this.set("LaunchTime", js.undefined)
    @scala.inline
    def setLicensesVarargs(value: LicenseConfiguration*): Self = this.set("Licenses", js.Array(value :_*))
    @scala.inline
    def setLicenses(value: LicenseList): Self = this.set("Licenses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLicenses: Self = this.set("Licenses", js.undefined)
    @scala.inline
    def setMetadataOptions(value: InstanceMetadataOptionsResponse): Self = this.set("MetadataOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadataOptions: Self = this.set("MetadataOptions", js.undefined)
    @scala.inline
    def setMonitoring(value: Monitoring): Self = this.set("Monitoring", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMonitoring: Self = this.set("Monitoring", js.undefined)
    @scala.inline
    def setNetworkInterfacesVarargs(value: InstanceNetworkInterface*): Self = this.set("NetworkInterfaces", js.Array(value :_*))
    @scala.inline
    def setNetworkInterfaces(value: InstanceNetworkInterfaceList): Self = this.set("NetworkInterfaces", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetworkInterfaces: Self = this.set("NetworkInterfaces", js.undefined)
    @scala.inline
    def setOutpostArn(value: String): Self = this.set("OutpostArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutpostArn: Self = this.set("OutpostArn", js.undefined)
    @scala.inline
    def setPlacement(value: Placement): Self = this.set("Placement", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlacement: Self = this.set("Placement", js.undefined)
    @scala.inline
    def setPlatform(value: PlatformValues): Self = this.set("Platform", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlatform: Self = this.set("Platform", js.undefined)
    @scala.inline
    def setPrivateDnsName(value: String): Self = this.set("PrivateDnsName", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrivateDnsName: Self = this.set("PrivateDnsName", js.undefined)
    @scala.inline
    def setPrivateIpAddress(value: String): Self = this.set("PrivateIpAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrivateIpAddress: Self = this.set("PrivateIpAddress", js.undefined)
    @scala.inline
    def setProductCodesVarargs(value: ProductCode*): Self = this.set("ProductCodes", js.Array(value :_*))
    @scala.inline
    def setProductCodes(value: ProductCodeList): Self = this.set("ProductCodes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProductCodes: Self = this.set("ProductCodes", js.undefined)
    @scala.inline
    def setPublicDnsName(value: String): Self = this.set("PublicDnsName", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublicDnsName: Self = this.set("PublicDnsName", js.undefined)
    @scala.inline
    def setPublicIpAddress(value: String): Self = this.set("PublicIpAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublicIpAddress: Self = this.set("PublicIpAddress", js.undefined)
    @scala.inline
    def setRamdiskId(value: String): Self = this.set("RamdiskId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRamdiskId: Self = this.set("RamdiskId", js.undefined)
    @scala.inline
    def setRootDeviceName(value: String): Self = this.set("RootDeviceName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRootDeviceName: Self = this.set("RootDeviceName", js.undefined)
    @scala.inline
    def setRootDeviceType(value: DeviceType): Self = this.set("RootDeviceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRootDeviceType: Self = this.set("RootDeviceType", js.undefined)
    @scala.inline
    def setSecurityGroupsVarargs(value: GroupIdentifier*): Self = this.set("SecurityGroups", js.Array(value :_*))
    @scala.inline
    def setSecurityGroups(value: GroupIdentifierList): Self = this.set("SecurityGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecurityGroups: Self = this.set("SecurityGroups", js.undefined)
    @scala.inline
    def setSourceDestCheck(value: Boolean): Self = this.set("SourceDestCheck", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceDestCheck: Self = this.set("SourceDestCheck", js.undefined)
    @scala.inline
    def setSpotInstanceRequestId(value: String): Self = this.set("SpotInstanceRequestId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpotInstanceRequestId: Self = this.set("SpotInstanceRequestId", js.undefined)
    @scala.inline
    def setSriovNetSupport(value: String): Self = this.set("SriovNetSupport", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSriovNetSupport: Self = this.set("SriovNetSupport", js.undefined)
    @scala.inline
    def setState(value: InstanceState): Self = this.set("State", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
    @scala.inline
    def setStateReason(value: StateReason): Self = this.set("StateReason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStateReason: Self = this.set("StateReason", js.undefined)
    @scala.inline
    def setStateTransitionReason(value: String): Self = this.set("StateTransitionReason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStateTransitionReason: Self = this.set("StateTransitionReason", js.undefined)
    @scala.inline
    def setSubnetId(value: String): Self = this.set("SubnetId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubnetId: Self = this.set("SubnetId", js.undefined)
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
    @scala.inline
    def setVirtualizationType(value: VirtualizationType): Self = this.set("VirtualizationType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVirtualizationType: Self = this.set("VirtualizationType", js.undefined)
    @scala.inline
    def setVpcId(value: String): Self = this.set("VpcId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcId: Self = this.set("VpcId", js.undefined)
  }
  
}

