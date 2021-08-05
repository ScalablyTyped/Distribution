package typings.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PolicyAttachment extends StObject {
  
  /**
    * The ObjectIdentifier that is associated with PolicyAttachment.
    */
  var ObjectIdentifier: js.UndefOr[typings.awsSdk.clouddirectoryMod.ObjectIdentifier] = js.undefined
  
  /**
    * The ID of PolicyAttachment.
    */
  var PolicyId: js.UndefOr[ObjectIdentifier] = js.undefined
  
  /**
    * The type of policy that can be associated with PolicyAttachment.
    */
  var PolicyType: js.UndefOr[typings.awsSdk.clouddirectoryMod.PolicyType] = js.undefined
}
object PolicyAttachment {
  
  inline def apply(): PolicyAttachment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicyAttachment]
  }
  
  extension [Self <: PolicyAttachment](x: Self) {
    
    inline def setObjectIdentifier(value: ObjectIdentifier): Self = StObject.set(x, "ObjectIdentifier", value.asInstanceOf[js.Any])
    
    inline def setObjectIdentifierUndefined: Self = StObject.set(x, "ObjectIdentifier", js.undefined)
    
    inline def setPolicyId(value: ObjectIdentifier): Self = StObject.set(x, "PolicyId", value.asInstanceOf[js.Any])
    
    inline def setPolicyIdUndefined: Self = StObject.set(x, "PolicyId", js.undefined)
    
    inline def setPolicyType(value: PolicyType): Self = StObject.set(x, "PolicyType", value.asInstanceOf[js.Any])
    
    inline def setPolicyTypeUndefined: Self = StObject.set(x, "PolicyType", js.undefined)
  }
}
