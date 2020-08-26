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
  def apply(): GetExportSnapshotRecordsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetExportSnapshotRecordsResult]
  }
  @scala.inline
  implicit class GetExportSnapshotRecordsResultOps[Self <: GetExportSnapshotRecordsResult] (val x: Self) extends AnyVal {
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
    def setExportSnapshotRecordsVarargs(value: ExportSnapshotRecord*): Self = this.set("exportSnapshotRecords", js.Array(value :_*))
    @scala.inline
    def setExportSnapshotRecords(value: ExportSnapshotRecordList): Self = this.set("exportSnapshotRecords", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExportSnapshotRecords: Self = this.set("exportSnapshotRecords", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
  
}

