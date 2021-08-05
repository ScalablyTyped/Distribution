package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisableTransitGatewayRouteTablePropagationResult extends StObject {
  
  /**
    * Information about route propagation.
    */
  var Propagation: js.UndefOr[TransitGatewayPropagation] = js.undefined
}
object DisableTransitGatewayRouteTablePropagationResult {
  
  inline def apply(): DisableTransitGatewayRouteTablePropagationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisableTransitGatewayRouteTablePropagationResult]
  }
  
  extension [Self <: DisableTransitGatewayRouteTablePropagationResult](x: Self) {
    
    inline def setPropagation(value: TransitGatewayPropagation): Self = StObject.set(x, "Propagation", value.asInstanceOf[js.Any])
    
    inline def setPropagationUndefined: Self = StObject.set(x, "Propagation", js.undefined)
  }
}
