package typings.awsSdk.cognitoidentityMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListIdentityPoolsResponse extends StObject {
  
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
  implicit class ListIdentityPoolsResponseMutableBuilder[Self <: ListIdentityPoolsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIdentityPools(value: IdentityPoolsList): Self = StObject.set(x, "IdentityPools", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentityPoolsUndefined: Self = StObject.set(x, "IdentityPools", js.undefined)
    
    @scala.inline
    def setIdentityPoolsVarargs(value: IdentityPoolShortDescription*): Self = StObject.set(x, "IdentityPools", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: PaginationKey): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
