package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteInsightRequest extends js.Object {
  /**
    * The ARN of the insight to delete.
    */
  var InsightArn: NonEmptyString = js.native
}

object DeleteInsightRequest {
  @scala.inline
  def apply(InsightArn: NonEmptyString): DeleteInsightRequest = {
    val __obj = js.Dynamic.literal(InsightArn = InsightArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteInsightRequest]
  }
  @scala.inline
  implicit class DeleteInsightRequestOps[Self <: DeleteInsightRequest] (val x: Self) extends AnyVal {
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
    def setInsightArn(value: NonEmptyString): Self = this.set("InsightArn", value.asInstanceOf[js.Any])
  }
  
}

