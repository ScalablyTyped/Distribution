package typings.awsSdk.iotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateSystemTemplateResponse extends js.Object {
  /**
    * An object containing summary information about the updated system.
    */
  var summary: js.UndefOr[SystemTemplateSummary] = js.native
}

object UpdateSystemTemplateResponse {
  @scala.inline
  def apply(): UpdateSystemTemplateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateSystemTemplateResponse]
  }
  @scala.inline
  implicit class UpdateSystemTemplateResponseOps[Self <: UpdateSystemTemplateResponse] (val x: Self) extends AnyVal {
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
    def setSummary(value: SystemTemplateSummary): Self = this.set("summary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSummary: Self = this.set("summary", js.undefined)
  }
  
}

