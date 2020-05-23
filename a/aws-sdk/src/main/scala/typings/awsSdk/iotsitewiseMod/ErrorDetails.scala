package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ErrorDetails extends js.Object {
  /**
    * The error code.
    */
  var code: ErrorCode = js.native
  /**
    * The error message.
    */
  var message: ErrorMessage = js.native
}

object ErrorDetails {
  @scala.inline
  def apply(code: ErrorCode, message: ErrorMessage): ErrorDetails = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorDetails]
  }
}

