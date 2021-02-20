package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PhoneNumberValidateRequest extends StObject {
  
  var NumberValidateRequest: typings.awsSdk.pinpointMod.NumberValidateRequest = js.native
}
object PhoneNumberValidateRequest {
  
  @scala.inline
  def apply(NumberValidateRequest: NumberValidateRequest): PhoneNumberValidateRequest = {
    val __obj = js.Dynamic.literal(NumberValidateRequest = NumberValidateRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhoneNumberValidateRequest]
  }
  
  @scala.inline
  implicit class PhoneNumberValidateRequestMutableBuilder[Self <: PhoneNumberValidateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNumberValidateRequest(value: NumberValidateRequest): Self = StObject.set(x, "NumberValidateRequest", value.asInstanceOf[js.Any])
  }
}
