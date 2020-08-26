package typings.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateEnvironmentMessage extends js.Object {
  /**
    * The name of the application with which the environment is associated.
    */
  var ApplicationName: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.ApplicationName] = js.native
  /**
    * If this parameter is specified, AWS Elastic Beanstalk updates the description of this environment.
    */
  var Description: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.Description] = js.native
  /**
    * The ID of the environment to update. If no environment with this ID exists, AWS Elastic Beanstalk returns an InvalidParameterValue error. Condition: You must specify either this or an EnvironmentName, or both. If you do not specify either, AWS Elastic Beanstalk returns MissingRequiredParameter error. 
    */
  var EnvironmentId: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.EnvironmentId] = js.native
  /**
    * The name of the environment to update. If no environment with this name exists, AWS Elastic Beanstalk returns an InvalidParameterValue error.  Condition: You must specify either this or an EnvironmentId, or both. If you do not specify either, AWS Elastic Beanstalk returns MissingRequiredParameter error. 
    */
  var EnvironmentName: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.EnvironmentName] = js.native
  /**
    * The name of the group to which the target environment belongs. Specify a group name only if the environment's name is specified in an environment manifest and not with the environment name or environment ID parameters. See Environment Manifest (env.yaml) for details.
    */
  var GroupName: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.GroupName] = js.native
  /**
    * If specified, AWS Elastic Beanstalk updates the configuration set associated with the running environment and sets the specified configuration options to the requested value.
    */
  var OptionSettings: js.UndefOr[ConfigurationOptionSettingsList] = js.native
  /**
    * A list of custom user-defined configuration options to remove from the configuration set for this environment.
    */
  var OptionsToRemove: js.UndefOr[OptionsSpecifierList] = js.native
  /**
    * The ARN of the platform, if used.
    */
  var PlatformArn: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.PlatformArn] = js.native
  /**
    * This specifies the platform version that the environment will run after the environment is updated.
    */
  var SolutionStackName: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.SolutionStackName] = js.native
  /**
    * If this parameter is specified, AWS Elastic Beanstalk deploys this configuration template to the environment. If no such configuration template is found, AWS Elastic Beanstalk returns an InvalidParameterValue error. 
    */
  var TemplateName: js.UndefOr[ConfigurationTemplateName] = js.native
  /**
    * This specifies the tier to use to update the environment. Condition: At this time, if you change the tier version, name, or type, AWS Elastic Beanstalk returns InvalidParameterValue error. 
    */
  var Tier: js.UndefOr[EnvironmentTier] = js.native
  /**
    * If this parameter is specified, AWS Elastic Beanstalk deploys the named application version to the environment. If no such application version is found, returns an InvalidParameterValue error. 
    */
  var VersionLabel: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.VersionLabel] = js.native
}

object UpdateEnvironmentMessage {
  @scala.inline
  def apply(): UpdateEnvironmentMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateEnvironmentMessage]
  }
  @scala.inline
  implicit class UpdateEnvironmentMessageOps[Self <: UpdateEnvironmentMessage] (val x: Self) extends AnyVal {
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
    def setApplicationName(value: ApplicationName): Self = this.set("ApplicationName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplicationName: Self = this.set("ApplicationName", js.undefined)
    @scala.inline
    def setDescription(value: Description): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setEnvironmentId(value: EnvironmentId): Self = this.set("EnvironmentId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnvironmentId: Self = this.set("EnvironmentId", js.undefined)
    @scala.inline
    def setEnvironmentName(value: EnvironmentName): Self = this.set("EnvironmentName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnvironmentName: Self = this.set("EnvironmentName", js.undefined)
    @scala.inline
    def setGroupName(value: GroupName): Self = this.set("GroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupName: Self = this.set("GroupName", js.undefined)
    @scala.inline
    def setOptionSettingsVarargs(value: ConfigurationOptionSetting*): Self = this.set("OptionSettings", js.Array(value :_*))
    @scala.inline
    def setOptionSettings(value: ConfigurationOptionSettingsList): Self = this.set("OptionSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptionSettings: Self = this.set("OptionSettings", js.undefined)
    @scala.inline
    def setOptionsToRemoveVarargs(value: OptionSpecification*): Self = this.set("OptionsToRemove", js.Array(value :_*))
    @scala.inline
    def setOptionsToRemove(value: OptionsSpecifierList): Self = this.set("OptionsToRemove", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptionsToRemove: Self = this.set("OptionsToRemove", js.undefined)
    @scala.inline
    def setPlatformArn(value: PlatformArn): Self = this.set("PlatformArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlatformArn: Self = this.set("PlatformArn", js.undefined)
    @scala.inline
    def setSolutionStackName(value: SolutionStackName): Self = this.set("SolutionStackName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSolutionStackName: Self = this.set("SolutionStackName", js.undefined)
    @scala.inline
    def setTemplateName(value: ConfigurationTemplateName): Self = this.set("TemplateName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplateName: Self = this.set("TemplateName", js.undefined)
    @scala.inline
    def setTier(value: EnvironmentTier): Self = this.set("Tier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTier: Self = this.set("Tier", js.undefined)
    @scala.inline
    def setVersionLabel(value: VersionLabel): Self = this.set("VersionLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersionLabel: Self = this.set("VersionLabel", js.undefined)
  }
  
}

