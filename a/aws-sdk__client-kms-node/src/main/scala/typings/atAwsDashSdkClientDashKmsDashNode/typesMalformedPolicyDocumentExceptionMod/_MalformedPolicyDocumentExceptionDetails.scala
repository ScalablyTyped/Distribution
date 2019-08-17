package typings.atAwsDashSdkClientDashKmsDashNode.typesMalformedPolicyDocumentExceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _MalformedPolicyDocumentExceptionDetails extends js.Object {
  /**
    * _ErrorMessageType shape
    */
  var message: js.UndefOr[String] = js.undefined
}

object _MalformedPolicyDocumentExceptionDetails {
  @scala.inline
  def apply(message: String = null): _MalformedPolicyDocumentExceptionDetails = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[_MalformedPolicyDocumentExceptionDetails]
  }
}

