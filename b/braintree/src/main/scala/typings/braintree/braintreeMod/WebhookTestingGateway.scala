package typings.braintree.braintreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebhookTestingGateway extends js.Object {
  def sampleNotification(kind: WebhookNotificationKind, id: String): js.Promise[SampleNotification]
}

object WebhookTestingGateway {
  @scala.inline
  def apply(sampleNotification: (WebhookNotificationKind, String) => js.Promise[SampleNotification]): WebhookTestingGateway = {
    val __obj = js.Dynamic.literal(sampleNotification = js.Any.fromFunction2(sampleNotification))
  
    __obj.asInstanceOf[WebhookTestingGateway]
  }
}

