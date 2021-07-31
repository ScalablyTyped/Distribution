package typings.awsSdk.cognitoidentityMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListIdentitiesResponse extends StObject {
  
  /**
    * An object containing a set of identities and associated mappings.
    */
  var Identities: js.UndefOr[IdentitiesList] = js.undefined
  
  /**
    * An identity pool ID in the format REGION:GUID.
    */
  var IdentityPoolId: js.UndefOr[typings.awsSdk.cognitoidentityMod.IdentityPoolId] = js.undefined
  
  /**
    * A pagination token.
    */
  var NextToken: js.UndefOr[PaginationKey] = js.undefined
}
object ListIdentitiesResponse {
  
  @scala.inline
  def apply(): ListIdentitiesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListIdentitiesResponse]
  }
  
  @scala.inline
  implicit class ListIdentitiesResponseMutableBuilder[Self <: ListIdentitiesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIdentities(value: IdentitiesList): Self = StObject.set(x, "Identities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentitiesUndefined: Self = StObject.set(x, "Identities", js.undefined)
    
    @scala.inline
    def setIdentitiesVarargs(value: IdentityDescription*): Self = StObject.set(x, "Identities", js.Array(value :_*))
    
    @scala.inline
    def setIdentityPoolId(value: IdentityPoolId): Self = StObject.set(x, "IdentityPoolId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentityPoolIdUndefined: Self = StObject.set(x, "IdentityPoolId", js.undefined)
    
    @scala.inline
    def setNextToken(value: PaginationKey): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
