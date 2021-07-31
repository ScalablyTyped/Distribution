package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetApplicationSettingsResponse extends StObject {
  
  var ApplicationSettingsResource: typings.awsSdk.pinpointMod.ApplicationSettingsResource
}
object GetApplicationSettingsResponse {
  
  @scala.inline
  def apply(ApplicationSettingsResource: ApplicationSettingsResource): GetApplicationSettingsResponse = {
    val __obj = js.Dynamic.literal(ApplicationSettingsResource = ApplicationSettingsResource.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetApplicationSettingsResponse]
  }
  
  @scala.inline
  implicit class GetApplicationSettingsResponseMutableBuilder[Self <: GetApplicationSettingsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationSettingsResource(value: ApplicationSettingsResource): Self = StObject.set(x, "ApplicationSettingsResource", value.asInstanceOf[js.Any])
  }
}
