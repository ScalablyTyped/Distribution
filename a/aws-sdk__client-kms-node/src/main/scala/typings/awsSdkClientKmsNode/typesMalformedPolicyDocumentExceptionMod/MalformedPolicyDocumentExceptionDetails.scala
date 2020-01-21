package typings.awsSdkClientKmsNode.typesMalformedPolicyDocumentExceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MalformedPolicyDocumentExceptionDetails extends js.Object {
  /**
    * _ErrorMessageType shape
    */
  var message: js.UndefOr[String] = js.undefined
}

object MalformedPolicyDocumentExceptionDetails {
  @scala.inline
  def apply(message: String = null): MalformedPolicyDocumentExceptionDetails = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[MalformedPolicyDocumentExceptionDetails]
  }
}

