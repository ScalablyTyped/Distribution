package typings.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateInstanceRequest extends StObject {
  
  /**
    * The default AWS OpsWorks Stacks agent version. You have the following options:    INHERIT - Use the stack's default agent version setting.    version_number - Use the specified agent version. This value overrides the stack's default setting. To update the agent version, you must edit the instance configuration and specify a new version. AWS OpsWorks Stacks then automatically installs that version on the instance.   The default setting is INHERIT. To specify an agent version, you must use the complete version number, not the abbreviated number shown on the console. For a list of available agent version numbers, call DescribeAgentVersions. AgentVersion cannot be set to Chef 12.2.
    */
  var AgentVersion: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the AMI that was used to create the instance. The value of this parameter must be the same AMI ID that the instance is already using. You cannot apply a new AMI to an instance by running UpdateInstance. UpdateInstance does not work on instances that are using custom AMIs. 
    */
  var AmiId: js.UndefOr[String] = js.undefined
  
  /**
    * The instance architecture. Instance types do not necessarily support both architectures. For a list of the architectures that are supported by the different instance types, see Instance Families and Types.
    */
  var Architecture: js.UndefOr[typings.awsSdk.opsworksMod.Architecture] = js.undefined
  
  /**
    * For load-based or time-based instances, the type. Windows stacks can use only time-based instances.
    */
  var AutoScalingType: js.UndefOr[typings.awsSdk.opsworksMod.AutoScalingType] = js.undefined
  
  /**
    * This property cannot be updated.
    */
  var EbsOptimized: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The instance host name.
    */
  var Hostname: js.UndefOr[String] = js.undefined
  
  /**
    * Whether to install operating system and package updates when the instance boots. The default value is true. To control when updates are installed, set this value to false. You must then update your instances manually by using CreateDeployment to run the update_dependencies stack command or by manually running yum (Amazon Linux) or apt-get (Ubuntu) on the instances.   We strongly recommend using the default value of true, to ensure that your instances have the latest security updates. 
    */
  var InstallUpdatesOnBoot: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The instance ID.
    */
  var InstanceId: String
  
  /**
    * The instance type, such as t2.micro. For a list of supported instance types, open the stack in the console, choose Instances, and choose + Instance. The Size list contains the currently supported types. For more information, see Instance Families and Types. The parameter values that you use to specify the various types are in the API Name column of the Available Instance Types table.
    */
  var InstanceType: js.UndefOr[String] = js.undefined
  
  /**
    * The instance's layer IDs.
    */
  var LayerIds: js.UndefOr[Strings] = js.undefined
  
  /**
    * The instance's operating system, which must be set to one of the following. You cannot update an instance that is using a custom AMI.   A supported Linux operating system: An Amazon Linux version, such as Amazon Linux 2018.03, Amazon Linux 2017.09, Amazon Linux 2017.03, Amazon Linux 2016.09, Amazon Linux 2016.03, Amazon Linux 2015.09, or Amazon Linux 2015.03.   A supported Ubuntu operating system, such as Ubuntu 16.04 LTS, Ubuntu 14.04 LTS, or Ubuntu 12.04 LTS.    CentOS Linux 7     Red Hat Enterprise Linux 7    A supported Windows operating system, such as Microsoft Windows Server 2012 R2 Base, Microsoft Windows Server 2012 R2 with SQL Server Express, Microsoft Windows Server 2012 R2 with SQL Server Standard, or Microsoft Windows Server 2012 R2 with SQL Server Web.   For more information about supported operating systems, see AWS OpsWorks Stacks Operating Systems. The default option is the current Amazon Linux version. If you set this parameter to Custom, you must use the AmiId parameter to specify the custom AMI that you want to use. For more information about supported operating systems, see Operating Systems. For more information about how to use custom AMIs with OpsWorks, see Using Custom AMIs.  You can specify a different Linux operating system for the updated stack, but you cannot change from Linux to Windows or Windows to Linux. 
    */
  var Os: js.UndefOr[String] = js.undefined
  
  /**
    * The instance's Amazon EC2 key name.
    */
  var SshKeyName: js.UndefOr[String] = js.undefined
}
object UpdateInstanceRequest {
  
  inline def apply(InstanceId: String): UpdateInstanceRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateInstanceRequest]
  }
  
  extension [Self <: UpdateInstanceRequest](x: Self) {
    
    inline def setAgentVersion(value: String): Self = StObject.set(x, "AgentVersion", value.asInstanceOf[js.Any])
    
    inline def setAgentVersionUndefined: Self = StObject.set(x, "AgentVersion", js.undefined)
    
    inline def setAmiId(value: String): Self = StObject.set(x, "AmiId", value.asInstanceOf[js.Any])
    
    inline def setAmiIdUndefined: Self = StObject.set(x, "AmiId", js.undefined)
    
    inline def setArchitecture(value: Architecture): Self = StObject.set(x, "Architecture", value.asInstanceOf[js.Any])
    
    inline def setArchitectureUndefined: Self = StObject.set(x, "Architecture", js.undefined)
    
    inline def setAutoScalingType(value: AutoScalingType): Self = StObject.set(x, "AutoScalingType", value.asInstanceOf[js.Any])
    
    inline def setAutoScalingTypeUndefined: Self = StObject.set(x, "AutoScalingType", js.undefined)
    
    inline def setEbsOptimized(value: Boolean): Self = StObject.set(x, "EbsOptimized", value.asInstanceOf[js.Any])
    
    inline def setEbsOptimizedUndefined: Self = StObject.set(x, "EbsOptimized", js.undefined)
    
    inline def setHostname(value: String): Self = StObject.set(x, "Hostname", value.asInstanceOf[js.Any])
    
    inline def setHostnameUndefined: Self = StObject.set(x, "Hostname", js.undefined)
    
    inline def setInstallUpdatesOnBoot(value: Boolean): Self = StObject.set(x, "InstallUpdatesOnBoot", value.asInstanceOf[js.Any])
    
    inline def setInstallUpdatesOnBootUndefined: Self = StObject.set(x, "InstallUpdatesOnBoot", js.undefined)
    
    inline def setInstanceId(value: String): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setInstanceType(value: String): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
    
    inline def setInstanceTypeUndefined: Self = StObject.set(x, "InstanceType", js.undefined)
    
    inline def setLayerIds(value: Strings): Self = StObject.set(x, "LayerIds", value.asInstanceOf[js.Any])
    
    inline def setLayerIdsUndefined: Self = StObject.set(x, "LayerIds", js.undefined)
    
    inline def setLayerIdsVarargs(value: String*): Self = StObject.set(x, "LayerIds", js.Array(value*))
    
    inline def setOs(value: String): Self = StObject.set(x, "Os", value.asInstanceOf[js.Any])
    
    inline def setOsUndefined: Self = StObject.set(x, "Os", js.undefined)
    
    inline def setSshKeyName(value: String): Self = StObject.set(x, "SshKeyName", value.asInstanceOf[js.Any])
    
    inline def setSshKeyNameUndefined: Self = StObject.set(x, "SshKeyName", js.undefined)
  }
}
