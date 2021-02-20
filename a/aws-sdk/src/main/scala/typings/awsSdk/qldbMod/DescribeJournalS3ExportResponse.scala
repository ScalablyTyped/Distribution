package typings.awsSdk.qldbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeJournalS3ExportResponse extends StObject {
  
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
  implicit class DescribeJournalS3ExportResponseMutableBuilder[Self <: DescribeJournalS3ExportResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExportDescription(value: JournalS3ExportDescription): Self = StObject.set(x, "ExportDescription", value.asInstanceOf[js.Any])
  }
}
