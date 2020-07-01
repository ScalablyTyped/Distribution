package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetUserDefinedFunctionsRequest extends js.Object {
  /**
    * The ID of the Data Catalog where the functions to be retrieved are located. If none is provided, the AWS account ID is used by default.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.native
  /**
    * The name of the catalog database where the functions are located. If none is provided, functions from all the databases across the catalog will be returned.
    */
  var DatabaseName: js.UndefOr[NameString] = js.native
  /**
    * The maximum number of functions to return in one response.
    */
  var MaxResults: js.UndefOr[PageSize] = js.native
  /**
    * A continuation token, if this is a continuation call.
    */
  var NextToken: js.UndefOr[Token] = js.native
  /**
    * An optional function-name pattern string that filters the function definitions returned.
    */
  var Pattern: NameString = js.native
}

object GetUserDefinedFunctionsRequest {
  @scala.inline
  def apply(
    Pattern: NameString,
    CatalogId: CatalogIdString = null,
    DatabaseName: NameString = null,
    MaxResults: js.UndefOr[PageSize] = js.undefined,
    NextToken: Token = null
  ): GetUserDefinedFunctionsRequest = {
    val __obj = js.Dynamic.literal(Pattern = Pattern.asInstanceOf[js.Any])
    if (CatalogId != null) __obj.updateDynamic("CatalogId")(CatalogId.asInstanceOf[js.Any])
    if (DatabaseName != null) __obj.updateDynamic("DatabaseName")(DatabaseName.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults.get.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetUserDefinedFunctionsRequest]
  }
}

