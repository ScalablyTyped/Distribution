package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteRouteRequest extends StObject {
  
  /**
    * The IPv4 CIDR range for the route. The value you specify must match the CIDR for the route exactly.
    */
  var DestinationCidrBlock: js.UndefOr[String] = js.native
  
  /**
    * The IPv6 CIDR range for the route. The value you specify must match the CIDR for the route exactly.
    */
  var DestinationIpv6CidrBlock: js.UndefOr[String] = js.native
  
  /**
    * The ID of the prefix list for the route.
    */
  var DestinationPrefixListId: js.UndefOr[PrefixListResourceId] = js.native
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * The ID of the route table.
    */
  var RouteTableId: typings.awsSdk.ec2Mod.RouteTableId = js.native
}
object DeleteRouteRequest {
  
  @scala.inline
  def apply(RouteTableId: RouteTableId): DeleteRouteRequest = {
    val __obj = js.Dynamic.literal(RouteTableId = RouteTableId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRouteRequest]
  }
  
  @scala.inline
  implicit class DeleteRouteRequestMutableBuilder[Self <: DeleteRouteRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestinationCidrBlock(value: String): Self = StObject.set(x, "DestinationCidrBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationCidrBlockUndefined: Self = StObject.set(x, "DestinationCidrBlock", js.undefined)
    
    @scala.inline
    def setDestinationIpv6CidrBlock(value: String): Self = StObject.set(x, "DestinationIpv6CidrBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationIpv6CidrBlockUndefined: Self = StObject.set(x, "DestinationIpv6CidrBlock", js.undefined)
    
    @scala.inline
    def setDestinationPrefixListId(value: PrefixListResourceId): Self = StObject.set(x, "DestinationPrefixListId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationPrefixListIdUndefined: Self = StObject.set(x, "DestinationPrefixListId", js.undefined)
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setRouteTableId(value: RouteTableId): Self = StObject.set(x, "RouteTableId", value.asInstanceOf[js.Any])
  }
}
