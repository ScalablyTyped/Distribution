package typings.awsSdk.cloudwatchlogsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeResourcePoliciesResponse extends StObject {
  
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * The resource policies that exist in this account.
    */
  var resourcePolicies: js.UndefOr[ResourcePolicies] = js.undefined
}
object DescribeResourcePoliciesResponse {
  
  @scala.inline
  def apply(): DescribeResourcePoliciesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeResourcePoliciesResponse]
  }
  
  @scala.inline
  implicit class DescribeResourcePoliciesResponseMutableBuilder[Self <: DescribeResourcePoliciesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setResourcePolicies(value: ResourcePolicies): Self = StObject.set(x, "resourcePolicies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourcePoliciesUndefined: Self = StObject.set(x, "resourcePolicies", js.undefined)
    
    @scala.inline
    def setResourcePoliciesVarargs(value: ResourcePolicy*): Self = StObject.set(x, "resourcePolicies", js.Array(value :_*))
  }
}
