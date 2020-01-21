package typings.awsSdkClientDynamodbBrowser.typesPointInTimeRecoveryUnavailableExceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointInTimeRecoveryUnavailableExceptionDetails extends js.Object {
  /**
    * _ErrorMessage shape
    */
  var message: js.UndefOr[String] = js.undefined
}

object PointInTimeRecoveryUnavailableExceptionDetails {
  @scala.inline
  def apply(message: String = null): PointInTimeRecoveryUnavailableExceptionDetails = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointInTimeRecoveryUnavailableExceptionDetails]
  }
}

