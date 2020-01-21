package typings.awsSdk.cognitosyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CognitoStreams extends js.Object {
  /**
    * The ARN of the role Amazon Cognito can assume in order to publish to the stream. This role must grant access to Amazon Cognito (cognito-sync) to invoke PutRecord on your Cognito stream.
    */
  var RoleArn: js.UndefOr[AssumeRoleArn] = js.native
  /**
    * The name of the Cognito stream to receive updates. This stream must be in the developers account and in the same region as the identity pool.
    */
  var StreamName: js.UndefOr[typings.awsSdk.cognitosyncMod.StreamName] = js.native
  /**
    * Status of the Cognito streams. Valid values are: ENABLED - Streaming of updates to identity pool is enabled. DISABLED - Streaming of updates to identity pool is disabled. Bulk publish will also fail if StreamingStatus is DISABLED.
    */
  var StreamingStatus: js.UndefOr[typings.awsSdk.cognitosyncMod.StreamingStatus] = js.native
}

object CognitoStreams {
  @scala.inline
  def apply(
    RoleArn: AssumeRoleArn = null,
    StreamName: StreamName = null,
    StreamingStatus: StreamingStatus = null
  ): CognitoStreams = {
    val __obj = js.Dynamic.literal()
    if (RoleArn != null) __obj.updateDynamic("RoleArn")(RoleArn.asInstanceOf[js.Any])
    if (StreamName != null) __obj.updateDynamic("StreamName")(StreamName.asInstanceOf[js.Any])
    if (StreamingStatus != null) __obj.updateDynamic("StreamingStatus")(StreamingStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[CognitoStreams]
  }
}

