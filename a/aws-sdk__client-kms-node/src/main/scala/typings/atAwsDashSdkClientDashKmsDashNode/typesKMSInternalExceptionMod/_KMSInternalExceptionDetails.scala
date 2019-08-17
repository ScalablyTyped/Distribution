package typings.atAwsDashSdkClientDashKmsDashNode.typesKMSInternalExceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _KMSInternalExceptionDetails extends js.Object {
  /**
    * _ErrorMessageType shape
    */
  var message: js.UndefOr[String] = js.undefined
}

object _KMSInternalExceptionDetails {
  @scala.inline
  def apply(message: String = null): _KMSInternalExceptionDetails = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[_KMSInternalExceptionDetails]
  }
}

