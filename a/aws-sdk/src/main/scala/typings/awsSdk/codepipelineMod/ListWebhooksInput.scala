package typings.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListWebhooksInput extends js.Object {
  /**
    * The maximum number of results to return in a single call. To retrieve the remaining results, make another call with the returned nextToken value.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.codepipelineMod.MaxResults] = js.native
  /**
    * The token that was returned from the previous ListWebhooks call, which can be used to return the next set of webhooks in the list.
    */
  var NextToken: js.UndefOr[typings.awsSdk.codepipelineMod.NextToken] = js.native
}

object ListWebhooksInput {
  @scala.inline
  def apply(MaxResults: Int | Double = null, NextToken: NextToken = null): ListWebhooksInput = {
    val __obj = js.Dynamic.literal()
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListWebhooksInput]
  }
}

