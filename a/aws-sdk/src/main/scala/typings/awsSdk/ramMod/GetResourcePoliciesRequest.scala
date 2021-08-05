package typings.awsSdk.ramMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResourcePoliciesRequest extends StObject {
  
  /**
    * The maximum number of results to return with a single call. To retrieve the remaining results, make another call with the returned nextToken value.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * The token for the next page of results.
    */
  var nextToken: js.UndefOr[String] = js.undefined
  
  /**
    * The principal.
    */
  var principal: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Resource Names (ARN) of the resources.
    */
  var resourceArns: ResourceArnList
}
object GetResourcePoliciesRequest {
  
  inline def apply(resourceArns: ResourceArnList): GetResourcePoliciesRequest = {
    val __obj = js.Dynamic.literal(resourceArns = resourceArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResourcePoliciesRequest]
  }
  
  extension [Self <: GetResourcePoliciesRequest](x: Self) {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setPrincipal(value: String): Self = StObject.set(x, "principal", value.asInstanceOf[js.Any])
    
    inline def setPrincipalUndefined: Self = StObject.set(x, "principal", js.undefined)
    
    inline def setResourceArns(value: ResourceArnList): Self = StObject.set(x, "resourceArns", value.asInstanceOf[js.Any])
    
    inline def setResourceArnsVarargs(value: String*): Self = StObject.set(x, "resourceArns", js.Array(value :_*))
  }
}
