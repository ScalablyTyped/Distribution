package typings
package cleaveDotJsLib.reactPropsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangeEvent[T]
  extends reactLib.reactMod.ReactNs.ChangeEvent[T]

object ChangeEvent {
  @scala.inline
  def apply[T](
    bubbles: scala.Boolean,
    cancelable: scala.Boolean,
    currentTarget: reactLib.EventTarget with T,
    defaultPrevented: scala.Boolean,
    eventPhase: scala.Double,
    isDefaultPrevented: js.Function0[scala.Boolean],
    isPropagationStopped: js.Function0[scala.Boolean],
    isTrusted: scala.Boolean,
    nativeEvent: reactLib.Event,
    persist: js.Function0[scala.Unit],
    preventDefault: js.Function0[scala.Unit],
    stopPropagation: js.Function0[scala.Unit],
    target: cleaveDotJsLib.Anon_RawValue with reactLib.EventTarget with T,
    target_ChangeEvent: reactLib.EventTarget with T,
    timeStamp: scala.Double,
    `type`: java.lang.String
  ): ChangeEvent[T] = {
    val __obj = js.Dynamic.literal(bubbles = bubbles, cancelable = cancelable, currentTarget = currentTarget, defaultPrevented = defaultPrevented, eventPhase = eventPhase, isDefaultPrevented = isDefaultPrevented, isPropagationStopped = isPropagationStopped, isTrusted = isTrusted, nativeEvent = nativeEvent, persist = persist, preventDefault = preventDefault, stopPropagation = stopPropagation, target = target, timeStamp = timeStamp)
    __obj.updateDynamic("target")(target_ChangeEvent)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ChangeEvent[T]]
  }
}

