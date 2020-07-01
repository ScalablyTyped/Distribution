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
  def apply(
    ApplicationName: ApplicationName,
    CNAMEPrefix: DNSCnamePrefix = null,
    Description: Description = null,
    EnvironmentName: EnvironmentName = null,
    GroupName: GroupName = null,
    OperationsRole: OperationsRole = null,
    OptionSettings: ConfigurationOptionSettingsList = null,
    OptionsToRemove: OptionsSpecifierList = null,
    PlatformArn: PlatformArn = null,
    SolutionStackName: SolutionStackName = null,
    Tags: Tags = null,
    TemplateName: ConfigurationTemplateName = null,
    Tier: EnvironmentTier = null,
    VersionLabel: VersionLabel = null
  ): CreateEnvironmentMessage = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName.asInstanceOf[js.Any])
    if (CNAMEPrefix != null) __obj.updateDynamic("CNAMEPrefix")(CNAMEPrefix.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (EnvironmentName != null) __obj.updateDynamic("EnvironmentName")(EnvironmentName.asInstanceOf[js.Any])
    if (GroupName != null) __obj.updateDynamic("GroupName")(GroupName.asInstanceOf[js.Any])
    if (OperationsRole != null) __obj.updateDynamic("OperationsRole")(OperationsRole.asInstanceOf[js.Any])
    if (OptionSettings != null) __obj.updateDynamic("OptionSettings")(OptionSettings.asInstanceOf[js.Any])
    if (OptionsToRemove != null) __obj.updateDynamic("OptionsToRemove")(OptionsToRemove.asInstanceOf[js.Any])
    if (PlatformArn != null) __obj.updateDynamic("PlatformArn")(PlatformArn.asInstanceOf[js.Any])
    if (SolutionStackName != null) __obj.updateDynamic("SolutionStackName")(SolutionStackName.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    if (TemplateName != null) __obj.updateDynamic("TemplateName")(TemplateName.asInstanceOf[js.Any])
    if (Tier != null) __obj.updateDynamic("Tier")(Tier.asInstanceOf[js.Any])
    if (VersionLabel != null) __obj.updateDynamic("VersionLabel")(VersionLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateEnvironmentMessage]
  }
}

