package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FirewallRuleInfo extends js.Object {
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
  implicit class FirewallRuleInfoOps[Self <: FirewallRuleInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEndIpAddress(value: String): Self = this.set("endIpAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def setServerName(value: String): Self = this.set("serverName", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartIpAddress(value: String): Self = this.set("startIpAddress", value.asInstanceOf[js.Any])
  }
  
}

