package typings.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPlatformVersionsResult extends js.Object {
  /**
    * In a paginated request, if this value isn't null, it's the token that you can pass in a subsequent request to get the next response page.
    */
  var NextToken: js.UndefOr[Token] = js.native
  /**
    * Summary information about the platform versions.
    */
  var PlatformSummaryList: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.PlatformSummaryList] = js.native
}

object ListPlatformVersionsResult {
  @scala.inline
  def apply(NextToken: Token = null, PlatformSummaryList: PlatformSummaryList = null): ListPlatformVersionsResult = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (PlatformSummaryList != null) __obj.updateDynamic("PlatformSummaryList")(PlatformSummaryList.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPlatformVersionsResult]
  }
}

