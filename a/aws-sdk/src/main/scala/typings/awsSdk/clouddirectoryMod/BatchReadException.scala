package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchReadException extends js.Object {
  /**
    * An exception message that is associated with the failure.
    */
  var Message: js.UndefOr[ExceptionMessage] = js.native
  /**
    * A type of exception, such as InvalidArnException.
    */
  var Type: js.UndefOr[BatchReadExceptionType] = js.native
}

object BatchReadException {
  @scala.inline
  def apply(Message: ExceptionMessage = null, Type: BatchReadExceptionType = null): BatchReadException = {
    val __obj = js.Dynamic.literal()
    if (Message != null) __obj.updateDynamic("Message")(Message.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchReadException]
  }
}

