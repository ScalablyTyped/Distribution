package typings.awsSdk.iotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateFlowTemplateResponse extends js.Object {
  /**
    * The summary object that describes the created workflow.
    */
  var summary: js.UndefOr[FlowTemplateSummary] = js.native
}

object CreateFlowTemplateResponse {
  @scala.inline
  def apply(): CreateFlowTemplateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateFlowTemplateResponse]
  }
  @scala.inline
  implicit class CreateFlowTemplateResponseOps[Self <: CreateFlowTemplateResponse] (val x: Self) extends AnyVal {
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
    def setSummary(value: FlowTemplateSummary): Self = this.set("summary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSummary: Self = this.set("summary", js.undefined)
  }
  
}

