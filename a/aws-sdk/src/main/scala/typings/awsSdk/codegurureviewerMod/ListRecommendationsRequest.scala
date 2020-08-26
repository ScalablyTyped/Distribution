package typings.awsSdk.codegurureviewerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListRecommendationsRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the  CodeReview  object. 
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
  def apply(CodeReviewArn: Arn): ListRecommendationsRequest = {
    val __obj = js.Dynamic.literal(CodeReviewArn = CodeReviewArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListRecommendationsRequest]
  }
  @scala.inline
  implicit class ListRecommendationsRequestOps[Self <: ListRecommendationsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCodeReviewArn(value: Arn): Self = this.set("CodeReviewArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxResults(value: MaxResults): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

