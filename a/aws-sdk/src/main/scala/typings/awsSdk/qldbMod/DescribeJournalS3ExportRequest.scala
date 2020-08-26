package typings.awsSdk.qldbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeJournalS3ExportRequest extends js.Object {
  /**
    * The unique ID of the journal export job that you want to describe.
    */
  var ExportId: UniqueId = js.native
  /**
    * The name of the ledger.
    */
  var Name: LedgerName = js.native
}

object DescribeJournalS3ExportRequest {
  @scala.inline
  def apply(ExportId: UniqueId, Name: LedgerName): DescribeJournalS3ExportRequest = {
    val __obj = js.Dynamic.literal(ExportId = ExportId.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeJournalS3ExportRequest]
  }
  @scala.inline
  implicit class DescribeJournalS3ExportRequestOps[Self <: DescribeJournalS3ExportRequest] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setName(value: LedgerName): Self = this.set("Name", value.asInstanceOf[js.Any])
  }
  
}

