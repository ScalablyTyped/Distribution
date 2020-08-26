package typings.awsSdkClientCognitoIdentityBrowser.typesLimitExceededExceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LimitExceededExceptionDetails extends js.Object {
  /**
    * <p>The message returned by a LimitExceededException.</p>
    */
  var message: js.UndefOr[String] = js.native
}

object LimitExceededExceptionDetails {
  @scala.inline
  def apply(): LimitExceededExceptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LimitExceededExceptionDetails]
  }
  @scala.inline
  implicit class LimitExceededExceptionDetailsOps[Self <: LimitExceededExceptionDetails] (val x: Self) extends AnyVal {
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
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
  }
  
}

