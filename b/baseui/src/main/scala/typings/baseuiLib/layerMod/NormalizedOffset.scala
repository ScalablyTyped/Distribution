package typings
package baseuiLib.layerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NormalizedOffset extends js.Object {
  var left: scala.Double
  var top: scala.Double
}

object NormalizedOffset {
  @scala.inline
  def apply(left: scala.Double, top: scala.Double): NormalizedOffset = {
    val __obj = js.Dynamic.literal(left = left, top = top)
  
    __obj.asInstanceOf[NormalizedOffset]
  }
}

