package typings.awsSdkClientCognitoIdentity.models0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListIdentitiesResponse extends StObject {
  
  /**
    * <p>An object containing a set of identities and associated mappings.</p>
    */
  var Identities: js.UndefOr[js.Array[IdentityDescription]] = js.undefined
  
  /**
    * <p>An identity pool ID in the format REGION:GUID.</p>
    */
  var IdentityPoolId: js.UndefOr[String] = js.undefined
  
  /**
    * <p>A pagination token.</p>
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListIdentitiesResponse {
  
  @scala.inline
  def apply(): ListIdentitiesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListIdentitiesResponse]
  }
  
  @JSImport("@aws-sdk/client-cognito-identity/types/models/models_0", "ListIdentitiesResponse")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def filterSensitiveLog(obj: ListIdentitiesResponse): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("filterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  implicit class ListIdentitiesResponseMutableBuilder[Self <: ListIdentitiesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIdentities(value: js.Array[IdentityDescription]): Self = StObject.set(x, "Identities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentitiesUndefined: Self = StObject.set(x, "Identities", js.undefined)
    
    @scala.inline
    def setIdentitiesVarargs(value: IdentityDescription*): Self = StObject.set(x, "Identities", js.Array(value :_*))
    
    @scala.inline
    def setIdentityPoolId(value: String): Self = StObject.set(x, "IdentityPoolId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentityPoolIdUndefined: Self = StObject.set(x, "IdentityPoolId", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
