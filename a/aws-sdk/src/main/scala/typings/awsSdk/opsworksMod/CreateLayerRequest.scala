package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateLayerRequest extends js.Object {
  /**
    * One or more user-defined key-value pairs to be added to the stack attributes. To create a cluster layer, set the EcsClusterArn attribute to the cluster's ARN.
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
    * Specifies CloudWatch Logs configuration options for the layer. For more information, see CloudWatchLogsLogStream.
    */
  var CloudWatchLogsConfiguration: js.UndefOr[typings.awsSdk.opsworksMod.CloudWatchLogsConfiguration] = js.native
  /**
    * The ARN of an IAM profile to be used for the layer's EC2 instances. For more information about IAM ARNs, see Using Identifiers.
    */
  var CustomInstanceProfileArn: js.UndefOr[String] = js.native
  /**
    * A JSON-formatted string containing custom stack configuration and deployment attributes to be installed on the layer's instances. For more information, see  Using Custom JSON. This feature is supported as of version 1.7.42 of the AWS CLI. 
    */
  var CustomJson: js.UndefOr[String] = js.native
  /**
    * A LayerCustomRecipes object that specifies the layer custom recipes.
    */
  var CustomRecipes: js.UndefOr[Recipes] = js.native
  /**
    * An array containing the layer custom security group IDs.
    */
  var CustomSecurityGroupIds: js.UndefOr[Strings] = js.native
  /**
    * Whether to disable auto healing for the layer.
    */
  var EnableAutoHealing: js.UndefOr[Boolean] = js.native
  /**
    * Whether to install operating system and package updates when the instance boots. The default value is true. To control when updates are installed, set this value to false. You must then update your instances manually by using CreateDeployment to run the update_dependencies stack command or by manually running yum (Amazon Linux) or apt-get (Ubuntu) on the instances.   To ensure that your instances have the latest security updates, we strongly recommend using the default value of true. 
    */
  var InstallUpdatesOnBoot: js.UndefOr[Boolean] = js.native
  /**
    * A LifeCycleEventConfiguration object that you can use to configure the Shutdown event to specify an execution timeout and enable or disable Elastic Load Balancer connection draining.
    */
  var LifecycleEventConfiguration: js.UndefOr[typings.awsSdk.opsworksMod.LifecycleEventConfiguration] = js.native
  /**
    * The layer name, which is used by the console.
    */
  var Name: String = js.native
  /**
    * An array of Package objects that describes the layer packages.
    */
  var Packages: js.UndefOr[Strings] = js.native
  /**
    * For custom layers only, use this parameter to specify the layer's short name, which is used internally by AWS OpsWorks Stacks and by Chef recipes. The short name is also used as the name for the directory where your app files are installed. It can have a maximum of 200 characters, which are limited to the alphanumeric characters, '-', '_', and '.'. The built-in layers' short names are defined by AWS OpsWorks Stacks. For more information, see the Layer Reference.
    */
  var Shortname: String = js.native
  /**
    * The layer stack ID.
    */
  var StackId: String = js.native
  /**
    * The layer type. A stack cannot have more than one built-in layer of the same type. It can have any number of custom layers. Built-in layers are not available in Chef 12 stacks.
    */
  var Type: LayerType = js.native
  /**
    * Whether to use Amazon EBS-optimized instances.
    */
  var UseEbsOptimizedInstances: js.UndefOr[Boolean] = js.native
  /**
    * A VolumeConfigurations object that describes the layer's Amazon EBS volumes.
    */
  var VolumeConfigurations: js.UndefOr[typings.awsSdk.opsworksMod.VolumeConfigurations] = js.native
}

object CreateLayerRequest {
  @scala.inline
  def apply(
    Name: String,
    Shortname: String,
    StackId: String,
    Type: LayerType,
    Attributes: LayerAttributes = null,
    AutoAssignElasticIps: js.UndefOr[Boolean] = js.undefined,
    AutoAssignPublicIps: js.UndefOr[Boolean] = js.undefined,
    CloudWatchLogsConfiguration: CloudWatchLogsConfiguration = null,
    CustomInstanceProfileArn: String = null,
    CustomJson: String = null,
    CustomRecipes: Recipes = null,
    CustomSecurityGroupIds: Strings = null,
    EnableAutoHealing: js.UndefOr[Boolean] = js.undefined,
    InstallUpdatesOnBoot: js.UndefOr[Boolean] = js.undefined,
    LifecycleEventConfiguration: LifecycleEventConfiguration = null,
    Packages: Strings = null,
    UseEbsOptimizedInstances: js.UndefOr[Boolean] = js.undefined,
    VolumeConfigurations: VolumeConfigurations = null
  ): CreateLayerRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Shortname = Shortname.asInstanceOf[js.Any], StackId = StackId.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    if (Attributes != null) __obj.updateDynamic("Attributes")(Attributes.asInstanceOf[js.Any])
    if (!js.isUndefined(AutoAssignElasticIps)) __obj.updateDynamic("AutoAssignElasticIps")(AutoAssignElasticIps.get.asInstanceOf[js.Any])
    if (!js.isUndefined(AutoAssignPublicIps)) __obj.updateDynamic("AutoAssignPublicIps")(AutoAssignPublicIps.get.asInstanceOf[js.Any])
    if (CloudWatchLogsConfiguration != null) __obj.updateDynamic("CloudWatchLogsConfiguration")(CloudWatchLogsConfiguration.asInstanceOf[js.Any])
    if (CustomInstanceProfileArn != null) __obj.updateDynamic("CustomInstanceProfileArn")(CustomInstanceProfileArn.asInstanceOf[js.Any])
    if (CustomJson != null) __obj.updateDynamic("CustomJson")(CustomJson.asInstanceOf[js.Any])
    if (CustomRecipes != null) __obj.updateDynamic("CustomRecipes")(CustomRecipes.asInstanceOf[js.Any])
    if (CustomSecurityGroupIds != null) __obj.updateDynamic("CustomSecurityGroupIds")(CustomSecurityGroupIds.asInstanceOf[js.Any])
    if (!js.isUndefined(EnableAutoHealing)) __obj.updateDynamic("EnableAutoHealing")(EnableAutoHealing.get.asInstanceOf[js.Any])
    if (!js.isUndefined(InstallUpdatesOnBoot)) __obj.updateDynamic("InstallUpdatesOnBoot")(InstallUpdatesOnBoot.get.asInstanceOf[js.Any])
    if (LifecycleEventConfiguration != null) __obj.updateDynamic("LifecycleEventConfiguration")(LifecycleEventConfiguration.asInstanceOf[js.Any])
    if (Packages != null) __obj.updateDynamic("Packages")(Packages.asInstanceOf[js.Any])
    if (!js.isUndefined(UseEbsOptimizedInstances)) __obj.updateDynamic("UseEbsOptimizedInstances")(UseEbsOptimizedInstances.get.asInstanceOf[js.Any])
    if (VolumeConfigurations != null) __obj.updateDynamic("VolumeConfigurations")(VolumeConfigurations.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLayerRequest]
  }
}

