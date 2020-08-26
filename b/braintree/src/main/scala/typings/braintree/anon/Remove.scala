package typings.braintree.anon

import typings.braintree.mod.DiscountAddRequest
import typings.braintree.mod.DiscountUpdateRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Remove extends js.Object {
  var add: js.UndefOr[js.Array[DiscountAddRequest]] = js.native
  var remove: js.UndefOr[js.Array[String]] = js.native
  var update: js.UndefOr[js.Array[DiscountUpdateRequest]] = js.native
}

object Remove {
  @scala.inline
  def apply(): Remove = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Remove]
  }
  @scala.inline
  implicit class RemoveOps[Self <: Remove] (val x: Self) extends AnyVal {
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
    def setAddVarargs(value: DiscountAddRequest*): Self = this.set("add", js.Array(value :_*))
    @scala.inline
    def setAdd(value: js.Array[DiscountAddRequest]): Self = this.set("add", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdd: Self = this.set("add", js.undefined)
    @scala.inline
    def setRemoveVarargs(value: String*): Self = this.set("remove", js.Array(value :_*))
    @scala.inline
    def setRemove(value: js.Array[String]): Self = this.set("remove", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemove: Self = this.set("remove", js.undefined)
    @scala.inline
    def setUpdateVarargs(value: DiscountUpdateRequest*): Self = this.set("update", js.Array(value :_*))
    @scala.inline
    def setUpdate(value: js.Array[DiscountUpdateRequest]): Self = this.set("update", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdate: Self = this.set("update", js.undefined)
  }
  
}

