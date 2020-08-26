package typings.cfb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CFBAddOpts extends js.Object {
  /** Skip existence and safety checks (best for bulk write operations) */
  var unsafe: js.UndefOr[Boolean] = js.native
}

object CFBAddOpts {
  @scala.inline
  def apply(): CFBAddOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CFBAddOpts]
  }
  @scala.inline
  implicit class CFBAddOptsOps[Self <: CFBAddOpts] (val x: Self) extends AnyVal {
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
    def setUnsafe(value: Boolean): Self = this.set("unsafe", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnsafe: Self = this.set("unsafe", js.undefined)
  }
  
}

