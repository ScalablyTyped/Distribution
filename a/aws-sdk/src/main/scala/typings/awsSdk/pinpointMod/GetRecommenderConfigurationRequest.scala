package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetRecommenderConfigurationRequest extends StObject {
  
  /**
    * The unique identifier for the recommender model configuration. This identifier is displayed as the Recommender ID on the Amazon Pinpoint console.
    */
  var RecommenderId: string = js.native
}
object GetRecommenderConfigurationRequest {
  
  @scala.inline
  def apply(RecommenderId: string): GetRecommenderConfigurationRequest = {
    val __obj = js.Dynamic.literal(RecommenderId = RecommenderId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRecommenderConfigurationRequest]
  }
  
  @scala.inline
  implicit class GetRecommenderConfigurationRequestMutableBuilder[Self <: GetRecommenderConfigurationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRecommenderId(value: string): Self = StObject.set(x, "RecommenderId", value.asInstanceOf[js.Any])
  }
}
