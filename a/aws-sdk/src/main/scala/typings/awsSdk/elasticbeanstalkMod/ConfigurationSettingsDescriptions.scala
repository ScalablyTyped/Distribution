package typings.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigurationSettingsDescriptions extends js.Object {
  /**
    *  A list of ConfigurationSettingsDescription. 
    */
  var ConfigurationSettings: js.UndefOr[ConfigurationSettingsDescriptionList] = js.native
}

object ConfigurationSettingsDescriptions {
  @scala.inline
  def apply(): ConfigurationSettingsDescriptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigurationSettingsDescriptions]
  }
  @scala.inline
  implicit class ConfigurationSettingsDescriptionsOps[Self <: ConfigurationSettingsDescriptions] (val x: Self) extends AnyVal {
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
    def setConfigurationSettingsVarargs(value: ConfigurationSettingsDescription*): Self = this.set("ConfigurationSettings", js.Array(value :_*))
    @scala.inline
    def setConfigurationSettings(value: ConfigurationSettingsDescriptionList): Self = this.set("ConfigurationSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfigurationSettings: Self = this.set("ConfigurationSettings", js.undefined)
  }
  
}

