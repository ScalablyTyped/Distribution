package typings.cesium.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bottom extends js.Object {
  var bottom: Double
  var far: Double
  var left: Double
  var near: Double
  var right: Double
  var top: Double
}

object Bottom {
  @scala.inline
  def apply(bottom: Double, far: Double, left: Double, near: Double, right: Double, top: Double): Bottom = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], far = far.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], near = near.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bottom]
  }
}

