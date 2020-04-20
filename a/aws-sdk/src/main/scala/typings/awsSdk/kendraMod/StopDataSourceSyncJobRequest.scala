package typings.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopDataSourceSyncJobRequest extends js.Object {
  /**
    * The identifier of the data source for which to stop the synchronization jobs.
    */
  var Id: DataSourceId = js.native
  /**
    * The identifier of the index that contains the data source.
    */
  var IndexId: typings.awsSdk.kendraMod.IndexId = js.native
}

object StopDataSourceSyncJobRequest {
  @scala.inline
  def apply(Id: DataSourceId, IndexId: IndexId): StopDataSourceSyncJobRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], IndexId = IndexId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopDataSourceSyncJobRequest]
  }
}

