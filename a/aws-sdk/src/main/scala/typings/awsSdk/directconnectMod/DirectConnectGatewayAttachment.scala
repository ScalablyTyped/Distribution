package typings.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    attachmentState: DirectConnectGatewayAttachmentState = null,
    attachmentType: DirectConnectGatewayAttachmentType = null,
    directConnectGatewayId: DirectConnectGatewayId = null,
    stateChangeError: StateChangeError = null,
    virtualInterfaceId: VirtualInterfaceId = null,
    virtualInterfaceOwnerAccount: OwnerAccount = null,
    virtualInterfaceRegion: VirtualInterfaceRegion = null
  ): DirectConnectGatewayAttachment = {
    val __obj = js.Dynamic.literal()
    if (attachmentState != null) __obj.updateDynamic("attachmentState")(attachmentState.asInstanceOf[js.Any])
    if (attachmentType != null) __obj.updateDynamic("attachmentType")(attachmentType.asInstanceOf[js.Any])
    if (directConnectGatewayId != null) __obj.updateDynamic("directConnectGatewayId")(directConnectGatewayId.asInstanceOf[js.Any])
    if (stateChangeError != null) __obj.updateDynamic("stateChangeError")(stateChangeError.asInstanceOf[js.Any])
    if (virtualInterfaceId != null) __obj.updateDynamic("virtualInterfaceId")(virtualInterfaceId.asInstanceOf[js.Any])
    if (virtualInterfaceOwnerAccount != null) __obj.updateDynamic("virtualInterfaceOwnerAccount")(virtualInterfaceOwnerAccount.asInstanceOf[js.Any])
    if (virtualInterfaceRegion != null) __obj.updateDynamic("virtualInterfaceRegion")(virtualInterfaceRegion.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectConnectGatewayAttachment]
  }
}

