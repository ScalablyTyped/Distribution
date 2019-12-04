package typings.baseui.layerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NormalizedOffset extends js.Object {
  var left: Double
  var top: Double
}

object NormalizedOffset {
  @scala.inline
  def apply(left: Double, top: Double): NormalizedOffset = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NormalizedOffset]
  }
}

