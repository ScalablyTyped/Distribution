package typings.atAwsDashSdkClientDashGlacierDashNode.typesPolicyEnforcedExceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _PolicyEnforcedExceptionDetails extends js.Object {
  /**
    * <p>PolicyEnforcedException</p>
    */
  var code: js.UndefOr[String] = js.undefined
  /**
    * <p>InitiateJob request denied by current data retrieval policy.</p>
    */
  var message: js.UndefOr[String] = js.undefined
  /**
    * <p>Client</p>
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object _PolicyEnforcedExceptionDetails {
  @scala.inline
  def apply(code: String = null, message: String = null, `type`: String = null): _PolicyEnforcedExceptionDetails = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_PolicyEnforcedExceptionDetails]
  }
}

