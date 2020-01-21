package typings.awsSdk.ecrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAuthorizationTokenRequest extends js.Object {
  /**
    * A list of AWS account IDs that are associated with the registries for which to get authorization tokens. If you do not specify a registry, the default registry is assumed.
    */
  var registryIds: js.UndefOr[GetAuthorizationTokenRegistryIdList] = js.native
}

object GetAuthorizationTokenRequest {
  @scala.inline
  def apply(registryIds: GetAuthorizationTokenRegistryIdList = null): GetAuthorizationTokenRequest = {
    val __obj = js.Dynamic.literal()
    if (registryIds != null) __obj.updateDynamic("registryIds")(registryIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAuthorizationTokenRequest]
  }
}

