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
  def apply(): DescribeUserResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeUserResponse]
  }
  @scala.inline
  implicit class DescribeUserResponseOps[Self <: DescribeUserResponse] (val x: Self) extends AnyVal {
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
    def setUser(value: User): Self = this.set("User", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUser: Self = this.set("User", js.undefined)
  }
  
}

