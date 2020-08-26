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
  @scala.inline
  implicit class DataSourceSyncJobMetricTargetOps[Self <: DataSourceSyncJobMetricTarget] (val x: Self) extends AnyVal {
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
    def setDataSourceId(value: DataSourceId): Self = this.set("DataSourceId", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataSourceSyncJobId(value: DataSourceSyncJobId): Self = this.set("DataSourceSyncJobId", value.asInstanceOf[js.Any])
  }
  
}

