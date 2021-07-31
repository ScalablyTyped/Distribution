package typings.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreatePolicyVersionResponse extends StObject {
  
  /**
    * A structure containing details about the new policy version.
    */
  var PolicyVersion: js.UndefOr[typings.awsSdk.iamMod.PolicyVersion] = js.undefined
}
object CreatePolicyVersionResponse {
  
  @scala.inline
  def apply(): CreatePolicyVersionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreatePolicyVersionResponse]
  }
  
  @scala.inline
  implicit class CreatePolicyVersionResponseMutableBuilder[Self <: CreatePolicyVersionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPolicyVersion(value: PolicyVersion): Self = StObject.set(x, "PolicyVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyVersionUndefined: Self = StObject.set(x, "PolicyVersion", js.undefined)
  }
}
