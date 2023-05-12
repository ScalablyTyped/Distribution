package typings.awsSdk2Types.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResourcePoliciesResponseEntry extends StObject {
  
  /**
    * A resource policy helps you to define the IAM entity (for example, an Amazon Web Services account) that can manage your Systems Manager resources. Currently, OpsItemGroup is the only resource that supports Systems Manager resource policies. The resource policy for OpsItemGroup enables Amazon Web Services accounts to view and interact with OpsCenter operational work items (OpsItems).
    */
  var Policy: js.UndefOr[typings.awsSdk2Types.clientsSsmMod.Policy] = js.undefined
  
  /**
    * ID of the current policy version. The hash helps to prevent a situation where multiple users attempt to overwrite a policy. You must provide this hash when updating or deleting a policy.
    */
  var PolicyHash: js.UndefOr[typings.awsSdk2Types.clientsSsmMod.PolicyHash] = js.undefined
  
  /**
    * A policy ID.
    */
  var PolicyId: js.UndefOr[typings.awsSdk2Types.clientsSsmMod.PolicyId] = js.undefined
}
object GetResourcePoliciesResponseEntry {
  
  inline def apply(): GetResourcePoliciesResponseEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetResourcePoliciesResponseEntry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResourcePoliciesResponseEntry] (val x: Self) extends AnyVal {
    
    inline def setPolicy(value: Policy): Self = StObject.set(x, "Policy", value.asInstanceOf[js.Any])
    
    inline def setPolicyHash(value: PolicyHash): Self = StObject.set(x, "PolicyHash", value.asInstanceOf[js.Any])
    
    inline def setPolicyHashUndefined: Self = StObject.set(x, "PolicyHash", js.undefined)
    
    inline def setPolicyId(value: PolicyId): Self = StObject.set(x, "PolicyId", value.asInstanceOf[js.Any])
    
    inline def setPolicyIdUndefined: Self = StObject.set(x, "PolicyId", js.undefined)
    
    inline def setPolicyUndefined: Self = StObject.set(x, "Policy", js.undefined)
  }
}
