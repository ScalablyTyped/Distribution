package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateRecommenderConfigurationResponse extends StObject {
  
  var RecommenderConfigurationResponse: typings.awsSdk.pinpointMod.RecommenderConfigurationResponse
}
object CreateRecommenderConfigurationResponse {
  
  @scala.inline
  def apply(RecommenderConfigurationResponse: RecommenderConfigurationResponse): CreateRecommenderConfigurationResponse = {
    val __obj = js.Dynamic.literal(RecommenderConfigurationResponse = RecommenderConfigurationResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRecommenderConfigurationResponse]
  }
  
  @scala.inline
  implicit class CreateRecommenderConfigurationResponseMutableBuilder[Self <: CreateRecommenderConfigurationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRecommenderConfigurationResponse(value: RecommenderConfigurationResponse): Self = StObject.set(x, "RecommenderConfigurationResponse", value.asInstanceOf[js.Any])
  }
}
