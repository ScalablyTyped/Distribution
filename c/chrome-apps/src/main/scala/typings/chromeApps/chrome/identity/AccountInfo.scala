package typings.chromeApps.chrome.identity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @since Chrome 32. */
@js.native
trait AccountInfo extends js.Object {
  /**
    * A unique identifier for the account.
    * This ID will not change for the lifetime of the account.
    */
  var id: String = js.native
}

object AccountInfo {
  @scala.inline
  def apply(id: String): AccountInfo = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountInfo]
  }
  @scala.inline
  implicit class AccountInfoOps[Self <: AccountInfo] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
  }
  
}

