package typings.awsSdkClientCognitoIdentityBrowser.typesConcurrentModificationExceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConcurrentModificationExceptionDetails extends js.Object {
  /**
    * <p>The message returned by a ConcurrentModificationException.</p>
    */
  var message: js.UndefOr[String] = js.undefined
}

object ConcurrentModificationExceptionDetails {
  @scala.inline
  def apply(message: String = null): ConcurrentModificationExceptionDetails = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConcurrentModificationExceptionDetails]
  }
}

