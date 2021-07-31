package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnableTransitGatewayRouteTablePropagationResult extends StObject {
  
  /**
    * Information about route propagation.
    */
  var Propagation: js.UndefOr[TransitGatewayPropagation] = js.undefined
}
object EnableTransitGatewayRouteTablePropagationResult {
  
  @scala.inline
  def apply(): EnableTransitGatewayRouteTablePropagationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnableTransitGatewayRouteTablePropagationResult]
  }
  
  @scala.inline
  implicit class EnableTransitGatewayRouteTablePropagationResultMutableBuilder[Self <: EnableTransitGatewayRouteTablePropagationResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPropagation(value: TransitGatewayPropagation): Self = StObject.set(x, "Propagation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropagationUndefined: Self = StObject.set(x, "Propagation", js.undefined)
  }
}
