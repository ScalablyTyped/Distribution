package typings.awsSdk.eventbridgeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPartnerEventSourceAccountsRequest extends js.Object {
  /**
    * The name of the partner event source to display account information about.
    */
  var EventSourceName: typings.awsSdk.eventbridgeMod.EventSourceName = js.native
  /**
    * Specifying this limits the number of results returned by this operation. The operation also returns a NextToken which you can use in a subsequent operation to retrieve the next set of results.
    */
  var Limit: js.UndefOr[LimitMax100] = js.native
  /**
    * The token returned by a previous call to this operation. Specifying this retrieves the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.eventbridgeMod.NextToken] = js.native
}

object ListPartnerEventSourceAccountsRequest {
  @scala.inline
  def apply(EventSourceName: EventSourceName, Limit: Int | Double = null, NextToken: NextToken = null): ListPartnerEventSourceAccountsRequest = {
    val __obj = js.Dynamic.literal(EventSourceName = EventSourceName.asInstanceOf[js.Any])
    if (Limit != null) __obj.updateDynamic("Limit")(Limit.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPartnerEventSourceAccountsRequest]
  }
}

