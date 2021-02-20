package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateRecommenderConfigurationRequest extends StObject {
  
  /**
    * The unique identifier for the recommender model configuration. This identifier is displayed as the Recommender ID on the Amazon Pinpoint console.
    */
  var RecommenderId: string = js.native
  
  var UpdateRecommenderConfiguration: typings.awsSdk.pinpointMod.UpdateRecommenderConfiguration = js.native
}
object UpdateRecommenderConfigurationRequest {
  
  @scala.inline
  def apply(RecommenderId: string, UpdateRecommenderConfiguration: UpdateRecommenderConfiguration): UpdateRecommenderConfigurationRequest = {
    val __obj = js.Dynamic.literal(RecommenderId = RecommenderId.asInstanceOf[js.Any], UpdateRecommenderConfiguration = UpdateRecommenderConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRecommenderConfigurationRequest]
  }
  
  @scala.inline
  implicit class UpdateRecommenderConfigurationRequestMutableBuilder[Self <: UpdateRecommenderConfigurationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRecommenderId(value: string): Self = StObject.set(x, "RecommenderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateRecommenderConfiguration(value: UpdateRecommenderConfiguration): Self = StObject.set(x, "UpdateRecommenderConfiguration", value.asInstanceOf[js.Any])
  }
}
