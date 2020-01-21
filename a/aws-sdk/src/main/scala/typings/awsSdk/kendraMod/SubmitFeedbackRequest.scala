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
  def apply(
    IndexId: IndexId,
    QueryId: QueryId,
    ClickFeedbackItems: ClickFeedbackList = null,
    RelevanceFeedbackItems: RelevanceFeedbackList = null
  ): SubmitFeedbackRequest = {
    val __obj = js.Dynamic.literal(IndexId = IndexId.asInstanceOf[js.Any], QueryId = QueryId.asInstanceOf[js.Any])
    if (ClickFeedbackItems != null) __obj.updateDynamic("ClickFeedbackItems")(ClickFeedbackItems.asInstanceOf[js.Any])
    if (RelevanceFeedbackItems != null) __obj.updateDynamic("RelevanceFeedbackItems")(RelevanceFeedbackItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubmitFeedbackRequest]
  }
}

