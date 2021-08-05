package typings.awsSdk.iotsecuretunnelingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTunnelResponse extends StObject {
  
  /**
    * The tunnel being described.
    */
  var tunnel: js.UndefOr[Tunnel] = js.undefined
}
object DescribeTunnelResponse {
  
  inline def apply(): DescribeTunnelResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTunnelResponse]
  }
  
  extension [Self <: DescribeTunnelResponse](x: Self) {
    
    inline def setTunnel(value: Tunnel): Self = StObject.set(x, "tunnel", value.asInstanceOf[js.Any])
    
    inline def setTunnelUndefined: Self = StObject.set(x, "tunnel", js.undefined)
  }
}
