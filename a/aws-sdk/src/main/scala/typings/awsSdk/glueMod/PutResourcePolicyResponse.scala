package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutResourcePolicyResponse extends StObject {
  
  /**
    * A hash of the policy that has just been set. This must be included in a subsequent call that overwrites or updates this policy.
    */
  var PolicyHash: js.UndefOr[HashString] = js.undefined
}
object PutResourcePolicyResponse {
  
  @scala.inline
  def apply(): PutResourcePolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutResourcePolicyResponse]
  }
  
  @scala.inline
  implicit class PutResourcePolicyResponseMutableBuilder[Self <: PutResourcePolicyResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPolicyHash(value: HashString): Self = StObject.set(x, "PolicyHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyHashUndefined: Self = StObject.set(x, "PolicyHash", js.undefined)
  }
}
