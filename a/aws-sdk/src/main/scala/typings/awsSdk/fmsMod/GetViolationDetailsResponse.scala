package typings.awsSdk.fmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetViolationDetailsResponse extends js.Object {
  /**
    * Violation detail for a resource.
    */
  var ViolationDetail: js.UndefOr[typings.awsSdk.fmsMod.ViolationDetail] = js.native
}

object GetViolationDetailsResponse {
  @scala.inline
  def apply(): GetViolationDetailsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetViolationDetailsResponse]
  }
  @scala.inline
  implicit class GetViolationDetailsResponseOps[Self <: GetViolationDetailsResponse] (val x: Self) extends AnyVal {
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
    def setViolationDetail(value: ViolationDetail): Self = this.set("ViolationDetail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViolationDetail: Self = this.set("ViolationDetail", js.undefined)
  }
  
}

