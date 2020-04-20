package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotificationChannel extends js.Object {
  /**
    * The ARN of an IAM role that gives Amazon Rekognition publishing permissions to the Amazon SNS topic. 
    */
  var RoleArn: typings.awsSdk.rekognitionMod.RoleArn = js.native
  /**
    * The Amazon SNS topic to which Amazon Rekognition to posts the completion status.
    */
  var SNSTopicArn: typings.awsSdk.rekognitionMod.SNSTopicArn = js.native
}

object NotificationChannel {
  @scala.inline
  def apply(RoleArn: RoleArn, SNSTopicArn: SNSTopicArn): NotificationChannel = {
    val __obj = js.Dynamic.literal(RoleArn = RoleArn.asInstanceOf[js.Any], SNSTopicArn = SNSTopicArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationChannel]
  }
}

