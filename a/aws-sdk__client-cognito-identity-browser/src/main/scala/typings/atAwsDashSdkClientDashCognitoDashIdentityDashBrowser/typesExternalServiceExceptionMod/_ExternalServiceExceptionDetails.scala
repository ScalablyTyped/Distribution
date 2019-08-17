package typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesExternalServiceExceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _ExternalServiceExceptionDetails extends js.Object {
  /**
    * <p>The message returned by an ExternalServiceException</p>
    */
  var message: js.UndefOr[String] = js.undefined
}

object _ExternalServiceExceptionDetails {
  @scala.inline
  def apply(message: String = null): _ExternalServiceExceptionDetails = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[_ExternalServiceExceptionDetails]
  }
}

