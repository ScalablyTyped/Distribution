package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetLoggingOptionsRequest extends js.Object {
  /**
    * The logging options payload.
    */
  var loggingOptionsPayload: LoggingOptionsPayload = js.native
}

object SetLoggingOptionsRequest {
  @scala.inline
  def apply(loggingOptionsPayload: LoggingOptionsPayload): SetLoggingOptionsRequest = {
    val __obj = js.Dynamic.literal(loggingOptionsPayload = loggingOptionsPayload.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetLoggingOptionsRequest]
  }
}

