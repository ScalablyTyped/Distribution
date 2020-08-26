package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListMembersRequest extends js.Object {
  /**
    * The maximum number of items to include in each page of a paginated response.
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  /**
    * The nextToken string that specifies which page of results to return in a paginated response.
    */
  var nextToken: js.UndefOr[string] = js.native
  /**
    * Specifies which accounts to include in the response, based on the status of an account's relationship with the master account. By default, the response includes only current member accounts. To include all accounts, set the value for this parameter to false.
    */
  var onlyAssociated: js.UndefOr[string] = js.native
}

object ListMembersRequest {
  @scala.inline
  def apply(): ListMembersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListMembersRequest]
  }
  @scala.inline
  implicit class ListMembersRequestOps[Self <: ListMembersRequest] (val x: Self) extends AnyVal {
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
    def setMaxResults(value: MaxResults): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    @scala.inline
    def setNextToken(value: string): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    @scala.inline
    def setOnlyAssociated(value: string): Self = this.set("onlyAssociated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnlyAssociated: Self = this.set("onlyAssociated", js.undefined)
  }
  
}

