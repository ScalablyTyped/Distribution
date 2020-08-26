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
  def apply(): ListVirtualInterfaceTestHistoryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListVirtualInterfaceTestHistoryResponse]
  }
  @scala.inline
  implicit class ListVirtualInterfaceTestHistoryResponseOps[Self <: ListVirtualInterfaceTestHistoryResponse] (val x: Self) extends AnyVal {
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
    def setNextToken(value: PaginationToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    @scala.inline
    def setVirtualInterfaceTestHistoryVarargs(value: VirtualInterfaceTestHistory*): Self = this.set("virtualInterfaceTestHistory", js.Array(value :_*))
    @scala.inline
    def setVirtualInterfaceTestHistory(value: VirtualInterfaceTestHistoryList): Self = this.set("virtualInterfaceTestHistory", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVirtualInterfaceTestHistory: Self = this.set("virtualInterfaceTestHistory", js.undefined)
  }
  
}

