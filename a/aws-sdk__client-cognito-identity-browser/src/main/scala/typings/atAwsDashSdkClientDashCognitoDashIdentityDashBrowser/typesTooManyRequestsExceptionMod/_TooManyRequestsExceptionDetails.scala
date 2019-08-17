package typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesTooManyRequestsExceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _TooManyRequestsExceptionDetails extends js.Object {
  /**
    * <p>Message returned by a TooManyRequestsException</p>
    */
  var message: js.UndefOr[String] = js.undefined
}

object _TooManyRequestsExceptionDetails {
  @scala.inline
  def apply(message: String = null): _TooManyRequestsExceptionDetails = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[_TooManyRequestsExceptionDetails]
  }
}

