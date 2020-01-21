package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateTransitGatewayRouteTableResult extends js.Object {
  /**
    * Information about the transit gateway route table.
    */
  var TransitGatewayRouteTable: js.UndefOr[typings.awsSdk.ec2Mod.TransitGatewayRouteTable] = js.native
}

object CreateTransitGatewayRouteTableResult {
  @scala.inline
  def apply(TransitGatewayRouteTable: TransitGatewayRouteTable = null): CreateTransitGatewayRouteTableResult = {
    val __obj = js.Dynamic.literal()
    if (TransitGatewayRouteTable != null) __obj.updateDynamic("TransitGatewayRouteTable")(TransitGatewayRouteTable.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTransitGatewayRouteTableResult]
  }
}

