package typings.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidateConfigurationSettingsMessage extends js.Object {
  /**
    * The name of the application that the configuration template or environment belongs to.
    */
  var ApplicationName: typings.awsSdk.elasticbeanstalkMod.ApplicationName = js.native
  /**
    * The name of the environment to validate the settings against. Condition: You cannot specify both this and a configuration template name.
    */
  var EnvironmentName: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.EnvironmentName] = js.native
  /**
    * A list of the options and desired values to evaluate.
    */
  var OptionSettings: ConfigurationOptionSettingsList = js.native
  /**
    * The name of the configuration template to validate the settings against. Condition: You cannot specify both this and an environment name.
    */
  var TemplateName: js.UndefOr[ConfigurationTemplateName] = js.native
}

object ValidateConfigurationSettingsMessage {
  @scala.inline
  def apply(
    ApplicationName: ApplicationName,
    OptionSettings: ConfigurationOptionSettingsList,
    EnvironmentName: EnvironmentName = null,
    TemplateName: ConfigurationTemplateName = null
  ): ValidateConfigurationSettingsMessage = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName.asInstanceOf[js.Any], OptionSettings = OptionSettings.asInstanceOf[js.Any])
    if (EnvironmentName != null) __obj.updateDynamic("EnvironmentName")(EnvironmentName.asInstanceOf[js.Any])
    if (TemplateName != null) __obj.updateDynamic("TemplateName")(TemplateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidateConfigurationSettingsMessage]
  }
}

