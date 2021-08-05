package typings.awsSdk.iotsecuretunnelingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTunnelRequest extends StObject {
  
  /**
    * The tunnel to describe.
    */
  var tunnelId: TunnelId
}
object DescribeTunnelRequest {
  
  inline def apply(tunnelId: TunnelId): DescribeTunnelRequest = {
    val __obj = js.Dynamic.literal(tunnelId = tunnelId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTunnelRequest]
  }
  
  extension [Self <: DescribeTunnelRequest](x: Self) {
    
    inline def setTunnelId(value: TunnelId): Self = StObject.set(x, "tunnelId", value.asInstanceOf[js.Any])
  }
}
