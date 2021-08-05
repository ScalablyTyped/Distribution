package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRecommenderConfigurationRequest extends StObject {
  
  /**
    * The unique identifier for the recommender model configuration. This identifier is displayed as the Recommender ID on the Amazon Pinpoint console.
    */
  var RecommenderId: string
}
object GetRecommenderConfigurationRequest {
  
  inline def apply(RecommenderId: string): GetRecommenderConfigurationRequest = {
    val __obj = js.Dynamic.literal(RecommenderId = RecommenderId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRecommenderConfigurationRequest]
  }
  
  extension [Self <: GetRecommenderConfigurationRequest](x: Self) {
    
    inline def setRecommenderId(value: string): Self = StObject.set(x, "RecommenderId", value.asInstanceOf[js.Any])
  }
}
