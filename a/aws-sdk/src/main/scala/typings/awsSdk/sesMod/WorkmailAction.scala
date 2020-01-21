package typings.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkmailAction extends js.Object {
  /**
    * The ARN of the Amazon WorkMail organization. An example of an Amazon WorkMail organization ARN is arn:aws:workmail:us-west-2:123456789012:organization/m-68755160c4cb4e29a2b2f8fb58f359d7. For information about Amazon WorkMail organizations, see the Amazon WorkMail Administrator Guide.
    */
  var OrganizationArn: AmazonResourceName = js.native
  /**
    * The Amazon Resource Name (ARN) of the Amazon SNS topic to notify when the WorkMail action is called. An example of an Amazon SNS topic ARN is arn:aws:sns:us-west-2:123456789012:MyTopic. For more information about Amazon SNS topics, see the Amazon SNS Developer Guide.
    */
  var TopicArn: js.UndefOr[AmazonResourceName] = js.native
}

object WorkmailAction {
  @scala.inline
  def apply(OrganizationArn: AmazonResourceName, TopicArn: AmazonResourceName = null): WorkmailAction = {
    val __obj = js.Dynamic.literal(OrganizationArn = OrganizationArn.asInstanceOf[js.Any])
    if (TopicArn != null) __obj.updateDynamic("TopicArn")(TopicArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkmailAction]
  }
}

