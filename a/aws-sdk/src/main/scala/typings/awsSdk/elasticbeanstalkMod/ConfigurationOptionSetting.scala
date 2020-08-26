package typings.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigurationOptionSetting extends js.Object {
  /**
    * A unique namespace that identifies the option's associated AWS resource.
    */
  var Namespace: js.UndefOr[OptionNamespace] = js.native
  /**
    * The name of the configuration option.
    */
  var OptionName: js.UndefOr[ConfigurationOptionName] = js.native
  /**
    * A unique resource name for the option setting. Use it for a time–based scaling configuration option.
    */
  var ResourceName: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.ResourceName] = js.native
  /**
    * The current value for the configuration option.
    */
  var Value: js.UndefOr[ConfigurationOptionValue] = js.native
}

object ConfigurationOptionSetting {
  @scala.inline
  def apply(): ConfigurationOptionSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigurationOptionSetting]
  }
  @scala.inline
  implicit class ConfigurationOptionSettingOps[Self <: ConfigurationOptionSetting] (val x: Self) extends AnyVal {
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
    def setNamespace(value: OptionNamespace): Self = this.set("Namespace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNamespace: Self = this.set("Namespace", js.undefined)
    @scala.inline
    def setOptionName(value: ConfigurationOptionName): Self = this.set("OptionName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptionName: Self = this.set("OptionName", js.undefined)
    @scala.inline
    def setResourceName(value: ResourceName): Self = this.set("ResourceName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceName: Self = this.set("ResourceName", js.undefined)
    @scala.inline
    def setValue(value: ConfigurationOptionValue): Self = this.set("Value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("Value", js.undefined)
  }
  
}

