package typings.awsSdk.eventbridgeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPartnerEventSourcesRequest extends js.Object {
  /**
    * pecifying this limits the number of results returned by this operation. The operation also returns a NextToken which you can use in a subsequent operation to retrieve the next set of results.
    */
  var Limit: js.UndefOr[LimitMax100] = js.native
  /**
    * If you specify this, the results are limited to only those partner event sources that start with the string you specify.
    */
  var NamePrefix: PartnerEventSourceNamePrefix = js.native
  /**
    * The token returned by a previous call to this operation. Specifying this retrieves the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.eventbridgeMod.NextToken] = js.native
}

object ListPartnerEventSourcesRequest {
  @scala.inline
  def apply(
    NamePrefix: PartnerEventSourceNamePrefix,
    Limit: js.UndefOr[LimitMax100] = js.undefined,
    NextToken: NextToken = null
  ): ListPartnerEventSourcesRequest = {
    val __obj = js.Dynamic.literal(NamePrefix = NamePrefix.asInstanceOf[js.Any])
    if (!js.isUndefined(Limit)) __obj.updateDynamic("Limit")(Limit.get.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPartnerEventSourcesRequest]
  }
}

