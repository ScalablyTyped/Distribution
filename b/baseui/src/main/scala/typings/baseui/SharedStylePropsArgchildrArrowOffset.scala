package typings.baseui

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

/* Inlined baseui.baseui/popover.SharedStylePropsArg & {  children ? :react.react.ReactNode} */
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

