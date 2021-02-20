package typings.awsSdk.organizationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdatePolicyResponse extends StObject {
  
  /**
    * A structure that contains details about the updated policy, showing the requested changes.
    */
  var Policy: js.UndefOr[typings.awsSdk.organizationsMod.Policy] = js.native
}
object UpdatePolicyResponse {
  
  @scala.inline
  def apply(): UpdatePolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdatePolicyResponse]
  }
  
  @scala.inline
  implicit class UpdatePolicyResponseMutableBuilder[Self <: UpdatePolicyResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPolicy(value: Policy): Self = StObject.set(x, "Policy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyUndefined: Self = StObject.set(x, "Policy", js.undefined)
  }
}
