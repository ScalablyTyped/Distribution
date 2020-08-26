package typings.awsSdk.pinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutConfigurationSetSendingOptionsRequest extends js.Object {
  /**
    * The name of the configuration set that you want to enable or disable email sending for.
    */
  var ConfigurationSetName: typings.awsSdk.pinpointemailMod.ConfigurationSetName = js.native
  /**
    * If true, email sending is enabled for the configuration set. If false, email sending is disabled for the configuration set.
    */
  var SendingEnabled: js.UndefOr[Enabled] = js.native
}

object PutConfigurationSetSendingOptionsRequest {
  @scala.inline
  def apply(ConfigurationSetName: ConfigurationSetName): PutConfigurationSetSendingOptionsRequest = {
    val __obj = js.Dynamic.literal(ConfigurationSetName = ConfigurationSetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutConfigurationSetSendingOptionsRequest]
  }
  @scala.inline
  implicit class PutConfigurationSetSendingOptionsRequestOps[Self <: PutConfigurationSetSendingOptionsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setConfigurationSetName(value: ConfigurationSetName): Self = this.set("ConfigurationSetName", value.asInstanceOf[js.Any])
    @scala.inline
    def setSendingEnabled(value: Enabled): Self = this.set("SendingEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSendingEnabled: Self = this.set("SendingEnabled", js.undefined)
  }
  
}

