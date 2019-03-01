package typings
package cypressLib.CypressNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Offset extends js.Object {
  var left: scala.Double
  var top: scala.Double
}

object Offset {
  @scala.inline
  def apply(left: scala.Double, top: scala.Double): Offset = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("left")(left)
    __obj.updateDynamic("top")(top)
    __obj.asInstanceOf[Offset]
  }
}

