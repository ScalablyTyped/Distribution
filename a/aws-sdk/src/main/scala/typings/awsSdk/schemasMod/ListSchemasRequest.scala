package typings.awsSdk.schemasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListSchemasRequest extends js.Object {
  var Limit: js.UndefOr[integer] = js.native
  /**
    * The token that specifies the next page of results to return. To request the first page, leave NextToken empty. The token will expire in 24 hours, and cannot be shared with other accounts.
    */
  var NextToken: js.UndefOr[string] = js.native
  /**
    * The name of the registry.
    */
  var RegistryName: string = js.native
  /**
    * Specifying this limits the results to only those schema names that start with the specified prefix.
    */
  var SchemaNamePrefix: js.UndefOr[string] = js.native
}

object ListSchemasRequest {
  @scala.inline
  def apply(
    RegistryName: string,
    Limit: js.UndefOr[integer] = js.undefined,
    NextToken: string = null,
    SchemaNamePrefix: string = null
  ): ListSchemasRequest = {
    val __obj = js.Dynamic.literal(RegistryName = RegistryName.asInstanceOf[js.Any])
    if (!js.isUndefined(Limit)) __obj.updateDynamic("Limit")(Limit.get.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (SchemaNamePrefix != null) __obj.updateDynamic("SchemaNamePrefix")(SchemaNamePrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSchemasRequest]
  }
}

