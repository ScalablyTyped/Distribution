package typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesGlobalTableAlreadyExistsExceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _GlobalTableAlreadyExistsExceptionDetails extends js.Object {
  /**
    * _ErrorMessage shape
    */
  var message: js.UndefOr[String] = js.undefined
}

object _GlobalTableAlreadyExistsExceptionDetails {
  @scala.inline
  def apply(message: String = null): _GlobalTableAlreadyExistsExceptionDetails = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[_GlobalTableAlreadyExistsExceptionDetails]
  }
}

