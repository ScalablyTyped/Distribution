package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateConnectionRequest extends js.Object {
  /**
    * The ID of the Data Catalog in which to create the connection. If none is provided, the AWS account ID is used by default.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.native
  /**
    * A ConnectionInput object defining the connection to create.
    */
  var ConnectionInput: typings.awsSdk.glueMod.ConnectionInput = js.native
}

object CreateConnectionRequest {
  @scala.inline
  def apply(ConnectionInput: ConnectionInput): CreateConnectionRequest = {
    val __obj = js.Dynamic.literal(ConnectionInput = ConnectionInput.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateConnectionRequest]
  }
  @scala.inline
  implicit class CreateConnectionRequestOps[Self <: CreateConnectionRequest] (val x: Self) extends AnyVal {
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
    def setCatalogId(value: CatalogIdString): Self = this.set("CatalogId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCatalogId: Self = this.set("CatalogId", js.undefined)
  }
  
}

