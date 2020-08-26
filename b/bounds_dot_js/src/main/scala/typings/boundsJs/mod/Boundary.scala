package typings.boundsJs.mod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bounds.js", "Boundary")
@js.native
class Boundary () extends js.Object {
  /**
    * The check method will return a `boolean`, indicating if the provided `element` is currently inside the boundary.
    * The check is based on history, which starts once you watch the element.
    * If the element is not currently being watched, check will return undefined.
    */
  def check(): Boolean = js.native
  def check(el: Element): Boolean = js.native
  /**
    * The `clear` method will effectively `unWatch` all elements for the boundary, destroy all history for the elements the boundary was watching,
    * and ensure that no events are emitted by the boundary going forward.
    */
  def clear(): Unit = js.native
  /**
    * The `unWatch` method will instruct your boundary to stop watching a certain element.
    * Callbacks for that element will no longer be executed.
    */
  def unWatch(): this.type = js.native
  def unWatch(el: Element): this.type = js.native
  /**
    * Calling watch will instruct your boundary to watch the desired element.
    * When the specified element enters your boundary, the `onEnter` callback will be executed.
    * When the specified element leaves your boundary, the `onLeave` callback will be executed.
    * Each callback is passed 1 argument, `ratio`, which represents the ratio of the element's bounding box that is inside the boundary.
    */
  def watch(): WatchOptions = js.native
  def watch(el: Null, onEnter: js.UndefOr[scala.Nothing], onLeave: WatchCallback): WatchOptions = js.native
  def watch(el: Null, onEnter: WatchCallback): WatchOptions = js.native
  def watch(el: Null, onEnter: WatchCallback, onLeave: WatchCallback): WatchOptions = js.native
  def watch(el: Element): WatchOptions = js.native
  def watch(el: Element, onEnter: js.UndefOr[scala.Nothing], onLeave: WatchCallback): WatchOptions = js.native
  def watch(el: Element, onEnter: WatchCallback): WatchOptions = js.native
  def watch(el: Element, onEnter: WatchCallback, onLeave: WatchCallback): WatchOptions = js.native
}

/* static members */
@JSImport("bounds.js", "Boundary")
@js.native
object Boundary extends js.Object {
  /**
    * The static `checkCompatibility` method will throw an error if `Bounds.js` is not supported in the user's browser.
    */
  def checkCompatibility(): Unit = js.native
}

