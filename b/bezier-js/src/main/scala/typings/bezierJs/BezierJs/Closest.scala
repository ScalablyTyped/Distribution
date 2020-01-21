package typings.bezierJs.BezierJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Closest extends js.Object {
  var mdist: Double
  var mpos: Double
}

object Closest {
  @scala.inline
  def apply(mdist: Double, mpos: Double): Closest = {
    val __obj = js.Dynamic.literal(mdist = mdist.asInstanceOf[js.Any], mpos = mpos.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Closest]
  }
}

