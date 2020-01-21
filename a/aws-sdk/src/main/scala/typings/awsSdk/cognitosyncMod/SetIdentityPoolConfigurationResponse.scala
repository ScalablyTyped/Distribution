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
  def apply(
    CognitoStreams: CognitoStreams = null,
    IdentityPoolId: IdentityPoolId = null,
    PushSync: PushSync = null
  ): SetIdentityPoolConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    if (CognitoStreams != null) __obj.updateDynamic("CognitoStreams")(CognitoStreams.asInstanceOf[js.Any])
    if (IdentityPoolId != null) __obj.updateDynamic("IdentityPoolId")(IdentityPoolId.asInstanceOf[js.Any])
    if (PushSync != null) __obj.updateDynamic("PushSync")(PushSync.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetIdentityPoolConfigurationResponse]
  }
}

