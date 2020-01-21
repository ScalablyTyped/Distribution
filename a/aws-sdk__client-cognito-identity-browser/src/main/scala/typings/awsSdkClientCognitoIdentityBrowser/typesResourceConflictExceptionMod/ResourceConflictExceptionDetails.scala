package typings.awsSdkClientCognitoIdentityBrowser.typesResourceConflictExceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceConflictExceptionDetails extends js.Object {
  /**
    * <p>The message returned by a ResourceConflictException.</p>
    */
  var message: js.UndefOr[String] = js.undefined
}

object ResourceConflictExceptionDetails {
  @scala.inline
  def apply(message: String = null): ResourceConflictExceptionDetails = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceConflictExceptionDetails]
  }
}

