package typings.awsSdkClientKmsBrowser.typesExpiredImportTokenExceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpiredImportTokenExceptionDetails extends js.Object {
  /**
    * _ErrorMessageType shape
    */
  var message: js.UndefOr[String] = js.undefined
}

object ExpiredImportTokenExceptionDetails {
  @scala.inline
  def apply(message: String = null): ExpiredImportTokenExceptionDetails = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpiredImportTokenExceptionDetails]
  }
}

