package typings.awsSdkClientCognitoIdentityBrowser.typesTooManyRequestsExceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooManyRequestsExceptionDetails extends js.Object {
  /**
    * <p>Message returned by a TooManyRequestsException</p>
    */
  var message: js.UndefOr[String] = js.undefined
}

object TooManyRequestsExceptionDetails {
  @scala.inline
  def apply(message: String = null): TooManyRequestsExceptionDetails = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooManyRequestsExceptionDetails]
  }
}

