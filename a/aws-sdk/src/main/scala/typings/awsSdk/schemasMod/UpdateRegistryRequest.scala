package typings.awsSdk.schemasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateRegistryRequest extends js.Object {
  /**
    * The description of the registry to update.
    */
  var Description: js.UndefOr[stringMin0Max256] = js.native
  /**
    * The name of the registry.
    */
  var RegistryName: string = js.native
}

object UpdateRegistryRequest {
  @scala.inline
  def apply(RegistryName: string, Description: stringMin0Max256 = null): UpdateRegistryRequest = {
    val __obj = js.Dynamic.literal(RegistryName = RegistryName.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRegistryRequest]
  }
}

