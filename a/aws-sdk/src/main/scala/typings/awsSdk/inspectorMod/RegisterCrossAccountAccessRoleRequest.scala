package typings.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
}

