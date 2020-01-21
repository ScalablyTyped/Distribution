package typings.awsSdkClientGlacierNode.typesRequestTimeoutExceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestTimeoutExceptionDetails extends js.Object {
  /**
    * <p>408 Request Timeout</p>
    */
  var code: js.UndefOr[String] = js.undefined
  /**
    * <p>Returned if, when uploading an archive, Amazon Glacier times out while receiving the upload.</p>
    */
  var message: js.UndefOr[String] = js.undefined
  /**
    * <p>Client</p>
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object RequestTimeoutExceptionDetails {
  @scala.inline
  def apply(code: String = null, message: String = null, `type`: String = null): RequestTimeoutExceptionDetails = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestTimeoutExceptionDetails]
  }
}

