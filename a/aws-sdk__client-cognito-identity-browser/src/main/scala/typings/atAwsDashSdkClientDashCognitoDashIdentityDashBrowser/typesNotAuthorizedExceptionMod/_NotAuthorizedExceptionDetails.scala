package typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesNotAuthorizedExceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _NotAuthorizedExceptionDetails extends js.Object {
  /**
    * <p>The message returned by a NotAuthorizedException</p>
    */
  var message: js.UndefOr[String] = js.undefined
}

object _NotAuthorizedExceptionDetails {
  @scala.inline
  def apply(message: String = null): _NotAuthorizedExceptionDetails = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[_NotAuthorizedExceptionDetails]
  }
}

