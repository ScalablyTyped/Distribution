package typings.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartDataSourceSyncJobRequest extends js.Object {
  /**
    * The identifier of the data source to synchronize.
    */
  var Id: DataSourceId = js.native
  /**
    * The identifier of the index that contains the data source.
    */
  var IndexId: typings.awsSdk.kendraMod.IndexId = js.native
}

object StartDataSourceSyncJobRequest {
  @scala.inline
  def apply(Id: DataSourceId, IndexId: IndexId): StartDataSourceSyncJobRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], IndexId = IndexId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StartDataSourceSyncJobRequest]
  }
}

