package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisableTransitGatewayRouteTablePropagationResult extends js.Object {
  
  /**
    * Information about route propagation.
    */
  var Propagation: js.UndefOr[TransitGatewayPropagation] = js.native
}
object DisableTransitGatewayRouteTablePropagationResult {
  
  @scala.inline
  def apply(): DisableTransitGatewayRouteTablePropagationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisableTransitGatewayRouteTablePropagationResult]
  }
  
  @scala.inline
  implicit class DisableTransitGatewayRouteTablePropagationResultOps[Self <: DisableTransitGatewayRouteTablePropagationResult] (val x: Self) extends AnyVal {
    
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
    def setPropagation(value: TransitGatewayPropagation): Self = this.set("Propagation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePropagation: Self = this.set("Propagation", js.undefined)
  }
}
