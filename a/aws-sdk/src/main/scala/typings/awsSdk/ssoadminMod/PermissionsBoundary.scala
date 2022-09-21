package typings.awsSdk.ssoadminMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PermissionsBoundary extends StObject {
  
  /**
    * Specifies the name and path of a customer managed policy. You must have an IAM policy that matches the name and path in each AWS account where you want to deploy your permission set.
    */
  var CustomerManagedPolicyReference: js.UndefOr[typings.awsSdk.ssoadminMod.CustomerManagedPolicyReference] = js.undefined
  
  /**
    * The AWS managed policy ARN that you want to attach to a permission set as a permissions boundary.
    */
  var ManagedPolicyArn: js.UndefOr[typings.awsSdk.ssoadminMod.ManagedPolicyArn] = js.undefined
}
object PermissionsBoundary {
  
  inline def apply(): PermissionsBoundary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PermissionsBoundary]
  }
  
  extension [Self <: PermissionsBoundary](x: Self) {
    
    inline def setCustomerManagedPolicyReference(value: CustomerManagedPolicyReference): Self = StObject.set(x, "CustomerManagedPolicyReference", value.asInstanceOf[js.Any])
    
    inline def setCustomerManagedPolicyReferenceUndefined: Self = StObject.set(x, "CustomerManagedPolicyReference", js.undefined)
    
    inline def setManagedPolicyArn(value: ManagedPolicyArn): Self = StObject.set(x, "ManagedPolicyArn", value.asInstanceOf[js.Any])
    
    inline def setManagedPolicyArnUndefined: Self = StObject.set(x, "ManagedPolicyArn", js.undefined)
  }
}
