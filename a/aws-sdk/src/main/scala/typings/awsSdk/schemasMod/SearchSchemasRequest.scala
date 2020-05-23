package typings.awsSdk.schemasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchSchemasRequest extends js.Object {
  /**
    * Specifying this limits the results to only schemas that include the provided keywords.
    */
  var Keywords: string = js.native
  var Limit: js.UndefOr[integer] = js.native
  /**
    * The token that specifies the next page of results to return. To request the first page, leave NextToken empty. The token will expire in 24 hours, and cannot be shared with other accounts.
    */
  var NextToken: js.UndefOr[string] = js.native
  /**
    * The name of the registry.
    */
  var RegistryName: string = js.native
}

object SearchSchemasRequest {
  @scala.inline
  def apply(
    Keywords: string,
    RegistryName: string,
    Limit: js.UndefOr[integer] = js.undefined,
    NextToken: string = null
  ): SearchSchemasRequest = {
    val __obj = js.Dynamic.literal(Keywords = Keywords.asInstanceOf[js.Any], RegistryName = RegistryName.asInstanceOf[js.Any])
    if (!js.isUndefined(Limit)) __obj.updateDynamic("Limit")(Limit.get.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchSchemasRequest]
  }
}

