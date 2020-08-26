package typings.columnify.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<columnify.columnify.Options, 'minWidth' | 'maxWidth'> */
@js.native
trait PickOptionsminWidthmaxWid extends js.Object {
  var maxWidth: js.UndefOr[Double] = js.native
  var minWidth: js.UndefOr[Double] = js.native
}

object PickOptionsminWidthmaxWid {
  @scala.inline
  def apply(): PickOptionsminWidthmaxWid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickOptionsminWidthmaxWid]
  }
  @scala.inline
  implicit class PickOptionsminWidthmaxWidOps[Self <: PickOptionsminWidthmaxWid] (val x: Self) extends AnyVal {
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
    def setMaxWidth(value: Double): Self = this.set("maxWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxWidth: Self = this.set("maxWidth", js.undefined)
    @scala.inline
    def setMinWidth(value: Double): Self = this.set("minWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinWidth: Self = this.set("minWidth", js.undefined)
  }
  
}

