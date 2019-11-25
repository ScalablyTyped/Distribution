package typings.atAwsDashSdkClientDashGlacierDashNode.typesLimitExceededExceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _LimitExceededExceptionDetails extends js.Object {
  /**
    * <p>400 Bad Request</p>
    */
  var code: js.UndefOr[String] = js.undefined
  /**
    * <p>Returned if the request results in a vault limit or tags limit being exceeded.</p>
    */
  var message: js.UndefOr[String] = js.undefined
  /**
    * <p>Client</p>
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object _LimitExceededExceptionDetails {
  @scala.inline
  def apply(code: String = null, message: String = null, `type`: String = null): _LimitExceededExceptionDetails = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_LimitExceededExceptionDetails]
  }
}

