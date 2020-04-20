package typings.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeConnectionsOnInterconnectRequest extends js.Object {
  /**
    * The ID of the interconnect.
    */
  var interconnectId: InterconnectId = js.native
}

object DescribeConnectionsOnInterconnectRequest {
  @scala.inline
  def apply(interconnectId: InterconnectId): DescribeConnectionsOnInterconnectRequest = {
    val __obj = js.Dynamic.literal(interconnectId = interconnectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeConnectionsOnInterconnectRequest]
  }
}

