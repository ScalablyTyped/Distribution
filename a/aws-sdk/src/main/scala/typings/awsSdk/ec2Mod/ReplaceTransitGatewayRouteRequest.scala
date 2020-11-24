package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReplaceTransitGatewayRouteRequest extends js.Object {
  
  /**
    * Indicates whether traffic matching this route is to be dropped.
    */
  var Blackhole: js.UndefOr[Boolean] = js.native
  
  /**
    * The CIDR range used for the destination match. Routing decisions are based on the most specific match.
    */
  var DestinationCidrBlock: String = js.native
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * The ID of the attachment.
    */
  var TransitGatewayAttachmentId: js.UndefOr[typings.awsSdk.ec2Mod.TransitGatewayAttachmentId] = js.native
  
  /**
    * The ID of the route table.
    */
  var TransitGatewayRouteTableId: typings.awsSdk.ec2Mod.TransitGatewayRouteTableId = js.native
}
object ReplaceTransitGatewayRouteRequest {
  
  @scala.inline
  def apply(DestinationCidrBlock: String, TransitGatewayRouteTableId: TransitGatewayRouteTableId): ReplaceTransitGatewayRouteRequest = {
    val __obj = js.Dynamic.literal(DestinationCidrBlock = DestinationCidrBlock.asInstanceOf[js.Any], TransitGatewayRouteTableId = TransitGatewayRouteTableId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplaceTransitGatewayRouteRequest]
  }
  
  @scala.inline
  implicit class ReplaceTransitGatewayRouteRequestOps[Self <: ReplaceTransitGatewayRouteRequest] (val x: Self) extends AnyVal {
    
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
    def setDestinationCidrBlock(value: String): Self = this.set("DestinationCidrBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitGatewayRouteTableId(value: TransitGatewayRouteTableId): Self = this.set("TransitGatewayRouteTableId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlackhole(value: Boolean): Self = this.set("Blackhole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlackhole: Self = this.set("Blackhole", js.undefined)
    
    @scala.inline
    def setDryRun(value: Boolean): Self = this.set("DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDryRun: Self = this.set("DryRun", js.undefined)
    
    @scala.inline
    def setTransitGatewayAttachmentId(value: TransitGatewayAttachmentId): Self = this.set("TransitGatewayAttachmentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitGatewayAttachmentId: Self = this.set("TransitGatewayAttachmentId", js.undefined)
  }
}
