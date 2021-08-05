package typings.awsSdk.cloudsearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeServiceAccessPoliciesResponse extends StObject {
  
  /**
    * The access rules configured for the domain specified in the request.
    */
  var AccessPolicies: AccessPoliciesStatus
}
object DescribeServiceAccessPoliciesResponse {
  
  inline def apply(AccessPolicies: AccessPoliciesStatus): DescribeServiceAccessPoliciesResponse = {
    val __obj = js.Dynamic.literal(AccessPolicies = AccessPolicies.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeServiceAccessPoliciesResponse]
  }
  
  extension [Self <: DescribeServiceAccessPoliciesResponse](x: Self) {
    
    inline def setAccessPolicies(value: AccessPoliciesStatus): Self = StObject.set(x, "AccessPolicies", value.asInstanceOf[js.Any])
  }
}
