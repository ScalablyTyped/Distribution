package typings.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartBgpFailoverTestRequest extends js.Object {
  /**
    * The BGP peers to place in the DOWN state.
    */
  var bgpPeers: js.UndefOr[BGPPeerIdList] = js.native
  /**
    * The time in minutes that the virtual interface failover test will last. Maximum value: 180 minutes (3 hours). Default: 180 minutes (3 hours).
    */
  var testDurationInMinutes: js.UndefOr[TestDuration] = js.native
  /**
    * The ID of the virtual interface you want to test.
    */
  var virtualInterfaceId: VirtualInterfaceId = js.native
}

object StartBgpFailoverTestRequest {
  @scala.inline
  def apply(virtualInterfaceId: VirtualInterfaceId): StartBgpFailoverTestRequest = {
    val __obj = js.Dynamic.literal(virtualInterfaceId = virtualInterfaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartBgpFailoverTestRequest]
  }
  @scala.inline
  implicit class StartBgpFailoverTestRequestOps[Self <: StartBgpFailoverTestRequest] (val x: Self) extends AnyVal {
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
    def setVirtualInterfaceId(value: VirtualInterfaceId): Self = this.set("virtualInterfaceId", value.asInstanceOf[js.Any])
    @scala.inline
    def setBgpPeersVarargs(value: BGPPeerId*): Self = this.set("bgpPeers", js.Array(value :_*))
    @scala.inline
    def setBgpPeers(value: BGPPeerIdList): Self = this.set("bgpPeers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBgpPeers: Self = this.set("bgpPeers", js.undefined)
    @scala.inline
    def setTestDurationInMinutes(value: TestDuration): Self = this.set("testDurationInMinutes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTestDurationInMinutes: Self = this.set("testDurationInMinutes", js.undefined)
  }
  
}

