package typings
package clearbladejsDashNodeLib.clearbladejsDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessagingSubscribeOptions extends js.Object {
  var qos: js.UndefOr[MessagingQOS] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
}

object MessagingSubscribeOptions {
  @scala.inline
  def apply(qos: MessagingQOS = null, timeout: scala.Int | scala.Double = null): MessagingSubscribeOptions = {
    val __obj = js.Dynamic.literal()
    if (qos != null) __obj.updateDynamic("qos")(qos)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessagingSubscribeOptions]
  }
}

