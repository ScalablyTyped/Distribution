package typings.awsSdkClientGlacierNode.typesVaultNotificationConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledVaultNotificationConfig extends VaultNotificationConfig {
  /**
    * <p>A list of one or more events for which Amazon Glacier will send a notification to the specified Amazon SNS topic.</p>
    */
  @JSName("Events")
  var Events_UnmarshalledVaultNotificationConfig: js.UndefOr[js.Array[String]] = js.undefined
}

object UnmarshalledVaultNotificationConfig {
  @scala.inline
  def apply(Events: js.Array[String] = null, SNSTopic: String = null): UnmarshalledVaultNotificationConfig = {
    val __obj = js.Dynamic.literal()
    if (Events != null) __obj.updateDynamic("Events")(Events.asInstanceOf[js.Any])
    if (SNSTopic != null) __obj.updateDynamic("SNSTopic")(SNSTopic.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledVaultNotificationConfig]
  }
}

