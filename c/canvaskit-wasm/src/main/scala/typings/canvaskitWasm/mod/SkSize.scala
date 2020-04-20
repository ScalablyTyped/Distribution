package typings.canvaskitWasm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SkSize extends js.Object {
  var h: Double
  var w: Double
}

object SkSize {
  @scala.inline
  def apply(h: Double, w: Double): SkSize = {
    val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkSize]
  }
}

