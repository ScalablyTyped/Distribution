package typings
package blazyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Breakpoint extends js.Object {
  var src: java.lang.String
  var width: scala.Double
}

object Breakpoint {
  @scala.inline
  def apply(src: java.lang.String, width: scala.Double): Breakpoint = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("src")(src)
    __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[Breakpoint]
  }
}

