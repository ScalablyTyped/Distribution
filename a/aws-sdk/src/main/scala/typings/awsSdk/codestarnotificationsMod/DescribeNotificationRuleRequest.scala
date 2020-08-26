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
  @scala.inline
  implicit class DescribeNotificationRuleRequestOps[Self <: DescribeNotificationRuleRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setArn(value: NotificationRuleArn): Self = this.set("Arn", value.asInstanceOf[js.Any])
  }
  
}

