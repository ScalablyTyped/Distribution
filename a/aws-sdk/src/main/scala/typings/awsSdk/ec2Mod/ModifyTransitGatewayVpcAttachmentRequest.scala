package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyTransitGatewayVpcAttachmentRequest extends StObject {
  
  /**
    * The IDs of one or more subnets to add. You can specify at most one subnet per Availability Zone.
    */
  var AddSubnetIds: js.UndefOr[TransitGatewaySubnetIdList] = js.native
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * The new VPC attachment options.  You cannot modify the IPv6 options. 
    */
  var Options: js.UndefOr[ModifyTransitGatewayVpcAttachmentRequestOptions] = js.native
  
  /**
    * The IDs of one or more subnets to remove.
    */
  var RemoveSubnetIds: js.UndefOr[TransitGatewaySubnetIdList] = js.native
  
  /**
    * The ID of the attachment.
    */
  var TransitGatewayAttachmentId: typings.awsSdk.ec2Mod.TransitGatewayAttachmentId = js.native
}
object ModifyTransitGatewayVpcAttachmentRequest {
  
  @scala.inline
  def apply(TransitGatewayAttachmentId: TransitGatewayAttachmentId): ModifyTransitGatewayVpcAttachmentRequest = {
    val __obj = js.Dynamic.literal(TransitGatewayAttachmentId = TransitGatewayAttachmentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyTransitGatewayVpcAttachmentRequest]
  }
  
  @scala.inline
  implicit class ModifyTransitGatewayVpcAttachmentRequestMutableBuilder[Self <: ModifyTransitGatewayVpcAttachmentRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddSubnetIds(value: TransitGatewaySubnetIdList): Self = StObject.set(x, "AddSubnetIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddSubnetIdsUndefined: Self = StObject.set(x, "AddSubnetIds", js.undefined)
    
    @scala.inline
    def setAddSubnetIdsVarargs(value: SubnetId*): Self = StObject.set(x, "AddSubnetIds", js.Array(value :_*))
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setOptions(value: ModifyTransitGatewayVpcAttachmentRequestOptions): Self = StObject.set(x, "Options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "Options", js.undefined)
    
    @scala.inline
    def setRemoveSubnetIds(value: TransitGatewaySubnetIdList): Self = StObject.set(x, "RemoveSubnetIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveSubnetIdsUndefined: Self = StObject.set(x, "RemoveSubnetIds", js.undefined)
    
    @scala.inline
    def setRemoveSubnetIdsVarargs(value: SubnetId*): Self = StObject.set(x, "RemoveSubnetIds", js.Array(value :_*))
    
    @scala.inline
    def setTransitGatewayAttachmentId(value: TransitGatewayAttachmentId): Self = StObject.set(x, "TransitGatewayAttachmentId", value.asInstanceOf[js.Any])
  }
}
