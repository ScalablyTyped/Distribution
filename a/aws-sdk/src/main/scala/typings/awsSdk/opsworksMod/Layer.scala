package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    Arn: String = null,
    Attributes: LayerAttributes = null,
    AutoAssignElasticIps: js.UndefOr[scala.Boolean] = js.undefined,
    AutoAssignPublicIps: js.UndefOr[scala.Boolean] = js.undefined,
    CloudWatchLogsConfiguration: CloudWatchLogsConfiguration = null,
    CreatedAt: DateTime = null,
    CustomInstanceProfileArn: String = null,
    CustomJson: String = null,
    CustomRecipes: Recipes = null,
    CustomSecurityGroupIds: Strings = null,
    DefaultRecipes: Recipes = null,
    DefaultSecurityGroupNames: Strings = null,
    EnableAutoHealing: js.UndefOr[scala.Boolean] = js.undefined,
    InstallUpdatesOnBoot: js.UndefOr[scala.Boolean] = js.undefined,
    LayerId: String = null,
    LifecycleEventConfiguration: LifecycleEventConfiguration = null,
    Name: String = null,
    Packages: Strings = null,
    Shortname: String = null,
    StackId: String = null,
    Type: LayerType = null,
    UseEbsOptimizedInstances: js.UndefOr[scala.Boolean] = js.undefined,
    VolumeConfigurations: VolumeConfigurations = null
  ): Layer = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    if (Attributes != null) __obj.updateDynamic("Attributes")(Attributes.asInstanceOf[js.Any])
    if (!js.isUndefined(AutoAssignElasticIps)) __obj.updateDynamic("AutoAssignElasticIps")(AutoAssignElasticIps.asInstanceOf[js.Any])
    if (!js.isUndefined(AutoAssignPublicIps)) __obj.updateDynamic("AutoAssignPublicIps")(AutoAssignPublicIps.asInstanceOf[js.Any])
    if (CloudWatchLogsConfiguration != null) __obj.updateDynamic("CloudWatchLogsConfiguration")(CloudWatchLogsConfiguration.asInstanceOf[js.Any])
    if (CreatedAt != null) __obj.updateDynamic("CreatedAt")(CreatedAt.asInstanceOf[js.Any])
    if (CustomInstanceProfileArn != null) __obj.updateDynamic("CustomInstanceProfileArn")(CustomInstanceProfileArn.asInstanceOf[js.Any])
    if (CustomJson != null) __obj.updateDynamic("CustomJson")(CustomJson.asInstanceOf[js.Any])
    if (CustomRecipes != null) __obj.updateDynamic("CustomRecipes")(CustomRecipes.asInstanceOf[js.Any])
    if (CustomSecurityGroupIds != null) __obj.updateDynamic("CustomSecurityGroupIds")(CustomSecurityGroupIds.asInstanceOf[js.Any])
    if (DefaultRecipes != null) __obj.updateDynamic("DefaultRecipes")(DefaultRecipes.asInstanceOf[js.Any])
    if (DefaultSecurityGroupNames != null) __obj.updateDynamic("DefaultSecurityGroupNames")(DefaultSecurityGroupNames.asInstanceOf[js.Any])
    if (!js.isUndefined(EnableAutoHealing)) __obj.updateDynamic("EnableAutoHealing")(EnableAutoHealing.asInstanceOf[js.Any])
    if (!js.isUndefined(InstallUpdatesOnBoot)) __obj.updateDynamic("InstallUpdatesOnBoot")(InstallUpdatesOnBoot.asInstanceOf[js.Any])
    if (LayerId != null) __obj.updateDynamic("LayerId")(LayerId.asInstanceOf[js.Any])
    if (LifecycleEventConfiguration != null) __obj.updateDynamic("LifecycleEventConfiguration")(LifecycleEventConfiguration.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (Packages != null) __obj.updateDynamic("Packages")(Packages.asInstanceOf[js.Any])
    if (Shortname != null) __obj.updateDynamic("Shortname")(Shortname.asInstanceOf[js.Any])
    if (StackId != null) __obj.updateDynamic("StackId")(StackId.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    if (!js.isUndefined(UseEbsOptimizedInstances)) __obj.updateDynamic("UseEbsOptimizedInstances")(UseEbsOptimizedInstances.asInstanceOf[js.Any])
    if (VolumeConfigurations != null) __obj.updateDynamic("VolumeConfigurations")(VolumeConfigurations.asInstanceOf[js.Any])
    __obj.asInstanceOf[Layer]
  }
}

