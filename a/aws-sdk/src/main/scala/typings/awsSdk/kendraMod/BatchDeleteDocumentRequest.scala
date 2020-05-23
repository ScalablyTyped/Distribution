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
  def apply(
    DocumentIdList: DocumentIdList,
    IndexId: IndexId,
    DataSourceSyncJobMetricTarget: DataSourceSyncJobMetricTarget = null
  ): BatchDeleteDocumentRequest = {
    val __obj = js.Dynamic.literal(DocumentIdList = DocumentIdList.asInstanceOf[js.Any], IndexId = IndexId.asInstanceOf[js.Any])
    if (DataSourceSyncJobMetricTarget != null) __obj.updateDynamic("DataSourceSyncJobMetricTarget")(DataSourceSyncJobMetricTarget.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDeleteDocumentRequest]
  }
}

