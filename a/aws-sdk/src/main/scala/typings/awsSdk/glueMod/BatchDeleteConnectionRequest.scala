package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchDeleteConnectionRequest extends js.Object {
  /**
    * The ID of the Data Catalog in which the connections reside. If none is provided, the AWS account ID is used by default.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.native
  /**
    * A list of names of the connections to delete.
    */
  var ConnectionNameList: DeleteConnectionNameList = js.native
}

object BatchDeleteConnectionRequest {
  @scala.inline
  def apply(ConnectionNameList: DeleteConnectionNameList, CatalogId: CatalogIdString = null): BatchDeleteConnectionRequest = {
    val __obj = js.Dynamic.literal(ConnectionNameList = ConnectionNameList.asInstanceOf[js.Any])
    if (CatalogId != null) __obj.updateDynamic("CatalogId")(CatalogId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDeleteConnectionRequest]
  }
}

