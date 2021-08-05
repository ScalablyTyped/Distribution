package typings.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubmitFeedbackRequest extends StObject {
  
  /**
    * Tells Amazon Kendra that a particular search result link was chosen by the user. 
    */
  var ClickFeedbackItems: js.UndefOr[ClickFeedbackList] = js.undefined
  
  /**
    * The identifier of the index that was queried.
    */
  var IndexId: typings.awsSdk.kendraMod.IndexId
  
  /**
    * The identifier of the specific query for which you are submitting feedback. The query ID is returned in the response to the operation.
    */
  var QueryId: typings.awsSdk.kendraMod.QueryId
  
  /**
    * Provides Amazon Kendra with relevant or not relevant feedback for whether a particular item was relevant to the search.
    */
  var RelevanceFeedbackItems: js.UndefOr[RelevanceFeedbackList] = js.undefined
}
object SubmitFeedbackRequest {
  
  inline def apply(IndexId: IndexId, QueryId: QueryId): SubmitFeedbackRequest = {
    val __obj = js.Dynamic.literal(IndexId = IndexId.asInstanceOf[js.Any], QueryId = QueryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubmitFeedbackRequest]
  }
  
  extension [Self <: SubmitFeedbackRequest](x: Self) {
    
    inline def setClickFeedbackItems(value: ClickFeedbackList): Self = StObject.set(x, "ClickFeedbackItems", value.asInstanceOf[js.Any])
    
    inline def setClickFeedbackItemsUndefined: Self = StObject.set(x, "ClickFeedbackItems", js.undefined)
    
    inline def setClickFeedbackItemsVarargs(value: ClickFeedback*): Self = StObject.set(x, "ClickFeedbackItems", js.Array(value :_*))
    
    inline def setIndexId(value: IndexId): Self = StObject.set(x, "IndexId", value.asInstanceOf[js.Any])
    
    inline def setQueryId(value: QueryId): Self = StObject.set(x, "QueryId", value.asInstanceOf[js.Any])
    
    inline def setRelevanceFeedbackItems(value: RelevanceFeedbackList): Self = StObject.set(x, "RelevanceFeedbackItems", value.asInstanceOf[js.Any])
    
    inline def setRelevanceFeedbackItemsUndefined: Self = StObject.set(x, "RelevanceFeedbackItems", js.undefined)
    
    inline def setRelevanceFeedbackItemsVarargs(value: RelevanceFeedback*): Self = StObject.set(x, "RelevanceFeedbackItems", js.Array(value :_*))
  }
}
