package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetMasterAccountResponse extends js.Object {
  /**
    * A list of details about the Security Hub master account for the current member account. 
    */
  var Master: js.UndefOr[Invitation] = js.native
}

object GetMasterAccountResponse {
  @scala.inline
  def apply(): GetMasterAccountResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetMasterAccountResponse]
  }
  @scala.inline
  implicit class GetMasterAccountResponseOps[Self <: GetMasterAccountResponse] (val x: Self) extends AnyVal {
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
    def setMaster(value: Invitation): Self = this.set("Master", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaster: Self = this.set("Master", js.undefined)
  }
  
}

