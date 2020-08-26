package typings.awsSdkBuildTypes.apiModelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Error extends js.Object {
  var code: js.UndefOr[java.lang.String] = js.native
  var httpStatusCode: js.UndefOr[scala.Double] = js.native
  var senderFault: js.UndefOr[scala.Boolean] = js.native
}

object Error {
  @scala.inline
  def apply(): Error = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Error]
  }
  @scala.inline
  implicit class ErrorOps[Self <: Error] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCode(value: java.lang.String): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
    @scala.inline
    def setHttpStatusCode(value: scala.Double): Self = this.set("httpStatusCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHttpStatusCode: Self = this.set("httpStatusCode", js.undefined)
    @scala.inline
    def setSenderFault(value: scala.Boolean): Self = this.set("senderFault", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSenderFault: Self = this.set("senderFault", js.undefined)
  }
  
}

