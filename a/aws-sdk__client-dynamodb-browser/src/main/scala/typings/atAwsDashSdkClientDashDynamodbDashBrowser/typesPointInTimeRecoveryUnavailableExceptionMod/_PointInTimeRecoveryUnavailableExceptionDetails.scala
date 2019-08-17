package typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesPointInTimeRecoveryUnavailableExceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _PointInTimeRecoveryUnavailableExceptionDetails extends js.Object {
  /**
    * _ErrorMessage shape
    */
  var message: js.UndefOr[String] = js.undefined
}

object _PointInTimeRecoveryUnavailableExceptionDetails {
  @scala.inline
  def apply(message: String = null): _PointInTimeRecoveryUnavailableExceptionDetails = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[_PointInTimeRecoveryUnavailableExceptionDetails]
  }
}

