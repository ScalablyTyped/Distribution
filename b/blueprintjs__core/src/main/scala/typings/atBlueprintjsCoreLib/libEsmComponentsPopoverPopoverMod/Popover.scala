package typings
package atBlueprintjsCoreLib.libEsmComponentsPopoverPopoverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/core/lib/esm/components/popover/popover", "Popover")
@js.native
class Popover ()
  extends atBlueprintjsCoreLib.libEsmCommonAbstractPureComponentMod.AbstractPureComponent[IPopoverProps, IPopoverState] {
  var cancelOpenTimeout: js.Any = js.native
  var handleMouseEnter: js.Any = js.native
  var handleMouseLeave: js.Any = js.native
  var handleOverlayClose: js.Any = js.native
  var handlePopoverClick: js.Any = js.native
  var handlePopoverResize: js.Any = js.native
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
  var popoverElement: reactLib.HTMLElement = js.native
  var popperScheduleUpdate: js.Any = js.native
  var refHandlers: js.Any = js.native
  var renderPopover: js.Any = js.native
  var renderTarget: js.Any = js.native
  @JSName("state")
  var state_Popover: IPopoverState = js.native
  /** DOM element that contains the target. */
  var targetElement: reactLib.HTMLElement = js.native
  /** Popper modifier that updates React state (for style properties) based on latest data. */
  var updatePopoverState: js.Any = js.native
  @JSName("componentDidMount")
  def componentDidMount_MPopover(): scala.Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MPopover(): scala.Unit = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MPopover(nextProps: IPopoverProps): scala.Unit = js.native
  /* private */ def getIsOpen(props: js.Any): js.Any = js.native
  /* private */ def getPopperModifiers(): js.Any = js.native
  /* private */ def isArrowEnabled(): js.Any = js.native
  /* private */ def isElementInPopover(element: js.Any): js.Any = js.native
  /* private */ def isHoverInteractionKind(): js.Any = js.native
  /* private */ def setOpenState(isOpen: js.Any): js.Any = js.native
  /* private */ def setOpenState(isOpen: js.Any, e: js.Any): js.Any = js.native
  /* private */ def setOpenState(isOpen: js.Any, e: js.Any, timeout: js.Any): js.Any = js.native
  /* private */ def understandChildren(): js.Any = js.native
  /* private */ def updateDarkParent(): js.Any = js.native
}

@JSImport("@blueprintjs/core/lib/esm/components/popover/popover", "Popover")
@js.native
object Popover extends js.Object {
  var defaultProps: atBlueprintjsCoreLib.libEsmComponentsPopoverPopoverMod.IPopoverProps = js.native
  var displayName: java.lang.String = js.native
}

