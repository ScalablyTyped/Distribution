package typings.awsSdk2Types.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutResourcePolicyRequest extends StObject {
  
  /**
    * A policy you want to associate with a resource.
    */
  var Policy: typings.awsSdk2Types.clientsSsmMod.Policy
  
  /**
    * ID of the current policy version. The hash helps to prevent a situation where multiple users attempt to overwrite a policy. You must provide this hash when updating or deleting a policy.
    */
  var PolicyHash: js.UndefOr[typings.awsSdk2Types.clientsSsmMod.PolicyHash] = js.undefined
  
  /**
    * The policy ID.
    */
  var PolicyId: js.UndefOr[typings.awsSdk2Types.clientsSsmMod.PolicyId] = js.undefined
  
  /**
    * Amazon Resource Name (ARN) of the resource to which you want to attach a policy.
    */
  var ResourceArn: ResourceArnString
}
object PutResourcePolicyRequest {
  
  inline def apply(Policy: Policy, ResourceArn: ResourceArnString): PutResourcePolicyRequest = {
    val __obj = js.Dynamic.literal(Policy = Policy.asInstanceOf[js.Any], ResourceArn = ResourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutResourcePolicyRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutResourcePolicyRequest] (val x: Self) extends AnyVal {
    
    inline def setPolicy(value: Policy): Self = StObject.set(x, "Policy", value.asInstanceOf[js.Any])
    
    inline def setPolicyHash(value: PolicyHash): Self = StObject.set(x, "PolicyHash", value.asInstanceOf[js.Any])
    
    inline def setPolicyHashUndefined: Self = StObject.set(x, "PolicyHash", js.undefined)
    
    inline def setPolicyId(value: PolicyId): Self = StObject.set(x, "PolicyId", value.asInstanceOf[js.Any])
    
    inline def setPolicyIdUndefined: Self = StObject.set(x, "PolicyId", js.undefined)
    
    inline def setResourceArn(value: ResourceArnString): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
  }
}
