package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListUserPoolsRequest extends js.Object {
  /**
    * The maximum number of results you want the request to return when listing the user pools.
    */
  var MaxResults: PoolQueryLimitType = js.native
  /**
    * An identifier that was returned from the previous call to this operation, which can be used to return the next set of items in the list.
    */
  var NextToken: js.UndefOr[PaginationKeyType] = js.native
}

object ListUserPoolsRequest {
  @scala.inline
  def apply(MaxResults: PoolQueryLimitType): ListUserPoolsRequest = {
    val __obj = js.Dynamic.literal(MaxResults = MaxResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListUserPoolsRequest]
  }
  @scala.inline
  implicit class ListUserPoolsRequestOps[Self <: ListUserPoolsRequest] (val x: Self) extends AnyVal {
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
    def setMaxResults(value: PoolQueryLimitType): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def setNextToken(value: PaginationKeyType): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

