package typings.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegisterWebhookWithThirdPartyInput extends js.Object {
  /**
    * The name of an existing webhook created with PutWebhook to register with a supported third party. 
    */
  var webhookName: js.UndefOr[WebhookName] = js.native
}

object RegisterWebhookWithThirdPartyInput {
  @scala.inline
  def apply(webhookName: WebhookName = null): RegisterWebhookWithThirdPartyInput = {
    val __obj = js.Dynamic.literal()
    if (webhookName != null) __obj.updateDynamic("webhookName")(webhookName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterWebhookWithThirdPartyInput]
  }
}

