package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteRecommenderConfigurationResponse extends StObject {
  
  var RecommenderConfigurationResponse: typings.awsSdk.pinpointMod.RecommenderConfigurationResponse = js.native
}
object DeleteRecommenderConfigurationResponse {
  
  @scala.inline
  def apply(RecommenderConfigurationResponse: RecommenderConfigurationResponse): DeleteRecommenderConfigurationResponse = {
    val __obj = js.Dynamic.literal(RecommenderConfigurationResponse = RecommenderConfigurationResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRecommenderConfigurationResponse]
  }
  
  @scala.inline
  implicit class DeleteRecommenderConfigurationResponseMutableBuilder[Self <: DeleteRecommenderConfigurationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRecommenderConfigurationResponse(value: RecommenderConfigurationResponse): Self = StObject.set(x, "RecommenderConfigurationResponse", value.asInstanceOf[js.Any])
  }
}
