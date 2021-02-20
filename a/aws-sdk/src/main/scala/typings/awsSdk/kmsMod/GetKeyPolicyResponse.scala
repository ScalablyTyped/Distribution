package typings.awsSdk.kmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetKeyPolicyResponse extends StObject {
  
  /**
    * A key policy document in JSON format.
    */
  var Policy: js.UndefOr[PolicyType] = js.native
}
object GetKeyPolicyResponse {
  
  @scala.inline
  def apply(): GetKeyPolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetKeyPolicyResponse]
  }
  
  @scala.inline
  implicit class GetKeyPolicyResponseMutableBuilder[Self <: GetKeyPolicyResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPolicy(value: PolicyType): Self = StObject.set(x, "Policy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyUndefined: Self = StObject.set(x, "Policy", js.undefined)
  }
}
