package typings.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteCapacityProviderRequest extends js.Object {
  /**
    * The short name or full Amazon Resource Name (ARN) of the capacity provider to delete.
    */
  var capacityProvider: String = js.native
}

object DeleteCapacityProviderRequest {
  @scala.inline
  def apply(capacityProvider: String): DeleteCapacityProviderRequest = {
    val __obj = js.Dynamic.literal(capacityProvider = capacityProvider.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteCapacityProviderRequest]
  }
}

