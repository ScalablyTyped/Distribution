package typings.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchDeleteDocumentRequest extends js.Object {
  var DataSourceSyncJobMetricTarget: js.UndefOr[typings.awsSdk.kendraMod.DataSourceSyncJobMetricTarget] = js.native
  /**
    * One or more identifiers for documents to delete from the index.
    */
  var DocumentIdList: typings.awsSdk.kendraMod.DocumentIdList = js.native
  /**
    * The identifier of the index that contains the documents to delete.
    */
  var IndexId: typings.awsSdk.kendraMod.IndexId = js.native
}

object BatchDeleteDocumentRequest {
  @scala.inline
  def apply(DocumentIdList: DocumentIdList, IndexId: IndexId): BatchDeleteDocumentRequest = {
    val __obj = js.Dynamic.literal(DocumentIdList = DocumentIdList.asInstanceOf[js.Any], IndexId = IndexId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDeleteDocumentRequest]
  }
  @scala.inline
  implicit class BatchDeleteDocumentRequestOps[Self <: BatchDeleteDocumentRequest] (val x: Self) extends AnyVal {
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
    def setDocumentIdListVarargs(value: DocumentId*): Self = this.set("DocumentIdList", js.Array(value :_*))
    @scala.inline
    def setDocumentIdList(value: DocumentIdList): Self = this.set("DocumentIdList", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndexId(value: IndexId): Self = this.set("IndexId", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataSourceSyncJobMetricTarget(value: DataSourceSyncJobMetricTarget): Self = this.set("DataSourceSyncJobMetricTarget", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataSourceSyncJobMetricTarget: Self = this.set("DataSourceSyncJobMetricTarget", js.undefined)
  }
  
}

