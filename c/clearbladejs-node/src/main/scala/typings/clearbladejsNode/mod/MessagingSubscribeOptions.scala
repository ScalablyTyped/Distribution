package typings.clearbladejsNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessagingSubscribeOptions extends js.Object {
  var qos: js.UndefOr[MessagingQOS] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object MessagingSubscribeOptions {
  @scala.inline
  def apply(qos: MessagingQOS = null, timeout: js.UndefOr[Double] = js.undefined): MessagingSubscribeOptions = {
    val __obj = js.Dynamic.literal()
    if (qos != null) __obj.updateDynamic("qos")(qos.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessagingSubscribeOptions]
  }
}

