package typings
package chocolatechipjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Extend extends js.Object {
  /**
    * This method adds the provided object to the Array prototype to make it available to all arrays of HTML elements.
    *
    * @param object And object to add to element arrays.
    * @return The extended array of elements.
    */
  def extend(`object`: js.Object): js.Array[stdLib.HTMLElement]
}

object Anon_Extend {
  @scala.inline
  def apply(extend: js.Function1[js.Object, js.Array[stdLib.HTMLElement]]): Anon_Extend = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("extend")(extend)
    __obj.asInstanceOf[Anon_Extend]
  }
}

