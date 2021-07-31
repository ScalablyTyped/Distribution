package typings.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RelevanceFeedback extends StObject {
  
  /**
    * Whether to document was relevant or not relevant to the search.
    */
  var RelevanceValue: RelevanceType
  
  /**
    * The unique identifier of the search result that the user provided relevance feedback for.
    */
  var ResultId: typings.awsSdk.kendraMod.ResultId
}
object RelevanceFeedback {
  
  @scala.inline
  def apply(RelevanceValue: RelevanceType, ResultId: ResultId): RelevanceFeedback = {
    val __obj = js.Dynamic.literal(RelevanceValue = RelevanceValue.asInstanceOf[js.Any], ResultId = ResultId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelevanceFeedback]
  }
  
  @scala.inline
  implicit class RelevanceFeedbackMutableBuilder[Self <: RelevanceFeedback] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRelevanceValue(value: RelevanceType): Self = StObject.set(x, "RelevanceValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultId(value: ResultId): Self = StObject.set(x, "ResultId", value.asInstanceOf[js.Any])
  }
}
