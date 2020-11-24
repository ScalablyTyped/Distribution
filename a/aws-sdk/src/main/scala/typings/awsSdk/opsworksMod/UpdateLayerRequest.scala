package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateLayerRequest extends js.Object {
  
  /**
    * One or more user-defined key/value pairs to be added to the stack attributes.
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
    * The ARN of an IAM profile to be used for all of the layer's EC2 instances. For more information about IAM ARNs, see Using Identifiers.
    */
  var CustomInstanceProfileArn: js.UndefOr[String] = js.native
  
  /**
    * A JSON-formatted string containing custom stack configuration and deployment attributes to be installed on the layer's instances. For more information, see  Using Custom JSON. 
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
    * Whether to disable auto healing for the layer.
    */
  var EnableAutoHealing: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether to install operating system and package updates when the instance boots. The default value is true. To control when updates are installed, set this value to false. You must then update your instances manually by using CreateDeployment to run the update_dependencies stack command or manually running yum (Amazon Linux) or apt-get (Ubuntu) on the instances.   We strongly recommend using the default value of true, to ensure that your instances have the latest security updates. 
    */
  var InstallUpdatesOnBoot: js.UndefOr[Boolean] = js.native
  
  /**
    * The layer ID.
    */
  var LayerId: String = js.native
  
  /**
    * 
    */
  var LifecycleEventConfiguration: js.UndefOr[typings.awsSdk.opsworksMod.LifecycleEventConfiguration] = js.native
  
  /**
    * The layer name, which is used by the console.
    */
  var Name: js.UndefOr[String] = js.native
  
  /**
    * An array of Package objects that describe the layer's packages.
    */
  var Packages: js.UndefOr[Strings] = js.native
  
  /**
    * For custom layers only, use this parameter to specify the layer's short name, which is used internally by AWS OpsWorks Stacks and by Chef. The short name is also used as the name for the directory where your app files are installed. It can have a maximum of 200 characters and must be in the following format: /\A[a-z0-9\-\_\.]+\Z/. The built-in layers' short names are defined by AWS OpsWorks Stacks. For more information, see the Layer Reference 
    */
  var Shortname: js.UndefOr[String] = js.native
  
  /**
    * Whether to use Amazon EBS-optimized instances.
    */
  var UseEbsOptimizedInstances: js.UndefOr[Boolean] = js.native
  
  /**
    * A VolumeConfigurations object that describes the layer's Amazon EBS volumes.
    */
  var VolumeConfigurations: js.UndefOr[typings.awsSdk.opsworksMod.VolumeConfigurations] = js.native
}
object UpdateLayerRequest {
  
  @scala.inline
  def apply(LayerId: String): UpdateLayerRequest = {
    val __obj = js.Dynamic.literal(LayerId = LayerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateLayerRequest]
  }
  
  @scala.inline
  implicit class UpdateLayerRequestOps[Self <: UpdateLayerRequest] (val x: Self) extends AnyVal {
    
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
    def setLayerId(value: String): Self = this.set("LayerId", value.asInstanceOf[js.Any])
    
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
    def setEnableAutoHealing(value: Boolean): Self = this.set("EnableAutoHealing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableAutoHealing: Self = this.set("EnableAutoHealing", js.undefined)
    
    @scala.inline
    def setInstallUpdatesOnBoot(value: Boolean): Self = this.set("InstallUpdatesOnBoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstallUpdatesOnBoot: Self = this.set("InstallUpdatesOnBoot", js.undefined)
    
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
