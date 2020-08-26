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
  def apply(ApplicationName: ApplicationName, OptionSettings: ConfigurationOptionSettingsList): ValidateConfigurationSettingsMessage = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName.asInstanceOf[js.Any], OptionSettings = OptionSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidateConfigurationSettingsMessage]
  }
  @scala.inline
  implicit class ValidateConfigurationSettingsMessageOps[Self <: ValidateConfigurationSettingsMessage] (val x: Self) extends AnyVal {
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
    def setOptionSettingsVarargs(value: ConfigurationOptionSetting*): Self = this.set("OptionSettings", js.Array(value :_*))
    @scala.inline
    def setOptionSettings(value: ConfigurationOptionSettingsList): Self = this.set("OptionSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnvironmentName(value: EnvironmentName): Self = this.set("EnvironmentName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnvironmentName: Self = this.set("EnvironmentName", js.undefined)
    @scala.inline
    def setTemplateName(value: ConfigurationTemplateName): Self = this.set("TemplateName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplateName: Self = this.set("TemplateName", js.undefined)
  }
  
}

