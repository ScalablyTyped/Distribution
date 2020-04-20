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
}

