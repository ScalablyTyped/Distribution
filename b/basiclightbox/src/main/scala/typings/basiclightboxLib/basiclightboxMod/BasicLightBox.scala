package typings
package basiclightboxLib.basiclightboxMod

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
  def close(): scala.Unit = js.native
  def close(cb: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
    * Returns the DOM element/node associated with the instance.
    */
  def element(): stdLib.Element = js.native
  /**
    * Shows a lightbox instance.
    *
    * @param cb A function that gets executed as soon as the lightbox starts to fade in.
    */
  def show(): scala.Unit = js.native
  def show(cb: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
    * Returns true when the lightbox instance is visible. Also returns true when the lightbox is currently in the process of showing/hiding and not fully visible/hidden, yet.
    */
  def visible(): scala.Boolean = js.native
}

