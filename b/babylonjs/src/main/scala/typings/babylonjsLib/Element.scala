package typings
package babylonjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Element extends js.Object {
  def webkitRequestFullScreen(): scala.Unit
}

object Element {
  @scala.inline
  def apply(webkitRequestFullScreen: js.Function0[scala.Unit]): Element = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("webkitRequestFullScreen")(webkitRequestFullScreen)
    __obj.asInstanceOf[Element]
  }
}

