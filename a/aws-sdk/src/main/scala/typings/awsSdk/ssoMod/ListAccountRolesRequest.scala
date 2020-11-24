package typings.awsSdk.ssoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListAccountRolesRequest extends js.Object {
  
  /**
    * The token issued by the CreateToken API call. For more information, see CreateToken in the AWS SSO OIDC API Reference Guide.
    */
  var accessToken: AccessTokenType = js.native
  
  /**
    * The identifier for the AWS account that is assigned to the user.
    */
  var accountId: AccountIdType = js.native
  
  /**
    * The number of items that clients can request per page.
    */
  var maxResults: js.UndefOr[MaxResultType] = js.native
  
  /**
    * The page token from the previous response output when you request subsequent pages.
    */
  var nextToken: js.UndefOr[NextTokenType] = js.native
}
object ListAccountRolesRequest {
  
  @scala.inline
  def apply(accessToken: AccessTokenType, accountId: AccountIdType): ListAccountRolesRequest = {
    val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], accountId = accountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAccountRolesRequest]
  }
  
  @scala.inline
  implicit class ListAccountRolesRequestOps[Self <: ListAccountRolesRequest] (val x: Self) extends AnyVal {
    
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
    def setAccountId(value: AccountIdType): Self = this.set("accountId", value.asInstanceOf[js.Any])
    
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
