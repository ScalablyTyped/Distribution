package typings.cesium

import typings.cesium.mod.Cartesian3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDistance extends js.Object {
  var distance: Double
  var normal: Cartesian3
}

object AnonDistance {
  @scala.inline
  def apply(distance: Double, normal: Cartesian3): AnonDistance = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], normal = normal.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDistance]
  }
}

