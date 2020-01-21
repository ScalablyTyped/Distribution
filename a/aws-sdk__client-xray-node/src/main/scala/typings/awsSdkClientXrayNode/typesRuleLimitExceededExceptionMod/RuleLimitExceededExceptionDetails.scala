package typings.awsSdkClientXrayNode.typesRuleLimitExceededExceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RuleLimitExceededExceptionDetails extends js.Object {
  /**
    * _ErrorMessage shape
    */
  var Message: js.UndefOr[String] = js.undefined
}

object RuleLimitExceededExceptionDetails {
  @scala.inline
  def apply(Message: String = null): RuleLimitExceededExceptionDetails = {
    val __obj = js.Dynamic.literal()
    if (Message != null) __obj.updateDynamic("Message")(Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleLimitExceededExceptionDetails]
  }
}

