package typings.cypress.JQuery

import typings.cypress._MouseEvent
import typings.cypress.cypressStrings.mouseover
import typings.std.Element
import typings.std.EventTarget
import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MouseEnterEvent[TDelegateTarget, TData, TCurrentTarget, TTarget] extends MouseEventBase[TDelegateTarget, TData, TCurrentTarget, TTarget] {
  // Special handling by jQuery.
  @JSName("type")
  var type_MouseEnterEvent: mouseover
}

object MouseEnterEvent {
  @scala.inline
  def apply[TDelegateTarget, TData, TCurrentTarget, TTarget](
    altKey: Boolean,
    bubbles: Boolean,
    button: Double,
    buttons: Double,
    cancelable: Boolean,
    clientX: Double,
    clientY: Double,
    ctrlKey: Boolean,
    currentTarget: TCurrentTarget,
    data: TData,
    delegateTarget: TDelegateTarget,
    detail: Double,
    eventPhase: Double,
    isDefaultPrevented: () => Boolean,
    isImmediatePropagationStopped: () => Boolean,
    isPropagationStopped: () => Boolean,
    metaKey: Boolean,
    offsetX: Double,
    offsetY: Double,
    pageX: Double,
    pageY: Double,
    preventDefault: () => Unit,
    screenX: Double,
    screenY: Double,
    shiftKey: Boolean,
    stopImmediatePropagation: () => Unit,
    stopPropagation: () => Unit,
    target: TTarget,
    timeStamp: Double,
    toElement: Element,
    `type`: mouseover,
    view: Window,
    which: Double,
    changedTouches: js.UndefOr[scala.Nothing] = js.undefined,
    char: js.UndefOr[scala.Nothing] = js.undefined,
    charCode: js.UndefOr[scala.Nothing] = js.undefined,
    key: js.UndefOr[scala.Nothing] = js.undefined,
    keyCode: js.UndefOr[scala.Nothing] = js.undefined,
    namespace: String = null,
    originalEvent: _MouseEvent = null,
    pointerId: js.UndefOr[scala.Nothing] = js.undefined,
    pointerType: js.UndefOr[scala.Nothing] = js.undefined,
    relatedTarget: EventTarget = null,
    result: js.Any = null,
    targetTouches: js.UndefOr[scala.Nothing] = js.undefined,
    touches: js.UndefOr[scala.Nothing] = js.undefined
  ): MouseEnterEvent[TDelegateTarget, TData, TCurrentTarget, TTarget] = {
    val __obj = js.Dynamic.literal(altKey = altKey, bubbles = bubbles, button = button, buttons = buttons, cancelable = cancelable, clientX = clientX, clientY = clientY, ctrlKey = ctrlKey, currentTarget = currentTarget.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], delegateTarget = delegateTarget.asInstanceOf[js.Any], detail = detail, eventPhase = eventPhase, isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), isImmediatePropagationStopped = js.Any.fromFunction0(isImmediatePropagationStopped), isPropagationStopped = js.Any.fromFunction0(isPropagationStopped), metaKey = metaKey, offsetX = offsetX, offsetY = offsetY, pageX = pageX, pageY = pageY, preventDefault = js.Any.fromFunction0(preventDefault), screenX = screenX, screenY = screenY, shiftKey = shiftKey, stopImmediatePropagation = js.Any.fromFunction0(stopImmediatePropagation), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any], timeStamp = timeStamp, toElement = toElement, view = view, which = which)
    __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(changedTouches)) __obj.updateDynamic("changedTouches")(changedTouches)
    if (!js.isUndefined(char)) __obj.updateDynamic("char")(char)
    if (!js.isUndefined(charCode)) __obj.updateDynamic("charCode")(charCode)
    if (!js.isUndefined(key)) __obj.updateDynamic("key")(key)
    if (!js.isUndefined(keyCode)) __obj.updateDynamic("keyCode")(keyCode)
    if (namespace != null) __obj.updateDynamic("namespace")(namespace)
    if (originalEvent != null) __obj.updateDynamic("originalEvent")(originalEvent)
    if (!js.isUndefined(pointerId)) __obj.updateDynamic("pointerId")(pointerId)
    if (!js.isUndefined(pointerType)) __obj.updateDynamic("pointerType")(pointerType)
    if (relatedTarget != null) __obj.updateDynamic("relatedTarget")(relatedTarget)
    if (result != null) __obj.updateDynamic("result")(result)
    if (!js.isUndefined(targetTouches)) __obj.updateDynamic("targetTouches")(targetTouches)
    if (!js.isUndefined(touches)) __obj.updateDynamic("touches")(touches)
    __obj.asInstanceOf[MouseEnterEvent[TDelegateTarget, TData, TCurrentTarget, TTarget]]
  }
}

