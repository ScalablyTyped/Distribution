package typings.awsSdk.macieMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MemberAccount extends js.Object {
  /**
    * The AWS account ID of the Amazon Macie Classic member account.
    */
  var accountId: js.UndefOr[AWSAccountId] = js.native
}

object MemberAccount {
  @scala.inline
  def apply(): MemberAccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MemberAccount]
  }
  @scala.inline
  implicit class MemberAccountOps[Self <: MemberAccount] (val x: Self) extends AnyVal {
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
    def setAccountId(value: AWSAccountId): Self = this.set("accountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccountId: Self = this.set("accountId", js.undefined)
  }
  
}

