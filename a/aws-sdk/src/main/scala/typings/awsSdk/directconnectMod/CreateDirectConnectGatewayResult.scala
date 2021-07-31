package typings.awsSdk.directconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDirectConnectGatewayResult extends StObject {
  
  /**
    * The Direct Connect gateway.
    */
  var directConnectGateway: js.UndefOr[DirectConnectGateway] = js.undefined
}
object CreateDirectConnectGatewayResult {
  
  @scala.inline
  def apply(): CreateDirectConnectGatewayResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDirectConnectGatewayResult]
  }
  
  @scala.inline
  implicit class CreateDirectConnectGatewayResultMutableBuilder[Self <: CreateDirectConnectGatewayResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirectConnectGateway(value: DirectConnectGateway): Self = StObject.set(x, "directConnectGateway", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectConnectGatewayUndefined: Self = StObject.set(x, "directConnectGateway", js.undefined)
  }
}
