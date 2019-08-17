package typings.atAwsDashSdkClientDashKmsDashNode.typesTagExceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _TagExceptionDetails extends js.Object {
  /**
    * _ErrorMessageType shape
    */
  var message: js.UndefOr[String] = js.undefined
}

object _TagExceptionDetails {
  @scala.inline
  def apply(message: String = null): _TagExceptionDetails = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[_TagExceptionDetails]
  }
}

