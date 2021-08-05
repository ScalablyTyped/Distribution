package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResourcePoliciesResponse extends StObject {
  
  /**
    * A list of the individual resource policies and the account-level resource policy.
    */
  var GetResourcePoliciesResponseList: js.UndefOr[typings.awsSdk.glueMod.GetResourcePoliciesResponseList] = js.undefined
  
  /**
    * A continuation token, if the returned list does not contain the last resource policy available.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
}
object GetResourcePoliciesResponse {
  
  inline def apply(): GetResourcePoliciesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetResourcePoliciesResponse]
  }
  
  extension [Self <: GetResourcePoliciesResponse](x: Self) {
    
    inline def setGetResourcePoliciesResponseList(value: GetResourcePoliciesResponseList): Self = StObject.set(x, "GetResourcePoliciesResponseList", value.asInstanceOf[js.Any])
    
    inline def setGetResourcePoliciesResponseListUndefined: Self = StObject.set(x, "GetResourcePoliciesResponseList", js.undefined)
    
    inline def setGetResourcePoliciesResponseListVarargs(value: GluePolicy*): Self = StObject.set(x, "GetResourcePoliciesResponseList", js.Array(value :_*))
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
