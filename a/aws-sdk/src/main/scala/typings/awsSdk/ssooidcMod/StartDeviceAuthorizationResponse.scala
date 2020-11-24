package typings.awsSdk.ssooidcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartDeviceAuthorizationResponse extends js.Object {
  
  /**
    * The short-lived code that is used by the device when polling for a session token.
    */
  var deviceCode: js.UndefOr[DeviceCode] = js.native
  
  /**
    * Indicates the number of seconds in which the verification code will become invalid.
    */
  var expiresIn: js.UndefOr[ExpirationInSeconds] = js.native
  
  /**
    * Indicates the number of seconds the client must wait between attempts when polling for a session.
    */
  var interval: js.UndefOr[IntervalInSeconds] = js.native
  
  /**
    * A one-time user verification code. This is needed to authorize an in-use device.
    */
  var userCode: js.UndefOr[UserCode] = js.native
  
  /**
    * The URI of the verification page that takes the userCode to authorize the device.
    */
  var verificationUri: js.UndefOr[URI] = js.native
  
  /**
    * An alternate URL that the client can use to automatically launch a browser. This process skips the manual step in which the user visits the verification page and enters their code.
    */
  var verificationUriComplete: js.UndefOr[URI] = js.native
}
object StartDeviceAuthorizationResponse {
  
  @scala.inline
  def apply(): StartDeviceAuthorizationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartDeviceAuthorizationResponse]
  }
  
  @scala.inline
  implicit class StartDeviceAuthorizationResponseOps[Self <: StartDeviceAuthorizationResponse] (val x: Self) extends AnyVal {
    
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
    def setDeviceCode(value: DeviceCode): Self = this.set("deviceCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceCode: Self = this.set("deviceCode", js.undefined)
    
    @scala.inline
    def setExpiresIn(value: ExpirationInSeconds): Self = this.set("expiresIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpiresIn: Self = this.set("expiresIn", js.undefined)
    
    @scala.inline
    def setInterval(value: IntervalInSeconds): Self = this.set("interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterval: Self = this.set("interval", js.undefined)
    
    @scala.inline
    def setUserCode(value: UserCode): Self = this.set("userCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserCode: Self = this.set("userCode", js.undefined)
    
    @scala.inline
    def setVerificationUri(value: URI): Self = this.set("verificationUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerificationUri: Self = this.set("verificationUri", js.undefined)
    
    @scala.inline
    def setVerificationUriComplete(value: URI): Self = this.set("verificationUriComplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerificationUriComplete: Self = this.set("verificationUriComplete", js.undefined)
  }
}
