package typings.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutWebhookInput extends js.Object {
  /**
    * The tags for the webhook.
    */
  var tags: js.UndefOr[TagList] = js.native
  /**
    * The detail provided in an input file to create the webhook, such as the webhook name, the pipeline name, and the action name. Give the webhook a unique name that helps you identify it. You might name the webhook after the pipeline and action it targets so that you can easily recognize what it's used for later.
    */
  var webhook: WebhookDefinition = js.native
}

object PutWebhookInput {
  @scala.inline
  def apply(webhook: WebhookDefinition, tags: TagList = null): PutWebhookInput = {
    val __obj = js.Dynamic.literal(webhook = webhook.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutWebhookInput]
  }
}

