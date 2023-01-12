package typings.awsSdk.clientsTransferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeSecurityPolicyResponse extends StObject {
  
  /**
    * An array containing the properties of the security policy.
    */
  var SecurityPolicy: DescribedSecurityPolicy
}
object DescribeSecurityPolicyResponse {
  
  inline def apply(SecurityPolicy: DescribedSecurityPolicy): DescribeSecurityPolicyResponse = {
    val __obj = js.Dynamic.literal(SecurityPolicy = SecurityPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeSecurityPolicyResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeSecurityPolicyResponse] (val x: Self) extends AnyVal {
    
    inline def setSecurityPolicy(value: DescribedSecurityPolicy): Self = StObject.set(x, "SecurityPolicy", value.asInstanceOf[js.Any])
  }
}
