package typings.awsSdkClientGlacierNode.typesServiceUnavailableExceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceUnavailableExceptionDetails extends js.Object {
  /**
    * <p>500 Internal Server Error</p>
    */
  var code: js.UndefOr[String] = js.undefined
  /**
    * <p>Returned if the service cannot complete the request.</p>
    */
  var message: js.UndefOr[String] = js.undefined
  /**
    * <p>Server</p>
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object ServiceUnavailableExceptionDetails {
  @scala.inline
  def apply(code: String = null, message: String = null, `type`: String = null): ServiceUnavailableExceptionDetails = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceUnavailableExceptionDetails]
  }
}

