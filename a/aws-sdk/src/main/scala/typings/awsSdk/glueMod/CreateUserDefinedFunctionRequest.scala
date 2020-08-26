package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateUserDefinedFunctionRequest extends js.Object {
  /**
    * The ID of the Data Catalog in which to create the function. If none is provided, the AWS account ID is used by default.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.native
  /**
    * The name of the catalog database in which to create the function.
    */
  var DatabaseName: NameString = js.native
  /**
    * A FunctionInput object that defines the function to create in the Data Catalog.
    */
  var FunctionInput: UserDefinedFunctionInput = js.native
}

object CreateUserDefinedFunctionRequest {
  @scala.inline
  def apply(DatabaseName: NameString, FunctionInput: UserDefinedFunctionInput): CreateUserDefinedFunctionRequest = {
    val __obj = js.Dynamic.literal(DatabaseName = DatabaseName.asInstanceOf[js.Any], FunctionInput = FunctionInput.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateUserDefinedFunctionRequest]
  }
  @scala.inline
  implicit class CreateUserDefinedFunctionRequestOps[Self <: CreateUserDefinedFunctionRequest] (val x: Self) extends AnyVal {
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
    def setFunctionInput(value: UserDefinedFunctionInput): Self = this.set("FunctionInput", value.asInstanceOf[js.Any])
    @scala.inline
    def setCatalogId(value: CatalogIdString): Self = this.set("CatalogId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCatalogId: Self = this.set("CatalogId", js.undefined)
  }
  
}

