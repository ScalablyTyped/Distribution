package typings.awsSdk.discoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartExportTaskResponse extends js.Object {
  /**
    * A unique identifier used to query the status of an export request.
    */
  var exportId: js.UndefOr[ConfigurationsExportId] = js.native
}

object StartExportTaskResponse {
  @scala.inline
  def apply(): StartExportTaskResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartExportTaskResponse]
  }
  @scala.inline
  implicit class StartExportTaskResponseOps[Self <: StartExportTaskResponse] (val x: Self) extends AnyVal {
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
    def setExportId(value: ConfigurationsExportId): Self = this.set("exportId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExportId: Self = this.set("exportId", js.undefined)
  }
  
}

