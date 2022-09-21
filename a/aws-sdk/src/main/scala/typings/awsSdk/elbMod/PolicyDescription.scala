package typings.awsSdk.elbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PolicyDescription extends StObject {
  
  /**
    * The policy attributes.
    */
  var PolicyAttributeDescriptions: js.UndefOr[typings.awsSdk.elbMod.PolicyAttributeDescriptions] = js.undefined
  
  /**
    * The name of the policy.
    */
  var PolicyName: js.UndefOr[typings.awsSdk.elbMod.PolicyName] = js.undefined
  
  /**
    * The name of the policy type.
    */
  var PolicyTypeName: js.UndefOr[typings.awsSdk.elbMod.PolicyTypeName] = js.undefined
}
object PolicyDescription {
  
  inline def apply(): PolicyDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicyDescription]
  }
  
  extension [Self <: PolicyDescription](x: Self) {
    
    inline def setPolicyAttributeDescriptions(value: PolicyAttributeDescriptions): Self = StObject.set(x, "PolicyAttributeDescriptions", value.asInstanceOf[js.Any])
    
    inline def setPolicyAttributeDescriptionsUndefined: Self = StObject.set(x, "PolicyAttributeDescriptions", js.undefined)
    
    inline def setPolicyAttributeDescriptionsVarargs(value: PolicyAttributeDescription*): Self = StObject.set(x, "PolicyAttributeDescriptions", js.Array(value*))
    
    inline def setPolicyName(value: PolicyName): Self = StObject.set(x, "PolicyName", value.asInstanceOf[js.Any])
    
    inline def setPolicyNameUndefined: Self = StObject.set(x, "PolicyName", js.undefined)
    
    inline def setPolicyTypeName(value: PolicyTypeName): Self = StObject.set(x, "PolicyTypeName", value.asInstanceOf[js.Any])
    
    inline def setPolicyTypeNameUndefined: Self = StObject.set(x, "PolicyTypeName", js.undefined)
  }
}
