package typings.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VirtualInterfaceTestHistory extends js.Object {
  
  /**
    * The BGP peers that were put in the DOWN state as part of the virtual interface failover test.
    */
  var bgpPeers: js.UndefOr[BGPPeerIdList] = js.native
  
  /**
    * The time that the virtual interface moves out of the DOWN state.
    */
  var endTime: js.UndefOr[EndTime] = js.native
  
  /**
    * The owner ID of the tested virtual interface.
    */
  var ownerAccount: js.UndefOr[OwnerAccount] = js.native
  
  /**
    * The time that the virtual interface moves to the DOWN state.
    */
  var startTime: js.UndefOr[StartTime] = js.native
  
  /**
    * The status of the virtual interface failover test.
    */
  var status: js.UndefOr[FailureTestHistoryStatus] = js.native
  
  /**
    * The time that the virtual interface failover test ran in minutes.
    */
  var testDurationInMinutes: js.UndefOr[TestDuration] = js.native
  
  /**
    * The ID of the virtual interface failover test.
    */
  var testId: js.UndefOr[TestId] = js.native
  
  /**
    * The ID of the tested virtual interface.
    */
  var virtualInterfaceId: js.UndefOr[VirtualInterfaceId] = js.native
}
object VirtualInterfaceTestHistory {
  
  @scala.inline
  def apply(): VirtualInterfaceTestHistory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VirtualInterfaceTestHistory]
  }
  
  @scala.inline
  implicit class VirtualInterfaceTestHistoryOps[Self <: VirtualInterfaceTestHistory] (val x: Self) extends AnyVal {
    
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
    def setBgpPeersVarargs(value: BGPPeerId*): Self = this.set("bgpPeers", js.Array(value :_*))
    
    @scala.inline
    def setBgpPeers(value: BGPPeerIdList): Self = this.set("bgpPeers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBgpPeers: Self = this.set("bgpPeers", js.undefined)
    
    @scala.inline
    def setEndTime(value: EndTime): Self = this.set("endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndTime: Self = this.set("endTime", js.undefined)
    
    @scala.inline
    def setOwnerAccount(value: OwnerAccount): Self = this.set("ownerAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwnerAccount: Self = this.set("ownerAccount", js.undefined)
    
    @scala.inline
    def setStartTime(value: StartTime): Self = this.set("startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
    
    @scala.inline
    def setStatus(value: FailureTestHistoryStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setTestDurationInMinutes(value: TestDuration): Self = this.set("testDurationInMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestDurationInMinutes: Self = this.set("testDurationInMinutes", js.undefined)
    
    @scala.inline
    def setTestId(value: TestId): Self = this.set("testId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestId: Self = this.set("testId", js.undefined)
    
    @scala.inline
    def setVirtualInterfaceId(value: VirtualInterfaceId): Self = this.set("virtualInterfaceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVirtualInterfaceId: Self = this.set("virtualInterfaceId", js.undefined)
  }
}
