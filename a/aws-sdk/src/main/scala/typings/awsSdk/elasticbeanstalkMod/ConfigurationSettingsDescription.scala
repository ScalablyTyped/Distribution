package typings.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigurationSettingsDescription extends js.Object {
  /**
    * The name of the application associated with this configuration set.
    */
  var ApplicationName: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.ApplicationName] = js.native
  /**
    * The date (in UTC time) when this configuration set was created.
    */
  var DateCreated: js.UndefOr[CreationDate] = js.native
  /**
    * The date (in UTC time) when this configuration set was last modified.
    */
  var DateUpdated: js.UndefOr[UpdateDate] = js.native
  /**
    *  If this configuration set is associated with an environment, the DeploymentStatus parameter indicates the deployment status of this configuration set:     null: This configuration is not associated with a running environment.    pending: This is a draft configuration that is not deployed to the associated environment but is in the process of deploying.    deployed: This is the configuration that is currently deployed to the associated running environment.    failed: This is a draft configuration that failed to successfully deploy.  
    */
  var DeploymentStatus: js.UndefOr[ConfigurationDeploymentStatus] = js.native
  /**
    * Describes this configuration set.
    */
  var Description: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.Description] = js.native
  /**
    *  If not null, the name of the environment for this configuration set. 
    */
  var EnvironmentName: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.EnvironmentName] = js.native
  /**
    * A list of the configuration options and their values in this configuration set.
    */
  var OptionSettings: js.UndefOr[ConfigurationOptionSettingsList] = js.native
  /**
    * The ARN of the platform.
    */
  var PlatformArn: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.PlatformArn] = js.native
  /**
    * The name of the solution stack this configuration set uses.
    */
  var SolutionStackName: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.SolutionStackName] = js.native
  /**
    *  If not null, the name of the configuration template for this configuration set. 
    */
  var TemplateName: js.UndefOr[ConfigurationTemplateName] = js.native
}

object ConfigurationSettingsDescription {
  @scala.inline
  def apply(
    ApplicationName: ApplicationName = null,
    DateCreated: CreationDate = null,
    DateUpdated: UpdateDate = null,
    DeploymentStatus: ConfigurationDeploymentStatus = null,
    Description: Description = null,
    EnvironmentName: EnvironmentName = null,
    OptionSettings: ConfigurationOptionSettingsList = null,
    PlatformArn: PlatformArn = null,
    SolutionStackName: SolutionStackName = null,
    TemplateName: ConfigurationTemplateName = null
  ): ConfigurationSettingsDescription = {
    val __obj = js.Dynamic.literal()
    if (ApplicationName != null) __obj.updateDynamic("ApplicationName")(ApplicationName.asInstanceOf[js.Any])
    if (DateCreated != null) __obj.updateDynamic("DateCreated")(DateCreated.asInstanceOf[js.Any])
    if (DateUpdated != null) __obj.updateDynamic("DateUpdated")(DateUpdated.asInstanceOf[js.Any])
    if (DeploymentStatus != null) __obj.updateDynamic("DeploymentStatus")(DeploymentStatus.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (EnvironmentName != null) __obj.updateDynamic("EnvironmentName")(EnvironmentName.asInstanceOf[js.Any])
    if (OptionSettings != null) __obj.updateDynamic("OptionSettings")(OptionSettings.asInstanceOf[js.Any])
    if (PlatformArn != null) __obj.updateDynamic("PlatformArn")(PlatformArn.asInstanceOf[js.Any])
    if (SolutionStackName != null) __obj.updateDynamic("SolutionStackName")(SolutionStackName.asInstanceOf[js.Any])
    if (TemplateName != null) __obj.updateDynamic("TemplateName")(TemplateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigurationSettingsDescription]
  }
}

