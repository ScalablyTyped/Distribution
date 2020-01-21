package typings.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListWebhooksOutput extends js.Object {
  /**
    * If the amount of returned information is significantly large, an identifier is also returned and can be used in a subsequent ListWebhooks call to return the next set of webhooks in the list. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.codepipelineMod.NextToken] = js.native
  /**
    * The JSON detail returned for each webhook in the list output for the ListWebhooks call.
    */
  var webhooks: js.UndefOr[WebhookList] = js.native
}

object ListWebhooksOutput {
  @scala.inline
  def apply(NextToken: NextToken = null, webhooks: WebhookList = null): ListWebhooksOutput = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (webhooks != null) __obj.updateDynamic("webhooks")(webhooks.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListWebhooksOutput]
  }
}

