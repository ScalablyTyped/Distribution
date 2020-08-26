package typings.awsSdk.mturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReviewReport extends js.Object {
  /**
    *  A list of ReviewAction objects for each action specified in the Review Policy. 
    */
  var ReviewActions: js.UndefOr[ReviewActionDetailList] = js.native
  /**
    *  A list of ReviewResults objects for each action specified in the Review Policy. 
    */
  var ReviewResults: js.UndefOr[ReviewResultDetailList] = js.native
}

object ReviewReport {
  @scala.inline
  def apply(): ReviewReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReviewReport]
  }
  @scala.inline
  implicit class ReviewReportOps[Self <: ReviewReport] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setReviewActionsVarargs(value: ReviewActionDetail*): Self = this.set("ReviewActions", js.Array(value :_*))
    @scala.inline
    def setReviewActions(value: ReviewActionDetailList): Self = this.set("ReviewActions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReviewActions: Self = this.set("ReviewActions", js.undefined)
    @scala.inline
    def setReviewResultsVarargs(value: ReviewResultDetail*): Self = this.set("ReviewResults", js.Array(value :_*))
    @scala.inline
    def setReviewResults(value: ReviewResultDetailList): Self = this.set("ReviewResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReviewResults: Self = this.set("ReviewResults", js.undefined)
  }
  
}

