package typings.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateWebhookOutput extends js.Object {
  /**
    *  Information about a repository's webhook that is associated with a project in AWS CodeBuild. 
    */
  var webhook: js.UndefOr[Webhook] = js.native
}

object UpdateWebhookOutput {
  @scala.inline
  def apply(webhook: Webhook = null): UpdateWebhookOutput = {
    val __obj = js.Dynamic.literal()
    if (webhook != null) __obj.updateDynamic("webhook")(webhook.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateWebhookOutput]
  }
}

