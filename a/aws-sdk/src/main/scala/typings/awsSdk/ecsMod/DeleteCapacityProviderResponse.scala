package typings.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteCapacityProviderResponse extends js.Object {
  var capacityProvider: js.UndefOr[CapacityProvider] = js.native
}

object DeleteCapacityProviderResponse {
  @scala.inline
  def apply(capacityProvider: CapacityProvider = null): DeleteCapacityProviderResponse = {
    val __obj = js.Dynamic.literal()
    if (capacityProvider != null) __obj.updateDynamic("capacityProvider")(capacityProvider.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteCapacityProviderResponse]
  }
}

