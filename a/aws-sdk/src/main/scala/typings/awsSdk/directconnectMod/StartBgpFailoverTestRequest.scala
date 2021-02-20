package typings.awsSdk.directconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartBgpFailoverTestRequest extends StObject {
  
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
  implicit class StartBgpFailoverTestRequestMutableBuilder[Self <: StartBgpFailoverTestRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBgpPeers(value: BGPPeerIdList): Self = StObject.set(x, "bgpPeers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBgpPeersUndefined: Self = StObject.set(x, "bgpPeers", js.undefined)
    
    @scala.inline
    def setBgpPeersVarargs(value: BGPPeerId*): Self = StObject.set(x, "bgpPeers", js.Array(value :_*))
    
    @scala.inline
    def setTestDurationInMinutes(value: TestDuration): Self = StObject.set(x, "testDurationInMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestDurationInMinutesUndefined: Self = StObject.set(x, "testDurationInMinutes", js.undefined)
    
    @scala.inline
    def setVirtualInterfaceId(value: VirtualInterfaceId): Self = StObject.set(x, "virtualInterfaceId", value.asInstanceOf[js.Any])
  }
}
