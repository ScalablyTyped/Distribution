package typings.awsSdk.marketplacecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelChangeSetResponse extends js.Object {
  /**
    * The ARN associated with the change set referenced in this request.
    */
  var ChangeSetArn: js.UndefOr[ARN] = js.native
  /**
    * The unique identifier for the change set referenced in this request.
    */
  var ChangeSetId: js.UndefOr[ResourceId] = js.native
}

object CancelChangeSetResponse {
  @scala.inline
  def apply(): CancelChangeSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CancelChangeSetResponse]
  }
  @scala.inline
  implicit class CancelChangeSetResponseOps[Self <: CancelChangeSetResponse] (val x: Self) extends AnyVal {
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
    def setChangeSetArn(value: ARN): Self = this.set("ChangeSetArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChangeSetArn: Self = this.set("ChangeSetArn", js.undefined)
    @scala.inline
    def setChangeSetId(value: ResourceId): Self = this.set("ChangeSetId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChangeSetId: Self = this.set("ChangeSetId", js.undefined)
  }
  
}

