package typings.awsSdkClientCognitoIdentity.models0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LookupDeveloperIdentityInput extends StObject {
  
  /**
    * <p>A unique ID used by your backend authentication process to identify a user.
    *          Typically, a developer identity provider would issue many developer user identifiers, in
    *          keeping with the number of users.</p>
    */
  var DeveloperUserIdentifier: js.UndefOr[String] = js.undefined
  
  /**
    * <p>A unique identifier in the format REGION:GUID.</p>
    */
  var IdentityId: js.UndefOr[String] = js.undefined
  
  /**
    * <p>An identity pool ID in the format REGION:GUID.</p>
    */
  var IdentityPoolId: js.UndefOr[String] = js.undefined
  
  /**
    * <p>The maximum number of identities to return.</p>
    */
  var MaxResults: js.UndefOr[Double] = js.undefined
  
  /**
    * <p>A pagination token. The first call you make will have <code>NextToken</code> set to
    *          null. After that the service will return <code>NextToken</code> values as needed. For
    *          example, let's say you make a request with <code>MaxResults</code> set to 10, and there are
    *          20 matches in the database. The service will return a pagination token as a part of the
    *          response. This token can be used to call the API again and get results starting from the
    *          11th match.</p>
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object LookupDeveloperIdentityInput {
  
  inline def apply(): LookupDeveloperIdentityInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LookupDeveloperIdentityInput]
  }
  
  extension [Self <: LookupDeveloperIdentityInput](x: Self) {
    
    inline def setDeveloperUserIdentifier(value: String): Self = StObject.set(x, "DeveloperUserIdentifier", value.asInstanceOf[js.Any])
    
    inline def setDeveloperUserIdentifierUndefined: Self = StObject.set(x, "DeveloperUserIdentifier", js.undefined)
    
    inline def setIdentityId(value: String): Self = StObject.set(x, "IdentityId", value.asInstanceOf[js.Any])
    
    inline def setIdentityIdUndefined: Self = StObject.set(x, "IdentityId", js.undefined)
    
    inline def setIdentityPoolId(value: String): Self = StObject.set(x, "IdentityPoolId", value.asInstanceOf[js.Any])
    
    inline def setIdentityPoolIdUndefined: Self = StObject.set(x, "IdentityPoolId", js.undefined)
    
    inline def setMaxResults(value: Double): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
