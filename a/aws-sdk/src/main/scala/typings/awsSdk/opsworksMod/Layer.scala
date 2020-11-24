package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Layer extends js.Object {
  
  /**
    * The Amazon Resource Number (ARN) of a layer.
    */
  var Arn: js.UndefOr[String] = js.native
  
  /**
    * The layer attributes. For the HaproxyStatsPassword, MysqlRootPassword, and GangliaPassword attributes, AWS OpsWorks Stacks returns *****FILTERED***** instead of the actual value For an ECS Cluster layer, AWS OpsWorks Stacks the EcsClusterArn attribute is set to the cluster's ARN.
    */
  var Attributes: js.UndefOr[LayerAttributes] = js.native
  
  /**
    * Whether to automatically assign an Elastic IP address to the layer's instances. For more information, see How to Edit a Layer.
    */
  var AutoAssignElasticIps: js.UndefOr[Boolean] = js.native
  
  /**
    * For stacks that are running in a VPC, whether to automatically assign a public IP address to the layer's instances. For more information, see How to Edit a Layer.
    */
  var AutoAssignPublicIps: js.UndefOr[Boolean] = js.native
  
  /**
    * The Amazon CloudWatch Logs configuration settings for the layer.
    */
  var CloudWatchLogsConfiguration: js.UndefOr[typings.awsSdk.opsworksMod.CloudWatchLogsConfiguration] = js.native
  
  /**
    * Date when the layer was created.
    */
  var CreatedAt: js.UndefOr[DateTime] = js.native
  
  /**
    * The ARN of the default IAM profile to be used for the layer's EC2 instances. For more information about IAM ARNs, see Using Identifiers.
    */
  var CustomInstanceProfileArn: js.UndefOr[String] = js.native
  
  /**
    * A JSON formatted string containing the layer's custom stack configuration and deployment attributes.
    */
  var CustomJson: js.UndefOr[String] = js.native
  
  /**
    * A LayerCustomRecipes object that specifies the layer's custom recipes.
    */
  var CustomRecipes: js.UndefOr[Recipes] = js.native
  
  /**
    * An array containing the layer's custom security group IDs.
    */
  var CustomSecurityGroupIds: js.UndefOr[Strings] = js.native
  
  /**
    * AWS OpsWorks Stacks supports five lifecycle events: setup, configuration, deploy, undeploy, and shutdown. For each layer, AWS OpsWorks Stacks runs a set of standard recipes for each event. You can also provide custom recipes for any or all layers and events. AWS OpsWorks Stacks runs custom event recipes after the standard recipes. LayerCustomRecipes specifies the custom recipes for a particular layer to be run in response to each of the five events. To specify a recipe, use the cookbook's directory name in the repository followed by two colons and the recipe name, which is the recipe's file name without the .rb extension. For example: phpapp2::dbsetup specifies the dbsetup.rb recipe in the repository's phpapp2 folder.
    */
  var DefaultRecipes: js.UndefOr[Recipes] = js.native
  
  /**
    * An array containing the layer's security group names.
    */
  var DefaultSecurityGroupNames: js.UndefOr[Strings] = js.native
  
  /**
    * Whether auto healing is disabled for the layer.
    */
  var EnableAutoHealing: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether to install operating system and package updates when the instance boots. The default value is true. If this value is set to false, you must then update your instances manually by using CreateDeployment to run the update_dependencies stack command or manually running yum (Amazon Linux) or apt-get (Ubuntu) on the instances.   We strongly recommend using the default value of true, to ensure that your instances have the latest security updates. 
    */
  var InstallUpdatesOnBoot: js.UndefOr[Boolean] = js.native
  
  /**
    * The layer ID.
    */
  var LayerId: js.UndefOr[String] = js.native
  
  /**
    * A LifeCycleEventConfiguration object that specifies the Shutdown event configuration.
    */
  var LifecycleEventConfiguration: js.UndefOr[typings.awsSdk.opsworksMod.LifecycleEventConfiguration] = js.native
  
  /**
    * The layer name.
    */
  var Name: js.UndefOr[String] = js.native
  
  /**
    * An array of Package objects that describe the layer's packages.
    */
  var Packages: js.UndefOr[Strings] = js.native
  
  /**
    * The layer short name.
    */
  var Shortname: js.UndefOr[String] = js.native
  
  /**
    * The layer stack ID.
    */
  var StackId: js.UndefOr[String] = js.native
  
  /**
    * The layer type.
    */
  var Type: js.UndefOr[LayerType] = js.native
  
  /**
    * Whether the layer uses Amazon EBS-optimized instances.
    */
  var UseEbsOptimizedInstances: js.UndefOr[Boolean] = js.native
  
  /**
    * A VolumeConfigurations object that describes the layer's Amazon EBS volumes.
    */
  var VolumeConfigurations: js.UndefOr[typings.awsSdk.opsworksMod.VolumeConfigurations] = js.native
}
object Layer {
  
  @scala.inline
  def apply(): Layer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Layer]
  }
  
  @scala.inline
  implicit class LayerOps[Self <: Layer] (val x: Self) extends AnyVal {
    
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
    def setArn(value: String): Self = this.set("Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("Arn", js.undefined)
    
    @scala.inline
    def setAttributes(value: LayerAttributes): Self = this.set("Attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributes: Self = this.set("Attributes", js.undefined)
    
    @scala.inline
    def setAutoAssignElasticIps(value: Boolean): Self = this.set("AutoAssignElasticIps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoAssignElasticIps: Self = this.set("AutoAssignElasticIps", js.undefined)
    
    @scala.inline
    def setAutoAssignPublicIps(value: Boolean): Self = this.set("AutoAssignPublicIps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoAssignPublicIps: Self = this.set("AutoAssignPublicIps", js.undefined)
    
    @scala.inline
    def setCloudWatchLogsConfiguration(value: CloudWatchLogsConfiguration): Self = this.set("CloudWatchLogsConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloudWatchLogsConfiguration: Self = this.set("CloudWatchLogsConfiguration", js.undefined)
    
    @scala.inline
    def setCreatedAt(value: DateTime): Self = this.set("CreatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedAt: Self = this.set("CreatedAt", js.undefined)
    
    @scala.inline
    def setCustomInstanceProfileArn(value: String): Self = this.set("CustomInstanceProfileArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomInstanceProfileArn: Self = this.set("CustomInstanceProfileArn", js.undefined)
    
    @scala.inline
    def setCustomJson(value: String): Self = this.set("CustomJson", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomJson: Self = this.set("CustomJson", js.undefined)
    
    @scala.inline
    def setCustomRecipes(value: Recipes): Self = this.set("CustomRecipes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomRecipes: Self = this.set("CustomRecipes", js.undefined)
    
    @scala.inline
    def setCustomSecurityGroupIdsVarargs(value: String*): Self = this.set("CustomSecurityGroupIds", js.Array(value :_*))
    
    @scala.inline
    def setCustomSecurityGroupIds(value: Strings): Self = this.set("CustomSecurityGroupIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomSecurityGroupIds: Self = this.set("CustomSecurityGroupIds", js.undefined)
    
    @scala.inline
    def setDefaultRecipes(value: Recipes): Self = this.set("DefaultRecipes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultRecipes: Self = this.set("DefaultRecipes", js.undefined)
    
    @scala.inline
    def setDefaultSecurityGroupNamesVarargs(value: String*): Self = this.set("DefaultSecurityGroupNames", js.Array(value :_*))
    
    @scala.inline
    def setDefaultSecurityGroupNames(value: Strings): Self = this.set("DefaultSecurityGroupNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultSecurityGroupNames: Self = this.set("DefaultSecurityGroupNames", js.undefined)
    
    @scala.inline
    def setEnableAutoHealing(value: Boolean): Self = this.set("EnableAutoHealing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableAutoHealing: Self = this.set("EnableAutoHealing", js.undefined)
    
    @scala.inline
    def setInstallUpdatesOnBoot(value: Boolean): Self = this.set("InstallUpdatesOnBoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstallUpdatesOnBoot: Self = this.set("InstallUpdatesOnBoot", js.undefined)
    
    @scala.inline
    def setLayerId(value: String): Self = this.set("LayerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayerId: Self = this.set("LayerId", js.undefined)
    
    @scala.inline
    def setLifecycleEventConfiguration(value: LifecycleEventConfiguration): Self = this.set("LifecycleEventConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLifecycleEventConfiguration: Self = this.set("LifecycleEventConfiguration", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setPackagesVarargs(value: String*): Self = this.set("Packages", js.Array(value :_*))
    
    @scala.inline
    def setPackages(value: Strings): Self = this.set("Packages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePackages: Self = this.set("Packages", js.undefined)
    
    @scala.inline
    def setShortname(value: String): Self = this.set("Shortname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShortname: Self = this.set("Shortname", js.undefined)
    
    @scala.inline
    def setStackId(value: String): Self = this.set("StackId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStackId: Self = this.set("StackId", js.undefined)
    
    @scala.inline
    def setType(value: LayerType): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
    
    @scala.inline
    def setUseEbsOptimizedInstances(value: Boolean): Self = this.set("UseEbsOptimizedInstances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseEbsOptimizedInstances: Self = this.set("UseEbsOptimizedInstances", js.undefined)
    
    @scala.inline
    def setVolumeConfigurationsVarargs(value: VolumeConfiguration*): Self = this.set("VolumeConfigurations", js.Array(value :_*))
    
    @scala.inline
    def setVolumeConfigurations(value: VolumeConfigurations): Self = this.set("VolumeConfigurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVolumeConfigurations: Self = this.set("VolumeConfigurations", js.undefined)
  }
}
