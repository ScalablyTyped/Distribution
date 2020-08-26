package typings.blessed.mod.Widgets

import typings.blessed.anon.X
import typings.blessed.mod.Widgets.Types.TPosition
import typings.blessed.mod.Widgets.Types.TTopLeft
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Coords extends js.Object {
  var _contentEnd: X = js.native
  var base: Double = js.native
  var nobot: TPosition = js.native
  var noleft: TTopLeft = js.native
  var noright: TPosition = js.native
  var notop: TTopLeft = js.native
  var xi: Double = js.native
  var xl: Double = js.native
  var yi: Double = js.native
  var yl: Double = js.native
}

object Coords {
  @scala.inline
  def apply(
    _contentEnd: X,
    base: Double,
    nobot: TPosition,
    noleft: TTopLeft,
    noright: TPosition,
    notop: TTopLeft,
    xi: Double,
    xl: Double,
    yi: Double,
    yl: Double
  ): Coords = {
    val __obj = js.Dynamic.literal(_contentEnd = _contentEnd.asInstanceOf[js.Any], base = base.asInstanceOf[js.Any], nobot = nobot.asInstanceOf[js.Any], noleft = noleft.asInstanceOf[js.Any], noright = noright.asInstanceOf[js.Any], notop = notop.asInstanceOf[js.Any], xi = xi.asInstanceOf[js.Any], xl = xl.asInstanceOf[js.Any], yi = yi.asInstanceOf[js.Any], yl = yl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Coords]
  }
  @scala.inline
  implicit class CoordsOps[Self <: Coords] (val x: Self) extends AnyVal {
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
    def set_contentEnd(value: X): Self = this.set("_contentEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def setBase(value: Double): Self = this.set("base", value.asInstanceOf[js.Any])
    @scala.inline
    def setNobot(value: TPosition): Self = this.set("nobot", value.asInstanceOf[js.Any])
    @scala.inline
    def setNoleft(value: TTopLeft): Self = this.set("noleft", value.asInstanceOf[js.Any])
    @scala.inline
    def setNoright(value: TPosition): Self = this.set("noright", value.asInstanceOf[js.Any])
    @scala.inline
    def setNotop(value: TTopLeft): Self = this.set("notop", value.asInstanceOf[js.Any])
    @scala.inline
    def setXi(value: Double): Self = this.set("xi", value.asInstanceOf[js.Any])
    @scala.inline
    def setXl(value: Double): Self = this.set("xl", value.asInstanceOf[js.Any])
    @scala.inline
    def setYi(value: Double): Self = this.set("yi", value.asInstanceOf[js.Any])
    @scala.inline
    def setYl(value: Double): Self = this.set("yl", value.asInstanceOf[js.Any])
  }
  
}

