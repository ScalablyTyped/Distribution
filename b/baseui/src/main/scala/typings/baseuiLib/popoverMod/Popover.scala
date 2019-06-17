package typings
package baseuiLib.popoverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baseui/popover", "Popover")
@js.native
class Popover ()
  extends reactLib.reactMod.Component[PopoverProps, PopoverPrivateState, js.Any] {
  def addDomEvents(): scala.Unit = js.native
  def animateIn(): scala.Unit = js.native
  def animateOut(): scala.Unit = js.native
  def clearTimers(): scala.Unit = js.native
  def getAnchorFromChildren(): reactLib.reactMod.ReactNode = js.native
  def getAnchorIdAttr(): java.lang.String | scala.Null = js.native
  def getAnchorProps(): js.Object = js.native
  def getDefaultState(props: PopoverProps): baseuiLib.Anon_ArrowOffset = js.native
  def getPopoverBodyProps(): js.Object = js.native
  def getPopoverIdAttr(): java.lang.String | scala.Null = js.native
  def getSharedProps(): SharedStylePropsArg with baseuiLib.Anon_ChildrenReactNode = js.native
  def init(prevProps: PopoverProps, prevState: PopoverPrivateState): scala.Unit = js.native
  def isAccessibilityTypeMenu(): scala.Boolean = js.native
  def isAccessibilityTypeTooltip(): scala.Boolean = js.native
  def isClickTrigger(): scala.Boolean = js.native
  def isHoverTrigger(): scala.Boolean = js.native
  def onAnchorClick(e: stdLib.Event): scala.Unit = js.native
  def onAnchorMouseEnter(): scala.Unit = js.native
  def onAnchorMouseLeave(): scala.Unit = js.native
  def onDocumentClick(evt: stdLib.MouseEvent): scala.Unit = js.native
  def onKeyPress(evt: stdLib.KeyboardEvent): scala.Unit = js.native
  def onPopoverMouseEnter(): scala.Unit = js.native
  def onPopoverMouseLeave(): scala.Unit = js.native
  def onPopperUpdate(normalizedOffsets: baseuiLib.layerMod.NormalizedOffsets, data: baseuiLib.layerMod.PopperDataObject): scala.Unit = js.native
  def removeDomEvents(): scala.Unit = js.native
  def renderAnchor(): reactLib.reactMod.ReactNode = js.native
  def renderPopover(): reactLib.reactMod.ReactNode = js.native
  def triggerOnMouseEnter(): scala.Unit = js.native
  def triggerOnMouseEnterWithDelay(): scala.Unit = js.native
  def triggerOnMouseLeave(): scala.Unit = js.native
  def triggerOnMouseLeaveWithDelay(): scala.Unit = js.native
}

