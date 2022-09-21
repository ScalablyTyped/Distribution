package typings.awsSdk.ssmincidentsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResourcePoliciesOutput extends StObject {
  
  /**
    * The pagination token to continue to the next page of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * Details about the resource policy attached to the response plan.
    */
  var resourcePolicies: ResourcePolicyList
}
object GetResourcePoliciesOutput {
  
  inline def apply(resourcePolicies: ResourcePolicyList): GetResourcePoliciesOutput = {
    val __obj = js.Dynamic.literal(resourcePolicies = resourcePolicies.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResourcePoliciesOutput]
  }
  
  extension [Self <: GetResourcePoliciesOutput](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setResourcePolicies(value: ResourcePolicyList): Self = StObject.set(x, "resourcePolicies", value.asInstanceOf[js.Any])
    
    inline def setResourcePoliciesVarargs(value: ResourcePolicy*): Self = StObject.set(x, "resourcePolicies", js.Array(value*))
  }
}
