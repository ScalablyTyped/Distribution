package typings.bootstrap.mod

import typings.bootstrap.bootstrapStrings.left
import typings.bootstrap.bootstrapStrings.right
import typings.jquery.JQuery.TriggeredEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CarouselEventHandler[TElement]
  extends TriggeredEvent[TElement, js.UndefOr[scala.Nothing], HTMLElement, HTMLElement] {
   // overridden only for better JsDoc
  /**
    * The direction in which the carousel is sliding.
    */
  var direction: left | right = js.native
  /**
    * The index of the current item.
    */
  var from: Double = js.native
  /**
    * The DOM element that is being slid into place as the active item.
    */
  var relatedTarget: HTMLElement = js.native
  /**
    * The index of the next item.
    */
  var to: Double = js.native
}

object CarouselEventHandler {
  @scala.inline
  def apply[TElement](
    currentTarget: HTMLElement,
    delegateTarget: TElement,
    direction: left | right,
    from: Double,
    isDefaultPrevented: () => Boolean,
    isImmediatePropagationStopped: () => Boolean,
    isPropagationStopped: () => Boolean,
    preventDefault: () => Unit,
    relatedTarget: HTMLElement,
    stopImmediatePropagation: () => Unit,
    stopPropagation: () => Unit,
    target: HTMLElement,
    timeStamp: Double,
    to: Double,
    `type`: String
  ): CarouselEventHandler[TElement] = {
    val __obj = js.Dynamic.literal(currentTarget = currentTarget.asInstanceOf[js.Any], delegateTarget = delegateTarget.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), isImmediatePropagationStopped = js.Any.fromFunction0(isImmediatePropagationStopped), isPropagationStopped = js.Any.fromFunction0(isPropagationStopped), preventDefault = js.Any.fromFunction0(preventDefault), relatedTarget = relatedTarget.asInstanceOf[js.Any], stopImmediatePropagation = js.Any.fromFunction0(stopImmediatePropagation), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CarouselEventHandler[TElement]]
  }
  @scala.inline
  implicit class CarouselEventHandlerOps[Self <: CarouselEventHandler[_], TElement] (val x: Self with CarouselEventHandler[TElement]) extends AnyVal {
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
    def setDirection(value: left | right): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def setFrom(value: Double): Self = this.set("from", value.asInstanceOf[js.Any])
    @scala.inline
    def setRelatedTarget(value: HTMLElement): Self = this.set("relatedTarget", value.asInstanceOf[js.Any])
    @scala.inline
    def setTo(value: Double): Self = this.set("to", value.asInstanceOf[js.Any])
  }
  
}

