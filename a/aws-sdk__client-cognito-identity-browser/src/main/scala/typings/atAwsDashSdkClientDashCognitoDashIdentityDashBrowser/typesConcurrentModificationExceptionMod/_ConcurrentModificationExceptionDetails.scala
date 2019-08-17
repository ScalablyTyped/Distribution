package typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesConcurrentModificationExceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _ConcurrentModificationExceptionDetails extends js.Object {
  /**
    * <p>The message returned by a ConcurrentModificationException.</p>
    */
  var message: js.UndefOr[String] = js.undefined
}

object _ConcurrentModificationExceptionDetails {
  @scala.inline
  def apply(message: String = null): _ConcurrentModificationExceptionDetails = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[_ConcurrentModificationExceptionDetails]
  }
}

