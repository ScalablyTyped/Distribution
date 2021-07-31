package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VpnGateway extends StObject {
  
  /**
    * The private Autonomous System Number (ASN) for the Amazon side of a BGP session.
    */
  var AmazonSideAsn: js.UndefOr[Long] = js.undefined
  
  /**
    * The Availability Zone where the virtual private gateway was created, if applicable. This field may be empty or not returned.
    */
  var AvailabilityZone: js.UndefOr[String] = js.undefined
  
  /**
    * The current state of the virtual private gateway.
    */
  var State: js.UndefOr[VpnState] = js.undefined
  
  /**
    * Any tags assigned to the virtual private gateway.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The type of VPN connection the virtual private gateway supports.
    */
  var Type: js.UndefOr[GatewayType] = js.undefined
  
  /**
    * Any VPCs attached to the virtual private gateway.
    */
  var VpcAttachments: js.UndefOr[VpcAttachmentList] = js.undefined
  
  /**
    * The ID of the virtual private gateway.
    */
  var VpnGatewayId: js.UndefOr[String] = js.undefined
}
object VpnGateway {
  
  @scala.inline
  def apply(): VpnGateway = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpnGateway]
  }
  
  @scala.inline
  implicit class VpnGatewayMutableBuilder[Self <: VpnGateway] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmazonSideAsn(value: Long): Self = StObject.set(x, "AmazonSideAsn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmazonSideAsnUndefined: Self = StObject.set(x, "AmazonSideAsn", js.undefined)
    
    @scala.inline
    def setAvailabilityZone(value: String): Self = StObject.set(x, "AvailabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityZoneUndefined: Self = StObject.set(x, "AvailabilityZone", js.undefined)
    
    @scala.inline
    def setState(value: VpnState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    
    @scala.inline
    def setType(value: GatewayType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    @scala.inline
    def setVpcAttachments(value: VpcAttachmentList): Self = StObject.set(x, "VpcAttachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcAttachmentsUndefined: Self = StObject.set(x, "VpcAttachments", js.undefined)
    
    @scala.inline
    def setVpcAttachmentsVarargs(value: VpcAttachment*): Self = StObject.set(x, "VpcAttachments", js.Array(value :_*))
    
    @scala.inline
    def setVpnGatewayId(value: String): Self = StObject.set(x, "VpnGatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpnGatewayIdUndefined: Self = StObject.set(x, "VpnGatewayId", js.undefined)
  }
}
