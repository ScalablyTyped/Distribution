package typings.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Instance extends StObject {
  
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
  implicit class InstanceMutableBuilder[Self <: Instance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAgentVersion(value: String): Self = StObject.set(x, "AgentVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAgentVersionUndefined: Self = StObject.set(x, "AgentVersion", js.undefined)
    
    @scala.inline
    def setAmiId(value: String): Self = StObject.set(x, "AmiId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmiIdUndefined: Self = StObject.set(x, "AmiId", js.undefined)
    
    @scala.inline
    def setArchitecture(value: Architecture): Self = StObject.set(x, "Architecture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArchitectureUndefined: Self = StObject.set(x, "Architecture", js.undefined)
    
    @scala.inline
    def setArn(value: String): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    @scala.inline
    def setAutoScalingType(value: AutoScalingType): Self = StObject.set(x, "AutoScalingType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoScalingTypeUndefined: Self = StObject.set(x, "AutoScalingType", js.undefined)
    
    @scala.inline
    def setAvailabilityZone(value: String): Self = StObject.set(x, "AvailabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityZoneUndefined: Self = StObject.set(x, "AvailabilityZone", js.undefined)
    
    @scala.inline
    def setBlockDeviceMappings(value: BlockDeviceMappings): Self = StObject.set(x, "BlockDeviceMappings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockDeviceMappingsUndefined: Self = StObject.set(x, "BlockDeviceMappings", js.undefined)
    
    @scala.inline
    def setBlockDeviceMappingsVarargs(value: BlockDeviceMapping*): Self = StObject.set(x, "BlockDeviceMappings", js.Array(value :_*))
    
    @scala.inline
    def setCreatedAt(value: DateTime): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    @scala.inline
    def setEbsOptimized(value: Boolean): Self = StObject.set(x, "EbsOptimized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEbsOptimizedUndefined: Self = StObject.set(x, "EbsOptimized", js.undefined)
    
    @scala.inline
    def setEc2InstanceId(value: String): Self = StObject.set(x, "Ec2InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEc2InstanceIdUndefined: Self = StObject.set(x, "Ec2InstanceId", js.undefined)
    
    @scala.inline
    def setEcsClusterArn(value: String): Self = StObject.set(x, "EcsClusterArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEcsClusterArnUndefined: Self = StObject.set(x, "EcsClusterArn", js.undefined)
    
    @scala.inline
    def setEcsContainerInstanceArn(value: String): Self = StObject.set(x, "EcsContainerInstanceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEcsContainerInstanceArnUndefined: Self = StObject.set(x, "EcsContainerInstanceArn", js.undefined)
    
    @scala.inline
    def setElasticIp(value: String): Self = StObject.set(x, "ElasticIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElasticIpUndefined: Self = StObject.set(x, "ElasticIp", js.undefined)
    
    @scala.inline
    def setHostname(value: String): Self = StObject.set(x, "Hostname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostnameUndefined: Self = StObject.set(x, "Hostname", js.undefined)
    
    @scala.inline
    def setInfrastructureClass(value: String): Self = StObject.set(x, "InfrastructureClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfrastructureClassUndefined: Self = StObject.set(x, "InfrastructureClass", js.undefined)
    
    @scala.inline
    def setInstallUpdatesOnBoot(value: Boolean): Self = StObject.set(x, "InstallUpdatesOnBoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstallUpdatesOnBootUndefined: Self = StObject.set(x, "InstallUpdatesOnBoot", js.undefined)
    
    @scala.inline
    def setInstanceId(value: String): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceIdUndefined: Self = StObject.set(x, "InstanceId", js.undefined)
    
    @scala.inline
    def setInstanceProfileArn(value: String): Self = StObject.set(x, "InstanceProfileArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceProfileArnUndefined: Self = StObject.set(x, "InstanceProfileArn", js.undefined)
    
    @scala.inline
    def setInstanceType(value: String): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceTypeUndefined: Self = StObject.set(x, "InstanceType", js.undefined)
    
    @scala.inline
    def setLastServiceErrorId(value: String): Self = StObject.set(x, "LastServiceErrorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastServiceErrorIdUndefined: Self = StObject.set(x, "LastServiceErrorId", js.undefined)
    
    @scala.inline
    def setLayerIds(value: Strings): Self = StObject.set(x, "LayerIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayerIdsUndefined: Self = StObject.set(x, "LayerIds", js.undefined)
    
    @scala.inline
    def setLayerIdsVarargs(value: String*): Self = StObject.set(x, "LayerIds", js.Array(value :_*))
    
    @scala.inline
    def setOs(value: String): Self = StObject.set(x, "Os", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOsUndefined: Self = StObject.set(x, "Os", js.undefined)
    
    @scala.inline
    def setPlatform(value: String): Self = StObject.set(x, "Platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformUndefined: Self = StObject.set(x, "Platform", js.undefined)
    
    @scala.inline
    def setPrivateDns(value: String): Self = StObject.set(x, "PrivateDns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateDnsUndefined: Self = StObject.set(x, "PrivateDns", js.undefined)
    
    @scala.inline
    def setPrivateIp(value: String): Self = StObject.set(x, "PrivateIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateIpUndefined: Self = StObject.set(x, "PrivateIp", js.undefined)
    
    @scala.inline
    def setPublicDns(value: String): Self = StObject.set(x, "PublicDns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicDnsUndefined: Self = StObject.set(x, "PublicDns", js.undefined)
    
    @scala.inline
    def setPublicIp(value: String): Self = StObject.set(x, "PublicIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicIpUndefined: Self = StObject.set(x, "PublicIp", js.undefined)
    
    @scala.inline
    def setRegisteredBy(value: String): Self = StObject.set(x, "RegisteredBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegisteredByUndefined: Self = StObject.set(x, "RegisteredBy", js.undefined)
    
    @scala.inline
    def setReportedAgentVersion(value: String): Self = StObject.set(x, "ReportedAgentVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportedAgentVersionUndefined: Self = StObject.set(x, "ReportedAgentVersion", js.undefined)
    
    @scala.inline
    def setReportedOs(value: ReportedOs): Self = StObject.set(x, "ReportedOs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportedOsUndefined: Self = StObject.set(x, "ReportedOs", js.undefined)
    
    @scala.inline
    def setRootDeviceType(value: RootDeviceType): Self = StObject.set(x, "RootDeviceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootDeviceTypeUndefined: Self = StObject.set(x, "RootDeviceType", js.undefined)
    
    @scala.inline
    def setRootDeviceVolumeId(value: String): Self = StObject.set(x, "RootDeviceVolumeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootDeviceVolumeIdUndefined: Self = StObject.set(x, "RootDeviceVolumeId", js.undefined)
    
    @scala.inline
    def setSecurityGroupIds(value: Strings): Self = StObject.set(x, "SecurityGroupIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityGroupIdsUndefined: Self = StObject.set(x, "SecurityGroupIds", js.undefined)
    
    @scala.inline
    def setSecurityGroupIdsVarargs(value: String*): Self = StObject.set(x, "SecurityGroupIds", js.Array(value :_*))
    
    @scala.inline
    def setSshHostDsaKeyFingerprint(value: String): Self = StObject.set(x, "SshHostDsaKeyFingerprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSshHostDsaKeyFingerprintUndefined: Self = StObject.set(x, "SshHostDsaKeyFingerprint", js.undefined)
    
    @scala.inline
    def setSshHostRsaKeyFingerprint(value: String): Self = StObject.set(x, "SshHostRsaKeyFingerprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSshHostRsaKeyFingerprintUndefined: Self = StObject.set(x, "SshHostRsaKeyFingerprint", js.undefined)
    
    @scala.inline
    def setSshKeyName(value: String): Self = StObject.set(x, "SshKeyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSshKeyNameUndefined: Self = StObject.set(x, "SshKeyName", js.undefined)
    
    @scala.inline
    def setStackId(value: String): Self = StObject.set(x, "StackId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackIdUndefined: Self = StObject.set(x, "StackId", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setSubnetId(value: String): Self = StObject.set(x, "SubnetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetIdUndefined: Self = StObject.set(x, "SubnetId", js.undefined)
    
    @scala.inline
    def setTenancy(value: String): Self = StObject.set(x, "Tenancy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTenancyUndefined: Self = StObject.set(x, "Tenancy", js.undefined)
    
    @scala.inline
    def setVirtualizationType(value: VirtualizationType): Self = StObject.set(x, "VirtualizationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualizationTypeUndefined: Self = StObject.set(x, "VirtualizationType", js.undefined)
  }
}
