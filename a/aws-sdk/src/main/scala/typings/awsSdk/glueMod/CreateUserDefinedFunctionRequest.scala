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
  def apply(
    DatabaseName: NameString,
    FunctionInput: UserDefinedFunctionInput,
    CatalogId: CatalogIdString = null
  ): CreateUserDefinedFunctionRequest = {
    val __obj = js.Dynamic.literal(DatabaseName = DatabaseName.asInstanceOf[js.Any], FunctionInput = FunctionInput.asInstanceOf[js.Any])
    if (CatalogId != null) __obj.updateDynamic("CatalogId")(CatalogId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateUserDefinedFunctionRequest]
  }
}

