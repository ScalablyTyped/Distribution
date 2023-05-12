package typings.awsSdk.clientsXrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListResourcePoliciesResult extends StObject {
  
  /**
    * Pagination token. Not currently supported.
    */
  var NextToken: js.UndefOr[ResourcePolicyNextToken] = js.undefined
  
  /**
    * The list of resource policies in the target Amazon Web Services account.
    */
  var ResourcePolicies: js.UndefOr[ResourcePolicyList] = js.undefined
}
object ListResourcePoliciesResult {
  
  inline def apply(): ListResourcePoliciesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListResourcePoliciesResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListResourcePoliciesResult] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: ResourcePolicyNextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setResourcePolicies(value: ResourcePolicyList): Self = StObject.set(x, "ResourcePolicies", value.asInstanceOf[js.Any])
    
    inline def setResourcePoliciesUndefined: Self = StObject.set(x, "ResourcePolicies", js.undefined)
    
    inline def setResourcePoliciesVarargs(value: ResourcePolicy*): Self = StObject.set(x, "ResourcePolicies", js.Array(value*))
  }
}
