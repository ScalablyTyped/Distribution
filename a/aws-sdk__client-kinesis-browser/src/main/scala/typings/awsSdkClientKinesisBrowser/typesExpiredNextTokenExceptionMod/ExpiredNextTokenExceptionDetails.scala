package typings.awsSdkClientKinesisBrowser.typesExpiredNextTokenExceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpiredNextTokenExceptionDetails extends js.Object {
  /**
    * _ErrorMessage shape
    */
  var message: js.UndefOr[String] = js.undefined
}

object ExpiredNextTokenExceptionDetails {
  @scala.inline
  def apply(message: String = null): ExpiredNextTokenExceptionDetails = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpiredNextTokenExceptionDetails]
  }
}

