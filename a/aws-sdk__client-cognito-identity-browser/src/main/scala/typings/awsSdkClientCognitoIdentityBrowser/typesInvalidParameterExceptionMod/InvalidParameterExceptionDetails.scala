package typings.awsSdkClientCognitoIdentityBrowser.typesInvalidParameterExceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvalidParameterExceptionDetails extends js.Object {
  /**
    * <p>The message returned by an InvalidParameterException.</p>
    */
  var message: js.UndefOr[String] = js.undefined
}

object InvalidParameterExceptionDetails {
  @scala.inline
  def apply(message: String = null): InvalidParameterExceptionDetails = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidParameterExceptionDetails]
  }
}

