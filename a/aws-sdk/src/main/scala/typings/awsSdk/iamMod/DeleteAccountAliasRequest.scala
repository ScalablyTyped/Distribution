package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteAccountAliasRequest extends js.Object {
  /**
    * The name of the account alias to delete. This parameter allows (through its regex pattern) a string of characters consisting of lowercase letters, digits, and dashes. You cannot start or finish with a dash, nor can you have two dashes in a row.
    */
  var AccountAlias: accountAliasType = js.native
}

object DeleteAccountAliasRequest {
  @scala.inline
  def apply(AccountAlias: accountAliasType): DeleteAccountAliasRequest = {
    val __obj = js.Dynamic.literal(AccountAlias = AccountAlias.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAccountAliasRequest]
  }
  @scala.inline
  implicit class DeleteAccountAliasRequestOps[Self <: DeleteAccountAliasRequest] (val x: Self) extends AnyVal {
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
    def setAccountAlias(value: accountAliasType): Self = this.set("AccountAlias", value.asInstanceOf[js.Any])
  }
  
}

