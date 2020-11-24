package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListUserPoolsResponse extends js.Object {
  
  /**
    * An identifier that was returned from the previous call to this operation, which can be used to return the next set of items in the list.
    */
  var NextToken: js.UndefOr[PaginationKeyType] = js.native
  
  /**
    * The user pools from the response to list users.
    */
  var UserPools: js.UndefOr[UserPoolListType] = js.native
}
object ListUserPoolsResponse {
  
  @scala.inline
  def apply(): ListUserPoolsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListUserPoolsResponse]
  }
  
  @scala.inline
  implicit class ListUserPoolsResponseOps[Self <: ListUserPoolsResponse] (val x: Self) extends AnyVal {
    
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
    def setNextToken(value: PaginationKeyType): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setUserPoolsVarargs(value: UserPoolDescriptionType*): Self = this.set("UserPools", js.Array(value :_*))
    
    @scala.inline
    def setUserPools(value: UserPoolListType): Self = this.set("UserPools", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserPools: Self = this.set("UserPools", js.undefined)
  }
}
