package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirewallRuleInfo extends js.Object {
  var endIpAddress: String
  var serverName: String
  var startIpAddress: String
}

object FirewallRuleInfo {
  @scala.inline
  def apply(endIpAddress: String, serverName: String, startIpAddress: String): FirewallRuleInfo = {
    val __obj = js.Dynamic.literal(endIpAddress = endIpAddress.asInstanceOf[js.Any], serverName = serverName.asInstanceOf[js.Any], startIpAddress = startIpAddress.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FirewallRuleInfo]
  }
}

