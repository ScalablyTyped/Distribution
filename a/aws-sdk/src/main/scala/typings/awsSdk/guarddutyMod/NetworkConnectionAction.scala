package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NetworkConnectionAction extends StObject {
  
  /**
    * Indicates whether EC2 blocked the network connection to your instance.
    */
  var Blocked: js.UndefOr[Boolean] = js.native
  
  /**
    * The network connection direction.
    */
  var ConnectionDirection: js.UndefOr[String] = js.native
  
  /**
    * The local IP information of the connection.
    */
  var LocalIpDetails: js.UndefOr[typings.awsSdk.guarddutyMod.LocalIpDetails] = js.native
  
  /**
    * The local port information of the connection.
    */
  var LocalPortDetails: js.UndefOr[typings.awsSdk.guarddutyMod.LocalPortDetails] = js.native
  
  /**
    * The network connection protocol.
    */
  var Protocol: js.UndefOr[String] = js.native
  
  /**
    * The remote IP information of the connection.
    */
  var RemoteIpDetails: js.UndefOr[typings.awsSdk.guarddutyMod.RemoteIpDetails] = js.native
  
  /**
    * The remote port information of the connection.
    */
  var RemotePortDetails: js.UndefOr[typings.awsSdk.guarddutyMod.RemotePortDetails] = js.native
}
object NetworkConnectionAction {
  
  @scala.inline
  def apply(): NetworkConnectionAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkConnectionAction]
  }
  
  @scala.inline
  implicit class NetworkConnectionActionMutableBuilder[Self <: NetworkConnectionAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlocked(value: Boolean): Self = StObject.set(x, "Blocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockedUndefined: Self = StObject.set(x, "Blocked", js.undefined)
    
    @scala.inline
    def setConnectionDirection(value: String): Self = StObject.set(x, "ConnectionDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionDirectionUndefined: Self = StObject.set(x, "ConnectionDirection", js.undefined)
    
    @scala.inline
    def setLocalIpDetails(value: LocalIpDetails): Self = StObject.set(x, "LocalIpDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalIpDetailsUndefined: Self = StObject.set(x, "LocalIpDetails", js.undefined)
    
    @scala.inline
    def setLocalPortDetails(value: LocalPortDetails): Self = StObject.set(x, "LocalPortDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalPortDetailsUndefined: Self = StObject.set(x, "LocalPortDetails", js.undefined)
    
    @scala.inline
    def setProtocol(value: String): Self = StObject.set(x, "Protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocolUndefined: Self = StObject.set(x, "Protocol", js.undefined)
    
    @scala.inline
    def setRemoteIpDetails(value: RemoteIpDetails): Self = StObject.set(x, "RemoteIpDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoteIpDetailsUndefined: Self = StObject.set(x, "RemoteIpDetails", js.undefined)
    
    @scala.inline
    def setRemotePortDetails(value: RemotePortDetails): Self = StObject.set(x, "RemotePortDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemotePortDetailsUndefined: Self = StObject.set(x, "RemotePortDetails", js.undefined)
  }
}
