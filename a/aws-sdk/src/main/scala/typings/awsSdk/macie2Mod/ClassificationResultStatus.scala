package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassificationResultStatus extends js.Object {
  /**
    * The status of the finding, such as COMPLETE.
    */
  var code: js.UndefOr[string] = js.native
  /**
    * A brief description of the status of the finding. Amazon Macie uses this value to notify you of any errors, warnings, or considerations that might impact your analysis of the finding.
    */
  var reason: js.UndefOr[string] = js.native
}

object ClassificationResultStatus {
  @scala.inline
  def apply(): ClassificationResultStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClassificationResultStatus]
  }
  @scala.inline
  implicit class ClassificationResultStatusOps[Self <: ClassificationResultStatus] (val x: Self) extends AnyVal {
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
    def setCode(value: string): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
    @scala.inline
    def setReason(value: string): Self = this.set("reason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReason: Self = this.set("reason", js.undefined)
  }
  
}

