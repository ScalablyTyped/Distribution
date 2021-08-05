package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateRecommenderConfigurationRequest extends StObject {
  
  /**
    * The unique identifier for the recommender model configuration. This identifier is displayed as the Recommender ID on the Amazon Pinpoint console.
    */
  var RecommenderId: string
  
  var UpdateRecommenderConfiguration: typings.awsSdk.pinpointMod.UpdateRecommenderConfiguration
}
object UpdateRecommenderConfigurationRequest {
  
  inline def apply(RecommenderId: string, UpdateRecommenderConfiguration: UpdateRecommenderConfiguration): UpdateRecommenderConfigurationRequest = {
    val __obj = js.Dynamic.literal(RecommenderId = RecommenderId.asInstanceOf[js.Any], UpdateRecommenderConfiguration = UpdateRecommenderConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRecommenderConfigurationRequest]
  }
  
  extension [Self <: UpdateRecommenderConfigurationRequest](x: Self) {
    
    inline def setRecommenderId(value: string): Self = StObject.set(x, "RecommenderId", value.asInstanceOf[js.Any])
    
    inline def setUpdateRecommenderConfiguration(value: UpdateRecommenderConfiguration): Self = StObject.set(x, "UpdateRecommenderConfiguration", value.asInstanceOf[js.Any])
  }
}
