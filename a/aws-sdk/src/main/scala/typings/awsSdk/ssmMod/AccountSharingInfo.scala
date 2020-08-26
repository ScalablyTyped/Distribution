package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountSharingInfo extends js.Object {
  /**
    * The AWS account ID where the current document is shared.
    */
  var AccountId: js.UndefOr[typings.awsSdk.ssmMod.AccountId] = js.native
  /**
    * The version of the current document shared with the account.
    */
  var SharedDocumentVersion: js.UndefOr[typings.awsSdk.ssmMod.SharedDocumentVersion] = js.native
}

object AccountSharingInfo {
  @scala.inline
  def apply(): AccountSharingInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountSharingInfo]
  }
  @scala.inline
  implicit class AccountSharingInfoOps[Self <: AccountSharingInfo] (val x: Self) extends AnyVal {
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
    def setAccountId(value: AccountId): Self = this.set("AccountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccountId: Self = this.set("AccountId", js.undefined)
    @scala.inline
    def setSharedDocumentVersion(value: SharedDocumentVersion): Self = this.set("SharedDocumentVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSharedDocumentVersion: Self = this.set("SharedDocumentVersion", js.undefined)
  }
  
}

