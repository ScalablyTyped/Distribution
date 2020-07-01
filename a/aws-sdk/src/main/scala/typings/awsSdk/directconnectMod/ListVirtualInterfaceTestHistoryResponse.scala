package typings.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListVirtualInterfaceTestHistoryResponse extends js.Object {
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * The ID of the tested virtual interface.
    */
  var virtualInterfaceTestHistory: js.UndefOr[VirtualInterfaceTestHistoryList] = js.native
}

object ListVirtualInterfaceTestHistoryResponse {
  @scala.inline
  def apply(
    nextToken: PaginationToken = null,
    virtualInterfaceTestHistory: VirtualInterfaceTestHistoryList = null
  ): ListVirtualInterfaceTestHistoryResponse = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (virtualInterfaceTestHistory != null) __obj.updateDynamic("virtualInterfaceTestHistory")(virtualInterfaceTestHistory.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListVirtualInterfaceTestHistoryResponse]
  }
}

