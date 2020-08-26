package typings.boundsJs.mod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * Accepts a mapping, where values are stated in pixels.
    * You can specify a `top`, `right`, `bottom`, or `left` margin to add to the root's bounding box.
    * This affects detection, NOT style on the root element.
    * @default { top: 0, right: 0, bottom: 0, left: 0 }
    */
  var margins: js.UndefOr[Margins] = js.native
  /**
    * The provided callback will be executed whenever any watched element enters or exits the boundary,
    * once all individual callbacks have executed.
    * This is a useful option if you'd like some action to take place no matter what element enters/exits your boundary.
    * @default () => {}
    */
  var onEmit: js.UndefOr[js.Function1[/* actions */ js.Array[Action], Unit]] = js.native
  /**
    * The root is the element for which we are creating the boundary.
    * Events will be emitted whenever a watched element enters/exits the root element.
    * @default window
    */
  var root: js.UndefOr[Element | Null] = js.native
  /**
    * Accepts a number between 0.0 and 1.0.
    * The ratio of intersecting area required before a callback is made.
    * A threshold of 0.0 means that if even a single pixel of a watched element enters the boundary, a callback is made.
    * A threshold of 1.0 means that every pixel of a watched element must be inside the boundary before a callback is made.
    * @default 0.0
    */
  var threshold: js.UndefOr[Double] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setMargins(value: Margins): Self = this.set("margins", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMargins: Self = this.set("margins", js.undefined)
    @scala.inline
    def setOnEmit(value: /* actions */ js.Array[Action] => Unit): Self = this.set("onEmit", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnEmit: Self = this.set("onEmit", js.undefined)
    @scala.inline
    def setRoot(value: Element): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    @scala.inline
    def setRootNull: Self = this.set("root", null)
    @scala.inline
    def setThreshold(value: Double): Self = this.set("threshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThreshold: Self = this.set("threshold", js.undefined)
  }
  
}

