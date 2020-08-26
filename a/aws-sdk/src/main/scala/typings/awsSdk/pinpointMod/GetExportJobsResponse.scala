package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetExportJobsResponse extends js.Object {
  var ExportJobsResponse: typings.awsSdk.pinpointMod.ExportJobsResponse = js.native
}

object GetExportJobsResponse {
  @scala.inline
  def apply(ExportJobsResponse: ExportJobsResponse): GetExportJobsResponse = {
    val __obj = js.Dynamic.literal(ExportJobsResponse = ExportJobsResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetExportJobsResponse]
  }
  @scala.inline
  implicit class GetExportJobsResponseOps[Self <: GetExportJobsResponse] (val x: Self) extends AnyVal {
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
    def setExportJobsResponse(value: ExportJobsResponse): Self = this.set("ExportJobsResponse", value.asInstanceOf[js.Any])
  }
  
}

