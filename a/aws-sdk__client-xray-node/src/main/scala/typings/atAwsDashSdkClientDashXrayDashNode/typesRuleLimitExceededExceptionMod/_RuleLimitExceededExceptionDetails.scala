package typings.atAwsDashSdkClientDashXrayDashNode.typesRuleLimitExceededExceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _RuleLimitExceededExceptionDetails extends js.Object {
  /**
    * _ErrorMessage shape
    */
  var Message: js.UndefOr[String] = js.undefined
}

object _RuleLimitExceededExceptionDetails {
  @scala.inline
  def apply(Message: String = null): _RuleLimitExceededExceptionDetails = {
    val __obj = js.Dynamic.literal()
    if (Message != null) __obj.updateDynamic("Message")(Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[_RuleLimitExceededExceptionDetails]
  }
}

