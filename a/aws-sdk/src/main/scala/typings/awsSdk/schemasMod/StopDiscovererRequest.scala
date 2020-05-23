package typings.awsSdk.schemasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopDiscovererRequest extends js.Object {
  /**
    * The ID of the discoverer.
    */
  var DiscovererId: string = js.native
}

object StopDiscovererRequest {
  @scala.inline
  def apply(DiscovererId: string): StopDiscovererRequest = {
    val __obj = js.Dynamic.literal(DiscovererId = DiscovererId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopDiscovererRequest]
  }
}

