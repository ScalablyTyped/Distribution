package typings.awsSdk.qldbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportJournalToS3Response extends StObject {
  
  /**
    * The unique ID that QLDB assigns to each journal export job. To describe your export request and check the status of the job, you can use ExportId to call DescribeJournalS3Export.
    */
  var ExportId: UniqueId
}
object ExportJournalToS3Response {
  
  inline def apply(ExportId: UniqueId): ExportJournalToS3Response = {
    val __obj = js.Dynamic.literal(ExportId = ExportId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportJournalToS3Response]
  }
  
  extension [Self <: ExportJournalToS3Response](x: Self) {
    
    inline def setExportId(value: UniqueId): Self = StObject.set(x, "ExportId", value.asInstanceOf[js.Any])
  }
}
