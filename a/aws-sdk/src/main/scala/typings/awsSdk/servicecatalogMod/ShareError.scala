package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShareError extends js.Object {
  /**
    * List of accounts impacted by the error.
    */
  var Accounts: js.UndefOr[Namespaces] = js.native
  /**
    * Error type that happened when processing the operation.
    */
  var Error: js.UndefOr[typings.awsSdk.servicecatalogMod.Error] = js.native
  /**
    * Information about the error.
    */
  var Message: js.UndefOr[typings.awsSdk.servicecatalogMod.Message] = js.native
}

object ShareError {
  @scala.inline
  def apply(): ShareError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShareError]
  }
  @scala.inline
  implicit class ShareErrorOps[Self <: ShareError] (val x: Self) extends AnyVal {
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
    def setAccountsVarargs(value: AccountId*): Self = this.set("Accounts", js.Array(value :_*))
    @scala.inline
    def setAccounts(value: Namespaces): Self = this.set("Accounts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccounts: Self = this.set("Accounts", js.undefined)
    @scala.inline
    def setError(value: Error): Self = this.set("Error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("Error", js.undefined)
    @scala.inline
    def setMessage(value: Message): Self = this.set("Message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("Message", js.undefined)
  }
  
}

