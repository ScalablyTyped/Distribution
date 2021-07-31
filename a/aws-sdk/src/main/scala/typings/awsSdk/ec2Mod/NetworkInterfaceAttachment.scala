package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkInterfaceAttachment extends StObject {
  
  /**
    * The timestamp indicating when the attachment initiated.
    */
  var AttachTime: js.UndefOr[DateTime] = js.undefined
  
  /**
    * The ID of the network interface attachment.
    */
  var AttachmentId: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates whether the network interface is deleted when the instance is terminated.
    */
  var DeleteOnTermination: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The device index of the network interface attachment on the instance.
    */
  var DeviceIndex: js.UndefOr[Integer] = js.undefined
  
  /**
    * The ID of the instance.
    */
  var InstanceId: js.UndefOr[String] = js.undefined
  
  /**
    * The AWS account ID of the owner of the instance.
    */
  var InstanceOwnerId: js.UndefOr[String] = js.undefined
  
  /**
    * The index of the network card.
    */
  var NetworkCardIndex: js.UndefOr[Integer] = js.undefined
  
  /**
    * The attachment state.
    */
  var Status: js.UndefOr[AttachmentStatus] = js.undefined
}
object NetworkInterfaceAttachment {
  
  @scala.inline
  def apply(): NetworkInterfaceAttachment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkInterfaceAttachment]
  }
  
  @scala.inline
  implicit class NetworkInterfaceAttachmentMutableBuilder[Self <: NetworkInterfaceAttachment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttachTime(value: DateTime): Self = StObject.set(x, "AttachTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachTimeUndefined: Self = StObject.set(x, "AttachTime", js.undefined)
    
    @scala.inline
    def setAttachmentId(value: String): Self = StObject.set(x, "AttachmentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachmentIdUndefined: Self = StObject.set(x, "AttachmentId", js.undefined)
    
    @scala.inline
    def setDeleteOnTermination(value: Boolean): Self = StObject.set(x, "DeleteOnTermination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteOnTerminationUndefined: Self = StObject.set(x, "DeleteOnTermination", js.undefined)
    
    @scala.inline
    def setDeviceIndex(value: Integer): Self = StObject.set(x, "DeviceIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceIndexUndefined: Self = StObject.set(x, "DeviceIndex", js.undefined)
    
    @scala.inline
    def setInstanceId(value: String): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceIdUndefined: Self = StObject.set(x, "InstanceId", js.undefined)
    
    @scala.inline
    def setInstanceOwnerId(value: String): Self = StObject.set(x, "InstanceOwnerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceOwnerIdUndefined: Self = StObject.set(x, "InstanceOwnerId", js.undefined)
    
    @scala.inline
    def setNetworkCardIndex(value: Integer): Self = StObject.set(x, "NetworkCardIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkCardIndexUndefined: Self = StObject.set(x, "NetworkCardIndex", js.undefined)
    
    @scala.inline
    def setStatus(value: AttachmentStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
