package typings.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPlatformBranchesResult extends js.Object {
  /**
    * In a paginated request, if this value isn't null, it's the token that you can pass in a subsequent request to get the next response page.
    */
  var NextToken: js.UndefOr[Token] = js.native
  /**
    * Summary information about the platform branches.
    */
  var PlatformBranchSummaryList: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.PlatformBranchSummaryList] = js.native
}

object ListPlatformBranchesResult {
  @scala.inline
  def apply(NextToken: Token = null, PlatformBranchSummaryList: PlatformBranchSummaryList = null): ListPlatformBranchesResult = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (PlatformBranchSummaryList != null) __obj.updateDynamic("PlatformBranchSummaryList")(PlatformBranchSummaryList.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPlatformBranchesResult]
  }
}

