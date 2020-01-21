package typings.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeUserResponse extends js.Object {
  /**
    * Information about the user account and configuration settings.
    */
  var User: js.UndefOr[typings.awsSdk.connectMod.User] = js.native
}

object DescribeUserResponse {
  @scala.inline
  def apply(User: User = null): DescribeUserResponse = {
    val __obj = js.Dynamic.literal()
    if (User != null) __obj.updateDynamic("User")(User.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeUserResponse]
  }
}

