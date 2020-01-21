package typings.awsSdk.codestarnotificationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeNotificationRuleRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the notification rule.
    */
  var Arn: NotificationRuleArn = js.native
}

object DescribeNotificationRuleRequest {
  @scala.inline
  def apply(Arn: NotificationRuleArn): DescribeNotificationRuleRequest = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeNotificationRuleRequest]
  }
}

