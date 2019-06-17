package typings
package baseuiLib.popoverMod

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
    val __obj = js.Dynamic.literal(left = left, top = top)
  
    __obj.asInstanceOf[Offset]
  }
}

