package typings.awsSdk.clientsTransferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeSecurityPolicyRequest extends StObject {
  
  /**
    * Specifies the name of the security policy that is attached to the server.
    */
  var SecurityPolicyName: typings.awsSdk.clientsTransferMod.SecurityPolicyName
}
object DescribeSecurityPolicyRequest {
  
  inline def apply(SecurityPolicyName: SecurityPolicyName): DescribeSecurityPolicyRequest = {
    val __obj = js.Dynamic.literal(SecurityPolicyName = SecurityPolicyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeSecurityPolicyRequest]
  }
  
  extension [Self <: DescribeSecurityPolicyRequest](x: Self) {
    
    inline def setSecurityPolicyName(value: SecurityPolicyName): Self = StObject.set(x, "SecurityPolicyName", value.asInstanceOf[js.Any])
  }
}
