package typings.awsSdkClientDynamodbNode.typesContinuousBackupsUnavailableExceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContinuousBackupsUnavailableExceptionDetails extends js.Object {
  /**
    * _ErrorMessage shape
    */
  var message: js.UndefOr[String] = js.undefined
}

object ContinuousBackupsUnavailableExceptionDetails {
  @scala.inline
  def apply(message: String = null): ContinuousBackupsUnavailableExceptionDetails = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContinuousBackupsUnavailableExceptionDetails]
  }
}

