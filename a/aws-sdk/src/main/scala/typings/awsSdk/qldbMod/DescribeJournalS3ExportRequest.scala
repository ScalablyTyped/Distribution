package typings.awsSdk.qldbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeJournalS3ExportRequest extends StObject {
  
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
  implicit class DescribeJournalS3ExportRequestMutableBuilder[Self <: DescribeJournalS3ExportRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExportId(value: UniqueId): Self = StObject.set(x, "ExportId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: LedgerName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
