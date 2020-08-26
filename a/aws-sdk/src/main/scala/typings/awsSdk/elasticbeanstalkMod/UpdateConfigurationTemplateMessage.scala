package typings.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateConfigurationTemplateMessage extends js.Object {
  /**
    * The name of the application associated with the configuration template to update.  If no application is found with this name, UpdateConfigurationTemplate returns an InvalidParameterValue error. 
    */
  var ApplicationName: typings.awsSdk.elasticbeanstalkMod.ApplicationName = js.native
  /**
    * A new description for the configuration.
    */
  var Description: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.Description] = js.native
  /**
    * A list of configuration option settings to update with the new specified option value.
    */
  var OptionSettings: js.UndefOr[ConfigurationOptionSettingsList] = js.native
  /**
    * A list of configuration options to remove from the configuration set.  Constraint: You can remove only UserDefined configuration options. 
    */
  var OptionsToRemove: js.UndefOr[OptionsSpecifierList] = js.native
  /**
    * The name of the configuration template to update.  If no configuration template is found with this name, UpdateConfigurationTemplate returns an InvalidParameterValue error. 
    */
  var TemplateName: ConfigurationTemplateName = js.native
}

object UpdateConfigurationTemplateMessage {
  @scala.inline
  def apply(ApplicationName: ApplicationName, TemplateName: ConfigurationTemplateName): UpdateConfigurationTemplateMessage = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName.asInstanceOf[js.Any], TemplateName = TemplateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateConfigurationTemplateMessage]
  }
  @scala.inline
  implicit class UpdateConfigurationTemplateMessageOps[Self <: UpdateConfigurationTemplateMessage] (val x: Self) extends AnyVal {
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
    def setTemplateName(value: ConfigurationTemplateName): Self = this.set("TemplateName", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: Description): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
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
  }
  
}

