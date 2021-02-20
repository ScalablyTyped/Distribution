package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteTransitGatewayRouteTableResult extends StObject {
  
  /**
    * Information about the deleted transit gateway route table.
    */
  var TransitGatewayRouteTable: js.UndefOr[typings.awsSdk.ec2Mod.TransitGatewayRouteTable] = js.native
}
object DeleteTransitGatewayRouteTableResult {
  
  @scala.inline
  def apply(): DeleteTransitGatewayRouteTableResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteTransitGatewayRouteTableResult]
  }
  
  @scala.inline
  implicit class DeleteTransitGatewayRouteTableResultMutableBuilder[Self <: DeleteTransitGatewayRouteTableResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTransitGatewayRouteTable(value: TransitGatewayRouteTable): Self = StObject.set(x, "TransitGatewayRouteTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitGatewayRouteTableUndefined: Self = StObject.set(x, "TransitGatewayRouteTable", js.undefined)
  }
}
