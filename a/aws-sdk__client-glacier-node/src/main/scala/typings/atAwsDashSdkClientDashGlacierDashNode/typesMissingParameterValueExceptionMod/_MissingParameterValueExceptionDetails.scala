package typings.atAwsDashSdkClientDashGlacierDashNode.typesMissingParameterValueExceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _MissingParameterValueExceptionDetails extends js.Object {
  /**
    * <p>400 Bad Request</p>
    */
  var code: js.UndefOr[String] = js.undefined
  /**
    * <p>Returned if no authentication data is found for the request.</p>
    */
  var message: js.UndefOr[String] = js.undefined
  /**
    * <p>Client.</p>
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object _MissingParameterValueExceptionDetails {
  @scala.inline
  def apply(code: String = null, message: String = null, `type`: String = null): _MissingParameterValueExceptionDetails = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code)
    if (message != null) __obj.updateDynamic("message")(message)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[_MissingParameterValueExceptionDetails]
  }
}

