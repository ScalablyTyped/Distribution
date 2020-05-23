package typings.awsSdk.schemasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListRegistriesRequest extends js.Object {
  var Limit: js.UndefOr[integer] = js.native
  /**
    * The token that specifies the next page of results to return. To request the first page, leave NextToken empty. The token will expire in 24 hours, and cannot be shared with other accounts.
    */
  var NextToken: js.UndefOr[string] = js.native
  /**
    * Specifying this limits the results to only those registry names that start with the specified prefix.
    */
  var RegistryNamePrefix: js.UndefOr[string] = js.native
  /**
    * Can be set to Local or AWS to limit responses to your custom registries, or the ones provided by AWS.
    */
  var Scope: js.UndefOr[string] = js.native
}

object ListRegistriesRequest {
  @scala.inline
  def apply(
    Limit: js.UndefOr[integer] = js.undefined,
    NextToken: string = null,
    RegistryNamePrefix: string = null,
    Scope: string = null
  ): ListRegistriesRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Limit)) __obj.updateDynamic("Limit")(Limit.get.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (RegistryNamePrefix != null) __obj.updateDynamic("RegistryNamePrefix")(RegistryNamePrefix.asInstanceOf[js.Any])
    if (Scope != null) __obj.updateDynamic("Scope")(Scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListRegistriesRequest]
  }
}

