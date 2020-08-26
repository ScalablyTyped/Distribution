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
    def setAgentVersion(value: String): Self = this.set("AgentVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAgentVersion: Self = this.set("AgentVersion", js.undefined)
    @scala.inline
    def setAmiId(value: String): Self = this.set("AmiId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAmiId: Self = this.set("AmiId", js.undefined)
    @scala.inline
    def setArchitecture(value: Architecture): Self = this.set("Architecture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArchitecture: Self = this.set("Architecture", js.undefined)
    @scala.inline
    def setArn(value: String): Self = this.set("Arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("Arn", js.undefined)
    @scala.inline
    def setAutoScalingType(value: AutoScalingType): Self = this.set("AutoScalingType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoScalingType: Self = this.set("AutoScalingType", js.undefined)
    @scala.inline
    def setAvailabilityZone(value: String): Self = this.set("AvailabilityZone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvailabilityZone: Self = this.set("AvailabilityZone", js.undefined)
    @scala.inline
    def setBlockDeviceMappingsVarargs(value: BlockDeviceMapping*): Self = this.set("BlockDeviceMappings", js.Array(value :_*))
    @scala.inline
    def setBlockDeviceMappings(value: BlockDeviceMappings): Self = this.set("BlockDeviceMappings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlockDeviceMappings: Self = this.set("BlockDeviceMappings", js.undefined)
    @scala.inline
    def setCreatedAt(value: DateTime): Self = this.set("CreatedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedAt: Self = this.set("CreatedAt", js.undefined)
    @scala.inline
    def setEbsOptimized(value: Boolean): Self = this.set("EbsOptimized", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEbsOptimized: Self = this.set("EbsOptimized", js.undefined)
    @scala.inline
    def setEc2InstanceId(value: String): Self = this.set("Ec2InstanceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEc2InstanceId: Self = this.set("Ec2InstanceId", js.undefined)
    @scala.inline
    def setEcsClusterArn(value: String): Self = this.set("EcsClusterArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEcsClusterArn: Self = this.set("EcsClusterArn", js.undefined)
    @scala.inline
    def setEcsContainerInstanceArn(value: String): Self = this.set("EcsContainerInstanceArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEcsContainerInstanceArn: Self = this.set("EcsContainerInstanceArn", js.undefined)
    @scala.inline
    def setElasticIp(value: String): Self = this.set("ElasticIp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElasticIp: Self = this.set("ElasticIp", js.undefined)
    @scala.inline
    def setHostname(value: String): Self = this.set("Hostname", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHostname: Self = this.set("Hostname", js.undefined)
    @scala.inline
    def setInfrastructureClass(value: String): Self = this.set("InfrastructureClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInfrastructureClass: Self = this.set("InfrastructureClass", js.undefined)
    @scala.inline
    def setInstallUpdatesOnBoot(value: Boolean): Self = this.set("InstallUpdatesOnBoot", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstallUpdatesOnBoot: Self = this.set("InstallUpdatesOnBoot", js.undefined)
    @scala.inline
    def setInstanceId(value: String): Self = this.set("InstanceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceId: Self = this.set("InstanceId", js.undefined)
    @scala.inline
    def setInstanceProfileArn(value: String): Self = this.set("InstanceProfileArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceProfileArn: Self = this.set("InstanceProfileArn", js.undefined)
    @scala.inline
    def setInstanceType(value: String): Self = this.set("InstanceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceType: Self = this.set("InstanceType", js.undefined)
    @scala.inline
    def setLastServiceErrorId(value: String): Self = this.set("LastServiceErrorId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastServiceErrorId: Self = this.set("LastServiceErrorId", js.undefined)
    @scala.inline
    def setLayerIdsVarargs(value: String*): Self = this.set("LayerIds", js.Array(value :_*))
    @scala.inline
    def setLayerIds(value: Strings): Self = this.set("LayerIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayerIds: Self = this.set("LayerIds", js.undefined)
    @scala.inline
    def setOs(value: String): Self = this.set("Os", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOs: Self = this.set("Os", js.undefined)
    @scala.inline
    def setPlatform(value: String): Self = this.set("Platform", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlatform: Self = this.set("Platform", js.undefined)
    @scala.inline
    def setPrivateDns(value: String): Self = this.set("PrivateDns", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrivateDns: Self = this.set("PrivateDns", js.undefined)
    @scala.inline
    def setPrivateIp(value: String): Self = this.set("PrivateIp", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrivateIp: Self = this.set("PrivateIp", js.undefined)
    @scala.inline
    def setPublicDns(value: String): Self = this.set("PublicDns", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublicDns: Self = this.set("PublicDns", js.undefined)
    @scala.inline
    def setPublicIp(value: String): Self = this.set("PublicIp", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublicIp: Self = this.set("PublicIp", js.undefined)
    @scala.inline
    def setRegisteredBy(value: String): Self = this.set("RegisteredBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegisteredBy: Self = this.set("RegisteredBy", js.undefined)
    @scala.inline
    def setReportedAgentVersion(value: String): Self = this.set("ReportedAgentVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReportedAgentVersion: Self = this.set("ReportedAgentVersion", js.undefined)
    @scala.inline
    def setReportedOs(value: ReportedOs): Self = this.set("ReportedOs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReportedOs: Self = this.set("ReportedOs", js.undefined)
    @scala.inline
    def setRootDeviceType(value: RootDeviceType): Self = this.set("RootDeviceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRootDeviceType: Self = this.set("RootDeviceType", js.undefined)
    @scala.inline
    def setRootDeviceVolumeId(value: String): Self = this.set("RootDeviceVolumeId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRootDeviceVolumeId: Self = this.set("RootDeviceVolumeId", js.undefined)
    @scala.inline
    def setSecurityGroupIdsVarargs(value: String*): Self = this.set("SecurityGroupIds", js.Array(value :_*))
    @scala.inline
    def setSecurityGroupIds(value: Strings): Self = this.set("SecurityGroupIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecurityGroupIds: Self = this.set("SecurityGroupIds", js.undefined)
    @scala.inline
    def setSshHostDsaKeyFingerprint(value: String): Self = this.set("SshHostDsaKeyFingerprint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSshHostDsaKeyFingerprint: Self = this.set("SshHostDsaKeyFingerprint", js.undefined)
    @scala.inline
    def setSshHostRsaKeyFingerprint(value: String): Self = this.set("SshHostRsaKeyFingerprint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSshHostRsaKeyFingerprint: Self = this.set("SshHostRsaKeyFingerprint", js.undefined)
    @scala.inline
    def setSshKeyName(value: String): Self = this.set("SshKeyName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSshKeyName: Self = this.set("SshKeyName", js.undefined)
    @scala.inline
    def setStackId(value: String): Self = this.set("StackId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStackId: Self = this.set("StackId", js.undefined)
    @scala.inline
    def setStatus(value: String): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    @scala.inline
    def setSubnetId(value: String): Self = this.set("SubnetId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubnetId: Self = this.set("SubnetId", js.undefined)
    @scala.inline
    def setTenancy(value: String): Self = this.set("Tenancy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTenancy: Self = this.set("Tenancy", js.undefined)
    @scala.inline
    def setVirtualizationType(value: VirtualizationType): Self = this.set("VirtualizationType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVirtualizationType: Self = this.set("VirtualizationType", js.undefined)
  }
  
}

