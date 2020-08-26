package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeMyUserProfileResult extends js.Object {
  /**
    * A UserProfile object that describes the user's SSH information.
    */
  var UserProfile: js.UndefOr[SelfUserProfile] = js.native
}

object DescribeMyUserProfileResult {
  @scala.inline
  def apply(): DescribeMyUserProfileResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeMyUserProfileResult]
  }
  @scala.inline
  implicit class DescribeMyUserProfileResultOps[Self <: DescribeMyUserProfileResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setUserProfile(value: SelfUserProfile): Self = this.set("UserProfile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserProfile: Self = this.set("UserProfile", js.undefined)
  }
  
}

