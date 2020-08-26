package typings.awsSdk.cognitosyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegisterDeviceRequest extends js.Object {
  /**
    * The unique ID for this identity.
    */
  var IdentityId: typings.awsSdk.cognitosyncMod.IdentityId = js.native
  /**
    * A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon Cognito. Here, the ID of the pool that the identity belongs to.
    */
  var IdentityPoolId: typings.awsSdk.cognitosyncMod.IdentityPoolId = js.native
  /**
    * The SNS platform type (e.g. GCM, SDM, APNS, APNS_SANDBOX).
    */
  var Platform: typings.awsSdk.cognitosyncMod.Platform = js.native
  /**
    * The push token.
    */
  var Token: PushToken = js.native
}

object RegisterDeviceRequest {
  @scala.inline
  def apply(IdentityId: IdentityId, IdentityPoolId: IdentityPoolId, Platform: Platform, Token: PushToken): RegisterDeviceRequest = {
    val __obj = js.Dynamic.literal(IdentityId = IdentityId.asInstanceOf[js.Any], IdentityPoolId = IdentityPoolId.asInstanceOf[js.Any], Platform = Platform.asInstanceOf[js.Any], Token = Token.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterDeviceRequest]
  }
  @scala.inline
  implicit class RegisterDeviceRequestOps[Self <: RegisterDeviceRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIdentityId(value: IdentityId): Self = this.set("IdentityId", value.asInstanceOf[js.Any])
    @scala.inline
    def setIdentityPoolId(value: IdentityPoolId): Self = this.set("IdentityPoolId", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlatform(value: Platform): Self = this.set("Platform", value.asInstanceOf[js.Any])
    @scala.inline
    def setToken(value: PushToken): Self = this.set("Token", value.asInstanceOf[js.Any])
  }
  
}

