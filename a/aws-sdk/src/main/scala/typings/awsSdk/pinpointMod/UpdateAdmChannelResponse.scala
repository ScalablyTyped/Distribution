package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateAdmChannelResponse extends StObject {
  
  var ADMChannelResponse: typings.awsSdk.pinpointMod.ADMChannelResponse = js.native
}
object UpdateAdmChannelResponse {
  
  @scala.inline
  def apply(ADMChannelResponse: ADMChannelResponse): UpdateAdmChannelResponse = {
    val __obj = js.Dynamic.literal(ADMChannelResponse = ADMChannelResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAdmChannelResponse]
  }
  
  @scala.inline
  implicit class UpdateAdmChannelResponseMutableBuilder[Self <: UpdateAdmChannelResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setADMChannelResponse(value: ADMChannelResponse): Self = StObject.set(x, "ADMChannelResponse", value.asInstanceOf[js.Any])
  }
}
