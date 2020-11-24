package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateDeviceStatusRequest extends js.Object {
  
  /**
    * The access token.
    */
  var AccessToken: TokenModelType = js.native
  
  /**
    * The device key.
    */
  var DeviceKey: DeviceKeyType = js.native
  
  /**
    * The status of whether a device is remembered.
    */
  var DeviceRememberedStatus: js.UndefOr[DeviceRememberedStatusType] = js.native
}
object UpdateDeviceStatusRequest {
  
  @scala.inline
  def apply(AccessToken: TokenModelType, DeviceKey: DeviceKeyType): UpdateDeviceStatusRequest = {
    val __obj = js.Dynamic.literal(AccessToken = AccessToken.asInstanceOf[js.Any], DeviceKey = DeviceKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDeviceStatusRequest]
  }
  
  @scala.inline
  implicit class UpdateDeviceStatusRequestOps[Self <: UpdateDeviceStatusRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAccessToken(value: TokenModelType): Self = this.set("AccessToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceKey(value: DeviceKeyType): Self = this.set("DeviceKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceRememberedStatus(value: DeviceRememberedStatusType): Self = this.set("DeviceRememberedStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceRememberedStatus: Self = this.set("DeviceRememberedStatus", js.undefined)
  }
}
