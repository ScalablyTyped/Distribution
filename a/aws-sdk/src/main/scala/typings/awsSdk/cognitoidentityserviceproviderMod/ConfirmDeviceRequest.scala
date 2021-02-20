package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfirmDeviceRequest extends StObject {
  
  /**
    * The access token.
    */
  var AccessToken: TokenModelType = js.native
  
  /**
    * The device key.
    */
  var DeviceKey: DeviceKeyType = js.native
  
  /**
    * The device name.
    */
  var DeviceName: js.UndefOr[DeviceNameType] = js.native
  
  /**
    * The configuration of the device secret verifier.
    */
  var DeviceSecretVerifierConfig: js.UndefOr[DeviceSecretVerifierConfigType] = js.native
}
object ConfirmDeviceRequest {
  
  @scala.inline
  def apply(AccessToken: TokenModelType, DeviceKey: DeviceKeyType): ConfirmDeviceRequest = {
    val __obj = js.Dynamic.literal(AccessToken = AccessToken.asInstanceOf[js.Any], DeviceKey = DeviceKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfirmDeviceRequest]
  }
  
  @scala.inline
  implicit class ConfirmDeviceRequestMutableBuilder[Self <: ConfirmDeviceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessToken(value: TokenModelType): Self = StObject.set(x, "AccessToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceKey(value: DeviceKeyType): Self = StObject.set(x, "DeviceKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceName(value: DeviceNameType): Self = StObject.set(x, "DeviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceNameUndefined: Self = StObject.set(x, "DeviceName", js.undefined)
    
    @scala.inline
    def setDeviceSecretVerifierConfig(value: DeviceSecretVerifierConfigType): Self = StObject.set(x, "DeviceSecretVerifierConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceSecretVerifierConfigUndefined: Self = StObject.set(x, "DeviceSecretVerifierConfig", js.undefined)
  }
}
