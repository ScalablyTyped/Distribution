package typings.awsSdk.curMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteReportDefinitionResponse extends js.Object {
  var ResponseMessage: js.UndefOr[DeleteResponseMessage] = js.native
}

object DeleteReportDefinitionResponse {
  @scala.inline
  def apply(): DeleteReportDefinitionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteReportDefinitionResponse]
  }
  @scala.inline
  implicit class DeleteReportDefinitionResponseOps[Self <: DeleteReportDefinitionResponse] (val x: Self) extends AnyVal {
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
    def setResponseMessage(value: DeleteResponseMessage): Self = this.set("ResponseMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponseMessage: Self = this.set("ResponseMessage", js.undefined)
  }
  
}

