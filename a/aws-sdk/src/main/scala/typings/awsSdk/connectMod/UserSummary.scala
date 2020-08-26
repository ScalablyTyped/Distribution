package typings.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserSummary extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the user account.
    */
  var Arn: js.UndefOr[ARN] = js.native
  /**
    * The identifier of the user account.
    */
  var Id: js.UndefOr[UserId] = js.native
  /**
    * The Amazon Connect user name of the user account.
    */
  var Username: js.UndefOr[AgentUsername] = js.native
}

object UserSummary {
  @scala.inline
  def apply(): UserSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserSummary]
  }
  @scala.inline
  implicit class UserSummaryOps[Self <: UserSummary] (val x: Self) extends AnyVal {
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
    def setArn(value: ARN): Self = this.set("Arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("Arn", js.undefined)
    @scala.inline
    def setId(value: UserId): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    @scala.inline
    def setUsername(value: AgentUsername): Self = this.set("Username", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsername: Self = this.set("Username", js.undefined)
  }
  
}

