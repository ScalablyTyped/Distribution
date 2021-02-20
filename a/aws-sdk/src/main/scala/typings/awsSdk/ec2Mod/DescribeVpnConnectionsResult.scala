package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeVpnConnectionsResult extends StObject {
  
  /**
    * Information about one or more VPN connections.
    */
  var VpnConnections: js.UndefOr[VpnConnectionList] = js.native
}
object DescribeVpnConnectionsResult {
  
  @scala.inline
  def apply(): DescribeVpnConnectionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeVpnConnectionsResult]
  }
  
  @scala.inline
  implicit class DescribeVpnConnectionsResultMutableBuilder[Self <: DescribeVpnConnectionsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVpnConnections(value: VpnConnectionList): Self = StObject.set(x, "VpnConnections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpnConnectionsUndefined: Self = StObject.set(x, "VpnConnections", js.undefined)
    
    @scala.inline
    def setVpnConnectionsVarargs(value: VpnConnection*): Self = StObject.set(x, "VpnConnections", js.Array(value :_*))
  }
}
