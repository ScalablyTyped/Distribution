package typings.braintree.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateExisting extends js.Object {
  var updateExisting: js.UndefOr[Boolean] = js.native
}

object UpdateExisting {
  @scala.inline
  def apply(): UpdateExisting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateExisting]
  }
  @scala.inline
  implicit class UpdateExistingOps[Self <: UpdateExisting] (val x: Self) extends AnyVal {
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
    def setUpdateExisting(value: Boolean): Self = this.set("updateExisting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateExisting: Self = this.set("updateExisting", js.undefined)
  }
  
}

