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
  def apply(): DeregisterWebhookWithThirdPartyInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeregisterWebhookWithThirdPartyInput]
  }
  @scala.inline
  implicit class DeregisterWebhookWithThirdPartyInputOps[Self <: DeregisterWebhookWithThirdPartyInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setWebhookName(value: WebhookName): Self = this.set("webhookName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebhookName: Self = this.set("webhookName", js.undefined)
  }
  
}

