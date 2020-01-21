package typings.awsSdkClientCognitoIdentityBrowser.typesInternalErrorExceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InternalErrorExceptionDetails extends js.Object {
  /**
    * <p>The message returned by an InternalErrorException.</p>
    */
  var message: js.UndefOr[String] = js.undefined
}

object InternalErrorExceptionDetails {
  @scala.inline
  def apply(message: String = null): InternalErrorExceptionDetails = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[InternalErrorExceptionDetails]
  }
}

