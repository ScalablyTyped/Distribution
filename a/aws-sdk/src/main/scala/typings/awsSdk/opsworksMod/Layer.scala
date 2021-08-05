package typings.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Layer extends StObject {
  
  /**
    * The Amazon Resource Number (ARN) of a layer.
    */
  var Arn: js.UndefOr[String] = js.undefined
  
  /**
    * The layer attributes. For the HaproxyStatsPassword, MysqlRootPassword, and GangliaPassword attributes, AWS OpsWorks Stacks returns *****FILTERED***** instead of the actual value For an ECS Cluster layer, AWS OpsWorks Stacks the EcsClusterArn attribute is set to the cluster's ARN.
    */
  var Attributes: js.UndefOr[LayerAttributes] = js.undefined
  
  /**
    * Whether to automatically assign an Elastic IP address to the layer's instances. For more information, see How to Edit a Layer.
    */
  var AutoAssignElasticIps: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For stacks that are running in a VPC, whether to automatically assign a public IP address to the layer's instances. For more information, see How to Edit a Layer.
    */
  var AutoAssignPublicIps: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The Amazon CloudWatch Logs configuration settings for the layer.
    */
  var CloudWatchLogsConfiguration: js.UndefOr[typings.awsSdk.opsworksMod.CloudWatchLogsConfiguration] = js.undefined
  
  /**
    * Date when the layer was created.
    */
  var CreatedAt: js.UndefOr[DateTime] = js.undefined
  
  /**
    * The ARN of the default IAM profile to be used for the layer's EC2 instances. For more information about IAM ARNs, see Using Identifiers.
    */
  var CustomInstanceProfileArn: js.UndefOr[String] = js.undefined
  
  /**
    * A JSON formatted string containing the layer's custom stack configuration and deployment attributes.
    */
  var CustomJson: js.UndefOr[String] = js.undefined
  
  /**
    * A LayerCustomRecipes object that specifies the layer's custom recipes.
    */
  var CustomRecipes: js.UndefOr[Recipes] = js.undefined
  
  /**
    * An array containing the layer's custom security group IDs.
    */
  var CustomSecurityGroupIds: js.UndefOr[Strings] = js.undefined
  
  /**
    * AWS OpsWorks Stacks supports five lifecycle events: setup, configuration, deploy, undeploy, and shutdown. For each layer, AWS OpsWorks Stacks runs a set of standard recipes for each event. You can also provide custom recipes for any or all layers and events. AWS OpsWorks Stacks runs custom event recipes after the standard recipes. LayerCustomRecipes specifies the custom recipes for a particular layer to be run in response to each of the five events. To specify a recipe, use the cookbook's directory name in the repository followed by two colons and the recipe name, which is the recipe's file name without the .rb extension. For example: phpapp2::dbsetup specifies the dbsetup.rb recipe in the repository's phpapp2 folder.
    */
  var DefaultRecipes: js.UndefOr[Recipes] = js.undefined
  
  /**
    * An array containing the layer's security group names.
    */
  var DefaultSecurityGroupNames: js.UndefOr[Strings] = js.undefined
  
  /**
    * Whether auto healing is disabled for the layer.
    */
  var EnableAutoHealing: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether to install operating system and package updates when the instance boots. The default value is true. If this value is set to false, you must then update your instances manually by using CreateDeployment to run the update_dependencies stack command or manually running yum (Amazon Linux) or apt-get (Ubuntu) on the instances.   We strongly recommend using the default value of true, to ensure that your instances have the latest security updates. 
    */
  var InstallUpdatesOnBoot: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The layer ID.
    */
  var LayerId: js.UndefOr[String] = js.undefined
  
  /**
    * A LifeCycleEventConfiguration object that specifies the Shutdown event configuration.
    */
  var LifecycleEventConfiguration: js.UndefOr[typings.awsSdk.opsworksMod.LifecycleEventConfiguration] = js.undefined
  
  /**
    * The layer name.
    */
  var Name: js.UndefOr[String] = js.undefined
  
  /**
    * An array of Package objects that describe the layer's packages.
    */
  var Packages: js.UndefOr[Strings] = js.undefined
  
  /**
    * The layer short name.
    */
  var Shortname: js.UndefOr[String] = js.undefined
  
  /**
    * The layer stack ID.
    */
  var StackId: js.UndefOr[String] = js.undefined
  
  /**
    * The layer type.
    */
  var Type: js.UndefOr[LayerType] = js.undefined
  
  /**
    * Whether the layer uses Amazon EBS-optimized instances.
    */
  var UseEbsOptimizedInstances: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A VolumeConfigurations object that describes the layer's Amazon EBS volumes.
    */
  var VolumeConfigurations: js.UndefOr[typings.awsSdk.opsworksMod.VolumeConfigurations] = js.undefined
}
object Layer {
  
  inline def apply(): Layer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Layer]
  }
  
  extension [Self <: Layer](x: Self) {
    
    inline def setArn(value: String): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setAttributes(value: LayerAttributes): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
    
    inline def setAutoAssignElasticIps(value: Boolean): Self = StObject.set(x, "AutoAssignElasticIps", value.asInstanceOf[js.Any])
    
    inline def setAutoAssignElasticIpsUndefined: Self = StObject.set(x, "AutoAssignElasticIps", js.undefined)
    
    inline def setAutoAssignPublicIps(value: Boolean): Self = StObject.set(x, "AutoAssignPublicIps", value.asInstanceOf[js.Any])
    
    inline def setAutoAssignPublicIpsUndefined: Self = StObject.set(x, "AutoAssignPublicIps", js.undefined)
    
    inline def setCloudWatchLogsConfiguration(value: CloudWatchLogsConfiguration): Self = StObject.set(x, "CloudWatchLogsConfiguration", value.asInstanceOf[js.Any])
    
    inline def setCloudWatchLogsConfigurationUndefined: Self = StObject.set(x, "CloudWatchLogsConfiguration", js.undefined)
    
    inline def setCreatedAt(value: DateTime): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    inline def setCustomInstanceProfileArn(value: String): Self = StObject.set(x, "CustomInstanceProfileArn", value.asInstanceOf[js.Any])
    
    inline def setCustomInstanceProfileArnUndefined: Self = StObject.set(x, "CustomInstanceProfileArn", js.undefined)
    
    inline def setCustomJson(value: String): Self = StObject.set(x, "CustomJson", value.asInstanceOf[js.Any])
    
    inline def setCustomJsonUndefined: Self = StObject.set(x, "CustomJson", js.undefined)
    
    inline def setCustomRecipes(value: Recipes): Self = StObject.set(x, "CustomRecipes", value.asInstanceOf[js.Any])
    
    inline def setCustomRecipesUndefined: Self = StObject.set(x, "CustomRecipes", js.undefined)
    
    inline def setCustomSecurityGroupIds(value: Strings): Self = StObject.set(x, "CustomSecurityGroupIds", value.asInstanceOf[js.Any])
    
    inline def setCustomSecurityGroupIdsUndefined: Self = StObject.set(x, "CustomSecurityGroupIds", js.undefined)
    
    inline def setCustomSecurityGroupIdsVarargs(value: String*): Self = StObject.set(x, "CustomSecurityGroupIds", js.Array(value :_*))
    
    inline def setDefaultRecipes(value: Recipes): Self = StObject.set(x, "DefaultRecipes", value.asInstanceOf[js.Any])
    
    inline def setDefaultRecipesUndefined: Self = StObject.set(x, "DefaultRecipes", js.undefined)
    
    inline def setDefaultSecurityGroupNames(value: Strings): Self = StObject.set(x, "DefaultSecurityGroupNames", value.asInstanceOf[js.Any])
    
    inline def setDefaultSecurityGroupNamesUndefined: Self = StObject.set(x, "DefaultSecurityGroupNames", js.undefined)
    
    inline def setDefaultSecurityGroupNamesVarargs(value: String*): Self = StObject.set(x, "DefaultSecurityGroupNames", js.Array(value :_*))
    
    inline def setEnableAutoHealing(value: Boolean): Self = StObject.set(x, "EnableAutoHealing", value.asInstanceOf[js.Any])
    
    inline def setEnableAutoHealingUndefined: Self = StObject.set(x, "EnableAutoHealing", js.undefined)
    
    inline def setInstallUpdatesOnBoot(value: Boolean): Self = StObject.set(x, "InstallUpdatesOnBoot", value.asInstanceOf[js.Any])
    
    inline def setInstallUpdatesOnBootUndefined: Self = StObject.set(x, "InstallUpdatesOnBoot", js.undefined)
    
    inline def setLayerId(value: String): Self = StObject.set(x, "LayerId", value.asInstanceOf[js.Any])
    
    inline def setLayerIdUndefined: Self = StObject.set(x, "LayerId", js.undefined)
    
    inline def setLifecycleEventConfiguration(value: LifecycleEventConfiguration): Self = StObject.set(x, "LifecycleEventConfiguration", value.asInstanceOf[js.Any])
    
    inline def setLifecycleEventConfigurationUndefined: Self = StObject.set(x, "LifecycleEventConfiguration", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setPackages(value: Strings): Self = StObject.set(x, "Packages", value.asInstanceOf[js.Any])
    
    inline def setPackagesUndefined: Self = StObject.set(x, "Packages", js.undefined)
    
    inline def setPackagesVarargs(value: String*): Self = StObject.set(x, "Packages", js.Array(value :_*))
    
    inline def setShortname(value: String): Self = StObject.set(x, "Shortname", value.asInstanceOf[js.Any])
    
    inline def setShortnameUndefined: Self = StObject.set(x, "Shortname", js.undefined)
    
    inline def setStackId(value: String): Self = StObject.set(x, "StackId", value.asInstanceOf[js.Any])
    
    inline def setStackIdUndefined: Self = StObject.set(x, "StackId", js.undefined)
    
    inline def setType(value: LayerType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    inline def setUseEbsOptimizedInstances(value: Boolean): Self = StObject.set(x, "UseEbsOptimizedInstances", value.asInstanceOf[js.Any])
    
    inline def setUseEbsOptimizedInstancesUndefined: Self = StObject.set(x, "UseEbsOptimizedInstances", js.undefined)
    
    inline def setVolumeConfigurations(value: VolumeConfigurations): Self = StObject.set(x, "VolumeConfigurations", value.asInstanceOf[js.Any])
    
    inline def setVolumeConfigurationsUndefined: Self = StObject.set(x, "VolumeConfigurations", js.undefined)
    
    inline def setVolumeConfigurationsVarargs(value: VolumeConfiguration*): Self = StObject.set(x, "VolumeConfigurations", js.Array(value :_*))
  }
}
