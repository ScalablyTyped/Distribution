package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAppsResponse extends StObject {
  
  var ApplicationsResponse: typings.awsSdk.pinpointMod.ApplicationsResponse
}
object GetAppsResponse {
  
  inline def apply(ApplicationsResponse: ApplicationsResponse): GetAppsResponse = {
    val __obj = js.Dynamic.literal(ApplicationsResponse = ApplicationsResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAppsResponse]
  }
  
  extension [Self <: GetAppsResponse](x: Self) {
    
    inline def setApplicationsResponse(value: ApplicationsResponse): Self = StObject.set(x, "ApplicationsResponse", value.asInstanceOf[js.Any])
  }
}
