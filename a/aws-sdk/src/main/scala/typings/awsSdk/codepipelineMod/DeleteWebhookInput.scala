package typings.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteWebhookInput extends js.Object {
  /**
    * The name of the webhook you want to delete.
    */
  var name: WebhookName = js.native
}

object DeleteWebhookInput {
  @scala.inline
  def apply(name: WebhookName): DeleteWebhookInput = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteWebhookInput]
  }
}

