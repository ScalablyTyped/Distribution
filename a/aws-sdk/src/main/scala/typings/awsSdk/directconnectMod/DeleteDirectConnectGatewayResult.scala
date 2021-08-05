package typings.awsSdk.directconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDirectConnectGatewayResult extends StObject {
  
  /**
    * The Direct Connect gateway.
    */
  var directConnectGateway: js.UndefOr[DirectConnectGateway] = js.undefined
}
object DeleteDirectConnectGatewayResult {
  
  inline def apply(): DeleteDirectConnectGatewayResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteDirectConnectGatewayResult]
  }
  
  extension [Self <: DeleteDirectConnectGatewayResult](x: Self) {
    
    inline def setDirectConnectGateway(value: DirectConnectGateway): Self = StObject.set(x, "directConnectGateway", value.asInstanceOf[js.Any])
    
    inline def setDirectConnectGatewayUndefined: Self = StObject.set(x, "directConnectGateway", js.undefined)
  }
}
