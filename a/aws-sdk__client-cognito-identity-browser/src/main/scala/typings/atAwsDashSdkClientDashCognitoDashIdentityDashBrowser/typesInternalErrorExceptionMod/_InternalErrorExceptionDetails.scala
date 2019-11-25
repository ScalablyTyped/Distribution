package typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesInternalErrorExceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _InternalErrorExceptionDetails extends js.Object {
  /**
    * <p>The message returned by an InternalErrorException.</p>
    */
  var message: js.UndefOr[String] = js.undefined
}

object _InternalErrorExceptionDetails {
  @scala.inline
  def apply(message: String = null): _InternalErrorExceptionDetails = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[_InternalErrorExceptionDetails]
  }
}

