package typings.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateLayerRequest extends StObject {
  
  /**
    * One or more user-defined key/value pairs to be added to the stack attributes.
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
    * Specifies CloudWatch Logs configuration options for the layer. For more information, see CloudWatchLogsLogStream.
    */
  var CloudWatchLogsConfiguration: js.UndefOr[typings.awsSdk.opsworksMod.CloudWatchLogsConfiguration] = js.undefined
  
  /**
    * The ARN of an IAM profile to be used for all of the layer's EC2 instances. For more information about IAM ARNs, see Using Identifiers.
    */
  var CustomInstanceProfileArn: js.UndefOr[String] = js.undefined
  
  /**
    * A JSON-formatted string containing custom stack configuration and deployment attributes to be installed on the layer's instances. For more information, see  Using Custom JSON. 
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
    * Whether to disable auto healing for the layer.
    */
  var EnableAutoHealing: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether to install operating system and package updates when the instance boots. The default value is true. To control when updates are installed, set this value to false. You must then update your instances manually by using CreateDeployment to run the update_dependencies stack command or manually running yum (Amazon Linux) or apt-get (Ubuntu) on the instances.   We strongly recommend using the default value of true, to ensure that your instances have the latest security updates. 
    */
  var InstallUpdatesOnBoot: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The layer ID.
    */
  var LayerId: String
  
  /**
    * 
    */
  var LifecycleEventConfiguration: js.UndefOr[typings.awsSdk.opsworksMod.LifecycleEventConfiguration] = js.undefined
  
  /**
    * The layer name, which is used by the console.
    */
  var Name: js.UndefOr[String] = js.undefined
  
  /**
    * An array of Package objects that describe the layer's packages.
    */
  var Packages: js.UndefOr[Strings] = js.undefined
  
  /**
    * For custom layers only, use this parameter to specify the layer's short name, which is used internally by AWS OpsWorks Stacks and by Chef. The short name is also used as the name for the directory where your app files are installed. It can have a maximum of 200 characters and must be in the following format: /\A[a-z0-9\-\_\.]+\Z/. The built-in layers' short names are defined by AWS OpsWorks Stacks. For more information, see the Layer Reference 
    */
  var Shortname: js.UndefOr[String] = js.undefined
  
  /**
    * Whether to use Amazon EBS-optimized instances.
    */
  var UseEbsOptimizedInstances: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A VolumeConfigurations object that describes the layer's Amazon EBS volumes.
    */
  var VolumeConfigurations: js.UndefOr[typings.awsSdk.opsworksMod.VolumeConfigurations] = js.undefined
}
object UpdateLayerRequest {
  
  inline def apply(LayerId: String): UpdateLayerRequest = {
    val __obj = js.Dynamic.literal(LayerId = LayerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateLayerRequest]
  }
  
  extension [Self <: UpdateLayerRequest](x: Self) {
    
    inline def setAttributes(value: LayerAttributes): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
    
    inline def setAutoAssignElasticIps(value: Boolean): Self = StObject.set(x, "AutoAssignElasticIps", value.asInstanceOf[js.Any])
    
    inline def setAutoAssignElasticIpsUndefined: Self = StObject.set(x, "AutoAssignElasticIps", js.undefined)
    
    inline def setAutoAssignPublicIps(value: Boolean): Self = StObject.set(x, "AutoAssignPublicIps", value.asInstanceOf[js.Any])
    
    inline def setAutoAssignPublicIpsUndefined: Self = StObject.set(x, "AutoAssignPublicIps", js.undefined)
    
    inline def setCloudWatchLogsConfiguration(value: CloudWatchLogsConfiguration): Self = StObject.set(x, "CloudWatchLogsConfiguration", value.asInstanceOf[js.Any])
    
    inline def setCloudWatchLogsConfigurationUndefined: Self = StObject.set(x, "CloudWatchLogsConfiguration", js.undefined)
    
    inline def setCustomInstanceProfileArn(value: String): Self = StObject.set(x, "CustomInstanceProfileArn", value.asInstanceOf[js.Any])
    
    inline def setCustomInstanceProfileArnUndefined: Self = StObject.set(x, "CustomInstanceProfileArn", js.undefined)
    
    inline def setCustomJson(value: String): Self = StObject.set(x, "CustomJson", value.asInstanceOf[js.Any])
    
    inline def setCustomJsonUndefined: Self = StObject.set(x, "CustomJson", js.undefined)
    
    inline def setCustomRecipes(value: Recipes): Self = StObject.set(x, "CustomRecipes", value.asInstanceOf[js.Any])
    
    inline def setCustomRecipesUndefined: Self = StObject.set(x, "CustomRecipes", js.undefined)
    
    inline def setCustomSecurityGroupIds(value: Strings): Self = StObject.set(x, "CustomSecurityGroupIds", value.asInstanceOf[js.Any])
    
    inline def setCustomSecurityGroupIdsUndefined: Self = StObject.set(x, "CustomSecurityGroupIds", js.undefined)
    
    inline def setCustomSecurityGroupIdsVarargs(value: String*): Self = StObject.set(x, "CustomSecurityGroupIds", js.Array(value :_*))
    
    inline def setEnableAutoHealing(value: Boolean): Self = StObject.set(x, "EnableAutoHealing", value.asInstanceOf[js.Any])
    
    inline def setEnableAutoHealingUndefined: Self = StObject.set(x, "EnableAutoHealing", js.undefined)
    
    inline def setInstallUpdatesOnBoot(value: Boolean): Self = StObject.set(x, "InstallUpdatesOnBoot", value.asInstanceOf[js.Any])
    
    inline def setInstallUpdatesOnBootUndefined: Self = StObject.set(x, "InstallUpdatesOnBoot", js.undefined)
    
    inline def setLayerId(value: String): Self = StObject.set(x, "LayerId", value.asInstanceOf[js.Any])
    
    inline def setLifecycleEventConfiguration(value: LifecycleEventConfiguration): Self = StObject.set(x, "LifecycleEventConfiguration", value.asInstanceOf[js.Any])
    
    inline def setLifecycleEventConfigurationUndefined: Self = StObject.set(x, "LifecycleEventConfiguration", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setPackages(value: Strings): Self = StObject.set(x, "Packages", value.asInstanceOf[js.Any])
    
    inline def setPackagesUndefined: Self = StObject.set(x, "Packages", js.undefined)
    
    inline def setPackagesVarargs(value: String*): Self = StObject.set(x, "Packages", js.Array(value :_*))
    
    inline def setShortname(value: String): Self = StObject.set(x, "Shortname", value.asInstanceOf[js.Any])
    
    inline def setShortnameUndefined: Self = StObject.set(x, "Shortname", js.undefined)
    
    inline def setUseEbsOptimizedInstances(value: Boolean): Self = StObject.set(x, "UseEbsOptimizedInstances", value.asInstanceOf[js.Any])
    
    inline def setUseEbsOptimizedInstancesUndefined: Self = StObject.set(x, "UseEbsOptimizedInstances", js.undefined)
    
    inline def setVolumeConfigurations(value: VolumeConfigurations): Self = StObject.set(x, "VolumeConfigurations", value.asInstanceOf[js.Any])
    
    inline def setVolumeConfigurationsUndefined: Self = StObject.set(x, "VolumeConfigurations", js.undefined)
    
    inline def setVolumeConfigurationsVarargs(value: VolumeConfiguration*): Self = StObject.set(x, "VolumeConfigurations", js.Array(value :_*))
  }
}
