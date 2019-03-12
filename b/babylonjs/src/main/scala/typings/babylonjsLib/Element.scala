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
  def apply(webkitRequestFullScreen: () => scala.Unit): Element = {
    val __obj = js.Dynamic.literal(webkitRequestFullScreen = js.Any.fromFunction0(webkitRequestFullScreen))
  
    __obj.asInstanceOf[Element]
  }
}

