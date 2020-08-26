package typings.awsSdkClientXrayNode.typesThrottledExceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThrottledExceptionDetails extends js.Object {
  /**
    * _ErrorMessage shape
    */
  var Message: js.UndefOr[String] = js.native
}

object ThrottledExceptionDetails {
  @scala.inline
  def apply(): ThrottledExceptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThrottledExceptionDetails]
  }
  @scala.inline
  implicit class ThrottledExceptionDetailsOps[Self <: ThrottledExceptionDetails] (val x: Self) extends AnyVal {
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
    def setMessage(value: String): Self = this.set("Message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("Message", js.undefined)
  }
  
}

