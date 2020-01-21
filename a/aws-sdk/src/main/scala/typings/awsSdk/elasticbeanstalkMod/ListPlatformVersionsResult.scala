package typings.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPlatformVersionsResult extends js.Object {
  /**
    * The starting index into the remaining list of platforms. if this value is not null, you can use it in a subsequent ListPlatformVersion call. 
    */
  var NextToken: js.UndefOr[Token] = js.native
  /**
    * Detailed information about the platforms.
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

