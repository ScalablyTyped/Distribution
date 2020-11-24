package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateTransitGatewayRouteResult extends js.Object {
  
  /**
    * Information about the route.
    */
  var Route: js.UndefOr[TransitGatewayRoute] = js.native
}
object CreateTransitGatewayRouteResult {
  
  @scala.inline
  def apply(): CreateTransitGatewayRouteResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateTransitGatewayRouteResult]
  }
  
  @scala.inline
  implicit class CreateTransitGatewayRouteResultOps[Self <: CreateTransitGatewayRouteResult] (val x: Self) extends AnyVal {
    
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
    def setRoute(value: TransitGatewayRoute): Self = this.set("Route", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoute: Self = this.set("Route", js.undefined)
  }
}
