package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UsageAccountResult extends js.Object {
  /**
    * The Account ID that generated usage.
    */
  var AccountId: js.UndefOr[typings.awsSdk.guarddutyMod.AccountId] = js.native
  /**
    * Represents the total of usage for the Account ID.
    */
  var Total: js.UndefOr[typings.awsSdk.guarddutyMod.Total] = js.native
}

object UsageAccountResult {
  @scala.inline
  def apply(): UsageAccountResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UsageAccountResult]
  }
  @scala.inline
  implicit class UsageAccountResultOps[Self <: UsageAccountResult] (val x: Self) extends AnyVal {
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
    def setTotal(value: Total): Self = this.set("Total", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotal: Self = this.set("Total", js.undefined)
  }
  
}

