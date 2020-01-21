package typings.cesium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBottom extends js.Object {
  var bottom: Double
  var far: Double
  var left: Double
  var near: Double
  var right: Double
  var top: Double
}

object AnonBottom {
  @scala.inline
  def apply(bottom: Double, far: Double, left: Double, near: Double, right: Double, top: Double): AnonBottom = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], far = far.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], near = near.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBottom]
  }
}

