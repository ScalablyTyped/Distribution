package typings.awsSdk.codestarnotificationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotificationRuleSummary extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the notification rule.
    */
  var Arn: js.UndefOr[NotificationRuleArn] = js.native
  /**
    * The unique ID of the notification rule.
    */
  var Id: js.UndefOr[NotificationRuleId] = js.native
}

object NotificationRuleSummary {
  @scala.inline
  def apply(Arn: NotificationRuleArn = null, Id: NotificationRuleId = null): NotificationRuleSummary = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationRuleSummary]
  }
}

