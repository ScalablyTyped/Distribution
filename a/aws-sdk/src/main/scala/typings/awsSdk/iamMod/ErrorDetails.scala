package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ErrorDetails extends js.Object {
  /**
    * The error code associated with the operation failure.
    */
  var Code: stringType = js.native
  /**
    * Detailed information about the reason that the operation failed.
    */
  var Message: stringType = js.native
}

object ErrorDetails {
  @scala.inline
  def apply(Code: stringType, Message: stringType): ErrorDetails = {
    val __obj = js.Dynamic.literal(Code = Code.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorDetails]
  }
}

