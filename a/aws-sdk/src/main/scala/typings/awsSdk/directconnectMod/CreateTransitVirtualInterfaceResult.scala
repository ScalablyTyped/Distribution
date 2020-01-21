package typings.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateTransitVirtualInterfaceResult extends js.Object {
  var virtualInterface: js.UndefOr[VirtualInterface] = js.native
}

object CreateTransitVirtualInterfaceResult {
  @scala.inline
  def apply(virtualInterface: VirtualInterface = null): CreateTransitVirtualInterfaceResult = {
    val __obj = js.Dynamic.literal()
    if (virtualInterface != null) __obj.updateDynamic("virtualInterface")(virtualInterface.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTransitVirtualInterfaceResult]
  }
}

