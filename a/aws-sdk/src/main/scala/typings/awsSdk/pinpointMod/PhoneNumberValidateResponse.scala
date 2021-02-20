package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PhoneNumberValidateResponse extends StObject {
  
  var NumberValidateResponse: typings.awsSdk.pinpointMod.NumberValidateResponse = js.native
}
object PhoneNumberValidateResponse {
  
  @scala.inline
  def apply(NumberValidateResponse: NumberValidateResponse): PhoneNumberValidateResponse = {
    val __obj = js.Dynamic.literal(NumberValidateResponse = NumberValidateResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhoneNumberValidateResponse]
  }
  
  @scala.inline
  implicit class PhoneNumberValidateResponseMutableBuilder[Self <: PhoneNumberValidateResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNumberValidateResponse(value: NumberValidateResponse): Self = StObject.set(x, "NumberValidateResponse", value.asInstanceOf[js.Any])
  }
}
