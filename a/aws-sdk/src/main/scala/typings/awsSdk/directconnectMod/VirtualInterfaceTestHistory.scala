package typings.awsSdk.directconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualInterfaceTestHistory extends StObject {
  
  /**
    * The BGP peers that were put in the DOWN state as part of the virtual interface failover test.
    */
  var bgpPeers: js.UndefOr[BGPPeerIdList] = js.undefined
  
  /**
    * The time that the virtual interface moves out of the DOWN state.
    */
  var endTime: js.UndefOr[EndTime] = js.undefined
  
  /**
    * The owner ID of the tested virtual interface.
    */
  var ownerAccount: js.UndefOr[OwnerAccount] = js.undefined
  
  /**
    * The time that the virtual interface moves to the DOWN state.
    */
  var startTime: js.UndefOr[StartTime] = js.undefined
  
  /**
    * The status of the virtual interface failover test.
    */
  var status: js.UndefOr[FailureTestHistoryStatus] = js.undefined
  
  /**
    * The time that the virtual interface failover test ran in minutes.
    */
  var testDurationInMinutes: js.UndefOr[TestDuration] = js.undefined
  
  /**
    * The ID of the virtual interface failover test.
    */
  var testId: js.UndefOr[TestId] = js.undefined
  
  /**
    * The ID of the tested virtual interface.
    */
  var virtualInterfaceId: js.UndefOr[VirtualInterfaceId] = js.undefined
}
object VirtualInterfaceTestHistory {
  
  @scala.inline
  def apply(): VirtualInterfaceTestHistory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VirtualInterfaceTestHistory]
  }
  
  @scala.inline
  implicit class VirtualInterfaceTestHistoryMutableBuilder[Self <: VirtualInterfaceTestHistory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBgpPeers(value: BGPPeerIdList): Self = StObject.set(x, "bgpPeers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBgpPeersUndefined: Self = StObject.set(x, "bgpPeers", js.undefined)
    
    @scala.inline
    def setBgpPeersVarargs(value: BGPPeerId*): Self = StObject.set(x, "bgpPeers", js.Array(value :_*))
    
    @scala.inline
    def setEndTime(value: EndTime): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    @scala.inline
    def setOwnerAccount(value: OwnerAccount): Self = StObject.set(x, "ownerAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerAccountUndefined: Self = StObject.set(x, "ownerAccount", js.undefined)
    
    @scala.inline
    def setStartTime(value: StartTime): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    @scala.inline
    def setStatus(value: FailureTestHistoryStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setTestDurationInMinutes(value: TestDuration): Self = StObject.set(x, "testDurationInMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestDurationInMinutesUndefined: Self = StObject.set(x, "testDurationInMinutes", js.undefined)
    
    @scala.inline
    def setTestId(value: TestId): Self = StObject.set(x, "testId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestIdUndefined: Self = StObject.set(x, "testId", js.undefined)
    
    @scala.inline
    def setVirtualInterfaceId(value: VirtualInterfaceId): Self = StObject.set(x, "virtualInterfaceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualInterfaceIdUndefined: Self = StObject.set(x, "virtualInterfaceId", js.undefined)
  }
}
