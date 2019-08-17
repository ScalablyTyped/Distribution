package typings.atAwsDashSdkClientDashKmsDashNode.typesInvalidImportTokenExceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _InvalidImportTokenExceptionDetails extends js.Object {
  /**
    * _ErrorMessageType shape
    */
  var message: js.UndefOr[String] = js.undefined
}

object _InvalidImportTokenExceptionDetails {
  @scala.inline
  def apply(message: String = null): _InvalidImportTokenExceptionDetails = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[_InvalidImportTokenExceptionDetails]
  }
}

