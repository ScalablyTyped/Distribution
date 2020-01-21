package typings.awsSdk.iotsecuretunnelingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTunnelsResponse extends js.Object {
  /**
    * A token to used to retrieve the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * A short description of the tunnels in an AWS account.
    */
  var tunnelSummaries: js.UndefOr[TunnelSummaryList] = js.native
}

object ListTunnelsResponse {
  @scala.inline
  def apply(nextToken: NextToken = null, tunnelSummaries: TunnelSummaryList = null): ListTunnelsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (tunnelSummaries != null) __obj.updateDynamic("tunnelSummaries")(tunnelSummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTunnelsResponse]
  }
}

