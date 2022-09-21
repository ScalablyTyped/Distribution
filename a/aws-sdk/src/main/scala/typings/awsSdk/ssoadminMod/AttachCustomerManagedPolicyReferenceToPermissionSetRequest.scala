package typings.awsSdk.ssoadminMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttachCustomerManagedPolicyReferenceToPermissionSetRequest extends StObject {
  
  /**
    * Specifies the name and path of a customer managed policy. You must have an IAM policy that matches the name and path in each AWS account where you want to deploy your permission set.
    */
  var CustomerManagedPolicyReference: typings.awsSdk.ssoadminMod.CustomerManagedPolicyReference
  
  /**
    * The ARN of the IAM Identity Center instance under which the operation will be executed. 
    */
  var InstanceArn: typings.awsSdk.ssoadminMod.InstanceArn
  
  /**
    * The ARN of the PermissionSet.
    */
  var PermissionSetArn: typings.awsSdk.ssoadminMod.PermissionSetArn
}
object AttachCustomerManagedPolicyReferenceToPermissionSetRequest {
  
  inline def apply(
    CustomerManagedPolicyReference: CustomerManagedPolicyReference,
    InstanceArn: InstanceArn,
    PermissionSetArn: PermissionSetArn
  ): AttachCustomerManagedPolicyReferenceToPermissionSetRequest = {
    val __obj = js.Dynamic.literal(CustomerManagedPolicyReference = CustomerManagedPolicyReference.asInstanceOf[js.Any], InstanceArn = InstanceArn.asInstanceOf[js.Any], PermissionSetArn = PermissionSetArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachCustomerManagedPolicyReferenceToPermissionSetRequest]
  }
  
  extension [Self <: AttachCustomerManagedPolicyReferenceToPermissionSetRequest](x: Self) {
    
    inline def setCustomerManagedPolicyReference(value: CustomerManagedPolicyReference): Self = StObject.set(x, "CustomerManagedPolicyReference", value.asInstanceOf[js.Any])
    
    inline def setInstanceArn(value: InstanceArn): Self = StObject.set(x, "InstanceArn", value.asInstanceOf[js.Any])
    
    inline def setPermissionSetArn(value: PermissionSetArn): Self = StObject.set(x, "PermissionSetArn", value.asInstanceOf[js.Any])
  }
}
