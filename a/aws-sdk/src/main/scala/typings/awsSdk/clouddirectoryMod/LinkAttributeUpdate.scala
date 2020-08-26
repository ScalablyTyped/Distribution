package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LinkAttributeUpdate extends js.Object {
  /**
    * The action to perform as part of the attribute update.
    */
  var AttributeAction: js.UndefOr[LinkAttributeAction] = js.native
  /**
    * The key of the attribute being updated.
    */
  var AttributeKey: js.UndefOr[typings.awsSdk.clouddirectoryMod.AttributeKey] = js.native
}

object LinkAttributeUpdate {
  @scala.inline
  def apply(): LinkAttributeUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinkAttributeUpdate]
  }
  @scala.inline
  implicit class LinkAttributeUpdateOps[Self <: LinkAttributeUpdate] (val x: Self) extends AnyVal {
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
    def setAttributeAction(value: LinkAttributeAction): Self = this.set("AttributeAction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributeAction: Self = this.set("AttributeAction", js.undefined)
    @scala.inline
    def setAttributeKey(value: AttributeKey): Self = this.set("AttributeKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributeKey: Self = this.set("AttributeKey", js.undefined)
  }
  
}

