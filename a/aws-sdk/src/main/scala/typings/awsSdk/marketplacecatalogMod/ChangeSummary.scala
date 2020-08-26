package typings.awsSdk.marketplacecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChangeSummary extends js.Object {
  /**
    * The type of the change.
    */
  var ChangeType: js.UndefOr[typings.awsSdk.marketplacecatalogMod.ChangeType] = js.native
  /**
    * This object contains details specific to the change type of the requested change.
    */
  var Details: js.UndefOr[Json] = js.native
  /**
    * The entity to be changed.
    */
  var Entity: js.UndefOr[typings.awsSdk.marketplacecatalogMod.Entity] = js.native
  /**
    * An array of ErrorDetail objects associated with the change.
    */
  var ErrorDetailList: js.UndefOr[typings.awsSdk.marketplacecatalogMod.ErrorDetailList] = js.native
}

object ChangeSummary {
  @scala.inline
  def apply(): ChangeSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChangeSummary]
  }
  @scala.inline
  implicit class ChangeSummaryOps[Self <: ChangeSummary] (val x: Self) extends AnyVal {
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
    def setChangeType(value: ChangeType): Self = this.set("ChangeType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChangeType: Self = this.set("ChangeType", js.undefined)
    @scala.inline
    def setDetails(value: Json): Self = this.set("Details", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetails: Self = this.set("Details", js.undefined)
    @scala.inline
    def setEntity(value: Entity): Self = this.set("Entity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntity: Self = this.set("Entity", js.undefined)
    @scala.inline
    def setErrorDetailListVarargs(value: ErrorDetail*): Self = this.set("ErrorDetailList", js.Array(value :_*))
    @scala.inline
    def setErrorDetailList(value: ErrorDetailList): Self = this.set("ErrorDetailList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorDetailList: Self = this.set("ErrorDetailList", js.undefined)
  }
  
}

