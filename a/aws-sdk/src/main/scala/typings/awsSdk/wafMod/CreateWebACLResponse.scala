package typings.awsSdk.wafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateWebACLResponse extends js.Object {
  /**
    * The ChangeToken that you used to submit the CreateWebACL request. You can also use this value to query the status of the request. For more information, see GetChangeTokenStatus.
    */
  var ChangeToken: js.UndefOr[typings.awsSdk.wafMod.ChangeToken] = js.native
  /**
    * The WebACL returned in the CreateWebACL response.
    */
  var WebACL: js.UndefOr[typings.awsSdk.wafMod.WebACL] = js.native
}

object CreateWebACLResponse {
  @scala.inline
  def apply(): CreateWebACLResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateWebACLResponse]
  }
  @scala.inline
  implicit class CreateWebACLResponseOps[Self <: CreateWebACLResponse] (val x: Self) extends AnyVal {
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
    def setChangeToken(value: ChangeToken): Self = this.set("ChangeToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChangeToken: Self = this.set("ChangeToken", js.undefined)
    @scala.inline
    def setWebACL(value: WebACL): Self = this.set("WebACL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebACL: Self = this.set("WebACL", js.undefined)
  }
  
}

