package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DnsServersOptionsModifyStructure extends js.Object {
  
  /**
    * The IPv4 address range, in CIDR notation, of the DNS servers to be used. You can specify up to two DNS servers. Ensure that the DNS servers can be reached by the clients. The specified values overwrite the existing values.
    */
  var CustomDnsServers: js.UndefOr[ValueStringList] = js.native
  
  /**
    * Indicates whether DNS servers should be used. Specify False to delete the existing DNS servers.
    */
  var Enabled: js.UndefOr[Boolean] = js.native
}
object DnsServersOptionsModifyStructure {
  
  @scala.inline
  def apply(): DnsServersOptionsModifyStructure = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DnsServersOptionsModifyStructure]
  }
  
  @scala.inline
  implicit class DnsServersOptionsModifyStructureOps[Self <: DnsServersOptionsModifyStructure] (val x: Self) extends AnyVal {
    
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
    def setCustomDnsServersVarargs(value: String*): Self = this.set("CustomDnsServers", js.Array(value :_*))
    
    @scala.inline
    def setCustomDnsServers(value: ValueStringList): Self = this.set("CustomDnsServers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomDnsServers: Self = this.set("CustomDnsServers", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("Enabled", js.undefined)
  }
}
