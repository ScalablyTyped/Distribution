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
  
  @scala.inline
  def apply(): PolicyAttachment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicyAttachment]
  }
  
  @scala.inline
  implicit class PolicyAttachmentMutableBuilder[Self <: PolicyAttachment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setObjectIdentifier(value: ObjectIdentifier): Self = StObject.set(x, "ObjectIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectIdentifierUndefined: Self = StObject.set(x, "ObjectIdentifier", js.undefined)
    
    @scala.inline
    def setPolicyId(value: ObjectIdentifier): Self = StObject.set(x, "PolicyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyIdUndefined: Self = StObject.set(x, "PolicyId", js.undefined)
    
    @scala.inline
    def setPolicyType(value: PolicyType): Self = StObject.set(x, "PolicyType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyTypeUndefined: Self = StObject.set(x, "PolicyType", js.undefined)
  }
}
