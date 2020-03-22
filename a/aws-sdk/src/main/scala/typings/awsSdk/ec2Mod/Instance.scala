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
  def apply(
    AmiLaunchIndex: Int | scala.Double = null,
    Architecture: ArchitectureValues = null,
    BlockDeviceMappings: InstanceBlockDeviceMappingList = null,
    CapacityReservationId: String = null,
    CapacityReservationSpecification: CapacityReservationSpecificationResponse = null,
    ClientToken: String = null,
    CpuOptions: CpuOptions = null,
    EbsOptimized: js.UndefOr[scala.Boolean] = js.undefined,
    ElasticGpuAssociations: ElasticGpuAssociationList = null,
    ElasticInferenceAcceleratorAssociations: ElasticInferenceAcceleratorAssociationList = null,
    EnaSupport: js.UndefOr[scala.Boolean] = js.undefined,
    HibernationOptions: HibernationOptions = null,
    Hypervisor: HypervisorType = null,
    IamInstanceProfile: IamInstanceProfile = null,
    ImageId: String = null,
    InstanceId: String = null,
    InstanceLifecycle: InstanceLifecycleType = null,
    InstanceType: InstanceType = null,
    KernelId: String = null,
    KeyName: String = null,
    LaunchTime: DateTime = null,
    Licenses: LicenseList = null,
    MetadataOptions: InstanceMetadataOptionsResponse = null,
    Monitoring: Monitoring = null,
    NetworkInterfaces: InstanceNetworkInterfaceList = null,
    OutpostArn: String = null,
    Placement: Placement = null,
    Platform: PlatformValues = null,
    PrivateDnsName: String = null,
    PrivateIpAddress: String = null,
    ProductCodes: ProductCodeList = null,
    PublicDnsName: String = null,
    PublicIpAddress: String = null,
    RamdiskId: String = null,
    RootDeviceName: String = null,
    RootDeviceType: DeviceType = null,
    SecurityGroups: GroupIdentifierList = null,
    SourceDestCheck: js.UndefOr[scala.Boolean] = js.undefined,
    SpotInstanceRequestId: String = null,
    SriovNetSupport: String = null,
    State: InstanceState = null,
    StateReason: StateReason = null,
    StateTransitionReason: String = null,
    SubnetId: String = null,
    Tags: TagList = null,
    VirtualizationType: VirtualizationType = null,
    VpcId: String = null
  ): Instance = {
    val __obj = js.Dynamic.literal()
    if (AmiLaunchIndex != null) __obj.updateDynamic("AmiLaunchIndex")(AmiLaunchIndex.asInstanceOf[js.Any])
    if (Architecture != null) __obj.updateDynamic("Architecture")(Architecture.asInstanceOf[js.Any])
    if (BlockDeviceMappings != null) __obj.updateDynamic("BlockDeviceMappings")(BlockDeviceMappings.asInstanceOf[js.Any])
    if (CapacityReservationId != null) __obj.updateDynamic("CapacityReservationId")(CapacityReservationId.asInstanceOf[js.Any])
    if (CapacityReservationSpecification != null) __obj.updateDynamic("CapacityReservationSpecification")(CapacityReservationSpecification.asInstanceOf[js.Any])
    if (ClientToken != null) __obj.updateDynamic("ClientToken")(ClientToken.asInstanceOf[js.Any])
    if (CpuOptions != null) __obj.updateDynamic("CpuOptions")(CpuOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(EbsOptimized)) __obj.updateDynamic("EbsOptimized")(EbsOptimized.asInstanceOf[js.Any])
    if (ElasticGpuAssociations != null) __obj.updateDynamic("ElasticGpuAssociations")(ElasticGpuAssociations.asInstanceOf[js.Any])
    if (ElasticInferenceAcceleratorAssociations != null) __obj.updateDynamic("ElasticInferenceAcceleratorAssociations")(ElasticInferenceAcceleratorAssociations.asInstanceOf[js.Any])
    if (!js.isUndefined(EnaSupport)) __obj.updateDynamic("EnaSupport")(EnaSupport.asInstanceOf[js.Any])
    if (HibernationOptions != null) __obj.updateDynamic("HibernationOptions")(HibernationOptions.asInstanceOf[js.Any])
    if (Hypervisor != null) __obj.updateDynamic("Hypervisor")(Hypervisor.asInstanceOf[js.Any])
    if (IamInstanceProfile != null) __obj.updateDynamic("IamInstanceProfile")(IamInstanceProfile.asInstanceOf[js.Any])
    if (ImageId != null) __obj.updateDynamic("ImageId")(ImageId.asInstanceOf[js.Any])
    if (InstanceId != null) __obj.updateDynamic("InstanceId")(InstanceId.asInstanceOf[js.Any])
    if (InstanceLifecycle != null) __obj.updateDynamic("InstanceLifecycle")(InstanceLifecycle.asInstanceOf[js.Any])
    if (InstanceType != null) __obj.updateDynamic("InstanceType")(InstanceType.asInstanceOf[js.Any])
    if (KernelId != null) __obj.updateDynamic("KernelId")(KernelId.asInstanceOf[js.Any])
    if (KeyName != null) __obj.updateDynamic("KeyName")(KeyName.asInstanceOf[js.Any])
    if (LaunchTime != null) __obj.updateDynamic("LaunchTime")(LaunchTime.asInstanceOf[js.Any])
    if (Licenses != null) __obj.updateDynamic("Licenses")(Licenses.asInstanceOf[js.Any])
    if (MetadataOptions != null) __obj.updateDynamic("MetadataOptions")(MetadataOptions.asInstanceOf[js.Any])
    if (Monitoring != null) __obj.updateDynamic("Monitoring")(Monitoring.asInstanceOf[js.Any])
    if (NetworkInterfaces != null) __obj.updateDynamic("NetworkInterfaces")(NetworkInterfaces.asInstanceOf[js.Any])
    if (OutpostArn != null) __obj.updateDynamic("OutpostArn")(OutpostArn.asInstanceOf[js.Any])
    if (Placement != null) __obj.updateDynamic("Placement")(Placement.asInstanceOf[js.Any])
    if (Platform != null) __obj.updateDynamic("Platform")(Platform.asInstanceOf[js.Any])
    if (PrivateDnsName != null) __obj.updateDynamic("PrivateDnsName")(PrivateDnsName.asInstanceOf[js.Any])
    if (PrivateIpAddress != null) __obj.updateDynamic("PrivateIpAddress")(PrivateIpAddress.asInstanceOf[js.Any])
    if (ProductCodes != null) __obj.updateDynamic("ProductCodes")(ProductCodes.asInstanceOf[js.Any])
    if (PublicDnsName != null) __obj.updateDynamic("PublicDnsName")(PublicDnsName.asInstanceOf[js.Any])
    if (PublicIpAddress != null) __obj.updateDynamic("PublicIpAddress")(PublicIpAddress.asInstanceOf[js.Any])
    if (RamdiskId != null) __obj.updateDynamic("RamdiskId")(RamdiskId.asInstanceOf[js.Any])
    if (RootDeviceName != null) __obj.updateDynamic("RootDeviceName")(RootDeviceName.asInstanceOf[js.Any])
    if (RootDeviceType != null) __obj.updateDynamic("RootDeviceType")(RootDeviceType.asInstanceOf[js.Any])
    if (SecurityGroups != null) __obj.updateDynamic("SecurityGroups")(SecurityGroups.asInstanceOf[js.Any])
    if (!js.isUndefined(SourceDestCheck)) __obj.updateDynamic("SourceDestCheck")(SourceDestCheck.asInstanceOf[js.Any])
    if (SpotInstanceRequestId != null) __obj.updateDynamic("SpotInstanceRequestId")(SpotInstanceRequestId.asInstanceOf[js.Any])
    if (SriovNetSupport != null) __obj.updateDynamic("SriovNetSupport")(SriovNetSupport.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (StateReason != null) __obj.updateDynamic("StateReason")(StateReason.asInstanceOf[js.Any])
    if (StateTransitionReason != null) __obj.updateDynamic("StateTransitionReason")(StateTransitionReason.asInstanceOf[js.Any])
    if (SubnetId != null) __obj.updateDynamic("SubnetId")(SubnetId.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    if (VirtualizationType != null) __obj.updateDynamic("VirtualizationType")(VirtualizationType.asInstanceOf[js.Any])
    if (VpcId != null) __obj.updateDynamic("VpcId")(VpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Instance]
  }
}

