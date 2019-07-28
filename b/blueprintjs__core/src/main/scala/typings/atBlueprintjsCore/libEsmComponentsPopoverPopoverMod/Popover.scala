package typings.atBlueprintjsCore.libEsmComponentsPopoverPopoverMod

import typings.atBlueprintjsCore.libEsmCommonAbstractPureComponentMod.AbstractPureComponent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/core/lib/esm/components/popover/popover", "Popover")
@js.native
class Popover () extends AbstractPureComponent[IPopoverProps, IPopoverState] {
  var cancelOpenTimeout: js.Any = js.native
  var handleMouseEnter: js.Any = js.native
  var handleMouseLeave: js.Any = js.native
  var handleOverlayClose: js.Any = js.native
  var handlePopoverClick: js.Any = js.native
  var handleTargetBlur: js.Any = js.native
  var handleTargetClick: js.Any = js.native
  var handleTargetFocus: js.Any = js.native
  var isMouseInTargetOrPopover: js.Any = js.native
  var lostFocusOnSamePage: js.Any = js.native
  /**
    * DOM element that contains the popover.
    * When `usePortal={true}`, this element will be portaled outside the usual DOM flow,
    * so this reference can be very useful for testing.
    */
  var popoverElement: HTMLElement = js.native
  var popperScheduleUpdate: js.Any = js.native
  var refHandlers: js.Any = js.native
  var renderPopover: js.Any = js.native
  var renderTarget: js.Any = js.native
  /** DOM element that contains the target. */
  var targetElement: HTMLElement = js.native
  /** Popper modifier that updates React state (for style properties) based on latest data. */
  var updatePopoverState: js.Any = js.native
  @JSName("componentDidMount")
  def componentDidMount_MPopover(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MPopover(): Unit = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MPopover(nextProps: IPopoverProps): Unit = js.native
  /* private */ def getIsOpen(props: js.Any): js.Any = js.native
  /* private */ def getPopperModifiers(): js.Any = js.native
  /* private */ def isArrowEnabled(): js.Any = js.native
  /* private */ def isElementInPopover(element: js.Any): js.Any = js.native
  /* private */ def isHoverInteractionKind(): js.Any = js.native
  /**
    * Instance method to instruct the `Popover` to recompute its position.
    *
    * This method should only be used if you are updating the target in a way
    * that does not cause it to re-render, such as changing its _position_
    * without changing its _size_ (since `Popover` already repositions when it
    * detects a resize).
    */
  def reposition(): Unit = js.native
  /* private */ def setOpenState(isOpen: js.Any): js.Any = js.native
  /* private */ def setOpenState(isOpen: js.Any, e: js.Any): js.Any = js.native
  /* private */ def setOpenState(isOpen: js.Any, e: js.Any, timeout: js.Any): js.Any = js.native
  /* private */ def understandChildren(): js.Any = js.native
  /* private */ def updateDarkParent(): js.Any = js.native
}

/* static members */
@JSImport("@blueprintjs/core/lib/esm/components/popover/popover", "Popover")
@js.native
object Popover extends js.Object {
  var defaultProps: IPopoverProps = js.native
  var displayName: String = js.native
}

