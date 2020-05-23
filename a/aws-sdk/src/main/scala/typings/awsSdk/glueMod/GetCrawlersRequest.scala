package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCrawlersRequest extends js.Object {
  /**
    * The number of crawlers to return on each call.
    */
  var MaxResults: js.UndefOr[PageSize] = js.native
  /**
    * A continuation token, if this is a continuation request.
    */
  var NextToken: js.UndefOr[Token] = js.native
}

object GetCrawlersRequest {
  @scala.inline
  def apply(MaxResults: js.UndefOr[PageSize] = js.undefined, NextToken: Token = null): GetCrawlersRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults.get.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCrawlersRequest]
  }
}

