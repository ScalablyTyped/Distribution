package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeVpnConnectionsResult extends js.Object {
  
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
  implicit class DescribeVpnConnectionsResultOps[Self <: DescribeVpnConnectionsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setVpnConnectionsVarargs(value: VpnConnection*): Self = this.set("VpnConnections", js.Array(value :_*))
    
    @scala.inline
    def setVpnConnections(value: VpnConnectionList): Self = this.set("VpnConnections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVpnConnections: Self = this.set("VpnConnections", js.undefined)
  }
}
