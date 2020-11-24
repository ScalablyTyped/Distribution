package typings.awsSdk.cognitoidentityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListIdentityPoolsResponse extends js.Object {
  
  /**
    * The identity pools returned by the ListIdentityPools action.
    */
  var IdentityPools: js.UndefOr[IdentityPoolsList] = js.native
  
  /**
    * A pagination token.
    */
  var NextToken: js.UndefOr[PaginationKey] = js.native
}
object ListIdentityPoolsResponse {
  
  @scala.inline
  def apply(): ListIdentityPoolsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListIdentityPoolsResponse]
  }
  
  @scala.inline
  implicit class ListIdentityPoolsResponseOps[Self <: ListIdentityPoolsResponse] (val x: Self) extends AnyVal {
    
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
    def setIdentityPoolsVarargs(value: IdentityPoolShortDescription*): Self = this.set("IdentityPools", js.Array(value :_*))
    
    @scala.inline
    def setIdentityPools(value: IdentityPoolsList): Self = this.set("IdentityPools", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdentityPools: Self = this.set("IdentityPools", js.undefined)
    
    @scala.inline
    def setNextToken(value: PaginationKey): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
