package typings.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RelevanceFeedback extends js.Object {
  /**
    * Whether to document was relevant or not relevant to the search.
    */
  var RelevanceValue: RelevanceType = js.native
  /**
    * The unique identifier of the search result that the user provided relevance feedback for.
    */
  var ResultId: typings.awsSdk.kendraMod.ResultId = js.native
}

object RelevanceFeedback {
  @scala.inline
  def apply(RelevanceValue: RelevanceType, ResultId: ResultId): RelevanceFeedback = {
    val __obj = js.Dynamic.literal(RelevanceValue = RelevanceValue.asInstanceOf[js.Any], ResultId = ResultId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelevanceFeedback]
  }
  @scala.inline
  implicit class RelevanceFeedbackOps[Self <: RelevanceFeedback] (val x: Self) extends AnyVal {
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
    def setRelevanceValue(value: RelevanceType): Self = this.set("RelevanceValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setResultId(value: ResultId): Self = this.set("ResultId", value.asInstanceOf[js.Any])
  }
  
}

