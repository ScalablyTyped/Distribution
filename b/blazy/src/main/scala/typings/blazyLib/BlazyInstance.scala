package typings
package blazyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BlazyInstance extends js.Object {
  /**
     * Unbind events and resets image array.
     */
  def destroy(): scala.Unit = js.native
  /**
     * Forces the given element(s) to load if not collapsed. If you also want to load a collapsed/hidden elements you can add true as the second parameter.
     * You can pass a single element or a list of elements. Tested with getElementById, getElementsByClassName, querySelectorAll, querySelector and jQuery selector.
     */
  def load(elements: js.Array[stdLib.Element | stdLib.HTMLElement], force: scala.Boolean): scala.Unit = js.native
  /**
     * Forces the given element(s) to load if not collapsed. If you also want to load a collapsed/hidden elements you can add true as the second parameter.
     * You can pass a single element or a list of elements. Tested with getElementById, getElementsByClassName, querySelectorAll, querySelector and jQuery selector.
     */
  def load(elements: stdLib.Element, force: scala.Boolean): scala.Unit = js.native
  /**
     * Forces the given element(s) to load if not collapsed. If you also want to load a collapsed/hidden elements you can add true as the second parameter.
     * You can pass a single element or a list of elements. Tested with getElementById, getElementsByClassName, querySelectorAll, querySelector and jQuery selector.
     */
  def load(elements: stdLib.HTMLCollection, force: scala.Boolean): scala.Unit = js.native
  /**
     * Forces the given element(s) to load if not collapsed. If you also want to load a collapsed/hidden elements you can add true as the second parameter.
     * You can pass a single element or a list of elements. Tested with getElementById, getElementsByClassName, querySelectorAll, querySelector and jQuery selector.
     */
  def load(elements: stdLib.HTMLElement, force: scala.Boolean): scala.Unit = js.native
  /**
     * Forces the given element(s) to load if not collapsed. If you also want to load a collapsed/hidden elements you can add true as the second parameter.
     * You can pass a single element or a list of elements. Tested with getElementById, getElementsByClassName, querySelectorAll, querySelector and jQuery selector.
     */
  def load(elements: stdLib.NodeList, force: scala.Boolean): scala.Unit = js.native
  /**
     * Revalidates document for visible images. Useful if you add images with scripting or ajax.
     */
  def revalidate(): scala.Unit = js.native
}

