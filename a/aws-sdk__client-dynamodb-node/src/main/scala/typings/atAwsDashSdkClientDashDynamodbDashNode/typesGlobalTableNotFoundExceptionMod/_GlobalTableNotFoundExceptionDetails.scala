package typings.atAwsDashSdkClientDashDynamodbDashNode.typesGlobalTableNotFoundExceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _GlobalTableNotFoundExceptionDetails extends js.Object {
  /**
    * _ErrorMessage shape
    */
  var message: js.UndefOr[String] = js.undefined
}

object _GlobalTableNotFoundExceptionDetails {
  @scala.inline
  def apply(message: String = null): _GlobalTableNotFoundExceptionDetails = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[_GlobalTableNotFoundExceptionDetails]
  }
}

