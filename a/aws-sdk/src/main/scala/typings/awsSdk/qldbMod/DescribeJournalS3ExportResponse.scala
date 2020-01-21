package typings.awsSdk.qldbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeJournalS3ExportResponse extends js.Object {
  /**
    * Information about the journal export job returned by a DescribeJournalS3Export request.
    */
  var ExportDescription: JournalS3ExportDescription = js.native
}

object DescribeJournalS3ExportResponse {
  @scala.inline
  def apply(ExportDescription: JournalS3ExportDescription): DescribeJournalS3ExportResponse = {
    val __obj = js.Dynamic.literal(ExportDescription = ExportDescription.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeJournalS3ExportResponse]
  }
}

