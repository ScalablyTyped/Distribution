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
  def apply(): BatchReadException = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchReadException]
  }
  @scala.inline
  implicit class BatchReadExceptionOps[Self <: BatchReadException] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMessage(value: ExceptionMessage): Self = this.set("Message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("Message", js.undefined)
    @scala.inline
    def setType(value: BatchReadExceptionType): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
  }
  
}

