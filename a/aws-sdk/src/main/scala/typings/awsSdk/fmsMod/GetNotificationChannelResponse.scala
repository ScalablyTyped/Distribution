package typings.awsSdk.fmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetNotificationChannelResponse extends js.Object {
  /**
    * The IAM role that is used by AWS Firewall Manager to record activity to SNS.
    */
  var SnsRoleName: js.UndefOr[ResourceArn] = js.native
  /**
    * The SNS topic that records AWS Firewall Manager activity. 
    */
  var SnsTopicArn: js.UndefOr[ResourceArn] = js.native
}

object GetNotificationChannelResponse {
  @scala.inline
  def apply(SnsRoleName: ResourceArn = null, SnsTopicArn: ResourceArn = null): GetNotificationChannelResponse = {
    val __obj = js.Dynamic.literal()
    if (SnsRoleName != null) __obj.updateDynamic("SnsRoleName")(SnsRoleName.asInstanceOf[js.Any])
    if (SnsTopicArn != null) __obj.updateDynamic("SnsTopicArn")(SnsTopicArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetNotificationChannelResponse]
  }
}

