package typings.baseui.popoverMod

import typings.baseui.anon.ArrowOffset
import typings.baseui.anon.SharedStylePropsArgchildrArrowOffset
import typings.baseui.layerMod.NormalizedOffsets
import typings.baseui.layerMod.PopperDataObject
import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.std.Event
import typings.std.KeyboardEvent
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("baseui/popover", "Popover")
@js.native
class Popover ()
  extends Component[PopoverProps, PopoverPrivateState, js.Any] {
  
  def addDomEvents(): Unit = js.native
  
  def animateIn(): Unit = js.native
  
  def animateOut(): Unit = js.native
  
  def clearTimers(): Unit = js.native
  
  def getAnchorFromChildren(): ReactNode = js.native
  
  def getAnchorIdAttr(): String | Null = js.native
  
  def getAnchorProps(): js.Object = js.native
  
  def getDefaultState(props: PopoverProps): ArrowOffset = js.native
  
  def getPopoverBodyProps(): js.Object = js.native
  
  def getPopoverIdAttr(): String | Null = js.native
  
  def getSharedProps(): SharedStylePropsArgchildrArrowOffset = js.native
  
  def init(prevProps: PopoverProps, prevState: PopoverPrivateState): Unit = js.native
  
  def isAccessibilityTypeMenu(): Boolean = js.native
  
  def isAccessibilityTypeTooltip(): Boolean = js.native
  
  def isClickTrigger(): Boolean = js.native
  
  def isHoverTrigger(): Boolean = js.native
  
  def onAnchorClick(e: Event): Unit = js.native
  
  def onAnchorMouseEnter(): Unit = js.native
  
  def onAnchorMouseLeave(): Unit = js.native
  
  def onDocumentClick(evt: MouseEvent): Unit = js.native
  
  def onKeyPress(evt: KeyboardEvent): Unit = js.native
  
  def onPopoverMouseEnter(): Unit = js.native
  
  def onPopoverMouseLeave(): Unit = js.native
  
  def onPopperUpdate(normalizedOffsets: NormalizedOffsets, data: PopperDataObject): Unit = js.native
  
  def removeDomEvents(): Unit = js.native
  
  def renderAnchor(): ReactNode = js.native
  
  def renderPopover(): ReactNode = js.native
  
  def triggerOnMouseEnter(): Unit = js.native
  
  def triggerOnMouseEnterWithDelay(): Unit = js.native
  
  def triggerOnMouseLeave(): Unit = js.native
  
  def triggerOnMouseLeaveWithDelay(): Unit = js.native
}
