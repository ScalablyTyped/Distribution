package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnableOrganizationAdminAccountRequest extends js.Object {
  /**
    * The AWS account ID for the account.
    */
  var adminAccountId: string = js.native
  /**
    * A unique, case-sensitive token that you provide to ensure the idempotency of the request.
    */
  var clientToken: js.UndefOr[string] = js.native
}

object EnableOrganizationAdminAccountRequest {
  @scala.inline
  def apply(adminAccountId: string): EnableOrganizationAdminAccountRequest = {
    val __obj = js.Dynamic.literal(adminAccountId = adminAccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnableOrganizationAdminAccountRequest]
  }
  @scala.inline
  implicit class EnableOrganizationAdminAccountRequestOps[Self <: EnableOrganizationAdminAccountRequest] (val x: Self) extends AnyVal {
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
    def setAdminAccountId(value: string): Self = this.set("adminAccountId", value.asInstanceOf[js.Any])
    @scala.inline
    def setClientToken(value: string): Self = this.set("clientToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientToken: Self = this.set("clientToken", js.undefined)
  }
  
}

