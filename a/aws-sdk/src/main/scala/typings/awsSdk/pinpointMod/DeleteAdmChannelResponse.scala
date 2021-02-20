package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteAdmChannelResponse extends StObject {
  
  var ADMChannelResponse: typings.awsSdk.pinpointMod.ADMChannelResponse = js.native
}
object DeleteAdmChannelResponse {
  
  @scala.inline
  def apply(ADMChannelResponse: ADMChannelResponse): DeleteAdmChannelResponse = {
    val __obj = js.Dynamic.literal(ADMChannelResponse = ADMChannelResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAdmChannelResponse]
  }
  
  @scala.inline
  implicit class DeleteAdmChannelResponseMutableBuilder[Self <: DeleteAdmChannelResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setADMChannelResponse(value: ADMChannelResponse): Self = StObject.set(x, "ADMChannelResponse", value.asInstanceOf[js.Any])
  }
}
