package typings.awsSdk.cognitosyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListRecordsResponse extends js.Object {
  /**
    * Total number of records.
    */
  var Count: js.UndefOr[Integer] = js.native
  /**
    * A boolean value specifying whether to delete the dataset locally.
    */
  var DatasetDeletedAfterRequestedSyncCount: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether the dataset exists.
    */
  var DatasetExists: js.UndefOr[Boolean] = js.native
  /**
    * Server sync count for this dataset.
    */
  var DatasetSyncCount: js.UndefOr[Long] = js.native
  /**
    * The user/device that made the last change to this record.
    */
  var LastModifiedBy: js.UndefOr[String] = js.native
  /**
    * Names of merged datasets.
    */
  var MergedDatasetNames: js.UndefOr[MergedDatasetNameList] = js.native
  /**
    * A pagination token for obtaining the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * A list of all records.
    */
  var Records: js.UndefOr[RecordList] = js.native
  /**
    * A token containing a session ID, identity ID, and expiration.
    */
  var SyncSessionToken: js.UndefOr[String] = js.native
}

object ListRecordsResponse {
  @scala.inline
  def apply(): ListRecordsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRecordsResponse]
  }
  @scala.inline
  implicit class ListRecordsResponseOps[Self <: ListRecordsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCount(value: Integer): Self = this.set("Count", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCount: Self = this.set("Count", js.undefined)
    @scala.inline
    def setDatasetDeletedAfterRequestedSyncCount(value: Boolean): Self = this.set("DatasetDeletedAfterRequestedSyncCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatasetDeletedAfterRequestedSyncCount: Self = this.set("DatasetDeletedAfterRequestedSyncCount", js.undefined)
    @scala.inline
    def setDatasetExists(value: Boolean): Self = this.set("DatasetExists", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatasetExists: Self = this.set("DatasetExists", js.undefined)
    @scala.inline
    def setDatasetSyncCount(value: Long): Self = this.set("DatasetSyncCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatasetSyncCount: Self = this.set("DatasetSyncCount", js.undefined)
    @scala.inline
    def setLastModifiedBy(value: String): Self = this.set("LastModifiedBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModifiedBy: Self = this.set("LastModifiedBy", js.undefined)
    @scala.inline
    def setMergedDatasetNamesVarargs(value: String*): Self = this.set("MergedDatasetNames", js.Array(value :_*))
    @scala.inline
    def setMergedDatasetNames(value: MergedDatasetNameList): Self = this.set("MergedDatasetNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMergedDatasetNames: Self = this.set("MergedDatasetNames", js.undefined)
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setRecordsVarargs(value: Record*): Self = this.set("Records", js.Array(value :_*))
    @scala.inline
    def setRecords(value: RecordList): Self = this.set("Records", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecords: Self = this.set("Records", js.undefined)
    @scala.inline
    def setSyncSessionToken(value: String): Self = this.set("SyncSessionToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSyncSessionToken: Self = this.set("SyncSessionToken", js.undefined)
  }
  
}

