package typings.awsSdk.wafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetChangeTokenStatusResponse extends js.Object {
  /**
    * The status of the change token.
    */
  var ChangeTokenStatus: js.UndefOr[typings.awsSdk.wafregionalMod.ChangeTokenStatus] = js.native
}

object GetChangeTokenStatusResponse {
  @scala.inline
  def apply(): GetChangeTokenStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetChangeTokenStatusResponse]
  }
  @scala.inline
  implicit class GetChangeTokenStatusResponseOps[Self <: GetChangeTokenStatusResponse] (val x: Self) extends AnyVal {
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
    def setChangeTokenStatus(value: ChangeTokenStatus): Self = this.set("ChangeTokenStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChangeTokenStatus: Self = this.set("ChangeTokenStatus", js.undefined)
  }
  
}

