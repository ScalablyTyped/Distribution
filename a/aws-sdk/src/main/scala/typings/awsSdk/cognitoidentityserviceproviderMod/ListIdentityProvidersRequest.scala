package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListIdentityProvidersRequest extends js.Object {
  /**
    * The maximum number of identity providers to return.
    */
  var MaxResults: js.UndefOr[ListProvidersLimitType] = js.native
  /**
    * A pagination token.
    */
  var NextToken: js.UndefOr[PaginationKeyType] = js.native
  /**
    * The user pool ID.
    */
  var UserPoolId: UserPoolIdType = js.native
}

object ListIdentityProvidersRequest {
  @scala.inline
  def apply(UserPoolId: UserPoolIdType): ListIdentityProvidersRequest = {
    val __obj = js.Dynamic.literal(UserPoolId = UserPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListIdentityProvidersRequest]
  }
  @scala.inline
  implicit class ListIdentityProvidersRequestOps[Self <: ListIdentityProvidersRequest] (val x: Self) extends AnyVal {
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
    def setUserPoolId(value: UserPoolIdType): Self = this.set("UserPoolId", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxResults(value: ListProvidersLimitType): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNextToken(value: PaginationKeyType): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

