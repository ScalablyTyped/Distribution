package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetExportJobResponse extends js.Object {
  var ExportJobResponse: typings.awsSdk.pinpointMod.ExportJobResponse = js.native
}

object GetExportJobResponse {
  @scala.inline
  def apply(ExportJobResponse: ExportJobResponse): GetExportJobResponse = {
    val __obj = js.Dynamic.literal(ExportJobResponse = ExportJobResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetExportJobResponse]
  }
  @scala.inline
  implicit class GetExportJobResponseOps[Self <: GetExportJobResponse] (val x: Self) extends AnyVal {
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
    def setExportJobResponse(value: ExportJobResponse): Self = this.set("ExportJobResponse", value.asInstanceOf[js.Any])
  }
  
}

