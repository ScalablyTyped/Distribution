package typings.awsSdk.codestarnotificationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnsubscribeRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the notification rule.
    */
  var Arn: NotificationRuleArn = js.native
  /**
    * The ARN of the SNS topic to unsubscribe from the notification rule.
    */
  var TargetAddress: typings.awsSdk.codestarnotificationsMod.TargetAddress = js.native
}

object UnsubscribeRequest {
  @scala.inline
  def apply(Arn: NotificationRuleArn, TargetAddress: TargetAddress): UnsubscribeRequest = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any], TargetAddress = TargetAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnsubscribeRequest]
  }
  @scala.inline
  implicit class UnsubscribeRequestOps[Self <: UnsubscribeRequest] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setTargetAddress(value: TargetAddress): Self = this.set("TargetAddress", value.asInstanceOf[js.Any])
  }
  
}

