package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyNetworkInterfaceAttributeRequest extends StObject {
  
  /**
    * Information about the interface attachment. If modifying the 'delete on termination' attribute, you must specify the ID of the interface attachment.
    */
  var Attachment: js.UndefOr[NetworkInterfaceAttachmentChanges] = js.undefined
  
  /**
    * A description for the network interface.
    */
  var Description: js.UndefOr[AttributeValue] = js.undefined
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Changes the security groups for the network interface. The new set of groups you specify replaces the current set. You must specify at least one group, even if it's just the default security group in the VPC. You must specify the ID of the security group, not the name.
    */
  var Groups: js.UndefOr[SecurityGroupIdStringList] = js.undefined
  
  /**
    * The ID of the network interface.
    */
  var NetworkInterfaceId: typings.awsSdk.ec2Mod.NetworkInterfaceId
  
  /**
    * Indicates whether source/destination checking is enabled. A value of true means checking is enabled, and false means checking is disabled. This value must be false for a NAT instance to perform NAT. For more information, see NAT Instances in the Amazon Virtual Private Cloud User Guide.
    */
  var SourceDestCheck: js.UndefOr[AttributeBooleanValue] = js.undefined
}
object ModifyNetworkInterfaceAttributeRequest {
  
  @scala.inline
  def apply(NetworkInterfaceId: NetworkInterfaceId): ModifyNetworkInterfaceAttributeRequest = {
    val __obj = js.Dynamic.literal(NetworkInterfaceId = NetworkInterfaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyNetworkInterfaceAttributeRequest]
  }
  
  @scala.inline
  implicit class ModifyNetworkInterfaceAttributeRequestMutableBuilder[Self <: ModifyNetworkInterfaceAttributeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttachment(value: NetworkInterfaceAttachmentChanges): Self = StObject.set(x, "Attachment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachmentUndefined: Self = StObject.set(x, "Attachment", js.undefined)
    
    @scala.inline
    def setDescription(value: AttributeValue): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setGroups(value: SecurityGroupIdStringList): Self = StObject.set(x, "Groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupsUndefined: Self = StObject.set(x, "Groups", js.undefined)
    
    @scala.inline
    def setGroupsVarargs(value: SecurityGroupId*): Self = StObject.set(x, "Groups", js.Array(value :_*))
    
    @scala.inline
    def setNetworkInterfaceId(value: NetworkInterfaceId): Self = StObject.set(x, "NetworkInterfaceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceDestCheck(value: AttributeBooleanValue): Self = StObject.set(x, "SourceDestCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceDestCheckUndefined: Self = StObject.set(x, "SourceDestCheck", js.undefined)
  }
}
