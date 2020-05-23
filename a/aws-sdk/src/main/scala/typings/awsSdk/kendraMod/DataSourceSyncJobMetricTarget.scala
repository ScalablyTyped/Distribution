package typings.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSourceSyncJobMetricTarget extends js.Object {
  /**
    * The ID of the data source that is running the sync job.
    */
  var DataSourceId: typings.awsSdk.kendraMod.DataSourceId = js.native
  /**
    * The ID of the sync job that is running on the data source.
    */
  var DataSourceSyncJobId: typings.awsSdk.kendraMod.DataSourceSyncJobId = js.native
}

object DataSourceSyncJobMetricTarget {
  @scala.inline
  def apply(DataSourceId: DataSourceId, DataSourceSyncJobId: DataSourceSyncJobId): DataSourceSyncJobMetricTarget = {
    val __obj = js.Dynamic.literal(DataSourceId = DataSourceId.asInstanceOf[js.Any], DataSourceSyncJobId = DataSourceSyncJobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSourceSyncJobMetricTarget]
  }
}

