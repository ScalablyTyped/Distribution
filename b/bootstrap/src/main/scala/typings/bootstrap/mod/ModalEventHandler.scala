package typings.bootstrap.mod

import typings.jquery.JQuery.TriggeredEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModalEventHandler[TElement]
  extends TriggeredEvent[TElement, js.UndefOr[scala.Nothing], HTMLElement, HTMLElement] {
   // overridden only for better JsDoc
  /**
    * For `show.bs.modal` and `shown.bs.modal` is the clicked element, when caused by a _click_.
    * Otherwise is undefined.
    */
  var relatedTarget: js.UndefOr[HTMLElement] = js.native
}

object ModalEventHandler {
  @scala.inline
  def apply[TElement](
    currentTarget: HTMLElement,
    delegateTarget: TElement,
    isDefaultPrevented: () => Boolean,
    isImmediatePropagationStopped: () => Boolean,
    isPropagationStopped: () => Boolean,
    preventDefault: () => Unit,
    stopImmediatePropagation: () => Unit,
    stopPropagation: () => Unit,
    target: HTMLElement,
    timeStamp: Double,
    `type`: String
  ): ModalEventHandler[TElement] = {
    val __obj = js.Dynamic.literal(currentTarget = currentTarget.asInstanceOf[js.Any], delegateTarget = delegateTarget.asInstanceOf[js.Any], isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), isImmediatePropagationStopped = js.Any.fromFunction0(isImmediatePropagationStopped), isPropagationStopped = js.Any.fromFunction0(isPropagationStopped), preventDefault = js.Any.fromFunction0(preventDefault), stopImmediatePropagation = js.Any.fromFunction0(stopImmediatePropagation), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModalEventHandler[TElement]]
  }
  @scala.inline
  implicit class ModalEventHandlerOps[Self <: ModalEventHandler[_], TElement] (val x: Self with ModalEventHandler[TElement]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRelatedTarget(value: HTMLElement): Self = this.set("relatedTarget", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelatedTarget: Self = this.set("relatedTarget", js.undefined)
  }
  
}

