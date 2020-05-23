package typings.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteDataSourceRequest extends js.Object {
  /**
    * The unique identifier of the data source to delete.
    */
  var Id: DataSourceId = js.native
  /**
    * The unique identifier of the index associated with the data source.
    */
  var IndexId: typings.awsSdk.kendraMod.IndexId = js.native
}

object DeleteDataSourceRequest {
  @scala.inline
  def apply(Id: DataSourceId, IndexId: IndexId): DeleteDataSourceRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], IndexId = IndexId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDataSourceRequest]
  }
}

