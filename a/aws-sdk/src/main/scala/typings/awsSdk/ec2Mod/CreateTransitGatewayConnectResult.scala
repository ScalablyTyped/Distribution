package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTransitGatewayConnectResult extends StObject {
  
  /**
    * Information about the Connect attachment.
    */
  var TransitGatewayConnect: js.UndefOr[typings.awsSdk.ec2Mod.TransitGatewayConnect] = js.undefined
}
object CreateTransitGatewayConnectResult {
  
  inline def apply(): CreateTransitGatewayConnectResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateTransitGatewayConnectResult]
  }
  
  extension [Self <: CreateTransitGatewayConnectResult](x: Self) {
    
    inline def setTransitGatewayConnect(value: TransitGatewayConnect): Self = StObject.set(x, "TransitGatewayConnect", value.asInstanceOf[js.Any])
    
    inline def setTransitGatewayConnectUndefined: Self = StObject.set(x, "TransitGatewayConnect", js.undefined)
  }
}
