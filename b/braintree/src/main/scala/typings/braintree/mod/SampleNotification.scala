package typings.braintree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SampleNotification extends js.Object {
  var bt_payload: String
  var bt_signature: String
}

object SampleNotification {
  @scala.inline
  def apply(bt_payload: String, bt_signature: String): SampleNotification = {
    val __obj = js.Dynamic.literal(bt_payload = bt_payload.asInstanceOf[js.Any], bt_signature = bt_signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[SampleNotification]
  }
}

