package typings.awsSdkClientCognitoIdentityBrowser.typesNotAuthorizedExceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotAuthorizedExceptionDetails extends js.Object {
  /**
    * <p>The message returned by a NotAuthorizedException</p>
    */
  var message: js.UndefOr[String] = js.undefined
}

object NotAuthorizedExceptionDetails {
  @scala.inline
  def apply(message: String = null): NotAuthorizedExceptionDetails = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotAuthorizedExceptionDetails]
  }
}

