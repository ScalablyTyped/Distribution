package typings.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListVirtualInterfaceTestHistoryRequest extends js.Object {
  
  /**
    * The BGP peers that were placed in the DOWN state during the virtual interface failover test.
    */
  var bgpPeers: js.UndefOr[BGPPeerIdList] = js.native
  
  /**
    * The maximum number of results to return with a single call. To retrieve the remaining results, make another call with the returned nextToken value. If MaxResults is given a value larger than 100, only 100 results are returned.
    */
  var maxResults: js.UndefOr[MaxResultSetSize] = js.native
  
  /**
    * The token for the next page of results.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
  
  /**
    * The status of the virtual interface failover test.
    */
  var status: js.UndefOr[FailureTestHistoryStatus] = js.native
  
  /**
    * The ID of the virtual interface failover test.
    */
  var testId: js.UndefOr[TestId] = js.native
  
  /**
    * The ID of the virtual interface that was tested.
    */
  var virtualInterfaceId: js.UndefOr[VirtualInterfaceId] = js.native
}
object ListVirtualInterfaceTestHistoryRequest {
  
  @scala.inline
  def apply(): ListVirtualInterfaceTestHistoryRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListVirtualInterfaceTestHistoryRequest]
  }
  
  @scala.inline
  implicit class ListVirtualInterfaceTestHistoryRequestOps[Self <: ListVirtualInterfaceTestHistoryRequest] (val x: Self) extends AnyVal {
    
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
    def setMaxResults(value: MaxResultSetSize): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    
    @scala.inline
    def setStatus(value: FailureTestHistoryStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
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
