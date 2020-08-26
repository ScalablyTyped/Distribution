package typings.awsSdk.discoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AgentNetworkInfo extends js.Object {
  /**
    * The IP address for the host where the agent/connector resides.
    */
  var ipAddress: js.UndefOr[String] = js.native
  /**
    * The MAC address for the host where the agent/connector resides.
    */
  var macAddress: js.UndefOr[String] = js.native
}

object AgentNetworkInfo {
  @scala.inline
  def apply(): AgentNetworkInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AgentNetworkInfo]
  }
  @scala.inline
  implicit class AgentNetworkInfoOps[Self <: AgentNetworkInfo] (val x: Self) extends AnyVal {
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
    def setIpAddress(value: String): Self = this.set("ipAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIpAddress: Self = this.set("ipAddress", js.undefined)
    @scala.inline
    def setMacAddress(value: String): Self = this.set("macAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMacAddress: Self = this.set("macAddress", js.undefined)
  }
  
}

