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
  def apply(ConfigurationSetName: ConfigurationSetName, SendingEnabled: js.UndefOr[Boolean] = js.undefined): PutConfigurationSetSendingOptionsRequest = {
    val __obj = js.Dynamic.literal(ConfigurationSetName = ConfigurationSetName.asInstanceOf[js.Any])
    if (!js.isUndefined(SendingEnabled)) __obj.updateDynamic("SendingEnabled")(SendingEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutConfigurationSetSendingOptionsRequest]
  }
}

