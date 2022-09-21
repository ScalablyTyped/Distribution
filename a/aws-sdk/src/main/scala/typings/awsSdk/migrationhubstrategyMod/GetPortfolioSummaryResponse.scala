package typings.awsSdk.migrationhubstrategyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPortfolioSummaryResponse extends StObject {
  
  /**
    *  An assessment summary for the portfolio including the number of servers to rehost and the overall number of anti-patterns. 
    */
  var assessmentSummary: js.UndefOr[AssessmentSummary] = js.undefined
}
object GetPortfolioSummaryResponse {
  
  inline def apply(): GetPortfolioSummaryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPortfolioSummaryResponse]
  }
  
  extension [Self <: GetPortfolioSummaryResponse](x: Self) {
    
    inline def setAssessmentSummary(value: AssessmentSummary): Self = StObject.set(x, "assessmentSummary", value.asInstanceOf[js.Any])
    
    inline def setAssessmentSummaryUndefined: Self = StObject.set(x, "assessmentSummary", js.undefined)
  }
}
