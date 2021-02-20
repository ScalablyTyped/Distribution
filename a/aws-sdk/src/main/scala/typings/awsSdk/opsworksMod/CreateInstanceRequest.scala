package typings.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateInstanceRequest extends StObject {
  
  /**
    * The default AWS OpsWorks Stacks agent version. You have the following options:    INHERIT - Use the stack's default agent version setting.    version_number - Use the specified agent version. This value overrides the stack's default setting. To update the agent version, edit the instance configuration and specify a new version. AWS OpsWorks Stacks then automatically installs that version on the instance.   The default setting is INHERIT. To specify an agent version, you must use the complete version number, not the abbreviated number shown on the console. For a list of available agent version numbers, call DescribeAgentVersions. AgentVersion cannot be set to Chef 12.2.
    */
  var AgentVersion: js.UndefOr[String] = js.native
  
  /**
    * A custom AMI ID to be used to create the instance. The AMI should be based on one of the supported operating systems. For more information, see Using Custom AMIs.  If you specify a custom AMI, you must set Os to Custom. 
    */
  var AmiId: js.UndefOr[String] = js.native
  
  /**
    * The instance architecture. The default option is x86_64. Instance types do not necessarily support both architectures. For a list of the architectures that are supported by the different instance types, see Instance Families and Types.
    */
  var Architecture: js.UndefOr[typings.awsSdk.opsworksMod.Architecture] = js.native
  
  /**
    * For load-based or time-based instances, the type. Windows stacks can use only time-based instances.
    */
  var AutoScalingType: js.UndefOr[typings.awsSdk.opsworksMod.AutoScalingType] = js.native
  
  /**
    * The instance Availability Zone. For more information, see Regions and Endpoints.
    */
  var AvailabilityZone: js.UndefOr[String] = js.native
  
  /**
    * An array of BlockDeviceMapping objects that specify the instance's block devices. For more information, see Block Device Mapping. Note that block device mappings are not supported for custom AMIs.
    */
  var BlockDeviceMappings: js.UndefOr[typings.awsSdk.opsworksMod.BlockDeviceMappings] = js.native
  
  /**
    * Whether to create an Amazon EBS-optimized instance.
    */
  var EbsOptimized: js.UndefOr[Boolean] = js.native
  
  /**
    * The instance host name.
    */
  var Hostname: js.UndefOr[String] = js.native
  
  /**
    * Whether to install operating system and package updates when the instance boots. The default value is true. To control when updates are installed, set this value to false. You must then update your instances manually by using CreateDeployment to run the update_dependencies stack command or by manually running yum (Amazon Linux) or apt-get (Ubuntu) on the instances.   We strongly recommend using the default value of true to ensure that your instances have the latest security updates. 
    */
  var InstallUpdatesOnBoot: js.UndefOr[Boolean] = js.native
  
  /**
    * The instance type, such as t2.micro. For a list of supported instance types, open the stack in the console, choose Instances, and choose + Instance. The Size list contains the currently supported types. For more information, see Instance Families and Types. The parameter values that you use to specify the various types are in the API Name column of the Available Instance Types table.
    */
  var InstanceType: String = js.native
  
  /**
    * An array that contains the instance's layer IDs.
    */
  var LayerIds: Strings = js.native
  
  /**
    * The instance's operating system, which must be set to one of the following.   A supported Linux operating system: An Amazon Linux version, such as Amazon Linux 2018.03, Amazon Linux 2017.09, Amazon Linux 2017.03, Amazon Linux 2016.09, Amazon Linux 2016.03, Amazon Linux 2015.09, or Amazon Linux 2015.03.   A supported Ubuntu operating system, such as Ubuntu 16.04 LTS, Ubuntu 14.04 LTS, or Ubuntu 12.04 LTS.    CentOS Linux 7     Red Hat Enterprise Linux 7    A supported Windows operating system, such as Microsoft Windows Server 2012 R2 Base, Microsoft Windows Server 2012 R2 with SQL Server Express, Microsoft Windows Server 2012 R2 with SQL Server Standard, or Microsoft Windows Server 2012 R2 with SQL Server Web.   A custom AMI: Custom.   For more information about the supported operating systems, see AWS OpsWorks Stacks Operating Systems. The default option is the current Amazon Linux version. If you set this parameter to Custom, you must use the CreateInstance action's AmiId parameter to specify the custom AMI that you want to use. Block device mappings are not supported if the value is Custom. For more information about supported operating systems, see Operating SystemsFor more information about how to use custom AMIs with AWS OpsWorks Stacks, see Using Custom AMIs.
    */
  var Os: js.UndefOr[String] = js.native
  
  /**
    * The instance root device type. For more information, see Storage for the Root Device.
    */
  var RootDeviceType: js.UndefOr[typings.awsSdk.opsworksMod.RootDeviceType] = js.native
  
  /**
    * The instance's Amazon EC2 key-pair name.
    */
  var SshKeyName: js.UndefOr[String] = js.native
  
  /**
    * The stack ID.
    */
  var StackId: String = js.native
  
  /**
    * The ID of the instance's subnet. If the stack is running in a VPC, you can use this parameter to override the stack's default subnet ID value and direct AWS OpsWorks Stacks to launch the instance in a different subnet.
    */
  var SubnetId: js.UndefOr[String] = js.native
  
  /**
    * The instance's tenancy option. The default option is no tenancy, or if the instance is running in a VPC, inherit tenancy settings from the VPC. The following are valid values for this parameter: dedicated, default, or host. Because there are costs associated with changes in tenancy options, we recommend that you research tenancy options before choosing them for your instances. For more information about dedicated hosts, see Dedicated Hosts Overview and Amazon EC2 Dedicated Hosts. For more information about dedicated instances, see Dedicated Instances and Amazon EC2 Dedicated Instances.
    */
  var Tenancy: js.UndefOr[String] = js.native
  
  /**
    * The instance's virtualization type, paravirtual or hvm.
    */
  var VirtualizationType: js.UndefOr[String] = js.native
}
object CreateInstanceRequest {
  
  @scala.inline
  def apply(InstanceType: String, LayerIds: Strings, StackId: String): CreateInstanceRequest = {
    val __obj = js.Dynamic.literal(InstanceType = InstanceType.asInstanceOf[js.Any], LayerIds = LayerIds.asInstanceOf[js.Any], StackId = StackId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateInstanceRequest]
  }
  
  @scala.inline
  implicit class CreateInstanceRequestMutableBuilder[Self <: CreateInstanceRequest] (val x: Self) extends AnyVal {
    
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
    def setEbsOptimized(value: Boolean): Self = StObject.set(x, "EbsOptimized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEbsOptimizedUndefined: Self = StObject.set(x, "EbsOptimized", js.undefined)
    
    @scala.inline
    def setHostname(value: String): Self = StObject.set(x, "Hostname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostnameUndefined: Self = StObject.set(x, "Hostname", js.undefined)
    
    @scala.inline
    def setInstallUpdatesOnBoot(value: Boolean): Self = StObject.set(x, "InstallUpdatesOnBoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstallUpdatesOnBootUndefined: Self = StObject.set(x, "InstallUpdatesOnBoot", js.undefined)
    
    @scala.inline
    def setInstanceType(value: String): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayerIds(value: Strings): Self = StObject.set(x, "LayerIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayerIdsVarargs(value: String*): Self = StObject.set(x, "LayerIds", js.Array(value :_*))
    
    @scala.inline
    def setOs(value: String): Self = StObject.set(x, "Os", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOsUndefined: Self = StObject.set(x, "Os", js.undefined)
    
    @scala.inline
    def setRootDeviceType(value: RootDeviceType): Self = StObject.set(x, "RootDeviceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootDeviceTypeUndefined: Self = StObject.set(x, "RootDeviceType", js.undefined)
    
    @scala.inline
    def setSshKeyName(value: String): Self = StObject.set(x, "SshKeyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSshKeyNameUndefined: Self = StObject.set(x, "SshKeyName", js.undefined)
    
    @scala.inline
    def setStackId(value: String): Self = StObject.set(x, "StackId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetId(value: String): Self = StObject.set(x, "SubnetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetIdUndefined: Self = StObject.set(x, "SubnetId", js.undefined)
    
    @scala.inline
    def setTenancy(value: String): Self = StObject.set(x, "Tenancy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTenancyUndefined: Self = StObject.set(x, "Tenancy", js.undefined)
    
    @scala.inline
    def setVirtualizationType(value: String): Self = StObject.set(x, "VirtualizationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualizationTypeUndefined: Self = StObject.set(x, "VirtualizationType", js.undefined)
  }
}
