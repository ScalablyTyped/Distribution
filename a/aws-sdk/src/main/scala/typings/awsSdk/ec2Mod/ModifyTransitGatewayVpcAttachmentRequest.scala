package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyTransitGatewayVpcAttachmentRequest extends js.Object {
  
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
  implicit class ModifyTransitGatewayVpcAttachmentRequestOps[Self <: ModifyTransitGatewayVpcAttachmentRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setTransitGatewayAttachmentId(value: TransitGatewayAttachmentId): Self = this.set("TransitGatewayAttachmentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddSubnetIdsVarargs(value: SubnetId*): Self = this.set("AddSubnetIds", js.Array(value :_*))
    
    @scala.inline
    def setAddSubnetIds(value: TransitGatewaySubnetIdList): Self = this.set("AddSubnetIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddSubnetIds: Self = this.set("AddSubnetIds", js.undefined)
    
    @scala.inline
    def setDryRun(value: Boolean): Self = this.set("DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDryRun: Self = this.set("DryRun", js.undefined)
    
    @scala.inline
    def setOptions(value: ModifyTransitGatewayVpcAttachmentRequestOptions): Self = this.set("Options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("Options", js.undefined)
    
    @scala.inline
    def setRemoveSubnetIdsVarargs(value: SubnetId*): Self = this.set("RemoveSubnetIds", js.Array(value :_*))
    
    @scala.inline
    def setRemoveSubnetIds(value: TransitGatewaySubnetIdList): Self = this.set("RemoveSubnetIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoveSubnetIds: Self = this.set("RemoveSubnetIds", js.undefined)
  }
}
