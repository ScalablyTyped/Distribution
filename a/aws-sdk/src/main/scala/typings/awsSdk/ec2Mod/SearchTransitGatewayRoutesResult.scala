package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchTransitGatewayRoutesResult extends js.Object {
  
  /**
    * Indicates whether there are additional routes available.
    */
  var AdditionalRoutesAvailable: js.UndefOr[Boolean] = js.native
  
  /**
    * Information about the routes.
    */
  var Routes: js.UndefOr[TransitGatewayRouteList] = js.native
}
object SearchTransitGatewayRoutesResult {
  
  @scala.inline
  def apply(): SearchTransitGatewayRoutesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchTransitGatewayRoutesResult]
  }
  
  @scala.inline
  implicit class SearchTransitGatewayRoutesResultOps[Self <: SearchTransitGatewayRoutesResult] (val x: Self) extends AnyVal {
    
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
    def setAdditionalRoutesAvailable(value: Boolean): Self = this.set("AdditionalRoutesAvailable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdditionalRoutesAvailable: Self = this.set("AdditionalRoutesAvailable", js.undefined)
    
    @scala.inline
    def setRoutesVarargs(value: TransitGatewayRoute*): Self = this.set("Routes", js.Array(value :_*))
    
    @scala.inline
    def setRoutes(value: TransitGatewayRouteList): Self = this.set("Routes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoutes: Self = this.set("Routes", js.undefined)
  }
}
