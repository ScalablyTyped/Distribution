package typings.awsSdk.schemasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteDiscovererRequest extends js.Object {
  var DiscovererId: string = js.native
}

object DeleteDiscovererRequest {
  @scala.inline
  def apply(DiscovererId: string): DeleteDiscovererRequest = {
    val __obj = js.Dynamic.literal(DiscovererId = DiscovererId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteDiscovererRequest]
  }
}

