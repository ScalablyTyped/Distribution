package typings.atAwsDashSdkClientDashDynamodbDashNode.typesTableAlreadyExistsExceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _TableAlreadyExistsExceptionDetails extends js.Object {
  /**
    * _ErrorMessage shape
    */
  var message: js.UndefOr[String] = js.undefined
}

object _TableAlreadyExistsExceptionDetails {
  @scala.inline
  def apply(message: String = null): _TableAlreadyExistsExceptionDetails = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[_TableAlreadyExistsExceptionDetails]
  }
}

