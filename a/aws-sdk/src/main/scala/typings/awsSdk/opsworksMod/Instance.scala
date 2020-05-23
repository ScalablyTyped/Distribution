package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Instance extends js.Object {
  /**
    * The agent version. This parameter is set to INHERIT if the instance inherits the default stack setting or to a a version number for a fixed agent version.
    */
  var AgentVersion: js.UndefOr[String] = js.native
  /**
    * A custom AMI ID to be used to create the instance. For more information, see Instances 
    */
  var AmiId: js.UndefOr[String] = js.native
  /**
    * The instance architecture: "i386" or "x86_64".
    */
  var Architecture: js.UndefOr[typings.awsSdk.opsworksMod.Architecture] = js.native
  /**
    * The instance's Amazon Resource Number (ARN).
    */
  var Arn: js.UndefOr[String] = js.native
  /**
    * For load-based or time-based instances, the type.
    */
  var AutoScalingType: js.UndefOr[typings.awsSdk.opsworksMod.AutoScalingType] = js.native
  /**
    * The instance Availability Zone. For more information, see Regions and Endpoints.
    */
  var AvailabilityZone: js.UndefOr[String] = js.native
  /**
    * An array of BlockDeviceMapping objects that specify the instance's block device mappings.
    */
  var BlockDeviceMappings: js.UndefOr[typings.awsSdk.opsworksMod.BlockDeviceMappings] = js.native
  /**
    * The time that the instance was created.
    */
  var CreatedAt: js.UndefOr[DateTime] = js.native
  /**
    * Whether this is an Amazon EBS-optimized instance.
    */
  var EbsOptimized: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the associated Amazon EC2 instance.
    */
  var Ec2InstanceId: js.UndefOr[String] = js.native
  /**
    * For container instances, the Amazon ECS cluster's ARN.
    */
  var EcsClusterArn: js.UndefOr[String] = js.native
  /**
    * For container instances, the instance's ARN.
    */
  var EcsContainerInstanceArn: js.UndefOr[String] = js.native
  /**
    * The instance Elastic IP address .
    */
  var ElasticIp: js.UndefOr[String] = js.native
  /**
    * The instance host name.
    */
  var Hostname: js.UndefOr[String] = js.native
  /**
    * For registered instances, the infrastructure class: ec2 or on-premises.
    */
  var InfrastructureClass: js.UndefOr[String] = js.native
  /**
    * Whether to install operating system and package updates when the instance boots. The default value is true. If this value is set to false, you must then update your instances manually by using CreateDeployment to run the update_dependencies stack command or by manually running yum (Amazon Linux) or apt-get (Ubuntu) on the instances.   We strongly recommend using the default value of true, to ensure that your instances have the latest security updates. 
    */
  var InstallUpdatesOnBoot: js.UndefOr[Boolean] = js.native
  /**
    * The instance ID.
    */
  var InstanceId: js.UndefOr[String] = js.native
  /**
    * The ARN of the instance's IAM profile. For more information about IAM ARNs, see Using Identifiers.
    */
  var InstanceProfileArn: js.UndefOr[String] = js.native
  /**
    * The instance type, such as t2.micro.
    */
  var InstanceType: js.UndefOr[String] = js.native
  /**
    * The ID of the last service error. For more information, call DescribeServiceErrors.
    */
  var LastServiceErrorId: js.UndefOr[String] = js.native
  /**
    * An array containing the instance layer IDs.
    */
  var LayerIds: js.UndefOr[Strings] = js.native
  /**
    * The instance's operating system.
    */
  var Os: js.UndefOr[String] = js.native
  /**
    * The instance's platform.
    */
  var Platform: js.UndefOr[String] = js.native
  /**
    * The instance's private DNS name.
    */
  var PrivateDns: js.UndefOr[String] = js.native
  /**
    * The instance's private IP address.
    */
  var PrivateIp: js.UndefOr[String] = js.native
  /**
    * The instance public DNS name.
    */
  var PublicDns: js.UndefOr[String] = js.native
  /**
    * The instance public IP address.
    */
  var PublicIp: js.UndefOr[String] = js.native
  /**
    * For registered instances, who performed the registration.
    */
  var RegisteredBy: js.UndefOr[String] = js.native
  /**
    * The instance's reported AWS OpsWorks Stacks agent version.
    */
  var ReportedAgentVersion: js.UndefOr[String] = js.native
  /**
    * For registered instances, the reported operating system.
    */
  var ReportedOs: js.UndefOr[typings.awsSdk.opsworksMod.ReportedOs] = js.native
  /**
    * The instance's root device type. For more information, see Storage for the Root Device.
    */
  var RootDeviceType: js.UndefOr[typings.awsSdk.opsworksMod.RootDeviceType] = js.native
  /**
    * The root device volume ID.
    */
  var RootDeviceVolumeId: js.UndefOr[String] = js.native
  /**
    * An array containing the instance security group IDs.
    */
  var SecurityGroupIds: js.UndefOr[Strings] = js.native
  /**
    * The SSH key's Deep Security Agent (DSA) fingerprint.
    */
  var SshHostDsaKeyFingerprint: js.UndefOr[String] = js.native
  /**
    * The SSH key's RSA fingerprint.
    */
  var SshHostRsaKeyFingerprint: js.UndefOr[String] = js.native
  /**
    * The instance's Amazon EC2 key-pair name.
    */
  var SshKeyName: js.UndefOr[String] = js.native
  /**
    * The stack ID.
    */
  var StackId: js.UndefOr[String] = js.native
  /**
    * The instance status:    booting     connection_lost     online     pending     rebooting     requested     running_setup     setup_failed     shutting_down     start_failed     stop_failed     stopped     stopping     terminated     terminating   
    */
  var Status: js.UndefOr[String] = js.native
  /**
    * The instance's subnet ID; applicable only if the stack is running in a VPC.
    */
  var SubnetId: js.UndefOr[String] = js.native
  /**
    * The instance's tenancy option, such as dedicated or host.
    */
  var Tenancy: js.UndefOr[String] = js.native
  /**
    * The instance's virtualization type: paravirtual or hvm.
    */
  var VirtualizationType: js.UndefOr[typings.awsSdk.opsworksMod.VirtualizationType] = js.native
}

object Instance {
  @scala.inline
  def apply(
    AgentVersion: String = null,
    AmiId: String = null,
    Architecture: Architecture = null,
    Arn: String = null,
    AutoScalingType: AutoScalingType = null,
    AvailabilityZone: String = null,
    BlockDeviceMappings: BlockDeviceMappings = null,
    CreatedAt: DateTime = null,
    EbsOptimized: js.UndefOr[Boolean] = js.undefined,
    Ec2InstanceId: String = null,
    EcsClusterArn: String = null,
    EcsContainerInstanceArn: String = null,
    ElasticIp: String = null,
    Hostname: String = null,
    InfrastructureClass: String = null,
    InstallUpdatesOnBoot: js.UndefOr[Boolean] = js.undefined,
    InstanceId: String = null,
    InstanceProfileArn: String = null,
    InstanceType: String = null,
    LastServiceErrorId: String = null,
    LayerIds: Strings = null,
    Os: String = null,
    Platform: String = null,
    PrivateDns: String = null,
    PrivateIp: String = null,
    PublicDns: String = null,
    PublicIp: String = null,
    RegisteredBy: String = null,
    ReportedAgentVersion: String = null,
    ReportedOs: ReportedOs = null,
    RootDeviceType: RootDeviceType = null,
    RootDeviceVolumeId: String = null,
    SecurityGroupIds: Strings = null,
    SshHostDsaKeyFingerprint: String = null,
    SshHostRsaKeyFingerprint: String = null,
    SshKeyName: String = null,
    StackId: String = null,
    Status: String = null,
    SubnetId: String = null,
    Tenancy: String = null,
    VirtualizationType: VirtualizationType = null
  ): Instance = {
    val __obj = js.Dynamic.literal()
    if (AgentVersion != null) __obj.updateDynamic("AgentVersion")(AgentVersion.asInstanceOf[js.Any])
    if (AmiId != null) __obj.updateDynamic("AmiId")(AmiId.asInstanceOf[js.Any])
    if (Architecture != null) __obj.updateDynamic("Architecture")(Architecture.asInstanceOf[js.Any])
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    if (AutoScalingType != null) __obj.updateDynamic("AutoScalingType")(AutoScalingType.asInstanceOf[js.Any])
    if (AvailabilityZone != null) __obj.updateDynamic("AvailabilityZone")(AvailabilityZone.asInstanceOf[js.Any])
    if (BlockDeviceMappings != null) __obj.updateDynamic("BlockDeviceMappings")(BlockDeviceMappings.asInstanceOf[js.Any])
    if (CreatedAt != null) __obj.updateDynamic("CreatedAt")(CreatedAt.asInstanceOf[js.Any])
    if (!js.isUndefined(EbsOptimized)) __obj.updateDynamic("EbsOptimized")(EbsOptimized.get.asInstanceOf[js.Any])
    if (Ec2InstanceId != null) __obj.updateDynamic("Ec2InstanceId")(Ec2InstanceId.asInstanceOf[js.Any])
    if (EcsClusterArn != null) __obj.updateDynamic("EcsClusterArn")(EcsClusterArn.asInstanceOf[js.Any])
    if (EcsContainerInstanceArn != null) __obj.updateDynamic("EcsContainerInstanceArn")(EcsContainerInstanceArn.asInstanceOf[js.Any])
    if (ElasticIp != null) __obj.updateDynamic("ElasticIp")(ElasticIp.asInstanceOf[js.Any])
    if (Hostname != null) __obj.updateDynamic("Hostname")(Hostname.asInstanceOf[js.Any])
    if (InfrastructureClass != null) __obj.updateDynamic("InfrastructureClass")(InfrastructureClass.asInstanceOf[js.Any])
    if (!js.isUndefined(InstallUpdatesOnBoot)) __obj.updateDynamic("InstallUpdatesOnBoot")(InstallUpdatesOnBoot.get.asInstanceOf[js.Any])
    if (InstanceId != null) __obj.updateDynamic("InstanceId")(InstanceId.asInstanceOf[js.Any])
    if (InstanceProfileArn != null) __obj.updateDynamic("InstanceProfileArn")(InstanceProfileArn.asInstanceOf[js.Any])
    if (InstanceType != null) __obj.updateDynamic("InstanceType")(InstanceType.asInstanceOf[js.Any])
    if (LastServiceErrorId != null) __obj.updateDynamic("LastServiceErrorId")(LastServiceErrorId.asInstanceOf[js.Any])
    if (LayerIds != null) __obj.updateDynamic("LayerIds")(LayerIds.asInstanceOf[js.Any])
    if (Os != null) __obj.updateDynamic("Os")(Os.asInstanceOf[js.Any])
    if (Platform != null) __obj.updateDynamic("Platform")(Platform.asInstanceOf[js.Any])
    if (PrivateDns != null) __obj.updateDynamic("PrivateDns")(PrivateDns.asInstanceOf[js.Any])
    if (PrivateIp != null) __obj.updateDynamic("PrivateIp")(PrivateIp.asInstanceOf[js.Any])
    if (PublicDns != null) __obj.updateDynamic("PublicDns")(PublicDns.asInstanceOf[js.Any])
    if (PublicIp != null) __obj.updateDynamic("PublicIp")(PublicIp.asInstanceOf[js.Any])
    if (RegisteredBy != null) __obj.updateDynamic("RegisteredBy")(RegisteredBy.asInstanceOf[js.Any])
    if (ReportedAgentVersion != null) __obj.updateDynamic("ReportedAgentVersion")(ReportedAgentVersion.asInstanceOf[js.Any])
    if (ReportedOs != null) __obj.updateDynamic("ReportedOs")(ReportedOs.asInstanceOf[js.Any])
    if (RootDeviceType != null) __obj.updateDynamic("RootDeviceType")(RootDeviceType.asInstanceOf[js.Any])
    if (RootDeviceVolumeId != null) __obj.updateDynamic("RootDeviceVolumeId")(RootDeviceVolumeId.asInstanceOf[js.Any])
    if (SecurityGroupIds != null) __obj.updateDynamic("SecurityGroupIds")(SecurityGroupIds.asInstanceOf[js.Any])
    if (SshHostDsaKeyFingerprint != null) __obj.updateDynamic("SshHostDsaKeyFingerprint")(SshHostDsaKeyFingerprint.asInstanceOf[js.Any])
    if (SshHostRsaKeyFingerprint != null) __obj.updateDynamic("SshHostRsaKeyFingerprint")(SshHostRsaKeyFingerprint.asInstanceOf[js.Any])
    if (SshKeyName != null) __obj.updateDynamic("SshKeyName")(SshKeyName.asInstanceOf[js.Any])
    if (StackId != null) __obj.updateDynamic("StackId")(StackId.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (SubnetId != null) __obj.updateDynamic("SubnetId")(SubnetId.asInstanceOf[js.Any])
    if (Tenancy != null) __obj.updateDynamic("Tenancy")(Tenancy.asInstanceOf[js.Any])
    if (VirtualizationType != null) __obj.updateDynamic("VirtualizationType")(VirtualizationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Instance]
  }
}

