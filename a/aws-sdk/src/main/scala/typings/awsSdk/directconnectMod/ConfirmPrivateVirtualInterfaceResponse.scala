package typings.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfirmPrivateVirtualInterfaceResponse extends js.Object {
  /**
    * The state of the virtual interface. The following are the possible values:    confirming: The creation of the virtual interface is pending confirmation from the virtual interface owner. If the owner of the virtual interface is different from the owner of the connection on which it is provisioned, then the virtual interface will remain in this state until it is confirmed by the virtual interface owner.    verifying: This state only applies to public virtual interfaces. Each public virtual interface needs validation before the virtual interface can be created.    pending: A virtual interface is in this state from the time that it is created until the virtual interface is ready to forward traffic.    available: A virtual interface that is able to forward traffic.    down: A virtual interface that is BGP down.    deleting: A virtual interface is in this state immediately after calling DeleteVirtualInterface until it can no longer forward traffic.    deleted: A virtual interface that cannot forward traffic.    rejected: The virtual interface owner has declined creation of the virtual interface. If a virtual interface in the Confirming state is deleted by the virtual interface owner, the virtual interface enters the Rejected state.    unknown: The state of the virtual interface is not available.  
    */
  var virtualInterfaceState: js.UndefOr[VirtualInterfaceState] = js.native
}

object ConfirmPrivateVirtualInterfaceResponse {
  @scala.inline
  def apply(): ConfirmPrivateVirtualInterfaceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfirmPrivateVirtualInterfaceResponse]
  }
  @scala.inline
  implicit class ConfirmPrivateVirtualInterfaceResponseOps[Self <: ConfirmPrivateVirtualInterfaceResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setVirtualInterfaceState(value: VirtualInterfaceState): Self = this.set("virtualInterfaceState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVirtualInterfaceState: Self = this.set("virtualInterfaceState", js.undefined)
  }
  
}

