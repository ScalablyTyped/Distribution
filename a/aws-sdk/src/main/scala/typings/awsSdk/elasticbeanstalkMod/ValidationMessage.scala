package typings.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidationMessage extends js.Object {
  /**
    * A message describing the error or warning.
    */
  var Message: js.UndefOr[ValidationMessageString] = js.native
  /**
    * The namespace to which the option belongs.
    */
  var Namespace: js.UndefOr[OptionNamespace] = js.native
  /**
    * The name of the option.
    */
  var OptionName: js.UndefOr[ConfigurationOptionName] = js.native
  /**
    * An indication of the severity of this message:    error: This message indicates that this is not a valid setting for an option.    warning: This message is providing information you should take into account.  
    */
  var Severity: js.UndefOr[ValidationSeverity] = js.native
}

object ValidationMessage {
  @scala.inline
  def apply(): ValidationMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidationMessage]
  }
  @scala.inline
  implicit class ValidationMessageOps[Self <: ValidationMessage] (val x: Self) extends AnyVal {
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
    def setMessage(value: ValidationMessageString): Self = this.set("Message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("Message", js.undefined)
    @scala.inline
    def setNamespace(value: OptionNamespace): Self = this.set("Namespace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNamespace: Self = this.set("Namespace", js.undefined)
    @scala.inline
    def setOptionName(value: ConfigurationOptionName): Self = this.set("OptionName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptionName: Self = this.set("OptionName", js.undefined)
    @scala.inline
    def setSeverity(value: ValidationSeverity): Self = this.set("Severity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeverity: Self = this.set("Severity", js.undefined)
  }
  
}

