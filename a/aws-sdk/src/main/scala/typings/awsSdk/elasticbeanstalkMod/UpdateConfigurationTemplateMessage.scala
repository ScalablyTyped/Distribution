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
  def apply(
    ApplicationName: ApplicationName,
    TemplateName: ConfigurationTemplateName,
    Description: Description = null,
    OptionSettings: ConfigurationOptionSettingsList = null,
    OptionsToRemove: OptionsSpecifierList = null
  ): UpdateConfigurationTemplateMessage = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName.asInstanceOf[js.Any], TemplateName = TemplateName.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (OptionSettings != null) __obj.updateDynamic("OptionSettings")(OptionSettings.asInstanceOf[js.Any])
    if (OptionsToRemove != null) __obj.updateDynamic("OptionsToRemove")(OptionsToRemove.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateConfigurationTemplateMessage]
  }
}

