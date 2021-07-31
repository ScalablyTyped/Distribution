package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetExportSnapshotRecordsResult extends StObject {
  
  /**
    * A list of objects describing the export snapshot records.
    */
  var exportSnapshotRecords: js.UndefOr[ExportSnapshotRecordList] = js.undefined
  
  /**
    * The token to advance to the next page of results from your request. A next page token is not returned if there are no more results to display. To get the next page of results, perform another GetExportSnapshotRecords request and specify the next page token using the pageToken parameter.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object GetExportSnapshotRecordsResult {
  
  @scala.inline
  def apply(): GetExportSnapshotRecordsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetExportSnapshotRecordsResult]
  }
  
  @scala.inline
  implicit class GetExportSnapshotRecordsResultMutableBuilder[Self <: GetExportSnapshotRecordsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExportSnapshotRecords(value: ExportSnapshotRecordList): Self = StObject.set(x, "exportSnapshotRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportSnapshotRecordsUndefined: Self = StObject.set(x, "exportSnapshotRecords", js.undefined)
    
    @scala.inline
    def setExportSnapshotRecordsVarargs(value: ExportSnapshotRecord*): Self = StObject.set(x, "exportSnapshotRecords", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
