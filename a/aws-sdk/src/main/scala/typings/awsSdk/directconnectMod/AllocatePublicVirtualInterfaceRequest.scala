package typings.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AllocatePublicVirtualInterfaceRequest extends js.Object {
  /**
    * The ID of the connection on which the public virtual interface is provisioned.
    */
  var connectionId: ConnectionId = js.native
  /**
    * Information about the public virtual interface.
    */
  var newPublicVirtualInterfaceAllocation: NewPublicVirtualInterfaceAllocation = js.native
  /**
    * The ID of the AWS account that owns the public virtual interface.
    */
  var ownerAccount: OwnerAccount = js.native
}

object AllocatePublicVirtualInterfaceRequest {
  @scala.inline
  def apply(
    connectionId: ConnectionId,
    newPublicVirtualInterfaceAllocation: NewPublicVirtualInterfaceAllocation,
    ownerAccount: OwnerAccount
  ): AllocatePublicVirtualInterfaceRequest = {
    val __obj = js.Dynamic.literal(connectionId = connectionId.asInstanceOf[js.Any], newPublicVirtualInterfaceAllocation = newPublicVirtualInterfaceAllocation.asInstanceOf[js.Any], ownerAccount = ownerAccount.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllocatePublicVirtualInterfaceRequest]
  }
  @scala.inline
  implicit class AllocatePublicVirtualInterfaceRequestOps[Self <: AllocatePublicVirtualInterfaceRequest] (val x: Self) extends AnyVal {
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
    def setConnectionId(value: ConnectionId): Self = this.set("connectionId", value.asInstanceOf[js.Any])
    @scala.inline
    def setNewPublicVirtualInterfaceAllocation(value: NewPublicVirtualInterfaceAllocation): Self = this.set("newPublicVirtualInterfaceAllocation", value.asInstanceOf[js.Any])
    @scala.inline
    def setOwnerAccount(value: OwnerAccount): Self = this.set("ownerAccount", value.asInstanceOf[js.Any])
  }
  
}

