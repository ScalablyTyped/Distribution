package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VpnGateway extends js.Object {
  
  /**
    * The private Autonomous System Number (ASN) for the Amazon side of a BGP session.
    */
  var AmazonSideAsn: js.UndefOr[Long] = js.native
  
  /**
    * The Availability Zone where the virtual private gateway was created, if applicable. This field may be empty or not returned.
    */
  var AvailabilityZone: js.UndefOr[String] = js.native
  
  /**
    * The current state of the virtual private gateway.
    */
  var State: js.UndefOr[VpnState] = js.native
  
  /**
    * Any tags assigned to the virtual private gateway.
    */
  var Tags: js.UndefOr[TagList] = js.native
  
  /**
    * The type of VPN connection the virtual private gateway supports.
    */
  var Type: js.UndefOr[GatewayType] = js.native
  
  /**
    * Any VPCs attached to the virtual private gateway.
    */
  var VpcAttachments: js.UndefOr[VpcAttachmentList] = js.native
  
  /**
    * The ID of the virtual private gateway.
    */
  var VpnGatewayId: js.UndefOr[String] = js.native
}
object VpnGateway {
  
  @scala.inline
  def apply(): VpnGateway = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpnGateway]
  }
  
  @scala.inline
  implicit class VpnGatewayOps[Self <: VpnGateway] (val x: Self) extends AnyVal {
    
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
    def setAmazonSideAsn(value: Long): Self = this.set("AmazonSideAsn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAmazonSideAsn: Self = this.set("AmazonSideAsn", js.undefined)
    
    @scala.inline
    def setAvailabilityZone(value: String): Self = this.set("AvailabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvailabilityZone: Self = this.set("AvailabilityZone", js.undefined)
    
    @scala.inline
    def setState(value: VpnState): Self = this.set("State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
    
    @scala.inline
    def setType(value: GatewayType): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
    
    @scala.inline
    def setVpcAttachmentsVarargs(value: VpcAttachment*): Self = this.set("VpcAttachments", js.Array(value :_*))
    
    @scala.inline
    def setVpcAttachments(value: VpcAttachmentList): Self = this.set("VpcAttachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVpcAttachments: Self = this.set("VpcAttachments", js.undefined)
    
    @scala.inline
    def setVpnGatewayId(value: String): Self = this.set("VpnGatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVpnGatewayId: Self = this.set("VpnGatewayId", js.undefined)
  }
}
