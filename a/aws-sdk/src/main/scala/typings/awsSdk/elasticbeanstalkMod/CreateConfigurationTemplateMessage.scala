package typings.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateConfigurationTemplateMessage extends js.Object {
  /**
    * The name of the Elastic Beanstalk application to associate with this configuration template.
    */
  var ApplicationName: typings.awsSdk.elasticbeanstalkMod.ApplicationName = js.native
  /**
    * An optional description for this configuration.
    */
  var Description: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.Description] = js.native
  /**
    * The ID of an environment whose settings you want to use to create the configuration template. You must specify EnvironmentId if you don't specify PlatformArn, SolutionStackName, or SourceConfiguration.
    */
  var EnvironmentId: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.EnvironmentId] = js.native
  /**
    * Option values for the Elastic Beanstalk configuration, such as the instance type. If specified, these values override the values obtained from the solution stack or the source configuration template. For a complete list of Elastic Beanstalk configuration options, see Option Values in the AWS Elastic Beanstalk Developer Guide.
    */
  var OptionSettings: js.UndefOr[ConfigurationOptionSettingsList] = js.native
  /**
    * The Amazon Resource Name (ARN) of the custom platform. For more information, see  Custom Platforms in the AWS Elastic Beanstalk Developer Guide.  If you specify PlatformArn, then don't specify SolutionStackName. 
    */
  var PlatformArn: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.PlatformArn] = js.native
  /**
    * The name of an Elastic Beanstalk solution stack (platform version) that this configuration uses. For example, 64bit Amazon Linux 2013.09 running Tomcat 7 Java 7. A solution stack specifies the operating system, runtime, and application server for a configuration template. It also determines the set of configuration options as well as the possible and default values. For more information, see Supported Platforms in the AWS Elastic Beanstalk Developer Guide. You must specify SolutionStackName if you don't specify PlatformArn, EnvironmentId, or SourceConfiguration. Use the  ListAvailableSolutionStacks  API to obtain a list of available solution stacks.
    */
  var SolutionStackName: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.SolutionStackName] = js.native
  /**
    * An Elastic Beanstalk configuration template to base this one on. If specified, Elastic Beanstalk uses the configuration values from the specified configuration template to create a new configuration. Values specified in OptionSettings override any values obtained from the SourceConfiguration. You must specify SourceConfiguration if you don't specify PlatformArn, EnvironmentId, or SolutionStackName. Constraint: If both solution stack name and source configuration are specified, the solution stack of the source configuration template must match the specified solution stack name.
    */
  var SourceConfiguration: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.SourceConfiguration] = js.native
  /**
    * Specifies the tags applied to the configuration template.
    */
  var Tags: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.Tags] = js.native
  /**
    * The name of the configuration template. Constraint: This name must be unique per application.
    */
  var TemplateName: ConfigurationTemplateName = js.native
}

object CreateConfigurationTemplateMessage {
  @scala.inline
  def apply(
    ApplicationName: ApplicationName,
    TemplateName: ConfigurationTemplateName,
    Description: Description = null,
    EnvironmentId: EnvironmentId = null,
    OptionSettings: ConfigurationOptionSettingsList = null,
    PlatformArn: PlatformArn = null,
    SolutionStackName: SolutionStackName = null,
    SourceConfiguration: SourceConfiguration = null,
    Tags: Tags = null
  ): CreateConfigurationTemplateMessage = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName.asInstanceOf[js.Any], TemplateName = TemplateName.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (EnvironmentId != null) __obj.updateDynamic("EnvironmentId")(EnvironmentId.asInstanceOf[js.Any])
    if (OptionSettings != null) __obj.updateDynamic("OptionSettings")(OptionSettings.asInstanceOf[js.Any])
    if (PlatformArn != null) __obj.updateDynamic("PlatformArn")(PlatformArn.asInstanceOf[js.Any])
    if (SolutionStackName != null) __obj.updateDynamic("SolutionStackName")(SolutionStackName.asInstanceOf[js.Any])
    if (SourceConfiguration != null) __obj.updateDynamic("SourceConfiguration")(SourceConfiguration.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateConfigurationTemplateMessage]
  }
}

