package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateRecommenderConfigurationRequest extends StObject {
  
  var CreateRecommenderConfiguration: typings.awsSdk.pinpointMod.CreateRecommenderConfiguration = js.native
}
object CreateRecommenderConfigurationRequest {
  
  @scala.inline
  def apply(CreateRecommenderConfiguration: CreateRecommenderConfiguration): CreateRecommenderConfigurationRequest = {
    val __obj = js.Dynamic.literal(CreateRecommenderConfiguration = CreateRecommenderConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRecommenderConfigurationRequest]
  }
  
  @scala.inline
  implicit class CreateRecommenderConfigurationRequestMutableBuilder[Self <: CreateRecommenderConfigurationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateRecommenderConfiguration(value: CreateRecommenderConfiguration): Self = StObject.set(x, "CreateRecommenderConfiguration", value.asInstanceOf[js.Any])
  }
}
