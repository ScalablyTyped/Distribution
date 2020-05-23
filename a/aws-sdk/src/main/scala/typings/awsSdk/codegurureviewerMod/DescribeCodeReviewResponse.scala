package typings.awsSdk.codegurureviewerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeCodeReviewResponse extends js.Object {
  /**
    *  Information about the code review. 
    */
  var CodeReview: js.UndefOr[typings.awsSdk.codegurureviewerMod.CodeReview] = js.native
}

object DescribeCodeReviewResponse {
  @scala.inline
  def apply(CodeReview: CodeReview = null): DescribeCodeReviewResponse = {
    val __obj = js.Dynamic.literal()
    if (CodeReview != null) __obj.updateDynamic("CodeReview")(CodeReview.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeCodeReviewResponse]
  }
}

