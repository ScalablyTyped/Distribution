package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateInferenceRecommendationsJobResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the recommendation job.
    */
  var JobArn: RecommendationJobArn
}
object CreateInferenceRecommendationsJobResponse {
  
  inline def apply(JobArn: RecommendationJobArn): CreateInferenceRecommendationsJobResponse = {
    val __obj = js.Dynamic.literal(JobArn = JobArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateInferenceRecommendationsJobResponse]
  }
  
  extension [Self <: CreateInferenceRecommendationsJobResponse](x: Self) {
    
    inline def setJobArn(value: RecommendationJobArn): Self = StObject.set(x, "JobArn", value.asInstanceOf[js.Any])
  }
}
