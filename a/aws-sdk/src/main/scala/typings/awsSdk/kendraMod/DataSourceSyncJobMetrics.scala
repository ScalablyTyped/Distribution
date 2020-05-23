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
  def apply(
    DocumentsAdded: MetricValue = null,
    DocumentsDeleted: MetricValue = null,
    DocumentsFailed: MetricValue = null,
    DocumentsModified: MetricValue = null,
    DocumentsScanned: MetricValue = null
  ): DataSourceSyncJobMetrics = {
    val __obj = js.Dynamic.literal()
    if (DocumentsAdded != null) __obj.updateDynamic("DocumentsAdded")(DocumentsAdded.asInstanceOf[js.Any])
    if (DocumentsDeleted != null) __obj.updateDynamic("DocumentsDeleted")(DocumentsDeleted.asInstanceOf[js.Any])
    if (DocumentsFailed != null) __obj.updateDynamic("DocumentsFailed")(DocumentsFailed.asInstanceOf[js.Any])
    if (DocumentsModified != null) __obj.updateDynamic("DocumentsModified")(DocumentsModified.asInstanceOf[js.Any])
    if (DocumentsScanned != null) __obj.updateDynamic("DocumentsScanned")(DocumentsScanned.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSourceSyncJobMetrics]
  }
}

