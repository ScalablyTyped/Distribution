package typings.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReviewDetails extends js.Object {
  /**
    * The associated support center case ID (if any).
    */
  var CaseId: js.UndefOr[typings.awsSdk.sesv2Mod.CaseId] = js.native
  /**
    * The status of the latest review of your account. The status can be one of the following:    PENDING – We have received your appeal and are in the process of reviewing it.    GRANTED – Your appeal has been reviewed and your production access has been granted.    DENIED – Your appeal has been reviewed and your production access has been denied.    FAILED – An internal error occurred and we didn't receive your appeal. You can submit your appeal again.  
    */
  var Status: js.UndefOr[ReviewStatus] = js.native
}

object ReviewDetails {
  @scala.inline
  def apply(): ReviewDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReviewDetails]
  }
  @scala.inline
  implicit class ReviewDetailsOps[Self <: ReviewDetails] (val x: Self) extends AnyVal {
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
    def setCaseId(value: CaseId): Self = this.set("CaseId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaseId: Self = this.set("CaseId", js.undefined)
    @scala.inline
    def setStatus(value: ReviewStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
  
}

