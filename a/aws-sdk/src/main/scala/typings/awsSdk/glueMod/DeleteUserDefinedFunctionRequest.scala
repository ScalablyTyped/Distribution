package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteUserDefinedFunctionRequest extends js.Object {
  /**
    * The ID of the Data Catalog where the function to be deleted is located. If none is supplied, the AWS account ID is used by default.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.native
  /**
    * The name of the catalog database where the function is located.
    */
  var DatabaseName: NameString = js.native
  /**
    * The name of the function definition to be deleted.
    */
  var FunctionName: NameString = js.native
}

object DeleteUserDefinedFunctionRequest {
  @scala.inline
  def apply(DatabaseName: NameString, FunctionName: NameString): DeleteUserDefinedFunctionRequest = {
    val __obj = js.Dynamic.literal(DatabaseName = DatabaseName.asInstanceOf[js.Any], FunctionName = FunctionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteUserDefinedFunctionRequest]
  }
  @scala.inline
  implicit class DeleteUserDefinedFunctionRequestOps[Self <: DeleteUserDefinedFunctionRequest] (val x: Self) extends AnyVal {
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
    def setDatabaseName(value: NameString): Self = this.set("DatabaseName", value.asInstanceOf[js.Any])
    @scala.inline
    def setFunctionName(value: NameString): Self = this.set("FunctionName", value.asInstanceOf[js.Any])
    @scala.inline
    def setCatalogId(value: CatalogIdString): Self = this.set("CatalogId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCatalogId: Self = this.set("CatalogId", js.undefined)
  }
  
}

