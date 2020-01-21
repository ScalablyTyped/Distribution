package typings.awsSdk.codestarnotificationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteNotificationRuleRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the notification rule you want to delete.
    */
  var Arn: NotificationRuleArn = js.native
}

object DeleteNotificationRuleRequest {
  @scala.inline
  def apply(Arn: NotificationRuleArn): DeleteNotificationRuleRequest = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteNotificationRuleRequest]
  }
}

