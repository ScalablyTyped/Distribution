package typings.c3.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShowHideOptions extends js.Object {
  /** Controls whether the legend will be shown or hidden along with the data. */
  var withLegend: js.UndefOr[Boolean] = js.native
}

object ShowHideOptions {
  @scala.inline
  def apply(): ShowHideOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShowHideOptions]
  }
  @scala.inline
  implicit class ShowHideOptionsOps[Self <: ShowHideOptions] (val x: Self) extends AnyVal {
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
    def setWithLegend(value: Boolean): Self = this.set("withLegend", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWithLegend: Self = this.set("withLegend", js.undefined)
  }
  
}

