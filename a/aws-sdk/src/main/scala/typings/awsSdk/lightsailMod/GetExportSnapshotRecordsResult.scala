package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetExportSnapshotRecordsResult extends js.Object {
  /**
    * A list of objects describing the export snapshot records.
    */
  var exportSnapshotRecords: js.UndefOr[ExportSnapshotRecordList] = js.native
  /**
    * The token to advance to the next page of resutls from your request. A next page token is not returned if there are no more results to display. To get the next page of results, perform another GetExportSnapshotRecords request and specify the next page token using the pageToken parameter.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object GetExportSnapshotRecordsResult {
  @scala.inline
  def apply(exportSnapshotRecords: ExportSnapshotRecordList = null, nextPageToken: String = null): GetExportSnapshotRecordsResult = {
    val __obj = js.Dynamic.literal()
    if (exportSnapshotRecords != null) __obj.updateDynamic("exportSnapshotRecords")(exportSnapshotRecords.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetExportSnapshotRecordsResult]
  }
}

