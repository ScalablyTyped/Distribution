package typings.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateStackRequest extends StObject {
  
  /**
    * The default AWS OpsWorks Stacks agent version. You have the following options:   Auto-update - Set this parameter to LATEST. AWS OpsWorks Stacks automatically installs new agent versions on the stack's instances as soon as they are available.   Fixed version - Set this parameter to your preferred agent version. To update the agent version, you must edit the stack configuration and specify a new version. AWS OpsWorks Stacks then automatically installs that version on the stack's instances.   The default setting is LATEST. To specify an agent version, you must use the complete version number, not the abbreviated number shown on the console. For a list of available agent version numbers, call DescribeAgentVersions. AgentVersion cannot be set to Chef 12.2.  You can also specify an agent version when you create or update an instance, which overrides the stack's default setting. 
    */
  var AgentVersion: js.UndefOr[String] = js.undefined
  
  /**
    * One or more user-defined key-value pairs to be added to the stack attributes.
    */
  var Attributes: js.UndefOr[StackAttributes] = js.undefined
  
  /**
    * A ChefConfiguration object that specifies whether to enable Berkshelf and the Berkshelf version on Chef 11.10 stacks. For more information, see Create a New Stack.
    */
  var ChefConfiguration: js.UndefOr[typings.awsSdk.opsworksMod.ChefConfiguration] = js.undefined
  
  /**
    * The configuration manager. When you update a stack, we recommend that you use the configuration manager to specify the Chef version: 12, 11.10, or 11.4 for Linux stacks, or 12.2 for Windows stacks. The default value for Linux stacks is currently 12.
    */
  var ConfigurationManager: js.UndefOr[StackConfigurationManager] = js.undefined
  
  /**
    * Contains the information required to retrieve an app or cookbook from a repository. For more information, see Adding Apps or Cookbooks and Recipes.
    */
  var CustomCookbooksSource: js.UndefOr[Source] = js.undefined
  
  /**
    * A string that contains user-defined, custom JSON. It can be used to override the corresponding default stack configuration JSON values or to pass data to recipes. The string should be in the following format:  "{\"key1\": \"value1\", \"key2\": \"value2\",...}"  For more information about custom JSON, see Use Custom JSON to Modify the Stack Configuration Attributes.
    */
  var CustomJson: js.UndefOr[String] = js.undefined
  
  /**
    * The stack's default Availability Zone, which must be in the stack's region. For more information, see Regions and Endpoints. If you also specify a value for DefaultSubnetId, the subnet must be in the same zone. For more information, see CreateStack. 
    */
  var DefaultAvailabilityZone: js.UndefOr[String] = js.undefined
  
  /**
    * The ARN of an IAM profile that is the default profile for all of the stack's EC2 instances. For more information about IAM ARNs, see Using Identifiers.
    */
  var DefaultInstanceProfileArn: js.UndefOr[String] = js.undefined
  
  /**
    * The stack's operating system, which must be set to one of the following:   A supported Linux operating system: An Amazon Linux version, such as Amazon Linux 2018.03, Amazon Linux 2017.09, Amazon Linux 2017.03, Amazon Linux 2016.09, Amazon Linux 2016.03, Amazon Linux 2015.09, or Amazon Linux 2015.03.   A supported Ubuntu operating system, such as Ubuntu 16.04 LTS, Ubuntu 14.04 LTS, or Ubuntu 12.04 LTS.    CentOS Linux 7     Red Hat Enterprise Linux 7    A supported Windows operating system, such as Microsoft Windows Server 2012 R2 Base, Microsoft Windows Server 2012 R2 with SQL Server Express, Microsoft Windows Server 2012 R2 with SQL Server Standard, or Microsoft Windows Server 2012 R2 with SQL Server Web.   A custom AMI: Custom. You specify the custom AMI you want to use when you create instances. For more information about how to use custom AMIs with OpsWorks, see Using Custom AMIs.   The default option is the stack's current operating system. For more information about supported operating systems, see AWS OpsWorks Stacks Operating Systems.
    */
  var DefaultOs: js.UndefOr[String] = js.undefined
  
  /**
    * The default root device type. This value is used by default for all instances in the stack, but you can override it when you create an instance. For more information, see Storage for the Root Device.
    */
  var DefaultRootDeviceType: js.UndefOr[RootDeviceType] = js.undefined
  
  /**
    * A default Amazon EC2 key-pair name. The default value is none. If you specify a key-pair name, AWS OpsWorks Stacks installs the public key on the instance and you can use the private key with an SSH client to log in to the instance. For more information, see  Using SSH to Communicate with an Instance and  Managing SSH Access. You can override this setting by specifying a different key pair, or no key pair, when you  create an instance. 
    */
  var DefaultSshKeyName: js.UndefOr[String] = js.undefined
  
  /**
    * The stack's default VPC subnet ID. This parameter is required if you specify a value for the VpcId parameter. All instances are launched into this subnet unless you specify otherwise when you create the instance. If you also specify a value for DefaultAvailabilityZone, the subnet must be in that zone. For information on default values and when this parameter is required, see the VpcId parameter description. 
    */
  var DefaultSubnetId: js.UndefOr[String] = js.undefined
  
  /**
    * The stack's new host name theme, with spaces replaced by underscores. The theme is used to generate host names for the stack's instances. By default, HostnameTheme is set to Layer_Dependent, which creates host names by appending integers to the layer's short name. The other themes are:    Baked_Goods     Clouds     Europe_Cities     Fruits     Greek_Deities_and_Titans     Legendary_creatures_from_Japan     Planets_and_Moons     Roman_Deities     Scottish_Islands     US_Cities     Wild_Cats    To obtain a generated host name, call GetHostNameSuggestion, which returns a host name based on the current theme.
    */
  var HostnameTheme: js.UndefOr[String] = js.undefined
  
  /**
    * The stack's new name.
    */
  var Name: js.UndefOr[String] = js.undefined
  
  /**
    * Do not use this parameter. You cannot update a stack's service role.
    */
  var ServiceRoleArn: js.UndefOr[String] = js.undefined
  
  /**
    * The stack ID.
    */
  var StackId: String
  
  /**
    * Whether the stack uses custom cookbooks.
    */
  var UseCustomCookbooks: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether to associate the AWS OpsWorks Stacks built-in security groups with the stack's layers. AWS OpsWorks Stacks provides a standard set of built-in security groups, one for each layer, which are associated with layers by default. UseOpsworksSecurityGroups allows you to provide your own custom security groups instead of using the built-in groups. UseOpsworksSecurityGroups has the following settings:    True - AWS OpsWorks Stacks automatically associates the appropriate built-in security group with each layer (default setting). You can associate additional security groups with a layer after you create it, but you cannot delete the built-in security group.   False - AWS OpsWorks Stacks does not associate built-in security groups with layers. You must create appropriate EC2 security groups and associate a security group with each layer that you create. However, you can still manually associate a built-in security group with a layer on. Custom security groups are required only for those layers that need custom settings.   For more information, see Create a New Stack.
    */
  var UseOpsworksSecurityGroups: js.UndefOr[Boolean] = js.undefined
}
object UpdateStackRequest {
  
  inline def apply(StackId: String): UpdateStackRequest = {
    val __obj = js.Dynamic.literal(StackId = StackId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateStackRequest]
  }
  
  extension [Self <: UpdateStackRequest](x: Self) {
    
    inline def setAgentVersion(value: String): Self = StObject.set(x, "AgentVersion", value.asInstanceOf[js.Any])
    
    inline def setAgentVersionUndefined: Self = StObject.set(x, "AgentVersion", js.undefined)
    
    inline def setAttributes(value: StackAttributes): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
    
    inline def setChefConfiguration(value: ChefConfiguration): Self = StObject.set(x, "ChefConfiguration", value.asInstanceOf[js.Any])
    
    inline def setChefConfigurationUndefined: Self = StObject.set(x, "ChefConfiguration", js.undefined)
    
    inline def setConfigurationManager(value: StackConfigurationManager): Self = StObject.set(x, "ConfigurationManager", value.asInstanceOf[js.Any])
    
    inline def setConfigurationManagerUndefined: Self = StObject.set(x, "ConfigurationManager", js.undefined)
    
    inline def setCustomCookbooksSource(value: Source): Self = StObject.set(x, "CustomCookbooksSource", value.asInstanceOf[js.Any])
    
    inline def setCustomCookbooksSourceUndefined: Self = StObject.set(x, "CustomCookbooksSource", js.undefined)
    
    inline def setCustomJson(value: String): Self = StObject.set(x, "CustomJson", value.asInstanceOf[js.Any])
    
    inline def setCustomJsonUndefined: Self = StObject.set(x, "CustomJson", js.undefined)
    
    inline def setDefaultAvailabilityZone(value: String): Self = StObject.set(x, "DefaultAvailabilityZone", value.asInstanceOf[js.Any])
    
    inline def setDefaultAvailabilityZoneUndefined: Self = StObject.set(x, "DefaultAvailabilityZone", js.undefined)
    
    inline def setDefaultInstanceProfileArn(value: String): Self = StObject.set(x, "DefaultInstanceProfileArn", value.asInstanceOf[js.Any])
    
    inline def setDefaultInstanceProfileArnUndefined: Self = StObject.set(x, "DefaultInstanceProfileArn", js.undefined)
    
    inline def setDefaultOs(value: String): Self = StObject.set(x, "DefaultOs", value.asInstanceOf[js.Any])
    
    inline def setDefaultOsUndefined: Self = StObject.set(x, "DefaultOs", js.undefined)
    
    inline def setDefaultRootDeviceType(value: RootDeviceType): Self = StObject.set(x, "DefaultRootDeviceType", value.asInstanceOf[js.Any])
    
    inline def setDefaultRootDeviceTypeUndefined: Self = StObject.set(x, "DefaultRootDeviceType", js.undefined)
    
    inline def setDefaultSshKeyName(value: String): Self = StObject.set(x, "DefaultSshKeyName", value.asInstanceOf[js.Any])
    
    inline def setDefaultSshKeyNameUndefined: Self = StObject.set(x, "DefaultSshKeyName", js.undefined)
    
    inline def setDefaultSubnetId(value: String): Self = StObject.set(x, "DefaultSubnetId", value.asInstanceOf[js.Any])
    
    inline def setDefaultSubnetIdUndefined: Self = StObject.set(x, "DefaultSubnetId", js.undefined)
    
    inline def setHostnameTheme(value: String): Self = StObject.set(x, "HostnameTheme", value.asInstanceOf[js.Any])
    
    inline def setHostnameThemeUndefined: Self = StObject.set(x, "HostnameTheme", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setServiceRoleArn(value: String): Self = StObject.set(x, "ServiceRoleArn", value.asInstanceOf[js.Any])
    
    inline def setServiceRoleArnUndefined: Self = StObject.set(x, "ServiceRoleArn", js.undefined)
    
    inline def setStackId(value: String): Self = StObject.set(x, "StackId", value.asInstanceOf[js.Any])
    
    inline def setUseCustomCookbooks(value: Boolean): Self = StObject.set(x, "UseCustomCookbooks", value.asInstanceOf[js.Any])
    
    inline def setUseCustomCookbooksUndefined: Self = StObject.set(x, "UseCustomCookbooks", js.undefined)
    
    inline def setUseOpsworksSecurityGroups(value: Boolean): Self = StObject.set(x, "UseOpsworksSecurityGroups", value.asInstanceOf[js.Any])
    
    inline def setUseOpsworksSecurityGroupsUndefined: Self = StObject.set(x, "UseOpsworksSecurityGroups", js.undefined)
  }
}
