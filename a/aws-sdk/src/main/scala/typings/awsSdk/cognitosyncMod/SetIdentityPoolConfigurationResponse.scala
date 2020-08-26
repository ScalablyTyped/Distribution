package typings.awsSdk.cognitosyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetIdentityPoolConfigurationResponse extends js.Object {
  /**
    * Options to apply to this identity pool for Amazon Cognito streams.
    */
  var CognitoStreams: js.UndefOr[typings.awsSdk.cognitosyncMod.CognitoStreams] = js.native
  /**
    * A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon Cognito.
    */
  var IdentityPoolId: js.UndefOr[typings.awsSdk.cognitosyncMod.IdentityPoolId] = js.native
  /**
    * Options to apply to this identity pool for push synchronization.
    */
  var PushSync: js.UndefOr[typings.awsSdk.cognitosyncMod.PushSync] = js.native
}

object SetIdentityPoolConfigurationResponse {
  @scala.inline
  def apply(): SetIdentityPoolConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetIdentityPoolConfigurationResponse]
  }
  @scala.inline
  implicit class SetIdentityPoolConfigurationResponseOps[Self <: SetIdentityPoolConfigurationResponse] (val x: Self) extends AnyVal {
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
    def setCognitoStreams(value: CognitoStreams): Self = this.set("CognitoStreams", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCognitoStreams: Self = this.set("CognitoStreams", js.undefined)
    @scala.inline
    def setIdentityPoolId(value: IdentityPoolId): Self = this.set("IdentityPoolId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdentityPoolId: Self = this.set("IdentityPoolId", js.undefined)
    @scala.inline
    def setPushSync(value: PushSync): Self = this.set("PushSync", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePushSync: Self = this.set("PushSync", js.undefined)
  }
  
}

