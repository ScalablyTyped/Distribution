package typings.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartBgpFailoverTestResponse extends js.Object {
  /**
    * Information about the virtual interface failover test.
    */
  var virtualInterfaceTest: js.UndefOr[VirtualInterfaceTestHistory] = js.native
}

object StartBgpFailoverTestResponse {
  @scala.inline
  def apply(virtualInterfaceTest: VirtualInterfaceTestHistory = null): StartBgpFailoverTestResponse = {
    val __obj = js.Dynamic.literal()
    if (virtualInterfaceTest != null) __obj.updateDynamic("virtualInterfaceTest")(virtualInterfaceTest.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartBgpFailoverTestResponse]
  }
}

