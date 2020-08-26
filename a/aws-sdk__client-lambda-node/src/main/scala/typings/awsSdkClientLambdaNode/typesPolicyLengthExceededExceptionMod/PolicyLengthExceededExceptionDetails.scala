package typings.awsSdkClientLambdaNode.typesPolicyLengthExceededExceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolicyLengthExceededExceptionDetails extends js.Object {
  /**
    * _String shape
    */
  var Type: js.UndefOr[String] = js.native
  /**
    * _String shape
    */
  var message: js.UndefOr[String] = js.native
}

object PolicyLengthExceededExceptionDetails {
  @scala.inline
  def apply(): PolicyLengthExceededExceptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicyLengthExceededExceptionDetails]
  }
  @scala.inline
  implicit class PolicyLengthExceededExceptionDetailsOps[Self <: PolicyLengthExceededExceptionDetails] (val x: Self) extends AnyVal {
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
    def setType(value: String): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
  }
  
}

