package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPortalsResponse extends js.Object {
  /**
    * The token for the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * A list that summarizes each portal.
    */
  var portalSummaries: js.UndefOr[PortalSummaries] = js.native
}

object ListPortalsResponse {
  @scala.inline
  def apply(nextToken: NextToken = null, portalSummaries: PortalSummaries = null): ListPortalsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (portalSummaries != null) __obj.updateDynamic("portalSummaries")(portalSummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPortalsResponse]
  }
}

