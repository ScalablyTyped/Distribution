package typings.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateEnvironmentMessage extends js.Object {
  /**
    * The name of the application that is associated with this environment.
    */
  var ApplicationName: typings.awsSdk.elasticbeanstalkMod.ApplicationName = js.native
  /**
    * If specified, the environment attempts to use this value as the prefix for the CNAME in your Elastic Beanstalk environment URL. If not specified, the CNAME is generated automatically by appending a random alphanumeric string to the environment name.
    */
  var CNAMEPrefix: js.UndefOr[DNSCnamePrefix] = js.native
  /**
    * Your description for this environment.
    */
  var Description: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.Description] = js.native
  /**
    * A unique name for the environment. Constraint: Must be from 4 to 40 characters in length. The name can contain only letters, numbers, and hyphens. It can't start or end with a hyphen. This name must be unique within a region in your account. If the specified name already exists in the region, Elastic Beanstalk returns an InvalidParameterValue error.  If you don't specify the CNAMEPrefix parameter, the environment name becomes part of the CNAME, and therefore part of the visible URL for your application.
    */
  var EnvironmentName: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.EnvironmentName] = js.native
  /**
    * The name of the group to which the target environment belongs. Specify a group name only if the environment's name is specified in an environment manifest and not with the environment name parameter. See Environment Manifest (env.yaml) for details.
    */
  var GroupName: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.GroupName] = js.native
  /**
    * The Amazon Resource Name (ARN) of an existing IAM role to be used as the environment's operations role. If specified, Elastic Beanstalk uses the operations role for permissions to downstream services during this call and during subsequent calls acting on this environment. To specify an operations role, you must have the iam:PassRole permission for the role. For more information, see Operations roles in the AWS Elastic Beanstalk Developer Guide.
    */
  var OperationsRole: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.OperationsRole] = js.native
  /**
    * If specified, AWS Elastic Beanstalk sets the specified configuration options to the requested value in the configuration set for the new environment. These override the values obtained from the solution stack or the configuration template.
    */
  var OptionSettings: js.UndefOr[ConfigurationOptionSettingsList] = js.native
  /**
    * A list of custom user-defined configuration options to remove from the configuration set for this new environment.
    */
  var OptionsToRemove: js.UndefOr[OptionsSpecifierList] = js.native
  /**
    * The Amazon Resource Name (ARN) of the custom platform to use with the environment. For more information, see Custom Platforms in the AWS Elastic Beanstalk Developer Guide.  If you specify PlatformArn, don't specify SolutionStackName. 
    */
  var PlatformArn: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.PlatformArn] = js.native
  /**
    * The name of an Elastic Beanstalk solution stack (platform version) to use with the environment. If specified, Elastic Beanstalk sets the configuration values to the default values associated with the specified solution stack. For a list of current solution stacks, see Elastic Beanstalk Supported Platforms in the AWS Elastic Beanstalk Platforms guide.  If you specify SolutionStackName, don't specify PlatformArn or TemplateName. 
    */
  var SolutionStackName: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.SolutionStackName] = js.native
  /**
    * Specifies the tags applied to resources in the environment.
    */
  var Tags: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.Tags] = js.native
  /**
    * The name of the Elastic Beanstalk configuration template to use with the environment.  If you specify TemplateName, then don't specify SolutionStackName. 
    */
  var TemplateName: js.UndefOr[ConfigurationTemplateName] = js.native
  /**
    * Specifies the tier to use in creating this environment. The environment tier that you choose determines whether Elastic Beanstalk provisions resources to support a web application that handles HTTP(S) requests or a web application that handles background-processing tasks.
    */
  var Tier: js.UndefOr[EnvironmentTier] = js.native
  /**
    * The name of the application version to deploy. Default: If not specified, Elastic Beanstalk attempts to deploy the sample application.
    */
  var VersionLabel: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.VersionLabel] = js.native
}

object CreateEnvironmentMessage {
  @scala.inline
  def apply(ApplicationName: ApplicationName): CreateEnvironmentMessage = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateEnvironmentMessage]
  }
  @scala.inline
  implicit class CreateEnvironmentMessageOps[Self <: CreateEnvironmentMessage] (val x: Self) extends AnyVal {
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
    def setCNAMEPrefix(value: DNSCnamePrefix): Self = this.set("CNAMEPrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCNAMEPrefix: Self = this.set("CNAMEPrefix", js.undefined)
    @scala.inline
    def setDescription(value: Description): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setEnvironmentName(value: EnvironmentName): Self = this.set("EnvironmentName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnvironmentName: Self = this.set("EnvironmentName", js.undefined)
    @scala.inline
    def setGroupName(value: GroupName): Self = this.set("GroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupName: Self = this.set("GroupName", js.undefined)
    @scala.inline
    def setOperationsRole(value: OperationsRole): Self = this.set("OperationsRole", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperationsRole: Self = this.set("OperationsRole", js.undefined)
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
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: Tags): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
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

