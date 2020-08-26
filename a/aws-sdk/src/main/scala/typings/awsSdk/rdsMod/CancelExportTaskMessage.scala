package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelExportTaskMessage extends js.Object {
  /**
    * The identifier of the snapshot export task to cancel.
    */
  var ExportTaskIdentifier: String = js.native
}

object CancelExportTaskMessage {
  @scala.inline
  def apply(ExportTaskIdentifier: String): CancelExportTaskMessage = {
    val __obj = js.Dynamic.literal(ExportTaskIdentifier = ExportTaskIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelExportTaskMessage]
  }
  @scala.inline
  implicit class CancelExportTaskMessageOps[Self <: CancelExportTaskMessage] (val x: Self) extends AnyVal {
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
    def setExportTaskIdentifier(value: String): Self = this.set("ExportTaskIdentifier", value.asInstanceOf[js.Any])
  }
  
}

