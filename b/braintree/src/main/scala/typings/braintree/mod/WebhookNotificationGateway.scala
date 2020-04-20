package typings.braintree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebhookNotificationGateway extends js.Object {
  def parse(signature: String, payload: String): js.Promise[WebhookNotification]
}

object WebhookNotificationGateway {
  @scala.inline
  def apply(parse: (String, String) => js.Promise[WebhookNotification]): WebhookNotificationGateway = {
    val __obj = js.Dynamic.literal(parse = js.Any.fromFunction2(parse))
    __obj.asInstanceOf[WebhookNotificationGateway]
  }
}

