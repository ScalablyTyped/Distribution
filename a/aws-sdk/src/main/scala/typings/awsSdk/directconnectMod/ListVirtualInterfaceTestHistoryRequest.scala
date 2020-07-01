package typings.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    bgpPeers: BGPPeerIdList = null,
    maxResults: js.UndefOr[MaxResultSetSize] = js.undefined,
    nextToken: PaginationToken = null,
    status: FailureTestHistoryStatus = null,
    testId: TestId = null,
    virtualInterfaceId: VirtualInterfaceId = null
  ): ListVirtualInterfaceTestHistoryRequest = {
    val __obj = js.Dynamic.literal()
    if (bgpPeers != null) __obj.updateDynamic("bgpPeers")(bgpPeers.asInstanceOf[js.Any])
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults.get.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (testId != null) __obj.updateDynamic("testId")(testId.asInstanceOf[js.Any])
    if (virtualInterfaceId != null) __obj.updateDynamic("virtualInterfaceId")(virtualInterfaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListVirtualInterfaceTestHistoryRequest]
  }
}

