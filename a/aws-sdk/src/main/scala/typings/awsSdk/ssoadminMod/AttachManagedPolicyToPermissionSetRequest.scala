package typings.awsSdk.ssoadminMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttachManagedPolicyToPermissionSetRequest extends js.Object {
  
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
  implicit class AttachManagedPolicyToPermissionSetRequestOps[Self <: AttachManagedPolicyToPermissionSetRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setInstanceArn(value: InstanceArn): Self = this.set("InstanceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManagedPolicyArn(value: ManagedPolicyArn): Self = this.set("ManagedPolicyArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionSetArn(value: PermissionSetArn): Self = this.set("PermissionSetArn", value.asInstanceOf[js.Any])
  }
}
