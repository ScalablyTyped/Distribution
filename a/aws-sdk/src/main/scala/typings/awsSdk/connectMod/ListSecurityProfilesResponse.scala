package typings.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListSecurityProfilesResponse extends js.Object {
  /**
    * If there are additional results, this is the token for the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.connectMod.NextToken] = js.native
  /**
    * Information about the security profiles.
    */
  var SecurityProfileSummaryList: js.UndefOr[typings.awsSdk.connectMod.SecurityProfileSummaryList] = js.native
}

object ListSecurityProfilesResponse {
  @scala.inline
  def apply(NextToken: NextToken = null, SecurityProfileSummaryList: SecurityProfileSummaryList = null): ListSecurityProfilesResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (SecurityProfileSummaryList != null) __obj.updateDynamic("SecurityProfileSummaryList")(SecurityProfileSummaryList.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSecurityProfilesResponse]
  }
}

