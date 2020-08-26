package typings.carbonComponents.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Direction extends js.Object {
  var direction: js.UndefOr[String] = js.native
  var menuSize: js.Any = js.native
  var offset: js.UndefOr[js.Object] = js.native
  var refPosition: js.Any = js.native
  var scrollX: js.UndefOr[Double] = js.native
  var scrollY: js.UndefOr[Double] = js.native
}

object Direction {
  @scala.inline
  def apply(menuSize: js.Any, refPosition: js.Any): Direction = {
    val __obj = js.Dynamic.literal(menuSize = menuSize.asInstanceOf[js.Any], refPosition = refPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[Direction]
  }
  @scala.inline
  implicit class DirectionOps[Self <: Direction] (val x: Self) extends AnyVal {
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
    def setMenuSize(value: js.Any): Self = this.set("menuSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setRefPosition(value: js.Any): Self = this.set("refPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def setDirection(value: String): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    @scala.inline
    def setOffset(value: js.Object): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    @scala.inline
    def setScrollX(value: Double): Self = this.set("scrollX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollX: Self = this.set("scrollX", js.undefined)
    @scala.inline
    def setScrollY(value: Double): Self = this.set("scrollY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollY: Self = this.set("scrollY", js.undefined)
  }
  
}

