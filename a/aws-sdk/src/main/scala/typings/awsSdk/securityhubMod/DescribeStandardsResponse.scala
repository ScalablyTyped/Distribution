package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeStandardsResponse extends js.Object {
  /**
    * The pagination token to use to request the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.securityhubMod.NextToken] = js.native
  /**
    * A list of available standards.
    */
  var Standards: js.UndefOr[typings.awsSdk.securityhubMod.Standards] = js.native
}

object DescribeStandardsResponse {
  @scala.inline
  def apply(NextToken: NextToken = null, Standards: Standards = null): DescribeStandardsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (Standards != null) __obj.updateDynamic("Standards")(Standards.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeStandardsResponse]
  }
}

