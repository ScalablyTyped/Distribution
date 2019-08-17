package typings.atAwsDashSdkClientDashGlacierDashNode.typesUnderscoreVaultNotificationConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledVaultNotificationConfig extends _VaultNotificationConfig {
  /**
    * <p>A list of one or more events for which Amazon Glacier will send a notification to the specified Amazon SNS topic.</p>
    */
  @JSName("Events")
  var Events__UnmarshalledVaultNotificationConfig: js.UndefOr[js.Array[String]] = js.undefined
}

object _UnmarshalledVaultNotificationConfig {
  @scala.inline
  def apply(Events: js.Array[String] = null, SNSTopic: String = null): _UnmarshalledVaultNotificationConfig = {
    val __obj = js.Dynamic.literal()
    if (Events != null) __obj.updateDynamic("Events")(Events)
    if (SNSTopic != null) __obj.updateDynamic("SNSTopic")(SNSTopic)
    __obj.asInstanceOf[_UnmarshalledVaultNotificationConfig]
  }
}

