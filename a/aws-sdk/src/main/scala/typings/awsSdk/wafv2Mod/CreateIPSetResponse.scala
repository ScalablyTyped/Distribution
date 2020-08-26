package typings.awsSdk.wafv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateIPSetResponse extends js.Object {
  /**
    * High-level information about an IPSet, returned by operations like create and list. This provides information like the ID, that you can use to retrieve and manage an IPSet, and the ARN, that you provide to the IPSetReferenceStatement to use the address set in a Rule.
    */
  var Summary: js.UndefOr[IPSetSummary] = js.native
}

object CreateIPSetResponse {
  @scala.inline
  def apply(): CreateIPSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateIPSetResponse]
  }
  @scala.inline
  implicit class CreateIPSetResponseOps[Self <: CreateIPSetResponse] (val x: Self) extends AnyVal {
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
    def setSummary(value: IPSetSummary): Self = this.set("Summary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSummary: Self = this.set("Summary", js.undefined)
  }
  
}

