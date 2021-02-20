package typings.awsSdkClientCognitoIdentity.models0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListIdentityPoolsResponse extends StObject {
  
  /**
    * <p>The identity pools returned by the ListIdentityPools action.</p>
    */
  var IdentityPools: js.UndefOr[js.Array[IdentityPoolShortDescription]] = js.native
  
  /**
    * <p>A pagination token.</p>
    */
  var NextToken: js.UndefOr[String] = js.native
}
object ListIdentityPoolsResponse {
  
  @scala.inline
  def apply(): ListIdentityPoolsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListIdentityPoolsResponse]
  }
  
  @JSImport("@aws-sdk/client-cognito-identity/types/models/models_0", "ListIdentityPoolsResponse.filterSensitiveLog")
  @js.native
  def filterSensitiveLog(obj: ListIdentityPoolsResponse): js.Any = js.native
  
  @scala.inline
  implicit class ListIdentityPoolsResponseMutableBuilder[Self <: ListIdentityPoolsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIdentityPools(value: js.Array[IdentityPoolShortDescription]): Self = StObject.set(x, "IdentityPools", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentityPoolsUndefined: Self = StObject.set(x, "IdentityPools", js.undefined)
    
    @scala.inline
    def setIdentityPoolsVarargs(value: IdentityPoolShortDescription*): Self = StObject.set(x, "IdentityPools", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
