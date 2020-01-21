package typings.awsSdkClientKinesisBrowser.typesKmsoptinrequiredMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KMSOptInRequiredDetails extends js.Object {
  /**
    * <p>A message that provides information about the error.</p>
    */
  var message: js.UndefOr[String] = js.undefined
}

object KMSOptInRequiredDetails {
  @scala.inline
  def apply(message: String = null): KMSOptInRequiredDetails = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[KMSOptInRequiredDetails]
  }
}

