package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListGatewaysResponse extends js.Object {
  /**
    * A list that summarizes each gateway.
    */
  var gatewaySummaries: GatewaySummaries = js.native
  /**
    * The token for the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object ListGatewaysResponse {
  @scala.inline
  def apply(gatewaySummaries: GatewaySummaries, nextToken: NextToken = null): ListGatewaysResponse = {
    val __obj = js.Dynamic.literal(gatewaySummaries = gatewaySummaries.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListGatewaysResponse]
  }
}

