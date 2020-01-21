package typings.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateCapacityProviderResponse extends js.Object {
  /**
    * The full description of the new capacity provider.
    */
  var capacityProvider: js.UndefOr[CapacityProvider] = js.native
}

object CreateCapacityProviderResponse {
  @scala.inline
  def apply(capacityProvider: CapacityProvider = null): CreateCapacityProviderResponse = {
    val __obj = js.Dynamic.literal()
    if (capacityProvider != null) __obj.updateDynamic("capacityProvider")(capacityProvider.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCapacityProviderResponse]
  }
}

