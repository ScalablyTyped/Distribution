package typings.awsSdk.cognitosyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegisterDeviceResponse extends StObject {
  
  /**
    * The unique ID generated for this device by Cognito.
    */
  var DeviceId: js.UndefOr[typings.awsSdk.cognitosyncMod.DeviceId] = js.native
}
object RegisterDeviceResponse {
  
  @scala.inline
  def apply(): RegisterDeviceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterDeviceResponse]
  }
  
  @scala.inline
  implicit class RegisterDeviceResponseMutableBuilder[Self <: RegisterDeviceResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceId(value: DeviceId): Self = StObject.set(x, "DeviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceIdUndefined: Self = StObject.set(x, "DeviceId", js.undefined)
  }
}
