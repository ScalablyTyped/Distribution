package typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesInvalidParameterExceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _InvalidParameterExceptionDetails extends js.Object {
  /**
    * <p>The message returned by an InvalidParameterException.</p>
    */
  var message: js.UndefOr[String] = js.undefined
}

object _InvalidParameterExceptionDetails {
  @scala.inline
  def apply(message: String = null): _InvalidParameterExceptionDetails = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[_InvalidParameterExceptionDetails]
  }
}

