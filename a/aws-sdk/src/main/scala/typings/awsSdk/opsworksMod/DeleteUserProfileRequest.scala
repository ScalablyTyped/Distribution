package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteUserProfileRequest extends js.Object {
  /**
    * The user's IAM ARN. This can also be a federated user's ARN.
    */
  var IamUserArn: String = js.native
}

object DeleteUserProfileRequest {
  @scala.inline
  def apply(IamUserArn: String): DeleteUserProfileRequest = {
    val __obj = js.Dynamic.literal(IamUserArn = IamUserArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteUserProfileRequest]
  }
}

