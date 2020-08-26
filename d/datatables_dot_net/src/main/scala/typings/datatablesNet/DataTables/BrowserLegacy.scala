package typings.datatablesNet.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BrowserLegacy extends js.Object {
  var bBounding: Boolean = js.native
  var bScrollOversize: Boolean = js.native
  var bScrollbarLeft: Boolean = js.native
  var barWidth: Double = js.native
}

object BrowserLegacy {
  @scala.inline
  def apply(bBounding: Boolean, bScrollOversize: Boolean, bScrollbarLeft: Boolean, barWidth: Double): BrowserLegacy = {
    val __obj = js.Dynamic.literal(bBounding = bBounding.asInstanceOf[js.Any], bScrollOversize = bScrollOversize.asInstanceOf[js.Any], bScrollbarLeft = bScrollbarLeft.asInstanceOf[js.Any], barWidth = barWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrowserLegacy]
  }
  @scala.inline
  implicit class BrowserLegacyOps[Self <: BrowserLegacy] (val x: Self) extends AnyVal {
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
    def setBBounding(value: Boolean): Self = this.set("bBounding", value.asInstanceOf[js.Any])
    @scala.inline
    def setBScrollOversize(value: Boolean): Self = this.set("bScrollOversize", value.asInstanceOf[js.Any])
    @scala.inline
    def setBScrollbarLeft(value: Boolean): Self = this.set("bScrollbarLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def setBarWidth(value: Double): Self = this.set("barWidth", value.asInstanceOf[js.Any])
  }
  
}

