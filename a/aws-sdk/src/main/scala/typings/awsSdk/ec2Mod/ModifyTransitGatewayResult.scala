package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyTransitGatewayResult extends StObject {
  
  var TransitGateway: js.UndefOr[typings.awsSdk.ec2Mod.TransitGateway] = js.undefined
}
object ModifyTransitGatewayResult {
  
  @scala.inline
  def apply(): ModifyTransitGatewayResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyTransitGatewayResult]
  }
  
  @scala.inline
  implicit class ModifyTransitGatewayResultMutableBuilder[Self <: ModifyTransitGatewayResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTransitGateway(value: TransitGateway): Self = StObject.set(x, "TransitGateway", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitGatewayUndefined: Self = StObject.set(x, "TransitGateway", js.undefined)
  }
}
