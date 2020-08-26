package typings.awsSdk.fmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListProtocolsListsResponse extends js.Object {
  /**
    * If you specify a value for MaxResults in your list request, and you have more objects than the maximum, AWS Firewall Manager returns this token in the response. You can use this token in subsequent requests to retrieve the next batch of objects.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * An array of ProtocolsListDataSummary objects.
    */
  var ProtocolsLists: js.UndefOr[ProtocolsListsData] = js.native
}

object ListProtocolsListsResponse {
  @scala.inline
  def apply(): ListProtocolsListsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListProtocolsListsResponse]
  }
  @scala.inline
  implicit class ListProtocolsListsResponseOps[Self <: ListProtocolsListsResponse] (val x: Self) extends AnyVal {
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
    def setNextToken(value: PaginationToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setProtocolsListsVarargs(value: ProtocolsListDataSummary*): Self = this.set("ProtocolsLists", js.Array(value :_*))
    @scala.inline
    def setProtocolsLists(value: ProtocolsListsData): Self = this.set("ProtocolsLists", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProtocolsLists: Self = this.set("ProtocolsLists", js.undefined)
  }
  
}

