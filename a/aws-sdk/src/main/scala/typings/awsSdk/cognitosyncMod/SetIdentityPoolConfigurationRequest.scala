package typings.awsSdk.cognitosyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetIdentityPoolConfigurationRequest extends js.Object {
  /**
    * Options to apply to this identity pool for Amazon Cognito streams.
    */
  var CognitoStreams: js.UndefOr[typings.awsSdk.cognitosyncMod.CognitoStreams] = js.native
  /**
    * A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon Cognito. This is the ID of the pool to modify.
    */
  var IdentityPoolId: typings.awsSdk.cognitosyncMod.IdentityPoolId = js.native
  /**
    * Options to apply to this identity pool for push synchronization.
    */
  var PushSync: js.UndefOr[typings.awsSdk.cognitosyncMod.PushSync] = js.native
}

object SetIdentityPoolConfigurationRequest {
  @scala.inline
  def apply(IdentityPoolId: IdentityPoolId, CognitoStreams: CognitoStreams = null, PushSync: PushSync = null): SetIdentityPoolConfigurationRequest = {
    val __obj = js.Dynamic.literal(IdentityPoolId = IdentityPoolId.asInstanceOf[js.Any])
    if (CognitoStreams != null) __obj.updateDynamic("CognitoStreams")(CognitoStreams.asInstanceOf[js.Any])
    if (PushSync != null) __obj.updateDynamic("PushSync")(PushSync.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetIdentityPoolConfigurationRequest]
  }
}

