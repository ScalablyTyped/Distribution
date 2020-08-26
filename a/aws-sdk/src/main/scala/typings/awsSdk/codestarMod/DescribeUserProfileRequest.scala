package typings.awsSdk.codestarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeUserProfileRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the user.
    */
  var userArn: UserArn = js.native
}

object DescribeUserProfileRequest {
  @scala.inline
  def apply(userArn: UserArn): DescribeUserProfileRequest = {
    val __obj = js.Dynamic.literal(userArn = userArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeUserProfileRequest]
  }
  @scala.inline
  implicit class DescribeUserProfileRequestOps[Self <: DescribeUserProfileRequest] (val x: Self) extends AnyVal {
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
    def setUserArn(value: UserArn): Self = this.set("userArn", value.asInstanceOf[js.Any])
  }
  
}

