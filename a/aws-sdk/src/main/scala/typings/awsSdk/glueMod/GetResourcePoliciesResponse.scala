package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetResourcePoliciesResponse extends StObject {
  
  /**
    * A list of the individual resource policies and the account-level resource policy.
    */
  var GetResourcePoliciesResponseList: js.UndefOr[typings.awsSdk.glueMod.GetResourcePoliciesResponseList] = js.native
  
  /**
    * A continuation token, if the returned list does not contain the last resource policy available.
    */
  var NextToken: js.UndefOr[Token] = js.native
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
    def setGetResourcePoliciesResponseList(value: GetResourcePoliciesResponseList): Self = StObject.set(x, "GetResourcePoliciesResponseList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetResourcePoliciesResponseListUndefined: Self = StObject.set(x, "GetResourcePoliciesResponseList", js.undefined)
    
    @scala.inline
    def setGetResourcePoliciesResponseListVarargs(value: GluePolicy*): Self = StObject.set(x, "GetResourcePoliciesResponseList", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
