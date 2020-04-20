package typings.awsSdk.codestarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteUserProfileResult extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the user deleted from AWS CodeStar.
    */
  var userArn: UserArn = js.native
}

object DeleteUserProfileResult {
  @scala.inline
  def apply(userArn: UserArn): DeleteUserProfileResult = {
    val __obj = js.Dynamic.literal(userArn = userArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteUserProfileResult]
  }
}

