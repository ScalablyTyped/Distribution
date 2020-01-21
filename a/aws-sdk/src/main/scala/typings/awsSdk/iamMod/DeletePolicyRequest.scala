package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeletePolicyRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the IAM policy you want to delete. For more information about ARNs, see Amazon Resource Names (ARNs) and AWS Service Namespaces in the AWS General Reference.
    */
  var PolicyArn: arnType = js.native
}

object DeletePolicyRequest {
  @scala.inline
  def apply(PolicyArn: arnType): DeletePolicyRequest = {
    val __obj = js.Dynamic.literal(PolicyArn = PolicyArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeletePolicyRequest]
  }
}

