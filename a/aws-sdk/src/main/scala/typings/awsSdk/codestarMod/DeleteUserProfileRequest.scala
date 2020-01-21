package typings.awsSdk.codestarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteUserProfileRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the user to delete from AWS CodeStar.
    */
  var userArn: UserArn = js.native
}

object DeleteUserProfileRequest {
  @scala.inline
  def apply(userArn: UserArn): DeleteUserProfileRequest = {
    val __obj = js.Dynamic.literal(userArn = userArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteUserProfileRequest]
  }
}

