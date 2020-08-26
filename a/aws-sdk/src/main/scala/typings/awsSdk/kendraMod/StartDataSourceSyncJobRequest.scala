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
  @scala.inline
  implicit class StartDataSourceSyncJobRequestOps[Self <: StartDataSourceSyncJobRequest] (val x: Self) extends AnyVal {
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
    def setId(value: DataSourceId): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndexId(value: IndexId): Self = this.set("IndexId", value.asInstanceOf[js.Any])
  }
  
}

