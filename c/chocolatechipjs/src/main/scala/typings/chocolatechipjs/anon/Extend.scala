package typings.chocolatechipjs.anon

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Extend extends js.Object {
  /**
    * This method adds the provided object to the Array prototype to make it available to all arrays of HTML elements.
    *
    * @param object And object to add to element arrays.
    * @return The extended array of elements.
    */
  def extend(`object`: js.Object): js.Array[HTMLElement]
}

object Extend {
  @scala.inline
  def apply(extend: js.Object => js.Array[HTMLElement]): Extend = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend))
    __obj.asInstanceOf[Extend]
  }
}

