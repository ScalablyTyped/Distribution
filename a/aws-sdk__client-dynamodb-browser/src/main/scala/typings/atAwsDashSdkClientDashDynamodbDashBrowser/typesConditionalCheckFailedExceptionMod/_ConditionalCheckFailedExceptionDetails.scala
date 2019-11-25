package typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesConditionalCheckFailedExceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _ConditionalCheckFailedExceptionDetails extends js.Object {
  /**
    * <p>The conditional request failed.</p>
    */
  var message: js.UndefOr[String] = js.undefined
}

object _ConditionalCheckFailedExceptionDetails {
  @scala.inline
  def apply(message: String = null): _ConditionalCheckFailedExceptionDetails = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[_ConditionalCheckFailedExceptionDetails]
  }
}

