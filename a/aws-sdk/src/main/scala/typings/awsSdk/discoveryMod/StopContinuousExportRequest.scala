package typings.awsSdk.discoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopContinuousExportRequest extends js.Object {
  /**
    * The unique ID assigned to this export.
    */
  var exportId: ConfigurationsExportId = js.native
}

object StopContinuousExportRequest {
  @scala.inline
  def apply(exportId: ConfigurationsExportId): StopContinuousExportRequest = {
    val __obj = js.Dynamic.literal(exportId = exportId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopContinuousExportRequest]
  }
  @scala.inline
  implicit class StopContinuousExportRequestOps[Self <: StopContinuousExportRequest] (val x: Self) extends AnyVal {
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
  }
  
}

