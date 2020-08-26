package typings.awsSdk.ssoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListAccountsRequest extends js.Object {
  /**
    * The token issued by the CreateToken API call. For more information, see CreateToken in the AWS SSO OIDC API Reference Guide.
    */
  var accessToken: AccessTokenType = js.native
  /**
    * This is the number of items clients can request per page.
    */
  var maxResults: js.UndefOr[MaxResultType] = js.native
  /**
    * (Optional) When requesting subsequent pages, this is the page token from the previous response output.
    */
  var nextToken: js.UndefOr[NextTokenType] = js.native
}

object ListAccountsRequest {
  @scala.inline
  def apply(accessToken: AccessTokenType): ListAccountsRequest = {
    val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAccountsRequest]
  }
  @scala.inline
  implicit class ListAccountsRequestOps[Self <: ListAccountsRequest] (val x: Self) extends AnyVal {
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
    def setAccessToken(value: AccessTokenType): Self = this.set("accessToken", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxResults(value: MaxResultType): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    @scala.inline
    def setNextToken(value: NextTokenType): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
  
}

