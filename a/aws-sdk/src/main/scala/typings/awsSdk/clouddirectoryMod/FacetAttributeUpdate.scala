package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FacetAttributeUpdate extends js.Object {
  /**
    * The action to perform when updating the attribute.
    */
  var Action: js.UndefOr[UpdateActionType] = js.native
  /**
    * The attribute to update.
    */
  var Attribute: js.UndefOr[FacetAttribute] = js.native
}

object FacetAttributeUpdate {
  @scala.inline
  def apply(): FacetAttributeUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FacetAttributeUpdate]
  }
  @scala.inline
  implicit class FacetAttributeUpdateOps[Self <: FacetAttributeUpdate] (val x: Self) extends AnyVal {
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
    def setAction(value: UpdateActionType): Self = this.set("Action", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAction: Self = this.set("Action", js.undefined)
    @scala.inline
    def setAttribute(value: FacetAttribute): Self = this.set("Attribute", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttribute: Self = this.set("Attribute", js.undefined)
  }
  
}

