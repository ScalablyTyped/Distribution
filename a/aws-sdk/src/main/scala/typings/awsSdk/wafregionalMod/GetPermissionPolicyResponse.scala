package typings.awsSdk.wafregionalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetPermissionPolicyResponse extends StObject {
  
  /**
    * The IAM policy attached to the specified RuleGroup.
    */
  var Policy: js.UndefOr[PolicyString] = js.native
}
object GetPermissionPolicyResponse {
  
  @scala.inline
  def apply(): GetPermissionPolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPermissionPolicyResponse]
  }
  
  @scala.inline
  implicit class GetPermissionPolicyResponseMutableBuilder[Self <: GetPermissionPolicyResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPolicy(value: PolicyString): Self = StObject.set(x, "Policy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyUndefined: Self = StObject.set(x, "Policy", js.undefined)
  }
}
