package typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesResourceConflictExceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _ResourceConflictExceptionDetails extends js.Object {
  /**
    * <p>The message returned by a ResourceConflictException.</p>
    */
  var message: js.UndefOr[String] = js.undefined
}

object _ResourceConflictExceptionDetails {
  @scala.inline
  def apply(message: String = null): _ResourceConflictExceptionDetails = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[_ResourceConflictExceptionDetails]
  }
}

