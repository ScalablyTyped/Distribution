package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateTagOptionInput extends js.Object {
  /**
    * The updated active state.
    */
  var Active: js.UndefOr[TagOptionActive] = js.native
  /**
    * The TagOption identifier.
    */
  var Id: TagOptionId = js.native
  /**
    * The updated value.
    */
  var Value: js.UndefOr[TagOptionValue] = js.native
}

object UpdateTagOptionInput {
  @scala.inline
  def apply(Id: TagOptionId): UpdateTagOptionInput = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTagOptionInput]
  }
  @scala.inline
  implicit class UpdateTagOptionInputOps[Self <: UpdateTagOptionInput] (val x: Self) extends AnyVal {
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
    def setId(value: TagOptionId): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def setActive(value: TagOptionActive): Self = this.set("Active", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActive: Self = this.set("Active", js.undefined)
    @scala.inline
    def setValue(value: TagOptionValue): Self = this.set("Value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("Value", js.undefined)
  }
  
}

