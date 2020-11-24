package typings.awsSdk.ssoadminMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutInlinePolicyToPermissionSetRequest extends js.Object {
  
  /**
    * The IAM inline policy to attach to a PermissionSet.
    */
  var InlinePolicy: PermissionSetPolicyDocument = js.native
  
  /**
    * The ARN of the SSO instance under which the operation will be executed. For more information about ARNs, see Amazon Resource Names (ARNs) and AWS Service Namespaces in the AWS General Reference.
    */
  var InstanceArn: typings.awsSdk.ssoadminMod.InstanceArn = js.native
  
  /**
    * The ARN of the permission set.
    */
  var PermissionSetArn: typings.awsSdk.ssoadminMod.PermissionSetArn = js.native
}
object PutInlinePolicyToPermissionSetRequest {
  
  @scala.inline
  def apply(
    InlinePolicy: PermissionSetPolicyDocument,
    InstanceArn: InstanceArn,
    PermissionSetArn: PermissionSetArn
  ): PutInlinePolicyToPermissionSetRequest = {
    val __obj = js.Dynamic.literal(InlinePolicy = InlinePolicy.asInstanceOf[js.Any], InstanceArn = InstanceArn.asInstanceOf[js.Any], PermissionSetArn = PermissionSetArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutInlinePolicyToPermissionSetRequest]
  }
  
  @scala.inline
  implicit class PutInlinePolicyToPermissionSetRequestOps[Self <: PutInlinePolicyToPermissionSetRequest] (val x: Self) extends AnyVal {
    
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
    def setInlinePolicy(value: PermissionSetPolicyDocument): Self = this.set("InlinePolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceArn(value: InstanceArn): Self = this.set("InstanceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionSetArn(value: PermissionSetArn): Self = this.set("PermissionSetArn", value.asInstanceOf[js.Any])
  }
}
