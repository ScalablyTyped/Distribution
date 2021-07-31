package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTransitGatewayResult extends StObject {
  
  /**
    * Information about the transit gateway.
    */
  var TransitGateway: js.UndefOr[typings.awsSdk.ec2Mod.TransitGateway] = js.undefined
}
object CreateTransitGatewayResult {
  
  @scala.inline
  def apply(): CreateTransitGatewayResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateTransitGatewayResult]
  }
  
  @scala.inline
  implicit class CreateTransitGatewayResultMutableBuilder[Self <: CreateTransitGatewayResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTransitGateway(value: TransitGateway): Self = StObject.set(x, "TransitGateway", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitGatewayUndefined: Self = StObject.set(x, "TransitGateway", js.undefined)
  }
}
