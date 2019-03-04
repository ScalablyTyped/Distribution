package typings
package bootstrapLib.bootstrapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModalEventHandler[TElement]
  extends jqueryLib.JQueryNs.TriggeredEvent[TElement, js.UndefOr[scala.Nothing], stdLib.HTMLElement, stdLib.HTMLElement] {
   // overridden only for better JsDoc
  /**
    * For `show.bs.modal` and `shown.bs.modal` is the clicked element, when caused by a _click_.
    * Otherwise is undefined.
    */
  var relatedTarget: js.UndefOr[stdLib.HTMLElement]
}

object ModalEventHandler {
  @scala.inline
  def apply[TElement](
    currentTarget: stdLib.HTMLElement,
    delegateTarget: TElement,
    isDefaultPrevented: js.Function0[scala.Boolean],
    isImmediatePropagationStopped: js.Function0[scala.Boolean],
    isPropagationStopped: js.Function0[scala.Boolean],
    preventDefault: js.Function0[scala.Unit],
    stopImmediatePropagation: js.Function0[scala.Unit],
    stopPropagation: js.Function0[scala.Unit],
    target: stdLib.HTMLElement,
    timeStamp: scala.Double,
    `type`: java.lang.String,
    altKey: js.UndefOr[scala.Boolean] = js.undefined,
    bubbles: js.UndefOr[scala.Boolean] = js.undefined,
    button: scala.Int | scala.Double = null,
    buttons: scala.Int | scala.Double = null,
    cancelable: js.UndefOr[scala.Boolean] = js.undefined,
    changedTouches: stdLib.TouchList = null,
    char: java.lang.String = null,
    charCode: scala.Int | scala.Double = null,
    clientX: scala.Int | scala.Double = null,
    clientY: scala.Int | scala.Double = null,
    ctrlKey: js.UndefOr[scala.Boolean] = js.undefined,
    data: js.UndefOr[scala.Nothing] = js.undefined,
    detail: scala.Int | scala.Double = null,
    eventPhase: scala.Int | scala.Double = null,
    key: java.lang.String = null,
    keyCode: scala.Int | scala.Double = null,
    metaKey: js.UndefOr[scala.Boolean] = js.undefined,
    namespace: java.lang.String = null,
    offsetX: scala.Int | scala.Double = null,
    offsetY: scala.Int | scala.Double = null,
    originalEvent: jqueryLib._Event = null,
    pageX: scala.Int | scala.Double = null,
    pageY: scala.Int | scala.Double = null,
    pointerId: scala.Int | scala.Double = null,
    pointerType: java.lang.String = null,
    relatedTarget: stdLib.HTMLElement = null,
    result: js.Any = null,
    screenX: scala.Int | scala.Double = null,
    screenY: scala.Int | scala.Double = null,
    shiftKey: js.UndefOr[scala.Boolean] = js.undefined,
    targetTouches: stdLib.TouchList = null,
    toElement: stdLib.Element = null,
    touches: stdLib.TouchList = null,
    view: stdLib.Window = null,
    which: scala.Int | scala.Double = null
  ): ModalEventHandler[TElement] = {
    val __obj = js.Dynamic.literal(currentTarget = currentTarget, delegateTarget = delegateTarget.asInstanceOf[js.Any], isDefaultPrevented = isDefaultPrevented, isImmediatePropagationStopped = isImmediatePropagationStopped, isPropagationStopped = isPropagationStopped, preventDefault = preventDefault, stopImmediatePropagation = stopImmediatePropagation, stopPropagation = stopPropagation, target = target, timeStamp = timeStamp)
    __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(altKey)) __obj.updateDynamic("altKey")(altKey)
    if (!js.isUndefined(bubbles)) __obj.updateDynamic("bubbles")(bubbles)
    if (button != null) __obj.updateDynamic("button")(button.asInstanceOf[js.Any])
    if (buttons != null) __obj.updateDynamic("buttons")(buttons.asInstanceOf[js.Any])
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable)
    if (changedTouches != null) __obj.updateDynamic("changedTouches")(changedTouches)
    if (char != null) __obj.updateDynamic("char")(char)
    if (charCode != null) __obj.updateDynamic("charCode")(charCode.asInstanceOf[js.Any])
    if (clientX != null) __obj.updateDynamic("clientX")(clientX.asInstanceOf[js.Any])
    if (clientY != null) __obj.updateDynamic("clientY")(clientY.asInstanceOf[js.Any])
    if (!js.isUndefined(ctrlKey)) __obj.updateDynamic("ctrlKey")(ctrlKey)
    if (!js.isUndefined(data)) __obj.updateDynamic("data")(data)
    if (detail != null) __obj.updateDynamic("detail")(detail.asInstanceOf[js.Any])
    if (eventPhase != null) __obj.updateDynamic("eventPhase")(eventPhase.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key)
    if (keyCode != null) __obj.updateDynamic("keyCode")(keyCode.asInstanceOf[js.Any])
    if (!js.isUndefined(metaKey)) __obj.updateDynamic("metaKey")(metaKey)
    if (namespace != null) __obj.updateDynamic("namespace")(namespace)
    if (offsetX != null) __obj.updateDynamic("offsetX")(offsetX.asInstanceOf[js.Any])
    if (offsetY != null) __obj.updateDynamic("offsetY")(offsetY.asInstanceOf[js.Any])
    if (originalEvent != null) __obj.updateDynamic("originalEvent")(originalEvent)
    if (pageX != null) __obj.updateDynamic("pageX")(pageX.asInstanceOf[js.Any])
    if (pageY != null) __obj.updateDynamic("pageY")(pageY.asInstanceOf[js.Any])
    if (pointerId != null) __obj.updateDynamic("pointerId")(pointerId.asInstanceOf[js.Any])
    if (pointerType != null) __obj.updateDynamic("pointerType")(pointerType)
    if (relatedTarget != null) __obj.updateDynamic("relatedTarget")(relatedTarget)
    if (result != null) __obj.updateDynamic("result")(result)
    if (screenX != null) __obj.updateDynamic("screenX")(screenX.asInstanceOf[js.Any])
    if (screenY != null) __obj.updateDynamic("screenY")(screenY.asInstanceOf[js.Any])
    if (!js.isUndefined(shiftKey)) __obj.updateDynamic("shiftKey")(shiftKey)
    if (targetTouches != null) __obj.updateDynamic("targetTouches")(targetTouches)
    if (toElement != null) __obj.updateDynamic("toElement")(toElement)
    if (touches != null) __obj.updateDynamic("touches")(touches)
    if (view != null) __obj.updateDynamic("view")(view)
    if (which != null) __obj.updateDynamic("which")(which.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModalEventHandler[TElement]]
  }
}

