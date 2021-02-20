package typings.awsSdk.ssoadminMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttachManagedPolicyToPermissionSetRequest extends StObject {
  
  /**
    * The ARN of the SSO instance under which the operation will be executed. For more information about ARNs, see Amazon Resource Names (ARNs) and AWS Service Namespaces in the AWS General Reference.
    */
  var InstanceArn: typings.awsSdk.ssoadminMod.InstanceArn = js.native
  
  /**
    * The IAM managed policy ARN to be attached to a permission set.
    */
  var ManagedPolicyArn: typings.awsSdk.ssoadminMod.ManagedPolicyArn = js.native
  
  /**
    * The ARN of the PermissionSet that the managed policy should be attached to.
    */
  var PermissionSetArn: typings.awsSdk.ssoadminMod.PermissionSetArn = js.native
}
object AttachManagedPolicyToPermissionSetRequest {
  
  @scala.inline
  def apply(InstanceArn: InstanceArn, ManagedPolicyArn: ManagedPolicyArn, PermissionSetArn: PermissionSetArn): AttachManagedPolicyToPermissionSetRequest = {
    val __obj = js.Dynamic.literal(InstanceArn = InstanceArn.asInstanceOf[js.Any], ManagedPolicyArn = ManagedPolicyArn.asInstanceOf[js.Any], PermissionSetArn = PermissionSetArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachManagedPolicyToPermissionSetRequest]
  }
  
  @scala.inline
  implicit class AttachManagedPolicyToPermissionSetRequestMutableBuilder[Self <: AttachManagedPolicyToPermissionSetRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceArn(value: InstanceArn): Self = StObject.set(x, "InstanceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManagedPolicyArn(value: ManagedPolicyArn): Self = StObject.set(x, "ManagedPolicyArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionSetArn(value: PermissionSetArn): Self = StObject.set(x, "PermissionSetArn", value.asInstanceOf[js.Any])
  }
}
