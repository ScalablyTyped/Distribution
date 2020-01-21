package typings.awsSdkClientKinesisBrowser.typesKmsthrottlingexceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KMSThrottlingExceptionDetails extends js.Object {
  /**
    * <p>A message that provides information about the error.</p>
    */
  var message: js.UndefOr[String] = js.undefined
}

object KMSThrottlingExceptionDetails {
  @scala.inline
  def apply(message: String = null): KMSThrottlingExceptionDetails = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[KMSThrottlingExceptionDetails]
  }
}

