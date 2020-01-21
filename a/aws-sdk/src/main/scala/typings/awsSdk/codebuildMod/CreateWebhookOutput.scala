package typings.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateWebhookOutput extends js.Object {
  /**
    * Information about a webhook that connects repository events to a build project in AWS CodeBuild.
    */
  var webhook: js.UndefOr[Webhook] = js.native
}

object CreateWebhookOutput {
  @scala.inline
  def apply(webhook: Webhook = null): CreateWebhookOutput = {
    val __obj = js.Dynamic.literal()
    if (webhook != null) __obj.updateDynamic("webhook")(webhook.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateWebhookOutput]
  }
}

