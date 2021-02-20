package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FirewallRuleInfo extends StObject {
  
  var endIpAddress: String = js.native
  
  var serverName: String = js.native
  
  var startIpAddress: String = js.native
}
object FirewallRuleInfo {
  
  @scala.inline
  def apply(endIpAddress: String, serverName: String, startIpAddress: String): FirewallRuleInfo = {
    val __obj = js.Dynamic.literal(endIpAddress = endIpAddress.asInstanceOf[js.Any], serverName = serverName.asInstanceOf[js.Any], startIpAddress = startIpAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirewallRuleInfo]
  }
  
  @scala.inline
  implicit class FirewallRuleInfoMutableBuilder[Self <: FirewallRuleInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndIpAddress(value: String): Self = StObject.set(x, "endIpAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerName(value: String): Self = StObject.set(x, "serverName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartIpAddress(value: String): Self = StObject.set(x, "startIpAddress", value.asInstanceOf[js.Any])
  }
}
