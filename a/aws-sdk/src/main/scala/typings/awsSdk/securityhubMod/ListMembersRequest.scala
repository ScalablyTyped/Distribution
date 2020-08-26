package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListMembersRequest extends js.Object {
  /**
    * The maximum number of items to return in the response. 
    */
  var MaxResults: js.UndefOr[typings.awsSdk.securityhubMod.MaxResults] = js.native
  /**
    * The token that is required for pagination. On your first call to the ListMembers operation, set the value of this parameter to NULL. For subsequent calls to the operation, to continue listing data, set the value of this parameter to the value returned from the previous response.
    */
  var NextToken: js.UndefOr[typings.awsSdk.securityhubMod.NextToken] = js.native
  /**
    * Specifies which member accounts to include in the response based on their relationship status with the master account. The default value is TRUE. If OnlyAssociated is set to TRUE, the response includes member accounts whose relationship status with the master is set to ENABLED or DISABLED. If OnlyAssociated is set to FALSE, the response includes all existing member accounts. 
    */
  var OnlyAssociated: js.UndefOr[Boolean] = js.native
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
    def setMaxResults(value: MaxResults): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setOnlyAssociated(value: Boolean): Self = this.set("OnlyAssociated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnlyAssociated: Self = this.set("OnlyAssociated", js.undefined)
  }
  
}

