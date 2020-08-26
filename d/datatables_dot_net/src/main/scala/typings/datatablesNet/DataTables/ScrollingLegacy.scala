package typings.datatablesNet.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScrollingLegacy extends js.Object {
  var bAutoCss: Boolean = js.native
  var bCollapse: Boolean = js.native
  var bInfinite: Boolean = js.native
  var iBarWidth: Double = js.native
  var iLoadGap: Double = js.native
  var sX: String = js.native
  var sY: String = js.native
}

object ScrollingLegacy {
  @scala.inline
  def apply(
    bAutoCss: Boolean,
    bCollapse: Boolean,
    bInfinite: Boolean,
    iBarWidth: Double,
    iLoadGap: Double,
    sX: String,
    sY: String
  ): ScrollingLegacy = {
    val __obj = js.Dynamic.literal(bAutoCss = bAutoCss.asInstanceOf[js.Any], bCollapse = bCollapse.asInstanceOf[js.Any], bInfinite = bInfinite.asInstanceOf[js.Any], iBarWidth = iBarWidth.asInstanceOf[js.Any], iLoadGap = iLoadGap.asInstanceOf[js.Any], sX = sX.asInstanceOf[js.Any], sY = sY.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollingLegacy]
  }
  @scala.inline
  implicit class ScrollingLegacyOps[Self <: ScrollingLegacy] (val x: Self) extends AnyVal {
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
    def setBAutoCss(value: Boolean): Self = this.set("bAutoCss", value.asInstanceOf[js.Any])
    @scala.inline
    def setBCollapse(value: Boolean): Self = this.set("bCollapse", value.asInstanceOf[js.Any])
    @scala.inline
    def setBInfinite(value: Boolean): Self = this.set("bInfinite", value.asInstanceOf[js.Any])
    @scala.inline
    def setIBarWidth(value: Double): Self = this.set("iBarWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setILoadGap(value: Double): Self = this.set("iLoadGap", value.asInstanceOf[js.Any])
    @scala.inline
    def setSX(value: String): Self = this.set("sX", value.asInstanceOf[js.Any])
    @scala.inline
    def setSY(value: String): Self = this.set("sY", value.asInstanceOf[js.Any])
  }
  
}

