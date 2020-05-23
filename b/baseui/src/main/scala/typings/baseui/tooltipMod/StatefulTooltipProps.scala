package typings.baseui.tooltipMod

import typings.baseui.anon.Close
import typings.baseui.baseuiStrings.auto
import typings.baseui.baseuiStrings.bottom
import typings.baseui.baseuiStrings.bottomLeft
import typings.baseui.baseuiStrings.bottomRight
import typings.baseui.baseuiStrings.click
import typings.baseui.baseuiStrings.close
import typings.baseui.baseuiStrings.hover
import typings.baseui.baseuiStrings.left
import typings.baseui.baseuiStrings.leftBottom
import typings.baseui.baseuiStrings.leftTop
import typings.baseui.baseuiStrings.menu
import typings.baseui.baseuiStrings.none
import typings.baseui.baseuiStrings.open
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

/* Inlined baseui.baseui/popover.StatefulPopoverProps */
trait StatefulTooltipProps extends js.Object {
  var accessibilityType: js.UndefOr[none | menu | tooltip] = js.undefined
  var animateOutTime: js.UndefOr[Double] = js.undefined
  var autoFocus: js.UndefOr[Boolean] = js.undefined
  var children: js.UndefOr[ReactNode] = js.undefined
  var content: js.UndefOr[ReactNode | (js.Function1[/* args */ Close, ReactNode])] = js.undefined
  var `data-baseweb`: js.UndefOr[String] = js.undefined
  var dismissOnClickOutside: js.UndefOr[Boolean] = js.undefined
  var dismissOnEsc: js.UndefOr[Boolean] = js.undefined
  var focusLock: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var ignoreBoundary: js.UndefOr[Boolean] = js.undefined
  var initialState: js.UndefOr[State] = js.undefined
  var mountNode: js.UndefOr[HTMLElement] = js.undefined
  var onClose: js.UndefOr[js.Function0[_]] = js.undefined
  var onMouseEnterDelay: js.UndefOr[Double] = js.undefined
  var onMouseLeaveDelay: js.UndefOr[Double] = js.undefined
  var onOpen: js.UndefOr[js.Function0[_]] = js.undefined
  var overrides: js.UndefOr[Overrides] = js.undefined
  var placement: js.UndefOr[
    topLeft | leftBottom | topRight | rightBottom | bottomLeft | right | auto | bottomRight | leftTop | left | bottom | rightTop | top
  ] = js.undefined
  var popperOptions: js.UndefOr[js.Any] = js.undefined
  var renderAll: js.UndefOr[Boolean] = js.undefined
  var returnFocus: js.UndefOr[Boolean] = js.undefined
  var showArrow: js.UndefOr[Boolean] = js.undefined
  var stateReducer: js.UndefOr[StateReducer] = js.undefined
  var triggerType: js.UndefOr[click | hover] = js.undefined
}

object StatefulTooltipProps {
  @scala.inline
  def apply(
    accessibilityType: none | menu | tooltip = null,
    animateOutTime: js.UndefOr[Double] = js.undefined,
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    children: ReactNode = null,
    content: ReactNode | (js.Function1[/* args */ Close, ReactNode]) = null,
    `data-baseweb`: String = null,
    dismissOnClickOutside: js.UndefOr[Boolean] = js.undefined,
    dismissOnEsc: js.UndefOr[Boolean] = js.undefined,
    focusLock: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    ignoreBoundary: js.UndefOr[Boolean] = js.undefined,
    initialState: State = null,
    mountNode: HTMLElement = null,
    onClose: () => _ = null,
    onMouseEnterDelay: js.UndefOr[Double] = js.undefined,
    onMouseLeaveDelay: js.UndefOr[Double] = js.undefined,
    onOpen: () => _ = null,
    overrides: Overrides = null,
    placement: topLeft | leftBottom | topRight | rightBottom | bottomLeft | right | auto | bottomRight | leftTop | left | bottom | rightTop | top = null,
    popperOptions: js.Any = null,
    renderAll: js.UndefOr[Boolean] = js.undefined,
    returnFocus: js.UndefOr[Boolean] = js.undefined,
    showArrow: js.UndefOr[Boolean] = js.undefined,
    stateReducer: (/* stateChangeType */ open | close, /* nextState */ State, /* currentState */ State) => State = null,
    triggerType: click | hover = null
  ): StatefulTooltipProps = {
    val __obj = js.Dynamic.literal()
    if (accessibilityType != null) __obj.updateDynamic("accessibilityType")(accessibilityType.asInstanceOf[js.Any])
    if (!js.isUndefined(animateOutTime)) __obj.updateDynamic("animateOutTime")(animateOutTime.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus.get.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (`data-baseweb` != null) __obj.updateDynamic("data-baseweb")(`data-baseweb`.asInstanceOf[js.Any])
    if (!js.isUndefined(dismissOnClickOutside)) __obj.updateDynamic("dismissOnClickOutside")(dismissOnClickOutside.get.asInstanceOf[js.Any])
    if (!js.isUndefined(dismissOnEsc)) __obj.updateDynamic("dismissOnEsc")(dismissOnEsc.get.asInstanceOf[js.Any])
    if (!js.isUndefined(focusLock)) __obj.updateDynamic("focusLock")(focusLock.get.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreBoundary)) __obj.updateDynamic("ignoreBoundary")(ignoreBoundary.get.asInstanceOf[js.Any])
    if (initialState != null) __obj.updateDynamic("initialState")(initialState.asInstanceOf[js.Any])
    if (mountNode != null) __obj.updateDynamic("mountNode")(mountNode.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction0(onClose))
    if (!js.isUndefined(onMouseEnterDelay)) __obj.updateDynamic("onMouseEnterDelay")(onMouseEnterDelay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(onMouseLeaveDelay)) __obj.updateDynamic("onMouseLeaveDelay")(onMouseLeaveDelay.get.asInstanceOf[js.Any])
    if (onOpen != null) __obj.updateDynamic("onOpen")(js.Any.fromFunction0(onOpen))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (popperOptions != null) __obj.updateDynamic("popperOptions")(popperOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(renderAll)) __obj.updateDynamic("renderAll")(renderAll.get.asInstanceOf[js.Any])
    if (!js.isUndefined(returnFocus)) __obj.updateDynamic("returnFocus")(returnFocus.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showArrow)) __obj.updateDynamic("showArrow")(showArrow.get.asInstanceOf[js.Any])
    if (stateReducer != null) __obj.updateDynamic("stateReducer")(js.Any.fromFunction3(stateReducer))
    if (triggerType != null) __obj.updateDynamic("triggerType")(triggerType.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatefulTooltipProps]
  }
}

