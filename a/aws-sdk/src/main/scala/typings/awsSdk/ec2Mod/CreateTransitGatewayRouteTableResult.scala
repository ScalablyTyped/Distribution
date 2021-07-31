package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTransitGatewayRouteTableResult extends StObject {
  
  /**
    * Information about the transit gateway route table.
    */
  var TransitGatewayRouteTable: js.UndefOr[typings.awsSdk.ec2Mod.TransitGatewayRouteTable] = js.undefined
}
object CreateTransitGatewayRouteTableResult {
  
  @scala.inline
  def apply(): CreateTransitGatewayRouteTableResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateTransitGatewayRouteTableResult]
  }
  
  @scala.inline
  implicit class CreateTransitGatewayRouteTableResultMutableBuilder[Self <: CreateTransitGatewayRouteTableResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTransitGatewayRouteTable(value: TransitGatewayRouteTable): Self = StObject.set(x, "TransitGatewayRouteTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitGatewayRouteTableUndefined: Self = StObject.set(x, "TransitGatewayRouteTable", js.undefined)
  }
}
