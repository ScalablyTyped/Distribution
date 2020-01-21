package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateConnectionRequest extends js.Object {
  /**
    * The ID of the Data Catalog in which the connection resides. If none is provided, the AWS account ID is used by default.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.native
  /**
    * A ConnectionInput object that redefines the connection in question.
    */
  var ConnectionInput: typings.awsSdk.glueMod.ConnectionInput = js.native
  /**
    * The name of the connection definition to update.
    */
  var Name: NameString = js.native
}

object UpdateConnectionRequest {
  @scala.inline
  def apply(ConnectionInput: ConnectionInput, Name: NameString, CatalogId: CatalogIdString = null): UpdateConnectionRequest = {
    val __obj = js.Dynamic.literal(ConnectionInput = ConnectionInput.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    if (CatalogId != null) __obj.updateDynamic("CatalogId")(CatalogId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateConnectionRequest]
  }
}

