package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetachNetworkInterfaceRequest extends StObject {
  
  /**
    * The ID of the attachment.
    */
  var AttachmentId: NetworkInterfaceAttachmentId
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether to force a detachment.    Use the Force parameter only as a last resort to detach a network interface from a failed instance.    If you use the Force parameter to detach a network interface, you might not be able to attach a different network interface to the same index on the instance without first stopping and starting the instance.   If you force the detachment of a network interface, the instance metadata might not get updated. This means that the attributes associated with the detached network interface might still be visible. The instance metadata will get updated when you stop and start the instance.   
    */
  var Force: js.UndefOr[Boolean] = js.undefined
}
object DetachNetworkInterfaceRequest {
  
  @scala.inline
  def apply(AttachmentId: NetworkInterfaceAttachmentId): DetachNetworkInterfaceRequest = {
    val __obj = js.Dynamic.literal(AttachmentId = AttachmentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetachNetworkInterfaceRequest]
  }
  
  @scala.inline
  implicit class DetachNetworkInterfaceRequestMutableBuilder[Self <: DetachNetworkInterfaceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttachmentId(value: NetworkInterfaceAttachmentId): Self = StObject.set(x, "AttachmentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setForce(value: Boolean): Self = StObject.set(x, "Force", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceUndefined: Self = StObject.set(x, "Force", js.undefined)
  }
}
