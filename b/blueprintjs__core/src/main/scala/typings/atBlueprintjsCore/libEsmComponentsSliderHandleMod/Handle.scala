package typings.atBlueprintjsCore.libEsmComponentsSliderHandleMod

import typings.atBlueprintjsCore.Anon_IsMoving
import typings.atBlueprintjsCore.libEsmCommonMod.AbstractPureComponent2
import typings.react.reactMod.NativeMouseEvent
import typings.react.reactMod.TouchEvent
import typings.std.HTMLElement
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/core/lib/esm/components/slider/handle", "Handle")
@js.native
class Handle ()
  extends AbstractPureComponent2[IInternalHandleProps, IHandleState, js.Object] {
  /** Clamp value and invoke callback if it differs from current value */
  var changeValue: js.Any = js.native
  /** Clamp value between min and max props */
  var clamp: js.Any = js.native
  var endHandleMovement: js.Any = js.native
  var endHandleTouchMovement: js.Any = js.native
  var getHandleElementCenterPixel: js.Any = js.native
  var getHandleMidpointAndOffset: js.Any = js.native
  var handleElement: js.Any = js.native
  var handleHandleMovement: js.Any = js.native
  var handleHandleTouchMovement: js.Any = js.native
  var handleKeyDown: js.Any = js.native
  var handleKeyUp: js.Any = js.native
  var handleMoveEndedAt: js.Any = js.native
  var handleMovedTo: js.Any = js.native
  var refHandlers: js.Any = js.native
  var removeDocumentEventListeners: js.Any = js.native
  @JSName("state")
  var state_Handle: Anon_IsMoving = js.native
  def beginHandleMovement(event: typings.react.reactMod.MouseEvent[HTMLElement, MouseEvent]): Unit = js.native
  def beginHandleMovement(event: MouseEvent): Unit = js.native
  def beginHandleTouchMovement(event: TouchEvent[HTMLElement]): Unit = js.native
  def beginHandleTouchMovement(event: typings.std.TouchEvent): Unit = js.native
  /** Convert client pixel to value between min and max. */
  def clientToValue(clientPixel: Double): Double = js.native
  @JSName("componentDidMount")
  def componentDidMount_MHandle(): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MHandle(): Unit = js.native
  def mouseEventClientOffset(event: typings.react.reactMod.MouseEvent[HTMLElement, NativeMouseEvent]): Double = js.native
  def mouseEventClientOffset(event: MouseEvent): Double = js.native
  def touchEventClientOffset(event: TouchEvent[HTMLElement]): Double = js.native
  def touchEventClientOffset(event: typings.std.TouchEvent): Double = js.native
}

/* static members */
@JSImport("@blueprintjs/core/lib/esm/components/slider/handle", "Handle")
@js.native
object Handle extends js.Object {
  var displayName: String = js.native
}

