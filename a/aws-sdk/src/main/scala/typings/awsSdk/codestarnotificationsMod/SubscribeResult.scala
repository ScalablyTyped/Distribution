package typings.awsSdk.codestarnotificationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubscribeResult extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the notification rule for which you have created assocations.
    */
  var Arn: js.UndefOr[NotificationRuleArn] = js.native
}

object SubscribeResult {
  @scala.inline
  def apply(Arn: NotificationRuleArn = null): SubscribeResult = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscribeResult]
  }
}

