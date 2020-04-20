package typings.awsSdk.elastictranscoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestRoleRequest extends js.Object {
  /**
    * The Amazon S3 bucket that contains media files to be transcoded. The action attempts to read from this bucket.
    */
  var InputBucket: BucketName = js.native
  /**
    * The Amazon S3 bucket that Elastic Transcoder writes transcoded media files to. The action attempts to read from this bucket.
    */
  var OutputBucket: BucketName = js.native
  /**
    * The IAM Amazon Resource Name (ARN) for the role that you want Elastic Transcoder to test.
    */
  var Role: typings.awsSdk.elastictranscoderMod.Role = js.native
  /**
    * The ARNs of one or more Amazon Simple Notification Service (Amazon SNS) topics that you want the action to send a test notification to.
    */
  var Topics: SnsTopics = js.native
}

object TestRoleRequest {
  @scala.inline
  def apply(InputBucket: BucketName, OutputBucket: BucketName, Role: Role, Topics: SnsTopics): TestRoleRequest = {
    val __obj = js.Dynamic.literal(InputBucket = InputBucket.asInstanceOf[js.Any], OutputBucket = OutputBucket.asInstanceOf[js.Any], Role = Role.asInstanceOf[js.Any], Topics = Topics.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestRoleRequest]
  }
}

