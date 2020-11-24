package typings.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DirectConnectGatewayAttachment extends js.Object {
  
  /**
    * The state of the attachment. The following are the possible values:    attaching: The initial state after a virtual interface is created using the Direct Connect gateway.    attached: The Direct Connect gateway and virtual interface are attached and ready to pass traffic.    detaching: The initial state after calling DeleteVirtualInterface.    detached: The virtual interface is detached from the Direct Connect gateway. Traffic flow between the Direct Connect gateway and virtual interface is stopped.  
    */
  var attachmentState: js.UndefOr[DirectConnectGatewayAttachmentState] = js.native
  
  /**
    * The type of attachment.
    */
  var attachmentType: js.UndefOr[DirectConnectGatewayAttachmentType] = js.native
  
  /**
    * The ID of the Direct Connect gateway.
    */
  var directConnectGatewayId: js.UndefOr[DirectConnectGatewayId] = js.native
  
  /**
    * The error message if the state of an object failed to advance.
    */
  var stateChangeError: js.UndefOr[StateChangeError] = js.native
  
  /**
    * The ID of the virtual interface.
    */
  var virtualInterfaceId: js.UndefOr[VirtualInterfaceId] = js.native
  
  /**
    * The ID of the AWS account that owns the virtual interface.
    */
  var virtualInterfaceOwnerAccount: js.UndefOr[OwnerAccount] = js.native
  
  /**
    * The AWS Region where the virtual interface is located.
    */
  var virtualInterfaceRegion: js.UndefOr[VirtualInterfaceRegion] = js.native
}
object DirectConnectGatewayAttachment {
  
  @scala.inline
  def apply(): DirectConnectGatewayAttachment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DirectConnectGatewayAttachment]
  }
  
  @scala.inline
  implicit class DirectConnectGatewayAttachmentOps[Self <: DirectConnectGatewayAttachment] (val x: Self) extends AnyVal {
    
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
    def setAttachmentState(value: DirectConnectGatewayAttachmentState): Self = this.set("attachmentState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttachmentState: Self = this.set("attachmentState", js.undefined)
    
    @scala.inline
    def setAttachmentType(value: DirectConnectGatewayAttachmentType): Self = this.set("attachmentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttachmentType: Self = this.set("attachmentType", js.undefined)
    
    @scala.inline
    def setDirectConnectGatewayId(value: DirectConnectGatewayId): Self = this.set("directConnectGatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirectConnectGatewayId: Self = this.set("directConnectGatewayId", js.undefined)
    
    @scala.inline
    def setStateChangeError(value: StateChangeError): Self = this.set("stateChangeError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStateChangeError: Self = this.set("stateChangeError", js.undefined)
    
    @scala.inline
    def setVirtualInterfaceId(value: VirtualInterfaceId): Self = this.set("virtualInterfaceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVirtualInterfaceId: Self = this.set("virtualInterfaceId", js.undefined)
    
    @scala.inline
    def setVirtualInterfaceOwnerAccount(value: OwnerAccount): Self = this.set("virtualInterfaceOwnerAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVirtualInterfaceOwnerAccount: Self = this.set("virtualInterfaceOwnerAccount", js.undefined)
    
    @scala.inline
    def setVirtualInterfaceRegion(value: VirtualInterfaceRegion): Self = this.set("virtualInterfaceRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVirtualInterfaceRegion: Self = this.set("virtualInterfaceRegion", js.undefined)
  }
}
