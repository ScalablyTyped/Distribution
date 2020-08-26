package typings.awsSdk.organizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateGovCloudAccountResponse extends js.Object {
  var CreateAccountStatus: js.UndefOr[typings.awsSdk.organizationsMod.CreateAccountStatus] = js.native
}

object CreateGovCloudAccountResponse {
  @scala.inline
  def apply(): CreateGovCloudAccountResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateGovCloudAccountResponse]
  }
  @scala.inline
  implicit class CreateGovCloudAccountResponseOps[Self <: CreateGovCloudAccountResponse] (val x: Self) extends AnyVal {
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
    def setCreateAccountStatus(value: CreateAccountStatus): Self = this.set("CreateAccountStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateAccountStatus: Self = this.set("CreateAccountStatus", js.undefined)
  }
  
}

