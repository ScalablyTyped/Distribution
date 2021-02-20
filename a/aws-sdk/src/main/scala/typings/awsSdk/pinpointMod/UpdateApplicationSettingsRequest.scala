package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateApplicationSettingsRequest extends StObject {
  
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: string = js.native
  
  var WriteApplicationSettingsRequest: typings.awsSdk.pinpointMod.WriteApplicationSettingsRequest = js.native
}
object UpdateApplicationSettingsRequest {
  
  @scala.inline
  def apply(ApplicationId: string, WriteApplicationSettingsRequest: WriteApplicationSettingsRequest): UpdateApplicationSettingsRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], WriteApplicationSettingsRequest = WriteApplicationSettingsRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateApplicationSettingsRequest]
  }
  
  @scala.inline
  implicit class UpdateApplicationSettingsRequestMutableBuilder[Self <: UpdateApplicationSettingsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationId(value: string): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWriteApplicationSettingsRequest(value: WriteApplicationSettingsRequest): Self = StObject.set(x, "WriteApplicationSettingsRequest", value.asInstanceOf[js.Any])
  }
}
