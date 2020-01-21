package typings.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeregisterWebhookWithThirdPartyInput extends js.Object {
  /**
    * The name of the webhook you want to deregister.
    */
  var webhookName: js.UndefOr[WebhookName] = js.native
}

object DeregisterWebhookWithThirdPartyInput {
  @scala.inline
  def apply(webhookName: WebhookName = null): DeregisterWebhookWithThirdPartyInput = {
    val __obj = js.Dynamic.literal()
    if (webhookName != null) __obj.updateDynamic("webhookName")(webhookName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeregisterWebhookWithThirdPartyInput]
  }
}

