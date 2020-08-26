package typings.awsSdk.qldbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportJournalToS3Response extends js.Object {
  /**
    * The unique ID that QLDB assigns to each journal export job. To describe your export request and check the status of the job, you can use ExportId to call DescribeJournalS3Export.
    */
  var ExportId: UniqueId = js.native
}

object ExportJournalToS3Response {
  @scala.inline
  def apply(ExportId: UniqueId): ExportJournalToS3Response = {
    val __obj = js.Dynamic.literal(ExportId = ExportId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportJournalToS3Response]
  }
  @scala.inline
  implicit class ExportJournalToS3ResponseOps[Self <: ExportJournalToS3Response] (val x: Self) extends AnyVal {
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
    def setExportId(value: UniqueId): Self = this.set("ExportId", value.asInstanceOf[js.Any])
  }
  
}

