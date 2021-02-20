package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransitGatewayVpcAttachment extends StObject {
  
  /**
    * The creation time.
    */
  var CreationTime: js.UndefOr[DateTime] = js.native
  
  /**
    * The VPC attachment options.
    */
  var Options: js.UndefOr[TransitGatewayVpcAttachmentOptions] = js.native
  
  /**
    * The state of the VPC attachment. Note that the initiating state has been deprecated.
    */
  var State: js.UndefOr[TransitGatewayAttachmentState] = js.native
  
  /**
    * The IDs of the subnets.
    */
  var SubnetIds: js.UndefOr[ValueStringList] = js.native
  
  /**
    * The tags for the VPC attachment.
    */
  var Tags: js.UndefOr[TagList] = js.native
  
  /**
    * The ID of the attachment.
    */
  var TransitGatewayAttachmentId: js.UndefOr[String] = js.native
  
  /**
    * The ID of the transit gateway.
    */
  var TransitGatewayId: js.UndefOr[String] = js.native
  
  /**
    * The ID of the VPC.
    */
  var VpcId: js.UndefOr[String] = js.native
  
  /**
    * The ID of the AWS account that owns the VPC.
    */
  var VpcOwnerId: js.UndefOr[String] = js.native
}
object TransitGatewayVpcAttachment {
  
  @scala.inline
  def apply(): TransitGatewayVpcAttachment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitGatewayVpcAttachment]
  }
  
  @scala.inline
  implicit class TransitGatewayVpcAttachmentMutableBuilder[Self <: TransitGatewayVpcAttachment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationTime(value: DateTime): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    @scala.inline
    def setOptions(value: TransitGatewayVpcAttachmentOptions): Self = StObject.set(x, "Options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "Options", js.undefined)
    
    @scala.inline
    def setState(value: TransitGatewayAttachmentState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    @scala.inline
    def setSubnetIds(value: ValueStringList): Self = StObject.set(x, "SubnetIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetIdsUndefined: Self = StObject.set(x, "SubnetIds", js.undefined)
    
    @scala.inline
    def setSubnetIdsVarargs(value: String*): Self = StObject.set(x, "SubnetIds", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    
    @scala.inline
    def setTransitGatewayAttachmentId(value: String): Self = StObject.set(x, "TransitGatewayAttachmentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitGatewayAttachmentIdUndefined: Self = StObject.set(x, "TransitGatewayAttachmentId", js.undefined)
    
    @scala.inline
    def setTransitGatewayId(value: String): Self = StObject.set(x, "TransitGatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitGatewayIdUndefined: Self = StObject.set(x, "TransitGatewayId", js.undefined)
    
    @scala.inline
    def setVpcId(value: String): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
    
    @scala.inline
    def setVpcOwnerId(value: String): Self = StObject.set(x, "VpcOwnerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcOwnerIdUndefined: Self = StObject.set(x, "VpcOwnerId", js.undefined)
  }
}
