package typings.basiclightbox.mod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BasicLightBox extends js.Object {
  /**
    * Closes a lightbox instance.
    *
    * @param cb A function that gets executed as soon as the lightbox has been faded out.
    */
  def close(): Unit = js.native
  def close(cb: js.Function0[Unit]): Unit = js.native
  /**
    * Returns the DOM element/node associated with the instance.
    */
  def element(): Element = js.native
  /**
    * Shows a lightbox instance.
    *
    * @param cb A function that gets executed as soon as the lightbox starts to fade in.
    */
  def show(): Unit = js.native
  def show(cb: js.Function0[Unit]): Unit = js.native
  /**
    * Returns true when the lightbox instance is visible. Also returns true when the lightbox is currently in the process of showing/hiding and not fully visible/hidden, yet.
    */
  def visible(): Boolean = js.native
}

