package typings.awsSdk.schemasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDiscovererRequest extends js.Object {
  /**
    * The description of the discoverer to update.
    */
  var Description: js.UndefOr[stringMin0Max256] = js.native
  /**
    * The ID of the discoverer.
    */
  var DiscovererId: string = js.native
}

object UpdateDiscovererRequest {
  @scala.inline
  def apply(DiscovererId: string, Description: stringMin0Max256 = null): UpdateDiscovererRequest = {
    val __obj = js.Dynamic.literal(DiscovererId = DiscovererId.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDiscovererRequest]
  }
}

