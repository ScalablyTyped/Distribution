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
  def apply(): CognitoStreams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CognitoStreams]
  }
  @scala.inline
  implicit class CognitoStreamsOps[Self <: CognitoStreams] (val x: Self) extends AnyVal {
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
    def setRoleArn(value: AssumeRoleArn): Self = this.set("RoleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoleArn: Self = this.set("RoleArn", js.undefined)
    @scala.inline
    def setStreamName(value: StreamName): Self = this.set("StreamName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStreamName: Self = this.set("StreamName", js.undefined)
    @scala.inline
    def setStreamingStatus(value: StreamingStatus): Self = this.set("StreamingStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStreamingStatus: Self = this.set("StreamingStatus", js.undefined)
  }
  
}

