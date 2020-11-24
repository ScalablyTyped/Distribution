package typings.awsSdk.qldbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  @scala.inline
  implicit class DescribeJournalS3ExportResponseOps[Self <: DescribeJournalS3ExportResponse] (val x: Self) extends AnyVal {
    
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
    def setExportDescription(value: JournalS3ExportDescription): Self = this.set("ExportDescription", value.asInstanceOf[js.Any])
  }
}
