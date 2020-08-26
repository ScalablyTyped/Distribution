package typings.betterScroll.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<better-scroll.better-scroll.WheelOption> */
@js.native
trait PartialWheelOption extends js.Object {
  var adjustTime: js.UndefOr[Double] = js.native
  var rotate: js.UndefOr[Double] = js.native
  var selectedIndex: js.UndefOr[Double] = js.native
  var wheelItemClass: js.UndefOr[String] = js.native
  var wheelWrapperClass: js.UndefOr[String] = js.native
}

object PartialWheelOption {
  @scala.inline
  def apply(): PartialWheelOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialWheelOption]
  }
  @scala.inline
  implicit class PartialWheelOptionOps[Self <: PartialWheelOption] (val x: Self) extends AnyVal {
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
    def setAdjustTime(value: Double): Self = this.set("adjustTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdjustTime: Self = this.set("adjustTime", js.undefined)
    @scala.inline
    def setRotate(value: Double): Self = this.set("rotate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRotate: Self = this.set("rotate", js.undefined)
    @scala.inline
    def setSelectedIndex(value: Double): Self = this.set("selectedIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedIndex: Self = this.set("selectedIndex", js.undefined)
    @scala.inline
    def setWheelItemClass(value: String): Self = this.set("wheelItemClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWheelItemClass: Self = this.set("wheelItemClass", js.undefined)
    @scala.inline
    def setWheelWrapperClass(value: String): Self = this.set("wheelWrapperClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWheelWrapperClass: Self = this.set("wheelWrapperClass", js.undefined)
  }
  
}

