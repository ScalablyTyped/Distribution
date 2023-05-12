package typings.awsSdk2Types.clientsSesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListIdentityPoliciesResponse extends StObject {
  
  /**
    * A list of names of policies that apply to the specified identity.
    */
  var PolicyNames: PolicyNameList
}
object ListIdentityPoliciesResponse {
  
  inline def apply(PolicyNames: PolicyNameList): ListIdentityPoliciesResponse = {
    val __obj = js.Dynamic.literal(PolicyNames = PolicyNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListIdentityPoliciesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListIdentityPoliciesResponse] (val x: Self) extends AnyVal {
    
    inline def setPolicyNames(value: PolicyNameList): Self = StObject.set(x, "PolicyNames", value.asInstanceOf[js.Any])
    
    inline def setPolicyNamesVarargs(value: PolicyName*): Self = StObject.set(x, "PolicyNames", js.Array(value*))
  }
}
