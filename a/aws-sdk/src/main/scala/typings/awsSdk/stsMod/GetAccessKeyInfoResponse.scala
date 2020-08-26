package typings.awsSdk.stsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAccessKeyInfoResponse extends js.Object {
  /**
    * The number used to identify the AWS account.
    */
  var Account: js.UndefOr[accountType] = js.native
}

object GetAccessKeyInfoResponse {
  @scala.inline
  def apply(): GetAccessKeyInfoResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAccessKeyInfoResponse]
  }
  @scala.inline
  implicit class GetAccessKeyInfoResponseOps[Self <: GetAccessKeyInfoResponse] (val x: Self) extends AnyVal {
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
    def setAccount(value: accountType): Self = this.set("Account", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccount: Self = this.set("Account", js.undefined)
  }
  
}

