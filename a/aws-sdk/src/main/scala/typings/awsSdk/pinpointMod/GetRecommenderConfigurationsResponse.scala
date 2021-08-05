package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRecommenderConfigurationsResponse extends StObject {
  
  var ListRecommenderConfigurationsResponse: typings.awsSdk.pinpointMod.ListRecommenderConfigurationsResponse
}
object GetRecommenderConfigurationsResponse {
  
  inline def apply(ListRecommenderConfigurationsResponse: ListRecommenderConfigurationsResponse): GetRecommenderConfigurationsResponse = {
    val __obj = js.Dynamic.literal(ListRecommenderConfigurationsResponse = ListRecommenderConfigurationsResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRecommenderConfigurationsResponse]
  }
  
  extension [Self <: GetRecommenderConfigurationsResponse](x: Self) {
    
    inline def setListRecommenderConfigurationsResponse(value: ListRecommenderConfigurationsResponse): Self = StObject.set(x, "ListRecommenderConfigurationsResponse", value.asInstanceOf[js.Any])
  }
}
