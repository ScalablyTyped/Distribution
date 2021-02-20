package typings.awsSdk.sesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListIdentityPoliciesResponse extends StObject {
  
  /**
    * A list of names of policies that apply to the specified identity.
    */
  var PolicyNames: PolicyNameList = js.native
}
object ListIdentityPoliciesResponse {
  
  @scala.inline
  def apply(PolicyNames: PolicyNameList): ListIdentityPoliciesResponse = {
    val __obj = js.Dynamic.literal(PolicyNames = PolicyNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListIdentityPoliciesResponse]
  }
  
  @scala.inline
  implicit class ListIdentityPoliciesResponseMutableBuilder[Self <: ListIdentityPoliciesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPolicyNames(value: PolicyNameList): Self = StObject.set(x, "PolicyNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyNamesVarargs(value: PolicyName*): Self = StObject.set(x, "PolicyNames", js.Array(value :_*))
  }
}
