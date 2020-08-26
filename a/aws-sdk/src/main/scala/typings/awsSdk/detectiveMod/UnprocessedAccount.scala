package typings.awsSdk.detectiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnprocessedAccount extends js.Object {
  /**
    * The AWS account identifier of the member account that was not processed.
    */
  var AccountId: js.UndefOr[typings.awsSdk.detectiveMod.AccountId] = js.native
  /**
    * The reason that the member account request could not be processed.
    */
  var Reason: js.UndefOr[UnprocessedReason] = js.native
}

object UnprocessedAccount {
  @scala.inline
  def apply(): UnprocessedAccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnprocessedAccount]
  }
  @scala.inline
  implicit class UnprocessedAccountOps[Self <: UnprocessedAccount] (val x: Self) extends AnyVal {
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
    def setAccountId(value: AccountId): Self = this.set("AccountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccountId: Self = this.set("AccountId", js.undefined)
    @scala.inline
    def setReason(value: UnprocessedReason): Self = this.set("Reason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReason: Self = this.set("Reason", js.undefined)
  }
  
}

