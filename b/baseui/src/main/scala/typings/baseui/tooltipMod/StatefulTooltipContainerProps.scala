package typings.baseui.tooltipMod

import typings.baseui.anon.Close
import typings.baseui.anon.PopoverPropschildrennever
import typings.baseui.baseuiStrings.auto
import typings.baseui.baseuiStrings.bottom
import typings.baseui.baseuiStrings.bottomLeft
import typings.baseui.baseuiStrings.bottomRight
import typings.baseui.baseuiStrings.click
import typings.baseui.baseuiStrings.hover
import typings.baseui.baseuiStrings.left
import typings.baseui.baseuiStrings.leftBottom
import typings.baseui.baseuiStrings.leftTop
import typings.baseui.baseuiStrings.menu
import typings.baseui.baseuiStrings.none
import typings.baseui.baseuiStrings.right
import typings.baseui.baseuiStrings.rightBottom
import typings.baseui.baseuiStrings.rightTop
import typings.baseui.baseuiStrings.tooltip
import typings.baseui.baseuiStrings.top
import typings.baseui.baseuiStrings.topLeft
import typings.baseui.baseuiStrings.topRight
import typings.baseui.popoverMod.Overrides
import typings.baseui.popoverMod.State
import typings.baseui.popoverMod.StateReducer
import typings.react.mod.ReactNode
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined baseui.baseui/popover.StatefulPopoverContainerProps */
@js.native
trait StatefulTooltipContainerProps extends js.Object {
  var accessibilityType: js.UndefOr[none | menu | tooltip] = js.native
  var animateOutTime: js.UndefOr[Double] = js.native
  var autoFocus: js.UndefOr[Boolean] = js.native
  var children: js.UndefOr[ReactNode] = js.native
  var content: js.UndefOr[ReactNode | (js.Function1[/* args */ Close, ReactNode])] = js.native
  var `data-baseweb`: js.UndefOr[String] = js.native
  var dismissOnClickOutside: js.UndefOr[Boolean] = js.native
  var dismissOnEsc: js.UndefOr[Boolean] = js.native
  var focusLock: js.UndefOr[Boolean] = js.native
  var id: js.UndefOr[String] = js.native
  var ignoreBoundary: js.UndefOr[Boolean] = js.native
  var initialState: js.UndefOr[State] = js.native
  var mountNode: js.UndefOr[HTMLElement] = js.native
  var onClose: js.UndefOr[js.Function0[_]] = js.native
  var onMouseEnterDelay: js.UndefOr[Double] = js.native
  var onMouseLeaveDelay: js.UndefOr[Double] = js.native
  var onOpen: js.UndefOr[js.Function0[_]] = js.native
  var overrides: js.UndefOr[Overrides] = js.native
  var placement: js.UndefOr[
    topLeft | leftBottom | topRight | rightBottom | bottomLeft | right | auto | bottomRight | leftTop | left | bottom | rightTop | top
  ] = js.native
  var popperOptions: js.UndefOr[js.Any] = js.native
  var renderAll: js.UndefOr[Boolean] = js.native
  var returnFocus: js.UndefOr[Boolean] = js.native
  var showArrow: js.UndefOr[Boolean] = js.native
  var stateReducer: js.UndefOr[StateReducer] = js.native
  var triggerType: js.UndefOr[click | hover] = js.native
  def children(props: PopoverPropschildrennever): ReactNode = js.native
}

