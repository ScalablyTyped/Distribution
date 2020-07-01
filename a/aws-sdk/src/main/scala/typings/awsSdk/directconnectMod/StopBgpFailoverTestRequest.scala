package typings.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopBgpFailoverTestRequest extends js.Object {
  /**
    * The ID of the virtual interface you no longer want to test.
    */
  var virtualInterfaceId: VirtualInterfaceId = js.native
}

object StopBgpFailoverTestRequest {
  @scala.inline
  def apply(virtualInterfaceId: VirtualInterfaceId): StopBgpFailoverTestRequest = {
    val __obj = js.Dynamic.literal(virtualInterfaceId = virtualInterfaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopBgpFailoverTestRequest]
  }
}

