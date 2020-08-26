package typings.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubmitFeedbackRequest extends js.Object {
  /**
    * Tells Amazon Kendra that a particular search result link was chosen by the user. 
    */
  var ClickFeedbackItems: js.UndefOr[ClickFeedbackList] = js.native
  /**
    * The identifier of the index that was queried.
    */
  var IndexId: typings.awsSdk.kendraMod.IndexId = js.native
  /**
    * The identifier of the specific query for which you are submitting feedback. The query ID is returned in the response to the operation.
    */
  var QueryId: typings.awsSdk.kendraMod.QueryId = js.native
  /**
    * Provides Amazon Kendra with relevant or not relevant feedback for whether a particular item was relevant to the search.
    */
  var RelevanceFeedbackItems: js.UndefOr[RelevanceFeedbackList] = js.native
}

object SubmitFeedbackRequest {
  @scala.inline
  def apply(IndexId: IndexId, QueryId: QueryId): SubmitFeedbackRequest = {
    val __obj = js.Dynamic.literal(IndexId = IndexId.asInstanceOf[js.Any], QueryId = QueryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubmitFeedbackRequest]
  }
  @scala.inline
  implicit class SubmitFeedbackRequestOps[Self <: SubmitFeedbackRequest] (val x: Self) extends AnyVal {
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
    def setIndexId(value: IndexId): Self = this.set("IndexId", value.asInstanceOf[js.Any])
    @scala.inline
    def setQueryId(value: QueryId): Self = this.set("QueryId", value.asInstanceOf[js.Any])
    @scala.inline
    def setClickFeedbackItemsVarargs(value: ClickFeedback*): Self = this.set("ClickFeedbackItems", js.Array(value :_*))
    @scala.inline
    def setClickFeedbackItems(value: ClickFeedbackList): Self = this.set("ClickFeedbackItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClickFeedbackItems: Self = this.set("ClickFeedbackItems", js.undefined)
    @scala.inline
    def setRelevanceFeedbackItemsVarargs(value: RelevanceFeedback*): Self = this.set("RelevanceFeedbackItems", js.Array(value :_*))
    @scala.inline
    def setRelevanceFeedbackItems(value: RelevanceFeedbackList): Self = this.set("RelevanceFeedbackItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelevanceFeedbackItems: Self = this.set("RelevanceFeedbackItems", js.undefined)
  }
  
}

