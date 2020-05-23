package typings.awsSdk.codegurureviewerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListCodeReviewsResponse extends js.Object {
  /**
    *  A list of code reviews that meet the criteria of the request. 
    */
  var CodeReviewSummaries: js.UndefOr[typings.awsSdk.codegurureviewerMod.CodeReviewSummaries] = js.native
  /**
    *  Pagination token. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.codegurureviewerMod.NextToken] = js.native
}

object ListCodeReviewsResponse {
  @scala.inline
  def apply(CodeReviewSummaries: CodeReviewSummaries = null, NextToken: NextToken = null): ListCodeReviewsResponse = {
    val __obj = js.Dynamic.literal()
    if (CodeReviewSummaries != null) __obj.updateDynamic("CodeReviewSummaries")(CodeReviewSummaries.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListCodeReviewsResponse]
  }
}

