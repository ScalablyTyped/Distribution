package typings.awsSdk.cognitoidentityMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LookupDeveloperIdentityResponse extends StObject {
  
  /**
    * This is the list of developer user identifiers associated with an identity ID. Cognito supports the association of multiple developer user identifiers with an identity ID.
    */
  var DeveloperUserIdentifierList: js.UndefOr[typings.awsSdk.cognitoidentityMod.DeveloperUserIdentifierList] = js.undefined
  
  /**
    * A unique identifier in the format REGION:GUID.
    */
  var IdentityId: js.UndefOr[typings.awsSdk.cognitoidentityMod.IdentityId] = js.undefined
  
  /**
    * A pagination token. The first call you make will have NextToken set to null. After that the service will return NextToken values as needed. For example, let's say you make a request with MaxResults set to 10, and there are 20 matches in the database. The service will return a pagination token as a part of the response. This token can be used to call the API again and get results starting from the 11th match.
    */
  var NextToken: js.UndefOr[PaginationKey] = js.undefined
}
object LookupDeveloperIdentityResponse {
  
  @scala.inline
  def apply(): LookupDeveloperIdentityResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LookupDeveloperIdentityResponse]
  }
  
  @scala.inline
  implicit class LookupDeveloperIdentityResponseMutableBuilder[Self <: LookupDeveloperIdentityResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeveloperUserIdentifierList(value: DeveloperUserIdentifierList): Self = StObject.set(x, "DeveloperUserIdentifierList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeveloperUserIdentifierListUndefined: Self = StObject.set(x, "DeveloperUserIdentifierList", js.undefined)
    
    @scala.inline
    def setDeveloperUserIdentifierListVarargs(value: DeveloperUserIdentifier*): Self = StObject.set(x, "DeveloperUserIdentifierList", js.Array(value :_*))
    
    @scala.inline
    def setIdentityId(value: IdentityId): Self = StObject.set(x, "IdentityId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentityIdUndefined: Self = StObject.set(x, "IdentityId", js.undefined)
    
    @scala.inline
    def setNextToken(value: PaginationKey): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
