package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteLocalGatewayRouteResult extends js.Object {
  
  /**
    * Information about the route.
    */
  var Route: js.UndefOr[LocalGatewayRoute] = js.native
}
object DeleteLocalGatewayRouteResult {
  
  @scala.inline
  def apply(): DeleteLocalGatewayRouteResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteLocalGatewayRouteResult]
  }
  
  @scala.inline
  implicit class DeleteLocalGatewayRouteResultOps[Self <: DeleteLocalGatewayRouteResult] (val x: Self) extends AnyVal {
    
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
    def setRoute(value: LocalGatewayRoute): Self = this.set("Route", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoute: Self = this.set("Route", js.undefined)
  }
}
