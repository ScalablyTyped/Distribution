package typings.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisassociateServiceRoleFromAccountResponse extends js.Object {
  /**
    * The time when the service role was disassociated from the account.
    */
  var DisassociatedAt: js.UndefOr[string] = js.native
}

object DisassociateServiceRoleFromAccountResponse {
  @scala.inline
  def apply(): DisassociateServiceRoleFromAccountResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisassociateServiceRoleFromAccountResponse]
  }
  @scala.inline
  implicit class DisassociateServiceRoleFromAccountResponseOps[Self <: DisassociateServiceRoleFromAccountResponse] (val x: Self) extends AnyVal {
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
    def setDisassociatedAt(value: string): Self = this.set("DisassociatedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisassociatedAt: Self = this.set("DisassociatedAt", js.undefined)
  }
  
}

