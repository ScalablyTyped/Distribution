package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisableTransitGatewayRouteTablePropagationResult extends StObject {
  
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
  implicit class DisableTransitGatewayRouteTablePropagationResultMutableBuilder[Self <: DisableTransitGatewayRouteTablePropagationResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPropagation(value: TransitGatewayPropagation): Self = StObject.set(x, "Propagation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropagationUndefined: Self = StObject.set(x, "Propagation", js.undefined)
  }
}
