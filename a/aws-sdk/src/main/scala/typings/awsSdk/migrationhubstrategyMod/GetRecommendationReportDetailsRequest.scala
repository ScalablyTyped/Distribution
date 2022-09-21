package typings.awsSdk.migrationhubstrategyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRecommendationReportDetailsRequest extends StObject {
  
  /**
    *  The recommendation report generation task id returned by StartRecommendationReportGeneration. 
    */
  var id: RecommendationTaskId
}
object GetRecommendationReportDetailsRequest {
  
  inline def apply(id: RecommendationTaskId): GetRecommendationReportDetailsRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRecommendationReportDetailsRequest]
  }
  
  extension [Self <: GetRecommendationReportDetailsRequest](x: Self) {
    
    inline def setId(value: RecommendationTaskId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
