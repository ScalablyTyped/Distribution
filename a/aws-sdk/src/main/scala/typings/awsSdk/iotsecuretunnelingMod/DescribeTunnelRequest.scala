package typings.awsSdk.iotsecuretunnelingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeTunnelRequest extends StObject {
  
  /**
    * The tunnel to describe.
    */
  var tunnelId: TunnelId = js.native
}
object DescribeTunnelRequest {
  
  @scala.inline
  def apply(tunnelId: TunnelId): DescribeTunnelRequest = {
    val __obj = js.Dynamic.literal(tunnelId = tunnelId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTunnelRequest]
  }
  
  @scala.inline
  implicit class DescribeTunnelRequestMutableBuilder[Self <: DescribeTunnelRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTunnelId(value: TunnelId): Self = StObject.set(x, "tunnelId", value.asInstanceOf[js.Any])
  }
}
