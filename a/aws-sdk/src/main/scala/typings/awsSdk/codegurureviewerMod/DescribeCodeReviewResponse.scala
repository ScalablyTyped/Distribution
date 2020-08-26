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
  def apply(): DescribeCodeReviewResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeCodeReviewResponse]
  }
  @scala.inline
  implicit class DescribeCodeReviewResponseOps[Self <: DescribeCodeReviewResponse] (val x: Self) extends AnyVal {
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
    def setCodeReview(value: CodeReview): Self = this.set("CodeReview", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCodeReview: Self = this.set("CodeReview", js.undefined)
  }
  
}

