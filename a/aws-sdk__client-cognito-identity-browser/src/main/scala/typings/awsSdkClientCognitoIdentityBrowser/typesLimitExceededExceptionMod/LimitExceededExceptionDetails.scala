package typings.awsSdkClientCognitoIdentityBrowser.typesLimitExceededExceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LimitExceededExceptionDetails extends js.Object {
  /**
    * <p>The message returned by a LimitExceededException.</p>
    */
  var message: js.UndefOr[String] = js.undefined
}

object LimitExceededExceptionDetails {
  @scala.inline
  def apply(message: String = null): LimitExceededExceptionDetails = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[LimitExceededExceptionDetails]
  }
}

