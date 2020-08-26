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
  def apply(ConnectionInput: ConnectionInput, Name: NameString): UpdateConnectionRequest = {
    val __obj = js.Dynamic.literal(ConnectionInput = ConnectionInput.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateConnectionRequest]
  }
  @scala.inline
  implicit class UpdateConnectionRequestOps[Self <: UpdateConnectionRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setConnectionInput(value: ConnectionInput): Self = this.set("ConnectionInput", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: NameString): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setCatalogId(value: CatalogIdString): Self = this.set("CatalogId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCatalogId: Self = this.set("CatalogId", js.undefined)
  }
  
}

