package typings.awsSdk.mturkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReviewReport extends StObject {
  
  /**
    *  A list of ReviewAction objects for each action specified in the Review Policy. 
    */
  var ReviewActions: js.UndefOr[ReviewActionDetailList] = js.undefined
  
  /**
    *  A list of ReviewResults objects for each action specified in the Review Policy. 
    */
  var ReviewResults: js.UndefOr[ReviewResultDetailList] = js.undefined
}
object ReviewReport {
  
  @scala.inline
  def apply(): ReviewReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReviewReport]
  }
  
  @scala.inline
  implicit class ReviewReportMutableBuilder[Self <: ReviewReport] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReviewActions(value: ReviewActionDetailList): Self = StObject.set(x, "ReviewActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReviewActionsUndefined: Self = StObject.set(x, "ReviewActions", js.undefined)
    
    @scala.inline
    def setReviewActionsVarargs(value: ReviewActionDetail*): Self = StObject.set(x, "ReviewActions", js.Array(value :_*))
    
    @scala.inline
    def setReviewResults(value: ReviewResultDetailList): Self = StObject.set(x, "ReviewResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReviewResultsUndefined: Self = StObject.set(x, "ReviewResults", js.undefined)
    
    @scala.inline
    def setReviewResultsVarargs(value: ReviewResultDetail*): Self = StObject.set(x, "ReviewResults", js.Array(value :_*))
  }
}
