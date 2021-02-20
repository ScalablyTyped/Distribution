package typings.awsSdk.transferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeSecurityPolicyRequest extends StObject {
  
  /**
    * Specifies the name of the security policy that is attached to the server.
    */
  var SecurityPolicyName: typings.awsSdk.transferMod.SecurityPolicyName = js.native
}
object DescribeSecurityPolicyRequest {
  
  @scala.inline
  def apply(SecurityPolicyName: SecurityPolicyName): DescribeSecurityPolicyRequest = {
    val __obj = js.Dynamic.literal(SecurityPolicyName = SecurityPolicyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeSecurityPolicyRequest]
  }
  
  @scala.inline
  implicit class DescribeSecurityPolicyRequestMutableBuilder[Self <: DescribeSecurityPolicyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSecurityPolicyName(value: SecurityPolicyName): Self = StObject.set(x, "SecurityPolicyName", value.asInstanceOf[js.Any])
  }
}
