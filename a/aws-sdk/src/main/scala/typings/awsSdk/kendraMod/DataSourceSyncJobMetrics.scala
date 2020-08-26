package typings.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSourceSyncJobMetrics extends js.Object {
  /**
    * The number of documents added from the data source up to now in the data source sync.
    */
  var DocumentsAdded: js.UndefOr[MetricValue] = js.native
  /**
    * The number of documents deleted from the data source up to now in the data source sync run.
    */
  var DocumentsDeleted: js.UndefOr[MetricValue] = js.native
  /**
    * The number of documents that failed to sync from the data source up to now in the data source sync run.
    */
  var DocumentsFailed: js.UndefOr[MetricValue] = js.native
  /**
    * The number of documents modified in the data source up to now in the data source sync run.
    */
  var DocumentsModified: js.UndefOr[MetricValue] = js.native
  /**
    * The current number of documents crawled by the current sync job in the data source.
    */
  var DocumentsScanned: js.UndefOr[MetricValue] = js.native
}

object DataSourceSyncJobMetrics {
  @scala.inline
  def apply(): DataSourceSyncJobMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceSyncJobMetrics]
  }
  @scala.inline
  implicit class DataSourceSyncJobMetricsOps[Self <: DataSourceSyncJobMetrics] (val x: Self) extends AnyVal {
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
    def setDocumentsAdded(value: MetricValue): Self = this.set("DocumentsAdded", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocumentsAdded: Self = this.set("DocumentsAdded", js.undefined)
    @scala.inline
    def setDocumentsDeleted(value: MetricValue): Self = this.set("DocumentsDeleted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocumentsDeleted: Self = this.set("DocumentsDeleted", js.undefined)
    @scala.inline
    def setDocumentsFailed(value: MetricValue): Self = this.set("DocumentsFailed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocumentsFailed: Self = this.set("DocumentsFailed", js.undefined)
    @scala.inline
    def setDocumentsModified(value: MetricValue): Self = this.set("DocumentsModified", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocumentsModified: Self = this.set("DocumentsModified", js.undefined)
    @scala.inline
    def setDocumentsScanned(value: MetricValue): Self = this.set("DocumentsScanned", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocumentsScanned: Self = this.set("DocumentsScanned", js.undefined)
  }
  
}

