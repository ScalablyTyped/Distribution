package typings.awsSdkClientKinesisBrowser.typesExpiredIteratorExceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpiredIteratorExceptionDetails extends js.Object {
  /**
    * <p>A message that provides information about the error.</p>
    */
  var message: js.UndefOr[String] = js.undefined
}

object ExpiredIteratorExceptionDetails {
  @scala.inline
  def apply(message: String = null): ExpiredIteratorExceptionDetails = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpiredIteratorExceptionDetails]
  }
}

