package typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesInvalidIdentityPoolConfigurationExceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _InvalidIdentityPoolConfigurationExceptionDetails extends js.Object {
  /**
    * <p>The message returned for an <code>InvalidIdentityPoolConfigurationException</code> </p>
    */
  var message: js.UndefOr[String] = js.undefined
}

object _InvalidIdentityPoolConfigurationExceptionDetails {
  @scala.inline
  def apply(message: String = null): _InvalidIdentityPoolConfigurationExceptionDetails = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[_InvalidIdentityPoolConfigurationExceptionDetails]
  }
}

