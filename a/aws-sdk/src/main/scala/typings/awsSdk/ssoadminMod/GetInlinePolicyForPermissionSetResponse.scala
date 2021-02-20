package typings.awsSdk.ssoadminMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetInlinePolicyForPermissionSetResponse extends StObject {
  
  /**
    * The IAM inline policy that is attached to the permission set.
    */
  var InlinePolicy: js.UndefOr[PermissionSetPolicyDocument] = js.native
}
object GetInlinePolicyForPermissionSetResponse {
  
  @scala.inline
  def apply(): GetInlinePolicyForPermissionSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetInlinePolicyForPermissionSetResponse]
  }
  
  @scala.inline
  implicit class GetInlinePolicyForPermissionSetResponseMutableBuilder[Self <: GetInlinePolicyForPermissionSetResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInlinePolicy(value: PermissionSetPolicyDocument): Self = StObject.set(x, "InlinePolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInlinePolicyUndefined: Self = StObject.set(x, "InlinePolicy", js.undefined)
  }
}
