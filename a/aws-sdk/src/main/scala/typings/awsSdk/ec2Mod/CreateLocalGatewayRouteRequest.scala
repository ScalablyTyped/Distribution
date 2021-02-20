package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateLocalGatewayRouteRequest extends StObject {
  
  /**
    * The CIDR range used for destination matches. Routing decisions are based on the most specific match.
    */
  var DestinationCidrBlock: String = js.native
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * The ID of the local gateway route table.
    */
  var LocalGatewayRouteTableId: LocalGatewayRoutetableId = js.native
  
  /**
    * The ID of the virtual interface group.
    */
  var LocalGatewayVirtualInterfaceGroupId: typings.awsSdk.ec2Mod.LocalGatewayVirtualInterfaceGroupId = js.native
}
object CreateLocalGatewayRouteRequest {
  
  @scala.inline
  def apply(
    DestinationCidrBlock: String,
    LocalGatewayRouteTableId: LocalGatewayRoutetableId,
    LocalGatewayVirtualInterfaceGroupId: LocalGatewayVirtualInterfaceGroupId
  ): CreateLocalGatewayRouteRequest = {
    val __obj = js.Dynamic.literal(DestinationCidrBlock = DestinationCidrBlock.asInstanceOf[js.Any], LocalGatewayRouteTableId = LocalGatewayRouteTableId.asInstanceOf[js.Any], LocalGatewayVirtualInterfaceGroupId = LocalGatewayVirtualInterfaceGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLocalGatewayRouteRequest]
  }
  
  @scala.inline
  implicit class CreateLocalGatewayRouteRequestMutableBuilder[Self <: CreateLocalGatewayRouteRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestinationCidrBlock(value: String): Self = StObject.set(x, "DestinationCidrBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setLocalGatewayRouteTableId(value: LocalGatewayRoutetableId): Self = StObject.set(x, "LocalGatewayRouteTableId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalGatewayVirtualInterfaceGroupId(value: LocalGatewayVirtualInterfaceGroupId): Self = StObject.set(x, "LocalGatewayVirtualInterfaceGroupId", value.asInstanceOf[js.Any])
  }
}
