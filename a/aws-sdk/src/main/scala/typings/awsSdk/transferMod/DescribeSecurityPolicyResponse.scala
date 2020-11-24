package typings.awsSdk.transferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeSecurityPolicyResponse extends js.Object {
  
  /**
    * An array containing the properties of the security policy.
    */
  var SecurityPolicy: DescribedSecurityPolicy = js.native
}
object DescribeSecurityPolicyResponse {
  
  @scala.inline
  def apply(SecurityPolicy: DescribedSecurityPolicy): DescribeSecurityPolicyResponse = {
    val __obj = js.Dynamic.literal(SecurityPolicy = SecurityPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeSecurityPolicyResponse]
  }
  
  @scala.inline
  implicit class DescribeSecurityPolicyResponseOps[Self <: DescribeSecurityPolicyResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSecurityPolicy(value: DescribedSecurityPolicy): Self = this.set("SecurityPolicy", value.asInstanceOf[js.Any])
  }
}
