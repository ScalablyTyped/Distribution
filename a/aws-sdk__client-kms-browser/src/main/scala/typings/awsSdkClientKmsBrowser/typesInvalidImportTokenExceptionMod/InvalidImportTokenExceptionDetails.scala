package typings.awsSdkClientKmsBrowser.typesInvalidImportTokenExceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvalidImportTokenExceptionDetails extends js.Object {
  /**
    * _ErrorMessageType shape
    */
  var message: js.UndefOr[String] = js.undefined
}

object InvalidImportTokenExceptionDetails {
  @scala.inline
  def apply(message: String = null): InvalidImportTokenExceptionDetails = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidImportTokenExceptionDetails]
  }
}

