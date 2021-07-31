package typings.awsSdk.iotsecuretunnelingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloseTunnelRequest extends StObject {
  
  /**
    * When set to true, AWS IoT Secure Tunneling deletes the tunnel data immediately.
    */
  var delete: js.UndefOr[DeleteFlag] = js.undefined
  
  /**
    * The ID of the tunnel to close.
    */
  var tunnelId: TunnelId
}
object CloseTunnelRequest {
  
  @scala.inline
  def apply(tunnelId: TunnelId): CloseTunnelRequest = {
    val __obj = js.Dynamic.literal(tunnelId = tunnelId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloseTunnelRequest]
  }
  
  @scala.inline
  implicit class CloseTunnelRequestMutableBuilder[Self <: CloseTunnelRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDelete(value: DeleteFlag): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteUndefined: Self = StObject.set(x, "delete", js.undefined)
    
    @scala.inline
    def setTunnelId(value: TunnelId): Self = StObject.set(x, "tunnelId", value.asInstanceOf[js.Any])
  }
}
