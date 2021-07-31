package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateApplicationSettingsResponse extends StObject {
  
  var ApplicationSettingsResource: typings.awsSdk.pinpointMod.ApplicationSettingsResource
}
object UpdateApplicationSettingsResponse {
  
  @scala.inline
  def apply(ApplicationSettingsResource: ApplicationSettingsResource): UpdateApplicationSettingsResponse = {
    val __obj = js.Dynamic.literal(ApplicationSettingsResource = ApplicationSettingsResource.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateApplicationSettingsResponse]
  }
  
  @scala.inline
  implicit class UpdateApplicationSettingsResponseMutableBuilder[Self <: UpdateApplicationSettingsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationSettingsResource(value: ApplicationSettingsResource): Self = StObject.set(x, "ApplicationSettingsResource", value.asInstanceOf[js.Any])
  }
}
