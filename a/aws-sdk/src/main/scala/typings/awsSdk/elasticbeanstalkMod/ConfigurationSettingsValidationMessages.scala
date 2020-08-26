package typings.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigurationSettingsValidationMessages extends js.Object {
  /**
    *  A list of ValidationMessage. 
    */
  var Messages: js.UndefOr[ValidationMessagesList] = js.native
}

object ConfigurationSettingsValidationMessages {
  @scala.inline
  def apply(): ConfigurationSettingsValidationMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigurationSettingsValidationMessages]
  }
  @scala.inline
  implicit class ConfigurationSettingsValidationMessagesOps[Self <: ConfigurationSettingsValidationMessages] (val x: Self) extends AnyVal {
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
    def setMessagesVarargs(value: ValidationMessage*): Self = this.set("Messages", js.Array(value :_*))
    @scala.inline
    def setMessages(value: ValidationMessagesList): Self = this.set("Messages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessages: Self = this.set("Messages", js.undefined)
  }
  
}

