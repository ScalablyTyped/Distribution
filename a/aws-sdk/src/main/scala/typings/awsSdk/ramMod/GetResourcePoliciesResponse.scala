package typings.awsSdk.ramMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResourcePoliciesResponse extends StObject {
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[String] = js.undefined
  
  /**
    * A key policy document, in JSON format.
    */
  var policies: js.UndefOr[PolicyList] = js.undefined
}
object GetResourcePoliciesResponse {
  
  @scala.inline
  def apply(): GetResourcePoliciesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetResourcePoliciesResponse]
  }
  
  @scala.inline
  implicit class GetResourcePoliciesResponseMutableBuilder[Self <: GetResourcePoliciesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setPolicies(value: PolicyList): Self = StObject.set(x, "policies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoliciesUndefined: Self = StObject.set(x, "policies", js.undefined)
    
    @scala.inline
    def setPoliciesVarargs(value: Policy*): Self = StObject.set(x, "policies", js.Array(value :_*))
  }
}
