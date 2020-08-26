package typings.baseui.layerMod

import typings.baseui.baseuiStrings.auto
import typings.baseui.baseuiStrings.bottom
import typings.baseui.baseuiStrings.bottomLeft
import typings.baseui.baseuiStrings.bottomRight
import typings.baseui.baseuiStrings.left
import typings.baseui.baseuiStrings.leftBottom
import typings.baseui.baseuiStrings.leftTop
import typings.baseui.baseuiStrings.right
import typings.baseui.baseuiStrings.rightBottom
import typings.baseui.baseuiStrings.rightTop
import typings.baseui.baseuiStrings.top
import typings.baseui.baseuiStrings.topLeft
import typings.baseui.baseuiStrings.topRight
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TetherProps extends js.Object {
  var anchorRef: js.UndefOr[Ref[HTMLElement]] = js.native
  var arrowRef: js.UndefOr[Ref[HTMLElement]] = js.native
  var children: ReactNode = js.native
  var onPopperUpdate: js.UndefOr[js.Function2[/* offsets */ NormalizedOffsets, /* popper */ PopperDataObject, _]] = js.native
  var placement: js.UndefOr[
    topLeft | leftBottom | topRight | rightBottom | bottomLeft | right | auto | bottomRight | leftTop | left | bottom | rightTop | top
  ] = js.native
  var popperOptions: js.UndefOr[js.Any] = js.native
  var popperRef: js.UndefOr[Ref[HTMLElement]] = js.native
}

object TetherProps {
  @scala.inline
  def apply(): TetherProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TetherProps]
  }
  @scala.inline
  implicit class TetherPropsOps[Self <: TetherProps] (val x: Self) extends AnyVal {
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
    def setAnchorRefFunction1(value: /* instance */ HTMLElement | Null => Unit): Self = this.set("anchorRef", js.Any.fromFunction1(value))
    @scala.inline
    def setAnchorRef(value: Ref[HTMLElement]): Self = this.set("anchorRef", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnchorRef: Self = this.set("anchorRef", js.undefined)
    @scala.inline
    def setAnchorRefNull: Self = this.set("anchorRef", null)
    @scala.inline
    def setArrowRefFunction1(value: /* instance */ HTMLElement | Null => Unit): Self = this.set("arrowRef", js.Any.fromFunction1(value))
    @scala.inline
    def setArrowRef(value: Ref[HTMLElement]): Self = this.set("arrowRef", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArrowRef: Self = this.set("arrowRef", js.undefined)
    @scala.inline
    def setArrowRefNull: Self = this.set("arrowRef", null)
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setOnPopperUpdate(value: (/* offsets */ NormalizedOffsets, /* popper */ PopperDataObject) => _): Self = this.set("onPopperUpdate", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnPopperUpdate: Self = this.set("onPopperUpdate", js.undefined)
    @scala.inline
    def setPlacement(
      value: topLeft | leftBottom | topRight | rightBottom | bottomLeft | right | auto | bottomRight | leftTop | left | bottom | rightTop | top
    ): Self = this.set("placement", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlacement: Self = this.set("placement", js.undefined)
    @scala.inline
    def setPopperOptions(value: js.Any): Self = this.set("popperOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePopperOptions: Self = this.set("popperOptions", js.undefined)
    @scala.inline
    def setPopperRefFunction1(value: /* instance */ HTMLElement | Null => Unit): Self = this.set("popperRef", js.Any.fromFunction1(value))
    @scala.inline
    def setPopperRef(value: Ref[HTMLElement]): Self = this.set("popperRef", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePopperRef: Self = this.set("popperRef", js.undefined)
    @scala.inline
    def setPopperRefNull: Self = this.set("popperRef", null)
  }
  
}

