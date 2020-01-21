package typings.awsSdkClientGlacierNode.typesVaultNotificationConfigMod

import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VaultNotificationConfig extends js.Object {
  /**
    * <p>A list of one or more events for which Amazon Glacier will send a notification to the specified Amazon SNS topic.</p>
    */
  var Events: js.UndefOr[js.Array[String] | Iterable[String]] = js.undefined
  /**
    * <p>The Amazon Simple Notification Service (Amazon SNS) topic Amazon Resource Name (ARN).</p>
    */
  var SNSTopic: js.UndefOr[String] = js.undefined
}

object VaultNotificationConfig {
  @scala.inline
  def apply(Events: js.Array[String] | Iterable[String] = null, SNSTopic: String = null): VaultNotificationConfig = {
    val __obj = js.Dynamic.literal()
    if (Events != null) __obj.updateDynamic("Events")(Events.asInstanceOf[js.Any])
    if (SNSTopic != null) __obj.updateDynamic("SNSTopic")(SNSTopic.asInstanceOf[js.Any])
    __obj.asInstanceOf[VaultNotificationConfig]
  }
}

