package typings.awsSdk.codegurureviewerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListRecommendationsRequest extends js.Object {
  /**
    *  The Amazon Resource Name (ARN) of the code review to describe. 
    */
  var CodeReviewArn: Arn = js.native
  /**
    *  The maximum number of results that are returned per call. The default is 100. 
    */
  var MaxResults: js.UndefOr[typings.awsSdk.codegurureviewerMod.MaxResults] = js.native
  /**
    *  Pagination token. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.codegurureviewerMod.NextToken] = js.native
}

object ListRecommendationsRequest {
  @scala.inline
  def apply(CodeReviewArn: Arn, MaxResults: js.UndefOr[MaxResults] = js.undefined, NextToken: NextToken = null): ListRecommendationsRequest = {
    val __obj = js.Dynamic.literal(CodeReviewArn = CodeReviewArn.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults.get.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListRecommendationsRequest]
  }
}

