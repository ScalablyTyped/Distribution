package typings.atAwsDashSdkClientDashGlacierDashNode.typesResourceNotFoundExceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _ResourceNotFoundExceptionDetails extends js.Object {
  /**
    * <p>404 Not Found</p>
    */
  var code: js.UndefOr[String] = js.undefined
  /**
    * <p>Returned if the specified resource (such as a vault, upload ID, or job ID) doesn't exist.</p>
    */
  var message: js.UndefOr[String] = js.undefined
  /**
    * <p>Client</p>
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object _ResourceNotFoundExceptionDetails {
  @scala.inline
  def apply(code: String = null, message: String = null, `type`: String = null): _ResourceNotFoundExceptionDetails = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_ResourceNotFoundExceptionDetails]
  }
}

