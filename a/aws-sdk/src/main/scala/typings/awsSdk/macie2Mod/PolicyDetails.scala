package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolicyDetails extends js.Object {
  /**
    * The action that produced the finding.
    */
  var action: js.UndefOr[FindingAction] = js.native
  /**
    * The entity that performed the action that produced the finding.
    */
  var actor: js.UndefOr[FindingActor] = js.native
}

object PolicyDetails {
  @scala.inline
  def apply(): PolicyDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicyDetails]
  }
  @scala.inline
  implicit class PolicyDetailsOps[Self <: PolicyDetails] (val x: Self) extends AnyVal {
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
    def setAction(value: FindingAction): Self = this.set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    @scala.inline
    def setActor(value: FindingActor): Self = this.set("actor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActor: Self = this.set("actor", js.undefined)
  }
  
}

