package typings.atAwsDashSdkClientDashDynamodbDashNode.typesContinuousBackupsUnavailableExceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _ContinuousBackupsUnavailableExceptionDetails extends js.Object {
  /**
    * _ErrorMessage shape
    */
  var message: js.UndefOr[String] = js.undefined
}

object _ContinuousBackupsUnavailableExceptionDetails {
  @scala.inline
  def apply(message: String = null): _ContinuousBackupsUnavailableExceptionDetails = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[_ContinuousBackupsUnavailableExceptionDetails]
  }
}

