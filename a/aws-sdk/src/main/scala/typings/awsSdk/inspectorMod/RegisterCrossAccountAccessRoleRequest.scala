package typings.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegisterCrossAccountAccessRoleRequest extends js.Object {
  
  /**
    * The ARN of the IAM role that grants Amazon Inspector access to AWS Services needed to perform security assessments. 
    */
  var roleArn: Arn = js.native
}
object RegisterCrossAccountAccessRoleRequest {
  
  @scala.inline
  def apply(roleArn: Arn): RegisterCrossAccountAccessRoleRequest = {
    val __obj = js.Dynamic.literal(roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterCrossAccountAccessRoleRequest]
  }
  
  @scala.inline
  implicit class RegisterCrossAccountAccessRoleRequestOps[Self <: RegisterCrossAccountAccessRoleRequest] (val x: Self) extends AnyVal {
    
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
    def setRoleArn(value: Arn): Self = this.set("roleArn", value.asInstanceOf[js.Any])
  }
}
