package typings.baseui.anon

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
import typings.baseui.popoverMod.Offset
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined baseui.baseui/popover.SharedStylePropsArg & {  children :react.react.ReactNode | undefined} */
@js.native
trait SharedStylePropsArgchildrArrowOffset extends js.Object {
  @JSName("$arrowOffset")
  var $arrowOffset: js.UndefOr[Offset] = js.native
  @JSName("$isAnimating")
  var $isAnimating: js.UndefOr[Boolean] = js.native
  @JSName("$isOpen")
  var $isOpen: js.UndefOr[Boolean] = js.native
  @JSName("$placement")
  var $placement: js.UndefOr[
    topLeft | leftBottom | topRight | rightBottom | bottomLeft | right | auto | bottomRight | leftTop | left | bottom | rightTop | top
  ] = js.native
  @JSName("$popoverOffset")
  var $popoverOffset: js.UndefOr[Offset] = js.native
  @JSName("$showArrow")
  var $showArrow: js.UndefOr[Boolean] = js.native
  var children: js.UndefOr[ReactNode] = js.native
}

object SharedStylePropsArgchildrArrowOffset {
  @scala.inline
  def apply(): SharedStylePropsArgchildrArrowOffset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SharedStylePropsArgchildrArrowOffset]
  }
  @scala.inline
  implicit class SharedStylePropsArgchildrArrowOffsetOps[Self <: SharedStylePropsArgchildrArrowOffset] (val x: Self) extends AnyVal {
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
    def set$arrowOffset(value: Offset): Self = this.set("$arrowOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$arrowOffset: Self = this.set("$arrowOffset", js.undefined)
    @scala.inline
    def set$isAnimating(value: Boolean): Self = this.set("$isAnimating", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$isAnimating: Self = this.set("$isAnimating", js.undefined)
    @scala.inline
    def set$isOpen(value: Boolean): Self = this.set("$isOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$isOpen: Self = this.set("$isOpen", js.undefined)
    @scala.inline
    def set$placement(
      value: topLeft | leftBottom | topRight | rightBottom | bottomLeft | right | auto | bottomRight | leftTop | left | bottom | rightTop | top
    ): Self = this.set("$placement", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$placement: Self = this.set("$placement", js.undefined)
    @scala.inline
    def set$popoverOffset(value: Offset): Self = this.set("$popoverOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$popoverOffset: Self = this.set("$popoverOffset", js.undefined)
    @scala.inline
    def set$showArrow(value: Boolean): Self = this.set("$showArrow", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$showArrow: Self = this.set("$showArrow", js.undefined)
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
  }
  
}

