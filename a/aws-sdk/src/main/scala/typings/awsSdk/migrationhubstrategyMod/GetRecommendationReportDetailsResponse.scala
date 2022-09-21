package typings.awsSdk.migrationhubstrategyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRecommendationReportDetailsResponse extends StObject {
  
  /**
    *  The ID of the recommendation report generation task. See the response of StartRecommendationReportGeneration. 
    */
  var id: js.UndefOr[RecommendationTaskId] = js.undefined
  
  /**
    *  Detailed information about the recommendation report. 
    */
  var recommendationReportDetails: js.UndefOr[RecommendationReportDetails] = js.undefined
}
object GetRecommendationReportDetailsResponse {
  
  inline def apply(): GetRecommendationReportDetailsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRecommendationReportDetailsResponse]
  }
  
  extension [Self <: GetRecommendationReportDetailsResponse](x: Self) {
    
    inline def setId(value: RecommendationTaskId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setRecommendationReportDetails(value: RecommendationReportDetails): Self = StObject.set(x, "recommendationReportDetails", value.asInstanceOf[js.Any])
    
    inline def setRecommendationReportDetailsUndefined: Self = StObject.set(x, "recommendationReportDetails", js.undefined)
  }
}
